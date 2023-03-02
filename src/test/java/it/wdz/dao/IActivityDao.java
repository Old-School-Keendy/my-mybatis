package it.wdz.dao;

import it.wdz.po.Activity;
import org.apache.ibatis.annotations.Select;

public interface IActivityDao {
    Activity queryActivityById(Activity activity);


    Integer insert(Activity activity);

}
