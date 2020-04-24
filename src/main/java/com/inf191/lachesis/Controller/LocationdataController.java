package com.inf191.lachesis.Controller;


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

    @Autowired
    LocationdataServiceImpl locationdataServiceImpl;

    @RequestMapping(method= RequestMethod.GET ,value ="/getbylid={fid}")
    private Locationdata getLocation(@PathVariable("fid") int fid){
        return locationdataServiceImpl.selectByPrimaryKey(fid);
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
        ldata.setLocation(locationdata.getLocation());
        ldata.setTime(locationdata.getTime());

        return locationdataServiceImpl.insert(ldata);
    }
}
