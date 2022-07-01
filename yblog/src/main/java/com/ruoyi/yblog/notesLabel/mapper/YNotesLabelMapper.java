package com.ruoyi.yblog.notesLabel.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.yblog.notesLabel.domain.YNotesLabel;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-06-19
 */
@Mapper
public interface YNotesLabelMapper 
{
    List<Map> labelList();
}
