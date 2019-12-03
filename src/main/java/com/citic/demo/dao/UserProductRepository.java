package com.citic.demo.dao;

import com.citic.demo.entity.UserProductPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserProductRepository {

    void save(@Param("po") UserProductPO po);

    List<UserProductPO> findByUserId(@Param("userId") Integer userId);
}
