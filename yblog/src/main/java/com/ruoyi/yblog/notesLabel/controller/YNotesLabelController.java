package com.ruoyi.yblog.notesLabel.controller;

import java.util.List;
import java.util.Map;

import com.ruoyi.yblog.util.ParamMap;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.yblog.notesLabel.domain.YNotesLabel;
import com.ruoyi.yblog.notesLabel.service.IYNotesLabelService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2022-06-19
 */
@Controller
@RequestMapping("/yblog/label")
public class YNotesLabelController extends BaseController
{
    private String prefix = "system/label";

    @Autowired
    private IYNotesLabelService yNotesLabelService;
    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/labelList")
    @ResponseBody
    public List<Map> labelList(@RequestBody ParamMap map)
    {
        return yNotesLabelService.labelList();
    }

}
