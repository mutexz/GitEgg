
package com.gitegg.platform.base.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author gitegg
 */
@Data
@ApiModel(description = "用户信息")
public class GitEggUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "客户端id")
    private String clientId;

    @ApiModelProperty(value = "租户id")
    private String tenantId;

    @ApiModelProperty(value = "第三方认证id")
    private String oauthId;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "姓名")
    private String realName;

    @ApiModelProperty(value = "1 : 男，0 : 女")
    private String gender;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "电话")
    private String mobile;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "'0'禁用,'1' 启用, '2' 密码过期或初次未修改")
    private String status;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区")
    private String area;

    @ApiModelProperty(value = "街道详细地址")
    private String street;

    @ApiModelProperty(value = "备注")
    private String comments;

    @ApiModelProperty(value = "角色id")
    private Long roleId;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "机构id")
    private Long organizationId;

    @ApiModelProperty(value = "机构名称")
    private String organizationName;

    @ApiModelProperty(value = "数据权限")
    private String dataPermission;

    /**
     * 集合列表说明：当同一个用户在不同机构拥有不同角色时，需要用户登录时选择对应机构
     */
    @ApiModelProperty(value = "角色id集合")
    private String roleIds;

    @ApiModelProperty(value = "角色标识集合")
    private String roleKeys;

    @ApiModelProperty(value = "角色名称集合")
    private String roleNames;

    @ApiModelProperty(value = "机构id集合")
    private String organizationIds;

    @ApiModelProperty(value = "机构名称集合")
    private String organizationNames;

    @ApiModelProperty(value = "角色id列表")
    private List<String> roleIdList;

    @ApiModelProperty(value = "角色key列表")
    private List<String> roleKeyList;

    @ApiModelProperty(value = "机构id列表")
    private List<String> organizationIdList;

    @ApiModelProperty(value = "机构名称列表")
    private List<String> organizationNameList;

    @ApiModelProperty(value = "资源列表字符串")
    private List<String> resourceKeyList;

}
