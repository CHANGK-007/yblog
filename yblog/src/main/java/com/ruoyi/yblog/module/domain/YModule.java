package com.ruoyi.yblog.module.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 菜单--模块对象 y_module
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("y_web_menu")
public class YModule extends Model<YModule>
{
    private static final long serialVersionUID = 1L;

    /** 菜单模块id */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** 模块名称 */
    @Excel(name = "模块名称")
    private String name;
}
