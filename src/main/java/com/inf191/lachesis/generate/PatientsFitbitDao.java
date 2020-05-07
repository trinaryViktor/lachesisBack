package com.inf191.lachesis.generate;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public interface PatientsFitbitDao {
    int deleteByPrimaryKey(Integer matchid);

    List<PatientsFitbit> selectByPid(int pid);

    int insert(PatientsFitbit record);

    int insertSelective(PatientsFitbit record);

    List<PatientsFitbit> selectActiveId();

    PatientsFitbit selectByPrimaryKey(Integer matchid);

    int updateByPrimaryKeySelective(PatientsFitbit record);

    int updateByPrimaryKey(PatientsFitbit record);
}