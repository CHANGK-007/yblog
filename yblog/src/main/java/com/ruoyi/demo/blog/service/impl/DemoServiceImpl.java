package com.ruoyi.demo.blog.service.impl;

import java.util.List;

import com.ruoyi.demo.blog.domain.Demo;
import com.ruoyi.demo.blog.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.demo.blog.mapper.DemoMapper;
import com.ruoyi.demo.blog.domain.Demo;
import com.ruoyi.demo.blog.service.IDemoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 465645Service业务层处理
 * 
 * @author 111
 * @date 2022-06-12
 */
@Service
public class DemoServiceImpl implements IDemoService 
{
    @Autowired
    private DemoMapper demoMapper;

    /**
     * 查询465645
     * 
     * @param id 465645主键
     * @return 465645
     */
    @Override
    public Demo selectDemoById(Long id)
    {
        return demoMapper.selectDemoById(id);
    }

    /**
     * 查询465645列表
     * 
     * @param demo 465645
     * @return 465645
     */
    @Override
    public List<Demo> selectDemoList(Demo demo)
    {
        return demoMapper.selectDemoList(demo);
    }

    /**
     * 新增465645
     * 
     * @param demo 465645
     * @return 结果
     */
    @Override
    public int insertDemo(Demo demo)
    {
        return demoMapper.insertDemo(demo);
    }

    /**
     * 修改465645
     * 
     * @param demo 465645
     * @return 结果
     */
    @Override
    public int updateDemo(Demo demo)
    {
        return demoMapper.updateDemo(demo);
    }

    /**
     * 批量删除465645
     * 
     * @param ids 需要删除的465645主键
     * @return 结果
     */
    @Override
    public int deleteDemoByIds(String ids)
    {
        return demoMapper.deleteDemoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除465645信息
     * 
     * @param id 465645主键
     * @return 结果
     */
    @Override
    public int deleteDemoById(Long id)
    {
        return demoMapper.deleteDemoById(id);
    }
}
