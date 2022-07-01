package com.ruoyi.yblog.module.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.yblog.module.mapper.YModuleMapper;
import com.ruoyi.yblog.module.domain.YModule;
import com.ruoyi.yblog.module.service.IYModuleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 菜单--模块Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
@Service
public class YModuleServiceImpl implements IYModuleService 
{
    @Autowired
    private YModuleMapper yModuleMapper;

    /**
     * 查询菜单--模块
     * 
     * @param id 菜单--模块主键
     * @return 菜单--模块
     */
    @Override
    public YModule selectYModuleById(Long id)
    {
        return yModuleMapper.selectYModuleById(id);
    }

    /**
     * 查询菜单--模块列表
     *
     * @return 菜单--模块
     */
    @Override
    public List<Map<String, Object>> selectYModuleList()
    {
        return yModuleMapper.selectYModuleList();
    }

    @Override
    public List<Map> selectModele()
    {
        return yModuleMapper.selectModele();
    }

}
