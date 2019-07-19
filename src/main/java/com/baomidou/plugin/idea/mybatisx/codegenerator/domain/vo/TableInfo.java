package com.baomidou.plugin.idea.mybatisx.codegenerator.domain.vo;

/**
 * 表的数据信息
 *
 */

public class TableInfo {

    /** 表名称 **/
    private Object tableName;

    /** 创建日期 **/
    private Object createTime;

    // 数据库引擎
    private Object engine;

    // 编码集
    private Object coding;

    // 备注
    private Object remark;

    public Object getTableName() {
        return tableName;
    }

    public void setTableName(Object tableName) {
        this.tableName = tableName;
    }

    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public Object getEngine() {
        return engine;
    }

    public void setEngine(Object engine) {
        this.engine = engine;
    }

    public Object getCoding() {
        return coding;
    }

    public void setCoding(Object coding) {
        this.coding = coding;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }
}