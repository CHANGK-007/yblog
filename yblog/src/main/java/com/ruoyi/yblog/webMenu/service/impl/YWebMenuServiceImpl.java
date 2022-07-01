package com.ruoyi.yblog.webMenu.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.yblog.util.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.yblog.webMenu.mapper.YWebMenuMapper;
import com.ruoyi.yblog.webMenu.domain.YWebMenu;
import com.ruoyi.yblog.webMenu.service.IYWebMenuService;

import static com.ruoyi.common.utils.ShiroUtils.getLoginName;

/**
 * web菜单  Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
@Service
public class YWebMenuServiceImpl implements IYWebMenuService
{
    @Autowired
    private YWebMenuMapper yWebMenuMapper;

    /**
     * 查询web菜单
     *
     * @param id web菜单主键
     * @return web菜单
     */
    @Override
    public YWebMenu selectYWebMenuById(Long id)
    {
        return yWebMenuMapper.selectYWebMenuById(id);
    }

    /**
     * 查询web菜单列表
     *
     * @return web菜单
     */
    @Override
    public Page selectYWebMenuList(Page<Map<String, Object>> page, Map<String, Object> map)
    {
        return page.setRecords(yWebMenuMapper.selectYWebMenuList(page,map));
    }

    /**
     * 添加web菜单
     *
     * @param yWebMenu web菜单
     * @return 结果
     */
    @Override
    public int insertYWebMenu(ParamMap map)
    {
        YWebMenu yWebMenu = map.toBean(YWebMenu.class);
        yWebMenu.setCreateTime(new Date());
        yWebMenu.setUpdateTime(new Date());
        yWebMenu.setCreateBy(getLoginName());
        yWebMenu.setUpdateBy(getLoginName());
        return yWebMenuMapper.insertYWebMenu(yWebMenu);
    }

    /**
     * 修改web菜单
     *
     * @param yWebMenu web菜单
     * @return 结果
     */
    @Override
    public int updateYWebMenu(ParamMap map)
    {
        YWebMenu yWebMenu = map.toBean(YWebMenu.class);
        yWebMenu.setUpdateTime(new Date());
        yWebMenu.setUpdateBy(getLoginName());
        AjaxResult ajaxResult = new AjaxResult();
        return yWebMenuMapper.updateYWebMenu(yWebMenu);
    }

    /**
     * 删除web菜单
     *
     * @return 结果
     */
    @Override
    public int deleteYWebMenuById(ParamMap map)
    {
        Long id=map.getInt("id").longValue();
        return yWebMenuMapper.deleteYWebMenuById(id);
    }

    @Override
    public List<Map> selectMenu(ParamMap map) {
        Long id=map.getInt("moduleId").longValue();
        return yWebMenuMapper.selectMenu(id);
    }
}
