package com.ruoyi.yblog.webMenu.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.yblog.util.ParamMap;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.yblog.webMenu.domain.YWebMenu;
import com.ruoyi.yblog.webMenu.service.IYWebMenuService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 *  web菜单 Controller
 * 
 * @author kc
 * @date 2022-06-16
 */
@Controller
@RequestMapping("/yblog/webMenu")
public class YWebMenuController extends BaseController
{
    private String prefix = "yblog/webMenu";

    @Autowired
    private IYWebMenuService yWebMenuService;

    @GetMapping()
    public String menu(@RequestParam(value = "id") Long id , ModelMap mmap)
    {
        mmap.put("id", id);
        return prefix + "/webMenuList";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public Page list(@RequestBody Map<String,Object> map)
    {
        Page<Map<String,Object>> page = new Page<>(Integer.parseInt(map.get("pageNum").toString()),Integer.parseInt(map.get("pageSize").toString()));
        return yWebMenuService.selectYWebMenuList(page,map);
    }

    /**
     * 添加 web 菜单
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult add(@RequestBody ParamMap map)
    {
        return toAjax(yWebMenuService.insertYWebMenu(map));
    }


    /**
     * 修改 web 菜单
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult edit(@RequestBody ParamMap map)
    {
        return toAjax(yWebMenuService.updateYWebMenu(map));
    }

    /**
     * 删除 web 菜单
     */
    @PostMapping("/delete")
    @ResponseBody
    public AjaxResult delete(@RequestBody ParamMap map)
    {
        return toAjax(yWebMenuService.deleteYWebMenuById(map));
    }

    @PostMapping("/menuList")
    @ResponseBody
    @CrossOrigin
    public List<Map> menuList(@RequestBody ParamMap map)
    {
        return yWebMenuService.selectMenu(map);
    }
}
