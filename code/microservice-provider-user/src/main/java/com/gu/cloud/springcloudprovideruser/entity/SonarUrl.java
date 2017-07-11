package com.gu.cloud.springcloudprovideruser.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity(name = "SONAR_URL")  
public class SonarUrl implements Serializable {  
  
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
    @ApiModelProperty(value="主键", hidden=false, notes="主键，隐藏", required=true, dataType="Long")// 使用该注解描述属性信息,当hidden=true时，该属性不会在api中显示  
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;  
      
    @ApiModelProperty(value="URL链接地址")  
    @Column(name="URL")  
    private String url;  
      
    @ApiModelProperty(value="项目组")  
    @Column(name="TEAM")  
    private String team;  
  
    @ApiModelProperty(value="部门")  
    @Column(name="DEPARTMENT")  
    private String department;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}  
    
    
 }  
