package generate;

import generate.Accounts;

public interface AccountsDao {
    int deleteByPrimaryKey(Integer account);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    Accounts selectByPrimaryKey(Integer account);

    int updateByPrimaryKeySelective(Accounts record);

    int updateByPrimaryKey(Accounts record);
}