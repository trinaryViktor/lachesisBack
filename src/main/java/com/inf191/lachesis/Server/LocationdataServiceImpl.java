package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Locationdata;
import com.inf191.lachesis.generate.LocationdataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationdataServiceImpl implements LocatindataService {

    @Autowired
    LocationdataDao locationdataDao;

    @Override
    public int deleteByPrimaryKey(Integer LocationId){
        return locationdataDao.deleteByPrimaryKey(LocationId);
    }

    @Override
    public int insert(Locationdata record){
        return locationdataDao.insert(record);
    }

    @Override
    public int insertSelective(Locationdata record){
        return locationdataDao.insertSelective(record);
    }

    @Override
    public Locationdata selectByPrimaryKey(Integer LocationId){
        return locationdataDao.selectByPrimaryKey(LocationId);
    }

    @Override
    public int updateByPrimaryKeySelective(Locationdata record){
        return locationdataDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Locationdata record){
        return locationdataDao.updateByPrimaryKey(record);
    }

}
