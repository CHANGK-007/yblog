package com.ruoyi.yblog.module.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.yblog.module.domain.YModule;

/**
 * 菜单--模块Service接口
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
public interface IYModuleService 
{
    /**
     * 查询菜单--模块
     * 
     * @param id 菜单--模块主键
     * @return 菜单--模块
     */
    public YModule selectYModuleById(Long id);

    /**
     * 查询菜单--模块列表
     *
     * @return 菜单--模块集合
     */
    public List<Map<String, Object>> selectYModuleList();

    public List<Map> selectModele();
}
