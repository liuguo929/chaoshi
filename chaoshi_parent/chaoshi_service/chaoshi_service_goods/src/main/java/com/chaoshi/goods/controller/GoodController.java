package com.chaoshi.goods.controller;

import com.chaoshi.entity.Result;
import com.chaoshi.entity.StatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodController {
    @GetMapping("/list")
    public Result findList(){
        System.out.println("查询商品列表~~~~");
        return new Result(true, StatusCode.OK,"查询成功");
    }
}
