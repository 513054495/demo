package com.husky.demo1.controller;

import com.infinitus.husky.controller.BaseController;
import com.husky.demo1.domain.Role;
import com.husky.demo1.req.RoleReq;
import com.husky.demo1.service.RoleService;
import com.infinitus.husky.enums.ResponseCodeEnum;
import com.infinitus.husky.resp.CommonResp;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;



@RestController
@RequestMapping("/Role")
public class RoleController extends BaseController {

    private static final Logger logger= LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService beanService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ApiOperation(value="保存接口", notes="保存信息")
    public CommonResp save(RoleReq req){
    logger.info("进入保存用户方法");
    try{
    Role bean=new Role();
    BeanUtils.copyProperties(req,bean);
    beanService.save(bean);
    logger.info("保存成功");
    return new CommonResp("保存");
    }catch (Exception e){
    logger.error(MessageFormat.format("保存失败：[{1}]",e.getLocalizedMessage()));
    return new CommonResp(ResponseCodeEnum.SAVE_FAIL.getCode(),ResponseCodeEnum.SAVE_FAIL.getMsg(),e);
    }
    }
}
