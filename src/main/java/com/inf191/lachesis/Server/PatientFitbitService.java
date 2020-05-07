package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.PatientsFitbit;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


public interface PatientFitbitService {
    int deleteByPrimaryKey(Integer matchid);
    int insert(PatientsFitbit record);
    int insertSelective(PatientsFitbit record);
    List<PatientsFitbit> selectActiveId();
    List<PatientsFitbit> selectByPid(int pid);
    PatientsFitbit selectByPrimaryKey(Integer matchid);
    int updateByPrimaryKeySelective(PatientsFitbit record);
    int updateByPrimaryKey(PatientsFitbit record);
}
