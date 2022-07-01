package com.ruoyi.yblog.notesLabel.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.yblog.util.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.yblog.notesLabel.mapper.YNotesLabelMapper;
import com.ruoyi.yblog.notesLabel.domain.YNotesLabel;
import com.ruoyi.yblog.notesLabel.service.IYNotesLabelService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-06-19
 */
@Service
public class YNotesLabelServiceImpl implements IYNotesLabelService 
{
    @Autowired
    private YNotesLabelMapper yNotesLabelMapper;

    /**
     * 查询笔记标签 列表
     * @param map
     * @return
     */
    @Override
    public List<Map> labelList() {
        return yNotesLabelMapper.labelList();
    }
}
