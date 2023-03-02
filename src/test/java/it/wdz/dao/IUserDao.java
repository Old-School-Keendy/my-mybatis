package it.wdz.dao;

import java.util.List;

import it.wdz.po.User;
import org.apache.ibatis.annotations.Select;

public interface IUserDao {

    @Select("SELECT id, userId, userName, userHead\n" +
            "        FROM user\n" +
            "        where id = #{id}")
    User queryUserInfo(User req);

    @Select("SELECT id, userId, userName, userHead\n" +
            "FROM user")
    List<User> queryUserInfoList();

}
