package it.wdz.dao;

import java.util.List;

import it.wdz.po.User;

public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);

}
