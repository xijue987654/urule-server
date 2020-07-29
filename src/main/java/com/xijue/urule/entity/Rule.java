package com.xijue.urule.entity;

import com.bstek.urule.model.Label;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: xijue987654
 * Date: Created in 2020/7/16 10:06
 * Version: 1.0
 */
public class Rule implements Serializable {

    /**
     * 自增ID
     */
    @Label("自增主键")
    private Integer rid;

    /**
     * 产品ID
     */
    @Label("id")
    private String id;

    /**
     * 域账号
     */
    @Label("创建人")
    private String addBy;

    /**
     * 添加日期
     */
    @Label("创建时间")
    private Date addTime;

    /**
     * 域账号
     */
    @Label("更新人")
    private String updatedBy;

    /**
     * 最后更新日期
     */
    @Label("更新时间")
    private Date updatedTime;

    @Label("删除标志")
    private String isDeleted;

    @Label("规则名称")
    private String ruleName;

    @Label("规则详情")
    private String ruleDetail;

    @Label("包名")
    private String packageName;

    @Label("是否可见")
    private Integer visible;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddBy() {
        return addBy;
    }

    public void setAddBy(String addBy) {
        this.addBy = addBy;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleDetail() {
        return ruleDetail;
    }

    public void setRuleDetail(String ruleDetail) {
        this.ruleDetail = ruleDetail;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }
}
