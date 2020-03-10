package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.PatientsFitbit;
import org.springframework.stereotype.Service;


public interface PatientFitbitService {
    int deleteByPrimaryKey(Integer matchid);
    int insert(PatientsFitbit record);
    int insertSelective(PatientsFitbit record);
    PatientsFitbit selectByPrimaryKey(Integer matchid);
    int updateByPrimaryKeySelective(PatientsFitbit record);
    int updateByPrimaryKey(PatientsFitbit record);
}
