package com.husky.demo1.controller;

import com.infinitus.husky.controller.BaseController;
import com.infinitus.husky.resp.CommonResp;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    private static final Logger logger= LoggerFactory.getLogger(TestController.class);
    @Value("${testStr}")
    private String str;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="测试接口", notes="测试接口")
    public CommonResp test(){
        return new CommonResp("测试","say",str);
    }

}
