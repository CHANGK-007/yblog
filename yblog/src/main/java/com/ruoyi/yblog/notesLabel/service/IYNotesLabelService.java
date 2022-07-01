package com.ruoyi.yblog.notesLabel.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.yblog.notesLabel.domain.YNotesLabel;
import com.ruoyi.yblog.util.ParamMap;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-06-19
 */
public interface IYNotesLabelService 
{
    /**
     * 查询笔记标签 列表
     * @param map
     * @return
     */
    List<Map> labelList();
}
