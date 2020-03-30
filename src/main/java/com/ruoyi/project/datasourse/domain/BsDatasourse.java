package com.ruoyi.project.datasourse.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 bs_datasourse
 * 
 * @author ruoyi
 * @date 2020-03-30
 */
public class BsDatasourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private Long id;

    /** $column.columnComment */
    private String dataSourseUrl;

    /** $column.columnComment */
    private String dataSourseName;

    /** $column.columnComment */
    private String dataSoursePassword;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDataSourseUrl(String dataSourseUrl) 
    {
        this.dataSourseUrl = dataSourseUrl;
    }

    public String getDataSourseUrl() 
    {
        return dataSourseUrl;
    }
    public void setDataSourseName(String dataSourseName) 
    {
        this.dataSourseName = dataSourseName;
    }

    public String getDataSourseName() 
    {
        return dataSourseName;
    }
    public void setDataSoursePassword(String dataSoursePassword) 
    {
        this.dataSoursePassword = dataSoursePassword;
    }

    public String getDataSoursePassword() 
    {
        return dataSoursePassword;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dataSourseUrl", getDataSourseUrl())
            .append("dataSourseName", getDataSourseName())
            .append("dataSoursePassword", getDataSoursePassword())
            .toString();
    }
}
