package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Fitbitdata;

import java.util.List;


public interface FitbitdataService {
    int deleteByPrimaryKey(Integer fid);

    int insert(Fitbitdata record);

    int insertSelective(Fitbitdata record);

    List<Fitbitdata> selectAllByFid(Integer fid);

    Fitbitdata selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Fitbitdata record);

    int updateByPrimaryKey(Fitbitdata record);
}
