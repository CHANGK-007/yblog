package com.ruoyi.yblog.notes.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.yblog.notes.domain.YNotes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 笔记Mapper接口
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
@Mapper
public interface YNotesMapper extends BaseMapper<YNotes>
{
    /**
     * 查询笔记
     * 
     * @param id 笔记主键
     * @return 笔记
     */
    YNotes selectYNotesById(Long id);

    /**
     * 查询笔记列表
     * 
     * @param yNotes 笔记
     * @return 笔记集合
     */
    List<Map<String, Object>> selectYNotesList(Page<Map<String, Object>> page,@Param("map") Map<String, Object> map);

    /**
     * 新增笔记
     * 
     * @param yNotes 笔记
     * @return 结果
     */
    int insertYNotes(YNotes yNotes);

    int deleteYNotesById(Long id);

    int updateYNotes(YNotes yNotes);

    List<Map<String, Object>> selectYNotesListTop(Page<Map<String, Object>> page);
}
