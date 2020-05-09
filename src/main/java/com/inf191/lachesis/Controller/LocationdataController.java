package com.inf191.lachesis.Controller;


import com.inf191.lachesis.Helper.RecentLocationCache;
import com.inf191.lachesis.Server.LocationdataServiceImpl;
import com.inf191.lachesis.generate.Fitbitdata;
import com.inf191.lachesis.generate.Locationdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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



        Locationdata ldata = new Locationdata();

        ldata.setMid(locationdata.getMid());
        if(locationdata.getLocation().equalsIgnoreCase("adt35s6d7b78dh9k06d9ns126s8bd7fj3")){
            ldata.setLocation("Room A");

        }
        ldata.setTime(locationdata.getTime());
        LRU.put(ldata.getMid(),ldata);
        return locationdataServiceImpl.insert(ldata);
    }

    @RequestMapping(method= RequestMethod.GET ,value ="/getRecentbymid={mid}")
    public Locationdata getRecentLocation(@PathVariable("mid") String mid) {
        return LRU.get(mid);
    }

    }
