package com.hb0730.boot.admin.project.user.model.vo;

import com.hb0730.boot.admin.commons.web.model.BusinessVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author bing_huang
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SystemUserVO extends BusinessVO {

    private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 用户账号
     */
    @NotEmpty(message = "用户账号不为空")
    private String username;

    /**
     * 用户密码
     */
    @NotEmpty(message = "用户密码不为空")
    private String password;
    /**
     * 用户昵称
     */
    @NotEmpty(message = "用户昵称不为空")
    private String nickName;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phonenumber;

    /**
     * 用户性别
     */
    private Integer sex;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 部门ID
     */
    @NotNull(message = "用户所属组织不为空")
    private Long deptId;

    /**
     * 排序
     */
    private Integer sort;

}