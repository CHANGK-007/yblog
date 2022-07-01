package com.ruoyi.yblog.notes.controller;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.yblog.util.ParamMap;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.yblog.notes.domain.YNotes;
import com.ruoyi.yblog.notes.service.IYNotesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 笔记Controller
 * 
 * @author ruoyi
 * @date 2022-06-16
 */
@Controller
@RequestMapping("/yblog/notes")
public class YNotesController extends BaseController
{
    private String prefix = "yblog/notes";

    @Autowired
    private IYNotesService yNotesService;

    @GetMapping()
    public String notes(@RequestParam(value = "id") Long id,ModelMap mmap)
    {
        mmap.put("id", id);
        return prefix + "/notes";
    }

    /**
     * 查询笔记列表
     */
    @PostMapping("/list")
    @ResponseBody
    @CrossOrigin
    public Page list(@RequestBody Map<String,Object> map)
    {
        Page<Map<String,Object>> page = new Page<>(Integer.parseInt(map.get("pageNum").toString()),Integer.parseInt(map.get("pageSize").toString()));
        return yNotesService.selectYNotesList(page,map);
    }
    /**
     * 查询笔记列表 top5
     */
    @PostMapping("/listTop")
    @ResponseBody
    @CrossOrigin
    public Page listTop()
    {
        Page<Map<String,Object>> page = new Page<>(1,5);
        return yNotesService.selectYNotesListTop(page);
    }

    /**
     * 跳转添加笔记
     */
    @GetMapping("/goadd")
    public String goadd(@RequestParam(value = "menuid") Long menuid,@RequestParam(value = "tag") String tag,ModelMap mmap)
    {
        mmap.put("menuid", menuid);
        mmap.put("tag", tag);
        return prefix + "/notesAdd";
    }
    /**
     * 跳转修改笔记
     */
    @GetMapping("/goeditor")
    public String goeditor(@RequestParam(value = "menuid") Long menuid,@RequestParam(value = "id") Long id,@RequestParam(value = "tag") String tag,ModelMap mmap)
    {
        mmap.put("menuid", menuid);
        mmap.put("id", id);
        mmap.put("tag", tag);
        return prefix + "/notesAdd";
    }
    /**
     * 添加笔记
     */
    @PostMapping("/notesAdd")
    @ResponseBody
    public AjaxResult notesAdd(@RequestBody ParamMap map)
    {
        return toAjax(yNotesService.insertYNotes(map));
    }
    /**
     * 添加笔记
     */
    @PostMapping("/notesEditor")
    @ResponseBody
    public AjaxResult notesEditor(@RequestBody ParamMap map)
    {
        return toAjax(yNotesService.updateYNotes(map));
    }

    @PostMapping("/selectYNotesById")
    @ResponseBody
    @CrossOrigin
    public YNotes selectYNotesById(@RequestBody ParamMap map)
    {
        return yNotesService.selectYNotesById(map);
    }

    /**
     * 删除 web 菜单
     */
    @PostMapping("/delete")
    @ResponseBody
    public AjaxResult delete(@RequestBody ParamMap map)
    {
        return toAjax(yNotesService.deleteYNotesById(map));
    }

}
