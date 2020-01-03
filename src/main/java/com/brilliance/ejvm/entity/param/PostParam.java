package com.brilliance.ejvm.entity.param;

import java.util.List;
import java.util.Map;

public class PostParam {
	private Long postId;
	/**
	 * 动态类型 1关注店铺 2商品收藏 3商品分享 4店铺分享 5商品好评 6动态点赞 7动态分享
	 */
	private Integer postType;
	/**
	 * 业务id
	 * 1关注店铺-shopId
	 * 2商品收藏-spuId
	 * 3商品分享-skuId
	 * 4店铺分享-shopId
	 * 5商品好评-commentId
	 * 6动态点赞-postId
	 * 7动态分享-postId
	 * 8大v分享-当前大v的uid
	 * 9主动发布-如果有商品，商品suid。如果没有是null
	 * 100100-裂变-帮签：签到id
	 * 100200-裂变-抽奖：抽奖id
	 * 100300-裂变-一起拼：团id
	 * 100400-裂变-红包：红包id
	 * 110100-商家-店铺上新：skuId（商品id）
	 * 110200-商家-订单生产：orderId（订单id）
	 * 110300-商家-发货：orderId（订单id）
	 * 110400-商家-签收：orderId（订单id）
	 * 110500-商家-订单行退款：orderId（订单id）[裂变相关id传入]
	 */
	private Long businessId;
	private Long publishTime;

	/**
	 * 可见性 0 不可见 1 仅自己可见 2 好友可见
	 */
	private Integer visible;

	private Integer postRole;

	private Long poster;
	/**
	 * customizationId定制id coffeId 咖啡id
	 */
	private Map<String, String> ext;
	/**
	 * 动态文案
	 */
	private String postContent;
	/**
	 * 动态图片
	 */
	private List<String> postImages;
	/**
	 * 动态文本是否需要审核
	 */
	private Boolean needAuditContent = false;
	/**
	 * 动态文本是否使用模板文案
	 */
	private Boolean userTemplate = false;
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

	public Integer getVisible() {
		return visible;
	}

	public void setVisible(Integer visible) {
		this.visible = visible;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Integer getPostRole() {
		return postRole;
	}

	public void setPostRole(Integer postRole) {
		this.postRole = postRole;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public List<String> getPostImages() {
		return postImages;
	}

	public void setPostImages(List<String> postImages) {
		this.postImages = postImages;
	}

	public Boolean getNeedAuditContent() {
		return needAuditContent;
	}

	public void setNeedAuditContent(Boolean needAuditContent) {
		this.needAuditContent = needAuditContent;
	}

	public Boolean getUserTemplate() {
		return userTemplate;
	}

	public void setUserTemplate(Boolean userTemplate) {
		this.userTemplate = userTemplate;
	}
}
