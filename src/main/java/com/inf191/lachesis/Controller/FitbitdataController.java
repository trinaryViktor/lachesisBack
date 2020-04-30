package com.inf191.lachesis.Controller;

import com.inf191.lachesis.Server.FitbitdataServiceImpl;
import com.inf191.lachesis.generate.Fitbitdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class FitbitdataController {
    @Autowired
    FitbitdataServiceImpl fitbitdataServiceImpl;

    @RequestMapping(method= RequestMethod.GET ,value ="/getbyfid={fid}")
    private Fitbitdata getFitbit(@PathVariable("fid") int fid){
        return fitbitdataServiceImpl.selectByPrimaryKey(fid);
    }

    @PostMapping( "/updateFitbitByJSON")
    public int updateFitbit(@RequestBody @Valid Fitbitdata fitbitdata){
        Fitbitdata fdata = new Fitbitdata();
        fdata.setFid(fitbitdata.getFid());
        fdata.setHeartrate(fitbitdata.getHeartrate());
        fdata.setTime(fitbitdata.getTime());

        return fitbitdataServiceImpl.updateByPrimaryKey(fdata);
    }

    @PostMapping("/inputFitbitByJSON")
    public int insertFitbit(@RequestBody Fitbitdata fitbitdata){
        Fitbitdata fdata = new Fitbitdata();
        fdata.setFid(fitbitdata.getFid());
        fdata.setHeartrate(fitbitdata.getHeartrate());
        fdata.setTime(fitbitdata.getTime());

        return fitbitdataServiceImpl.insert(fdata);

    }

    @RequestMapping(method= RequestMethod.GET ,value ="/getAllbyfid={fid}")
    public List<Fitbitdata> selectAllByFid(@PathVariable("fid") int fid){
       return fitbitdataServiceImpl.selectAllByFid(fid);
    }


}
