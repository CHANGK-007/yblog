package com.ruoyi.yblog.notesLabel.domain;

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
 * 【请填写功能名称】对象 y_notes_label
 * 
 * @author ruoyi
 * @date 2022-06-19
 */

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("y_web_menu")
public class YNotesLabel extends Model<YNotesLabel>
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** $column.columnComment */
    @Excel(name = "标签名称")
    private String label;
}
