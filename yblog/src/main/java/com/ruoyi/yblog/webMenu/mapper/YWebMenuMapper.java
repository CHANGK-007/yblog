package com.ruoyi.yblog.webMenu.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.yblog.webMenu.domain.YWebMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * web菜单Mapper接口
 * 
 * @author kc
 * @date 2022-06-16
 */
@Mapper
public interface YWebMenuMapper extends BaseMapper<YWebMenu>
{
    /**
     * 查询web菜单
     * 
     * @param id web菜单主键
     * @return web菜单
     */
    public YWebMenu selectYWebMenuById(Long id);

    /**
     * 查询web菜单列表
     *
     * @return web菜单集合
     */
    public List<Map<String, Object>> selectYWebMenuList(Page<Map<String, Object>> page,@Param("map") Map<String, Object> map);

    /**
     * 新增web菜单
     * 
     * @param yWebMenu web菜单
     * @return 结果
     */
    public int insertYWebMenu(YWebMenu yWebMenu);

    /**
     * 修改web菜单
     *
     * @param yWebMenu web菜单
     * @return 结果
     */
    public int updateYWebMenu(YWebMenu yWebMenu);

    /**
     * 删除web菜单
     *
     * @return 结果
     */
    public int deleteYWebMenuById(Long id);

    List<Map> selectMenu(Long id);
}
