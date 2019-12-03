package com.citic.demo.service;

import com.citic.demo.entity.UserProductPO;
import com.citic.demo.vo.UserProductVO;

import java.util.List;

public interface UserProductService {

    void purchaseProduct(UserProductVO requestVo);

    List<UserProductPO> getUserProducts(Integer userId);
}
