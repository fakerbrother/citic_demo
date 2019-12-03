package com.citic.demo.service.impl;

import com.citic.demo.dao.UserProductRepository;
import com.citic.demo.entity.UserProductPO;
import com.citic.demo.service.UserProductService;
import com.citic.demo.vo.UserProductVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProductServiceImpl implements UserProductService {

    private final UserProductRepository userProductRepository;

    public UserProductServiceImpl(UserProductRepository userProductRepository) {
        this.userProductRepository = userProductRepository;
    }

    @Override
    public void purchaseProduct(UserProductVO requestVo) {
        UserProductPO po = new UserProductPO();
        po.setName(requestVo.getProductName());
        po.setUserId(requestVo.getUserId());
        userProductRepository.save(po);
    }

    @Override
    public List<UserProductPO> getUserProducts(Integer userId) {
        return userProductRepository.findByUserId(userId);
    }
}
