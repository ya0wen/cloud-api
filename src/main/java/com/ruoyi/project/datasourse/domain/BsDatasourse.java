package com.ruoyi.project.datasourse.domain;

import lombok.Data;
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
@Data
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

    private String dataSourseDriver;

}
