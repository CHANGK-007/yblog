package com.ruoyi.demo.blog.service;

import java.util.List;
import com.ruoyi.demo.blog.domain.Demo;
import com.ruoyi.demo.blog.domain.Demo;

/**
 * 465645Service接口
 * 
 * @author 111
 * @date 2022-06-12
 */
public interface IDemoService 
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
     * 批量删除465645
     * 
     * @param ids 需要删除的465645主键集合
     * @return 结果
     */
    public int deleteDemoByIds(String ids);

    /**
     * 删除465645信息
     * 
     * @param id 465645主键
     * @return 结果
     */
    public int deleteDemoById(Long id);
}
