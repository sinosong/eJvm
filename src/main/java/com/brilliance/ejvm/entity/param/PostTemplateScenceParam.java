package com.brilliance.ejvm.entity.param;


import com.brilliance.ejvm.entity.param.BaseParam;

/**
 * 动态模板场景参数
 */
public class PostTemplateScenceParam extends BaseParam {

    private static final long serialVersionUID = 1L;

    private Integer templateSence;


    public Integer getTemplateSence() {
        return templateSence;
    }

    public void setTemplateSence(Integer templateSence) {
        this.templateSence = templateSence;
    }
}
