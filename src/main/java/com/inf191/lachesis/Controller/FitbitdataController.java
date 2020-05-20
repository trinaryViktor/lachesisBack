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

    static Fitbitdata recentFit1 = null;
    static Fitbitdata recentFit2 = null;
    static Fitbitdata recentFit3 = null;

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
        if(fdata.getFid()==1){
            recentFit1 = fdata;
        }
        else if(fdata.getFid()==2){
            recentFit2 = fdata;
        }
        else if(fdata.getFid()==3){
            recentFit3 = fdata;
        }

        return fitbitdataServiceImpl.insert(fdata);

    }

    //If there are may fitbit, consider of using Redis
    // if you want, add something into the header return error message, I am too lazy
    @RequestMapping(method= RequestMethod.GET ,value ="/recentFitbit={fid}")
    public Fitbitdata recentFitbitData(@PathVariable("fid") int fid){

        if(fid == 1){
            return recentFit1;
        }
        else if(fid == 2){
            return recentFit2;
        }
        else {
            return recentFit3;
        }
    }

    @RequestMapping(method= RequestMethod.GET ,value ="/getAllActivebypid={pid}")
    public List<Fitbitdata> selectAllActive(@PathVariable("pid") int pid){
        return fitbitdataServiceImpl.selectAllActiveBypid(pid);
    }

    @RequestMapping(method= RequestMethod.GET ,value ="/getAllbyfid={fid}")
    public List<Fitbitdata> selectAllByFid(@PathVariable("fid") int fid){
       return fitbitdataServiceImpl.selectAllByFid(fid);
    }


}
