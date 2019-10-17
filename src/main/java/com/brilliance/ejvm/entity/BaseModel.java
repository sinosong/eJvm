package com.brilliance.ejvm.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * @author sinosong
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseModel implements Serializable {
	@TableId(value = "id_", type = IdType.ID_WORKER)
	private Long id;
	@TableField("enable_")
	private Integer enable;
	@TableField("remark_")
	private String remark;
	private Long createBy;
	private Date createTime;
	private Long updateBy;
	private Date updateTime;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	public String getId_() {
		return id == null ? "" : id.toString();
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the enable
	 */
	public Integer getEnable() {
		return enable;
	}

	/**
	 * @param enable
	 *            the enable to set
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * @return the createBy
	 */
	public Long getCreateBy() {
		return createBy;
	}

	/**
	 * @param createBy
	 *            the createBy to set
	 */
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateBy
	 */
	public Long getUpdateBy() {
		return updateBy;
	}

	/**
	 * @param updateBy
	 *            the updateBy to set
	 */
	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("id", id)
				.add("enable", enable)
				.add("remark", remark)
				.add("createBy", createBy)
				.add("createTime", createTime)
				.add("updateBy", updateBy)
				.add("updateTime", updateTime)
				.toString();
	}
}
