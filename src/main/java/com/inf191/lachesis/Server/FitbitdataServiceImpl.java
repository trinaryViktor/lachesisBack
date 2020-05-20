package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Fitbitdata;
import com.inf191.lachesis.generate.FitbitdataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitbitdataServiceImpl implements FitbitdataService {
    @Autowired
    FitbitdataDao fitbitdataDao;


    @Override
    public int deleteByPrimaryKey(Integer fid) {
        return fitbitdataDao.deleteByPrimaryKey(fid);
    }

    @Override
    public int insert(Fitbitdata record) {
        return fitbitdataDao.insert(record);
    }

    @Override
    public int insertSelective(Fitbitdata record) {
        return fitbitdataDao.insertSelective(record);
    }

    @Override
    public List<Fitbitdata> selectAllActiveBypid(Integer pid) {
        return fitbitdataDao.selectAllActiveByPid(pid);
    }



    @Override
    public List<Fitbitdata> selectAllByFid(Integer fid) {
        return fitbitdataDao.selectAllByFid(fid);
    }


    @Override
    public Fitbitdata selectByPrimaryKey(Integer fid) {
        return fitbitdataDao.selectByPrimaryKey(fid);
    }

    @Override
    public int updateByPrimaryKeySelective(Fitbitdata record) {
        return fitbitdataDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Fitbitdata record) {
        return fitbitdataDao.updateByPrimaryKey(record);
    }

}
