package com.ruoyi.yblog.module.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.yblog.module.domain.YModule;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单--模块Mapper接口
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
@Mapper
public interface YModuleMapper extends BaseMapper<YModule>
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
