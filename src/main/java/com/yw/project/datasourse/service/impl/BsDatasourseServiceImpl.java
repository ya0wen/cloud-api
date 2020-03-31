package com.yw.project.datasourse.service.impl;

import java.util.List;

import com.yw.project.datasourse.service.IBsDatasourseService;
import com.yw.project.datasourse.domain.BsDatasourse;
import com.yw.project.datasourse.mapper.BsDatasourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yw
 * @date 2020-03-30
 */
@Service
public class BsDatasourseServiceImpl implements IBsDatasourseService
{
    @Autowired
    private BsDatasourseMapper bsDatasourseMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BsDatasourse selectBsDatasourseById(Long id)
    {
        return bsDatasourseMapper.selectBsDatasourseById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bsDatasourse 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BsDatasourse> selectBsDatasourseList(BsDatasourse bsDatasourse)
    {
        return bsDatasourseMapper.selectBsDatasourseList(bsDatasourse);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bsDatasourse 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBsDatasourse(BsDatasourse bsDatasourse)
    {
        return bsDatasourseMapper.insertBsDatasourse(bsDatasourse);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bsDatasourse 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBsDatasourse(BsDatasourse bsDatasourse)
    {
        return bsDatasourseMapper.updateBsDatasourse(bsDatasourse);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBsDatasourseByIds(Long[] ids)
    {
        return bsDatasourseMapper.deleteBsDatasourseByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBsDatasourseById(Long id)
    {
        return bsDatasourseMapper.deleteBsDatasourseById(id);
    }
}
