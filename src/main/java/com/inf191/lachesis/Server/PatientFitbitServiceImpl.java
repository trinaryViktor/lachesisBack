package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.PatientsFitbit;
import com.inf191.lachesis.generate.PatientsFitbitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientFitbitServiceImpl implements PatientFitbitService {
    @Autowired
    PatientsFitbitDao patientsFitbitDao;


    @Override
    public int deleteByPrimaryKey(Integer matchid) {
        return patientsFitbitDao.deleteByPrimaryKey(matchid);
    }

    @Override
    public int insert(PatientsFitbit record) {
        return patientsFitbitDao.insert(record);
    }

    @Override
    public int insertSelective(PatientsFitbit record) {
        return patientsFitbitDao.insertSelective(record);
    }

    @Override
    public PatientsFitbit selectByPrimaryKey(Integer matchid) {
        return patientsFitbitDao.selectByPrimaryKey(matchid);
    }

    @Override
    public int updateByPrimaryKeySelective(PatientsFitbit record) {
        return patientsFitbitDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PatientsFitbit record) {
        return patientsFitbitDao.updateByPrimaryKey(record);
    }
}
