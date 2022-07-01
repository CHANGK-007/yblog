package com.ruoyi.yblog.notes.domain;

import java.util.Date;

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

/**
 * 笔记对象 y_notes
 * 
 * @author kc
 * @date 2022-06-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("y_web_menu")
public class YNotes extends Model<YNotes>
{

    private static final long serialVersionUID = 1L;

    /** 笔记id */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 菜单模块--id */
    @Excel(name = "菜单模块")
    private Long menuId;

    /** 笔记内容 */
    @Excel(name = "笔记内容")
    private String content;

    /** 标签 */
    @Excel(name = "标签")
    private Long labelId;

    /** 是否显示 */
    @Excel(name = "是否显示")
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

}
