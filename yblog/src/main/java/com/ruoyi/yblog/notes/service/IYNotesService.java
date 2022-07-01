package com.ruoyi.yblog.notes.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.yblog.notes.domain.YNotes;
import com.ruoyi.yblog.util.ParamMap;

/**
 * 笔记Service接口
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
public interface IYNotesService 
{
    /**
     * 查询笔记
     * 
     * @param id 笔记主键
     * @return 笔记
     */
    YNotes selectYNotesById(ParamMap map);

    /**
     * 查询笔记列表
     * 
     *
     * @param page
     * @param map
     * @return 笔记集合
     */
    Page selectYNotesList(Page<Map<String, Object>> page, Map<String, Object> map);

    /**
     * 新增笔记
     * 
     * @param yNotes 笔记
     * @return 结果
     */
    int insertYNotes(ParamMap map);

    int deleteYNotesById(ParamMap map);

    int updateYNotes(ParamMap map);

    Page selectYNotesListTop(Page<Map<String, Object>> page);
}
