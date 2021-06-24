package com.gitegg.platform.mybatis.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @author GitEgg
 * @date 2020/12/14
 **/
@Data
public class BaseEntity implements Serializable {

    @ApiModelProperty(value = "租户id")
    @TableField(value = "tenant_id")
    private Long tenantId;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建者")
    @TableField(value = "CREATOR", fill = FieldFill.INSERT)
    private Long creator;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "UPDATE_TIME", fill = FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新者")
    @TableField(value = "OPERATOR", fill = FieldFill.UPDATE)
    private Long operator;

    @ApiModelProperty(value = "1:删除 0:不删除")
    @TableField("DEL_FLAG")
    @TableLogic
    private Integer delFlag;

}
