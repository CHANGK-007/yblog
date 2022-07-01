package com.ruoyi.yblog.notes.service.impl;

import java.util.Date;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.yblog.util.ParamMap;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.yblog.notes.mapper.YNotesMapper;
import com.ruoyi.yblog.notes.domain.YNotes;
import com.ruoyi.yblog.notes.service.IYNotesService;
import com.ruoyi.common.core.text.Convert;

import static com.ruoyi.common.utils.ShiroUtils.getLoginName;

/**
 * 笔记Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
@Service
public class YNotesServiceImpl implements IYNotesService 
{
    @Autowired
    private YNotesMapper yNotesMapper;

    /**
     * 查询笔记
     * 
     * @param id 笔记主键
     * @return 笔记
     */
    @Override
    public YNotes selectYNotesById(ParamMap map)
    {
        Long id=map.getInt("id").longValue();
        return yNotesMapper.selectYNotesById(id);
    }

    /**
     * 查询笔记列表
     * 
     *
     * @param page 分页
     * @param map 查询条件
     * @return 笔记
     */
    @Override
    public Page selectYNotesList(Page<Map<String, Object>> page, Map<String, Object> map)
    {
        return  page.setRecords(yNotesMapper.selectYNotesList(page,map));
    }

    /**
     * 新增笔记
     * 
     * @param map 笔记
     * @return 结果
     */
    @Override
    public int insertYNotes(@NotNull ParamMap map)
    {
        YNotes yNotes = map.toBean(YNotes.class);
        yNotes.setCreateTime(new Date());
        yNotes.setUpdateTime(new Date());
        yNotes.setCreateBy(getLoginName());
        yNotes.setUpdateBy(getLoginName());
        return yNotesMapper.insertYNotes(yNotes);
    }

    @Override
    public int deleteYNotesById(ParamMap map) {
        Long id=map.getInt("id").longValue();
        return yNotesMapper.deleteYNotesById(id);
    }

    @Override
    public int updateYNotes(ParamMap map) {
        YNotes yNotes = map.toBean(YNotes.class);
        yNotes.setUpdateTime(new Date());
        yNotes.setUpdateBy(getLoginName());
        return yNotesMapper.updateYNotes(yNotes);
    }

    @Override
    public Page selectYNotesListTop(Page<Map<String, Object>> page) {
        return  page.setRecords(yNotesMapper.selectYNotesListTop(page));
    }

}
