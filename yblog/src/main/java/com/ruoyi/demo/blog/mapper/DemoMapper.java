package com.ruoyi.demo.blog.mapper;

import java.util.List;
import com.ruoyi.demo.blog.domain.Demo;
import com.ruoyi.demo.blog.domain.Demo;

/**
 * 465645Mapper接口
 * 
 * @author 111
 * @date 2022-06-12
 */
public interface DemoMapper 
{
    /**
     * 查询465645
     * 
     * @param id 465645主键
     * @return 465645
     */
    public Demo selectDemoById(Long id);

    /**
     * 查询465645列表
     * 
     * @param demo 465645
     * @return 465645集合
     */
    public List<Demo> selectDemoList(Demo demo);

    /**
     * 新增465645
     * 
     * @param demo 465645
     * @return 结果
     */
    public int insertDemo(Demo demo);

    /**
     * 修改465645
     * 
     * @param demo 465645
     * @return 结果
     */
    public int updateDemo(Demo demo);

    /**
     * 删除465645
     * 
     * @param id 465645主键
     * @return 结果
     */
    public int deleteDemoById(Long id);

    /**
     * 批量删除465645
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDemoByIds(String[] ids);
}
