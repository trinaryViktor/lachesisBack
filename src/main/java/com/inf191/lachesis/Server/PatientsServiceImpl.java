package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Patients;
import com.inf191.lachesis.generate.PatientsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsServiceImpl implements PatientsService {
   @Autowired
   PatientsDao patientsDao;

    @Override
    public Patients selectByPrimaryKey(int id) {
        return patientsDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Patients> selectAllPatients() {
        return patientsDao.selectAllPatients();
    }

    @Override
    public int updateByPrimaryKey(Patients patients) {
        return patientsDao.updateByPrimaryKey(patients);
    }

    @Override
    public int insert(Patients paitents){
        return patientsDao.insert(paitents);
    }

    @Override
    public int insertSelective(Patients patients) {
        return patientsDao.insertSelective(patients);
    }

    @Override
    public int deleteByPrimaryKey(int id) {
        return patientsDao.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Patients patients) {
        return patientsDao.updateByPrimaryKeySelective(patients);
    }

    @Override
    public List<Patients> getActivePatietns(){
        return patientsDao.getActivePatietns();
    }

}
