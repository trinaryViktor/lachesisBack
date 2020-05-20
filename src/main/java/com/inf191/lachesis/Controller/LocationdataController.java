package com.inf191.lachesis.Controller;


import com.inf191.lachesis.Helper.RecentLocationCache;
import com.inf191.lachesis.Server.LocationdataServiceImpl;
import com.inf191.lachesis.generate.Locationdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.Date;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class LocationdataController {

    //set up the cache with size 10
    RecentLocationCache<String,Locationdata> LRU = new RecentLocationCache<>(10);

    @Autowired
    LocationdataServiceImpl locationdataServiceImpl;

    @RequestMapping(method= RequestMethod.GET ,value ="/getbylid={lid}")
    public Locationdata getLocation(@PathVariable("lid") int lid){
        return locationdataServiceImpl.selectByPrimaryKey(lid);
    }

    @PostMapping( "/updateLocationByJSON")
    public int updateLocation(@RequestBody @Valid Locationdata locationdata){
        Locationdata ldata = new Locationdata();
        ldata.setMid(locationdata.getMid());
        ldata.setLocation(locationdata.getLocation());
        ldata.setTime(locationdata.getTime());

        return locationdataServiceImpl.updateByPrimaryKey(ldata);
    }


    @PostMapping( "/insertLocationByJSON")
    public int insertLocation(@RequestBody @Valid Locationdata locationdata){

        Timestamp ts = new Timestamp(System.currentTimeMillis());
        Date time = ts;

        Locationdata ldata = new Locationdata();

        ldata.setMid(locationdata.getMid());
        if(locationdata.getLocation().equalsIgnoreCase("adt35s6d7b78dh9k06d9ns126s8bd7fj3")){
            ldata.setLocation("RoomA");
        }
        else if(locationdata.getLocation().equalsIgnoreCase("f7826da6-4fa2-4e98-8024-bc5b71e0345e")){
            ldata.setLocation("Waiting");
        }
        else if(locationdata.getLocation().equalsIgnoreCase("d7826da6-4fa2-4e98-8024-bc5b71e0345d")){
            ldata.setLocation("RoomB");
        }
        else{
            ldata.setLocation(locationdata.getLocation());
        }
        ldata.setTime(time);
        LRU.put(ldata.getMid(),ldata);
        return locationdataServiceImpl.insert(ldata);
    }

    @RequestMapping(method= RequestMethod.GET ,value ="/getRecentLocationByMid={mid}")
    public Locationdata getRecentLocation(@PathVariable("mid") String mid) {
        return LRU.get(mid);
    }



    }
