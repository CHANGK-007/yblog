package com.ruoyi.yblog.webMenu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 *  web菜单 对象 y_web_menu
 * 
 * @author kc
 * @date 2022-06-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("y_web_menu")
public class YWebMenu extends Model<YWebMenu>
{
    private static final long serialVersionUID = 1L;

    /** web菜单id */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** 菜单名称 */
    @Excel(name = "菜单名称")
    private String menuName;

    /** 父菜单ID */
    @Excel(name = "父菜单ID")
    private Long moduleId;

    /** 是否显示（1-是，0-否） */
    @Excel(name = "是否显示（1-是，0-否）")
    private Long isShow;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 创建者 */
    @Excel(name = "创建者")
    private String createBy;

    /** 创建时间 */
    @Excel(name = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新者 */
    @Excel(name = "更新者")
    private String updateBy;

    /** 更新时间 */
    @Excel(name = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;

}
