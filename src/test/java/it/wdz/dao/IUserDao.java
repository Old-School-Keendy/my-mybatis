package it.wdz.dao;

import java.util.List;

import it.wdz.po.User;

public interface IUserDao {

    User queryUserInfoById(Long uId);

}
