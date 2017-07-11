package com.gu.cloud.springcloudprovideruser.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gu.cloud.springcloudprovideruser.entity.SonarUrl;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

public interface SwaggerTest {  
    @ApiOperation(value="获取项目组Sonar对应的Url信息", notes="根据id获取项目组Sonar对应的Url信息")// 使用该注解描述接口方法信息  
    @ApiImplicitParams({  
            @ApiImplicitParam(name = "id", value = "SonarUrl表ID", required = true, dataType = "Long", paramType="path")  
    })// 使用该注解描述方法参数信息，此处需要注意的是paramType参数，需要配置成path，否则在UI中访问接口方法时，会报错  
    @GetMapping("/get/{id}")  
    SonarUrl get(@PathVariable Long id);  
      
    @ApiOperation(value="获取项目组Sonar对应的所有Url信息")  
    @GetMapping("/get/all")  
    List<SonarUrl> getAll();  
}  
