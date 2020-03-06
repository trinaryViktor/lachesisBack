package com.inf191.lachesis.Controller;

import com.inf191.lachesis.Server.PatientsService;
import com.inf191.lachesis.Server.PatientsServiceImpl;
import com.inf191.lachesis.generate.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value="/api")
public class PatientsController {
    @Autowired
    private PatientsServiceImpl patientsServiceImpl;

    @RequestMapping(method=RequestMethod.GET ,value ="/getbyid={id}")
    public Patients patients(@PathVariable ("id") int id){
        return patientsServiceImpl.selectByPrimaryKey(id);
    }

    @RequestMapping(method = RequestMethod.POST ,value="/uploadPatientsByJSON")
    public String uploadPatients(@RequestBody @Valid Patients patients,BindingResult bindingResult){
        List<ObjectError> objectErrors = bindingResult.getAllErrors();
        System.out.println(objectErrors.toString());
        patientsServiceImpl.insert(patients);
        return patients.toString();
    }
}
