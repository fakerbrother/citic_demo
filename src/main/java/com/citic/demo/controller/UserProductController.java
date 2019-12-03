package com.citic.demo.controller;

import com.citic.demo.common.ResponseVO;
import com.citic.demo.service.UserProductService;
import com.citic.demo.vo.UserProductVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/product")
public class UserProductController {

    private final UserProductService userProductService;

    public UserProductController(UserProductService userProductService) {
        this.userProductService = userProductService;
    }

    @PostMapping
    public ResponseVO purchaseProduct(@RequestBody UserProductVO requestVo) {
        userProductService.purchaseProduct(requestVo);
        return ResponseVO.success();
    }

    @GetMapping("/{userId}")
    public ResponseVO getUserProducts(@PathVariable("userId") Integer userId) {
        return ResponseVO.success(userProductService.getUserProducts(userId));
    }
}
