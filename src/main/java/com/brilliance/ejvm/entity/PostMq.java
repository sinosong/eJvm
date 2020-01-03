package com.brilliance.ejvm.entity;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * mq 消息对象
 * 
 * @author lzm
 * @version 创建时间：2019年8月17日 上午11:20:06
 */
public class PostMq {
	private String caller;
	/**
	 * 动态类型 1关注店铺 2商品收藏 3商品分享 4店铺分享 5商品好评 6动态点赞 7动态分享
	 */
	private Integer postType;
	/**
	 * 业务id 动态分享/点赞为分享动态id
	 */
	private Long businessId;
	private Long publishTime;
	private Long poster;
	/**
	 * customizationId定制id
	 * coffeId 咖啡id
	 */
	private Map<String, String> ext;

	public String getCaller() {
		return caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
	}

	public Integer getPostType() {
		return postType;
	}

	public void setPostType(Integer postType) {
		this.postType = postType;
	}

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public Long getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Long publishTime) {
		this.publishTime = publishTime;
	}

	public Long getPoster() {
		return poster;
	}

	public void setPoster(Long poster) {
		this.poster = poster;
	}

	public Map<String, String> getExt() {
		return ext;
	}

	public void setExt(Map<String, String> ext) {
		this.ext = ext;
	}

	public String formatMqBoby() {
		return JSON.toJSONString(this);
	}
}
