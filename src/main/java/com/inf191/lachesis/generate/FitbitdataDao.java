package com.inf191.lachesis.generate;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FitbitdataDao {
    int deleteByPrimaryKey(Integer heardataid);

    List<Fitbitdata> selectAllActiveByPid(Integer pid);

    List<Fitbitdata> selectAllByFid(Integer fid);

    int insert(Fitbitdata record);

    int insertSelective(Fitbitdata record);

    Fitbitdata selectByPrimaryKey(Integer heardataid);

    int updateByPrimaryKeySelective(Fitbitdata record);

    int updateByPrimaryKey(Fitbitdata record);
}