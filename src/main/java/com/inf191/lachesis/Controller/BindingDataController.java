package com.inf191.lachesis.Controller;

import com.inf191.lachesis.Server.BindingDataServiceImpl;
import com.inf191.lachesis.Server.PatientFitbitServiceImpl;
import com.inf191.lachesis.generate.BindingData;
import com.inf191.lachesis.generate.PatientsFitbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class BindingDataController {
    @Autowired
    private BindingDataServiceImpl bindingDataServiceImpl;
    @Autowired
    private PatientFitbitServiceImpl patientFitbitServiceImpl;

    @PostMapping("/inputBindingByJSON")
    public PatientsFitbit insertBinding(@RequestBody@Valid BindingData bData){
        BindingData bd = new BindingData();

        bd.setDobday(bData.getDobday());
        bd.setDobmonth(bData.getDobmonth());
        bd.setDobyear(bData.getDobyear());
        bd.setFid(bData.getFid());
        bd.setFirstName(bData.getFirstName());
        bd.setMiddleName(bData.getMiddleName());
        bd.setLastName(bData.getLastName());
        bd.setMid(bData.getMid());
        bd.setHeight(bData.getHeight());
        bd.setWeight(bData.getWeight());
        bd.setStart(bData.getStart());
        bd.setPid(bData.getPid());

        return  bindingDataServiceImpl.signinBindingInfo(bd);
    }


    //this is not working, using updateconnect api
    @RequestMapping(method = RequestMethod.GET, value = "/SignOffBypid={pid}")
    public int signoffBinding(@PathVariable("pid") int pid){
        List<PatientsFitbit> matchedList = patientFitbitServiceImpl.selectByPid(pid);
        System.out.println(matchedList);

        //if there insert one patietns mistakely multiple times.
        //****** usually do it in cache, but in this case, we just let it read from DBS
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        Date time = ts;

            for(PatientsFitbit p:matchedList){
               PatientsFitbit pf = patientFitbitServiceImpl.selectByPrimaryKey(p.getMatchid());
               pf.setFinish(time);
               System.out.println(pf);
               if(patientFitbitServiceImpl.updateByPrimaryKey(pf)!=1) return 0;
            }
        return 1;


    }

}
