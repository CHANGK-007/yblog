package com.ruoyi.demo.blog.controller;

import java.util.List;

import com.ruoyi.demo.blog.domain.Demo;
import com.ruoyi.demo.blog.service.IDemoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.demo.blog.domain.Demo;
import com.ruoyi.demo.blog.service.IDemoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 465645Controller
 * 
 * @author 111
 * @date 2022-06-12
 */
@Controller
@RequestMapping("/system/demo")
public class DemoController extends BaseController
{
    private String prefix = "blog/";

    @Autowired
    private IDemoService demoService;

    @RequiresPermissions("system:demo:view")
    @GetMapping()
    public String demo()
    {
        return prefix + "/notesList";
    }

    /**
     * 查询465645列表
     */
//    @RequiresPermissions("system:demo:list")
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public TableDataInfo list(Demo demo)
    {
        startPage();
        List<Demo> list = demoService.selectDemoList(demo);
        return getDataTable(list);
    }

    /**
     * 导出465645列表
     */
    @RequiresPermissions("system:demo:export")
    @Log(title = "465645", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Demo demo)
    {
        List<Demo> list = demoService.selectDemoList(demo);
        ExcelUtil<Demo> util = new ExcelUtil<Demo>(Demo.class);
        return util.exportExcel(list, "465645数据");
    }

    /**
     * 新增465645
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存465645
     */
    @RequiresPermissions("system:demo:add")
    @Log(title = "465645", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Demo demo)
    {
        return toAjax(demoService.insertDemo(demo));
    }

    /**
     * 修改465645
     */
    @RequiresPermissions("system:demo:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Demo demo = demoService.selectDemoById(id);
        mmap.put("demo", demo);
        return prefix + "/edit";
    }

    /**
     * 修改保存465645
     */
    @RequiresPermissions("system:demo:edit")
    @Log(title = "465645", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Demo demo)
    {
        return toAjax(demoService.updateDemo(demo));
    }

    /**
     * 删除465645
     */
    @RequiresPermissions("system:demo:remove")
    @Log(title = "465645", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(demoService.deleteDemoByIds(ids));
    }
}
