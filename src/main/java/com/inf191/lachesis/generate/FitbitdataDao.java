package com.inf191.lachesis.generate;

public interface FitbitdataDao {
    int deleteByPrimaryKey(Integer fid);

    int insert(Fitbitdata record);

    int insertSelective(Fitbitdata record);

    Fitbitdata selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Fitbitdata record);

    int updateByPrimaryKey(Fitbitdata record);
}