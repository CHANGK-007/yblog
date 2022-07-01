package com.ruoyi.yblog.module.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.yblog.module.service.IYModuleService;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 菜单--模块Controller
 * 
 * @author kc
 * @date 2022-06-16
 */
@Controller
@RequestMapping("/yblog/module")
public class YModuleController extends BaseController
{
    private String prefix = "yblog/module";

    @Autowired
    private IYModuleService yModuleService;

    @GetMapping()
    public String module()
    {
        return prefix + "/module";
    }

    /**
     * 查询菜单--模块列表
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public List<Map<String, Object>> list()
    {
        return yModuleService.selectYModuleList();
    }

    /**
     * 查询菜单--模块下拉框
     */
    @PostMapping("/moduleList")
    @ResponseBody
    public List<Map> moduleList()
    {
        return yModuleService.selectModele();
    }
}
