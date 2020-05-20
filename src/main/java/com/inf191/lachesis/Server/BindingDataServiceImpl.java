package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.BindingData;
import com.inf191.lachesis.generate.Patients;
import com.inf191.lachesis.generate.PatientsFitbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BindingDataServiceImpl implements BindingDataService {

    @Autowired
    //create new patient
    private PatientsServiceImpl patientsServiceImpl;
    @Autowired
    //create new PatientFitbit
    private PatientFitbitServiceImpl patientFitbitServiceImpl;


    @Override
    public PatientsFitbit signinBindingInfo(BindingData bData) {



        PatientsFitbit patientsFitbit = new PatientsFitbit();
        Patients patients = new Patients();

        patients.setHeight(bData.getHeight());
        patients.setWeight(bData.getWeight());
        patients.setMid(bData.getMid());
        patients.setFirstName(bData.getFirstName());
        patients.setMiddleName(bData.getMiddleName());
        patients.setLastName(bData.getLastName());
        patients.setDobyear(bData.getDobyear());
        patients.setDobmonth(bData.getDobmonth());
        patients.setDobday(bData.getDobday());
        patientsServiceImpl.insert(patients);

        int pid = patients.getPid();

        System.out.println("service: "+pid);

        patientsFitbit.setPid(pid);
        patientsFitbit.setFid(bData.getFid());
        patientsFitbit.setStart(bData.getStart());

        patientFitbitServiceImpl.insert(patientsFitbit);
        return patientsFitbit;

    }

    @Override
    public int signoffBinding(PatientsFitbit patientsFitbit) {
        System.out.println(patientsFitbit.toString());
        return patientFitbitServiceImpl.updateByPrimaryKey(patientsFitbit);
    }

}
