package com.onlythinking.shop.model;

import com.onlythinking.commons.core.interceptor.CreatedTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * <p> This was generated by Ot Mybatis generator. </p>
 * 
 * ot_user_login_log
 * 
 * 用户登录日志
 * 
 * @author lixingping
 * Date 2020-05-11 11:38:19
 */
@Data
@ApiModel("用户登录日志")
public class OtUserLoginLog implements Serializable {
    /**
     * ID
     */
    @Id
    @ApiModelProperty(value = "ID")
    private String id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @CreatedTime
    private Date createdTime;

    /**
     * 操作记录
     */
    @ApiModelProperty(value = "操作记录")
    private String remark;

    /**
     * 应用编号
     */
    @ApiModelProperty(value = "应用编号")
    private String appNo;

    /**
     * IP来源
     */
    @ApiModelProperty(value = "IP来源")
    private String ipGeo;

    /**
     * 登录IP
     */
    @ApiModelProperty(value = "登录IP")
    private String loginIp;

    /**
     * 小程序类型(wx|swan|my|tt|h5)
     */
    @ApiModelProperty(value = "小程序类型(wx|swan|my|tt|h5)")
    private String maType;

    /**
     * 用户昵称
     */
    @NotBlank
    @ApiModelProperty(value = "用户昵称", required = true)
    private String nickName;

    /**
     * 用户ID
     */
    @NotBlank
    @ApiModelProperty(value = "用户ID", required = true)
    private String uid;

    /**
     * 唯一值(appNo:maType:(openid|phoneNo))
     */
    @ApiModelProperty(value = "唯一值(appNo:maType:(openid|phoneNo))")
    private String uniqueKey;

    private static final long serialVersionUID = 1L;
}