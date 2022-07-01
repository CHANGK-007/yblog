package com.ruoyi.yblog.webMenu.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.yblog.util.ParamMap;
import com.ruoyi.yblog.webMenu.domain.YWebMenu;

/**
 * web菜单Service接口
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
public interface IYWebMenuService 
{
    /**
     * 查询web菜单
     * 
     * @param id web菜单主键
     * @return web菜单
     */
    YWebMenu selectYWebMenuById(Long id);

    /**
     * 查询web菜单列表
     *
     * @return web菜单集合
     */
    Page<YWebMenu> selectYWebMenuList(Page<Map<String, Object>> page, Map<String, Object> map);

    /**
     * 新增web菜单
     * 
     * @param yWebMenu web菜单
     * @return 结果
     */
    int insertYWebMenu(ParamMap map);


    /**
     * 修改web菜单
     *
     * @param yWebMenu web菜单
     * @return 结果
     */
    int updateYWebMenu(ParamMap map);

    /**
     * 删除web菜单
     *
     * @return 结果
     */
    int deleteYWebMenuById(ParamMap map);

    List<Map> selectMenu(ParamMap map);
}
