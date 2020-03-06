package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Patients;
import com.inf191.lachesis.generate.PatientsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientsServiceImpl implements PatientsService {
   @Autowired
   PatientsDao patientsDao;

    @Override
    public Patients selectByPrimaryKey(int id) {
        return patientsDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Patients patients) {
        return patientsDao.updateByPrimaryKey(patients);
    }

    public int insert(Patients paitents){
        return patientsDao.insert(paitents);
    }
}
