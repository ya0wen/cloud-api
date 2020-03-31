package com.yw.project.datasourse.controller;

import java.util.List;

import com.yw.common.utils.sql.JDBCConnectionUtil;
import com.yw.project.datasourse.domain.BsDatasourse;
import com.yw.project.datasourse.service.IBsDatasourseService;
import org.springframework.data.annotation.Id;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yw.framework.aspectj.lang.annotation.Log;
import com.yw.framework.aspectj.lang.enums.BusinessType;
import com.yw.framework.web.controller.BaseController;
import com.yw.framework.web.domain.AjaxResult;
import com.yw.common.utils.poi.ExcelUtil;
import com.yw.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author yw
 * @date 2020-03-30
 */
@RestController
@RequestMapping("/datasourse/datasourse")
public class BsDatasourseController extends BaseController
{
    @Autowired
    private IBsDatasourseService bsDatasourseService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('datasourse:datasourse:list')")
    @GetMapping("/list")
    public TableDataInfo list(BsDatasourse bsDatasourse)
    {
        startPage();
        List<BsDatasourse> list = bsDatasourseService.selectBsDatasourseList(bsDatasourse);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('datasourse:datasourse:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(BsDatasourse bsDatasourse)
    {
        List<BsDatasourse> list = bsDatasourseService.selectBsDatasourseList(bsDatasourse);
        ExcelUtil<BsDatasourse> util = new ExcelUtil<BsDatasourse>(BsDatasourse.class);
        return util.exportExcel(list, "datasourse");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('datasourse:datasourse:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bsDatasourseService.selectBsDatasourseById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('datasourse:datasourse:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BsDatasourse bsDatasourse)
    {
        return toAjax(bsDatasourseService.insertBsDatasourse(bsDatasourse));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('datasourse:datasourse:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BsDatasourse bsDatasourse)
    {
        return toAjax(bsDatasourseService.updateBsDatasourse(bsDatasourse));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('datasourse:datasourse:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bsDatasourseService.deleteBsDatasourseByIds(ids));
    }


    /**
     * 测试jdbc连接
     * @param id
     * @return
     */
    @PostMapping("/test-jdbc/{id}")
    public AjaxResult testJdbcConConnection(@PathVariable Long id)
    {
        BsDatasourse bsDatasourse = bsDatasourseService.selectBsDatasourseById(id);

        try {
            JDBCConnectionUtil.getConnection(bsDatasourse.getDataSourseUrl(),bsDatasourse.getDataSourseName(),bsDatasourse.getDataSoursePassword(),bsDatasourse.getDataSourseDriver());
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.error(e.getMessage());
        }
        return AjaxResult.success("连接成功");
    }
}
