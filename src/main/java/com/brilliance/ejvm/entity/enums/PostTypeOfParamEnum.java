package com.brilliance.ejvm.entity.enums;


/**
 * @author Administrator
 */

public enum PostTypeOfParamEnum {
    /*关注店铺*/
    SHOP_ATTENTION(1, "用户对店铺的关注"),
    /* 收藏商品 */
    PRODUCT_COLLECT(2, "用户对商品的收藏"),
    /* 分享商品 */
    PRODUCT_SHARE(3, "用户对商品分享"),
    /* 分享店铺 */
    SHOP_SHARE(4, "用户对店铺的分享"),
    /* 好评商品 */
    PRODUCT_COMMENT(5, "用户的好评信息"),
    /* 点赞动态 */
    POST_THUMBSUP(6, "点赞"),
    /* 分享动态 */
    POST_SHARE(7, "必要朋友分享动态"),
    /* 分享大V、企业定制 */
    VIP_SHARE(8, "分享大V、企业定制"),
    /* 主动发布动态 */
    POST_PUBLISH(9, "主动发布动态"),
    /* 裂变-帮签 */
    FISSION_SIGN(100100, "裂变-帮签"),
    /* 裂变-抽奖 */
    FISSION_LOTTERY(100200, "裂变-抽奖"),
    /* 裂变-一起拼 */
    FISSION_TOGETHER(100300, "裂变-一起拼"),
    /* 裂变-红包 */
    FISSION_REDPACKAGE(100400, "裂变-红包-发起者"),
    /* 商家-店铺上新 */
    SHOP_NEW(110100, "商家-店铺上新"),
    /* 商家-订单生产 */
    SHOP_MAKEORDER(110200, "商家-订单生产"),
    /* 商家-发货 */
    SHOP_DELIVER(110300, "商家-发货"),
    /* 商家-签收 */
    SHOP_SIGNFOR(110400, "商家-签收"),
    /* 商家-订单行退款 */
    SHOP_RETURN(110500, "商家-订单行退款"),
    /* 好友点赞咖啡商品 */
    THUMBS_UP_COFFEE(130001, "好友点赞咖啡商品"),
    /* 分享咖啡馆到微信好友、微信朋友圈 */
    SHARE_CAFE_TO_WECHAT(130004, "分享咖啡馆到微信好友、微信朋友圈"),
    /** 抢夺类 */
    SNATCH_BASE(120010,"抢夺类通用枚举"),
    /** 抢返现卡 */
    SNATCH_CASH(120110,"返现卡"),
    /** 抢参团卡 */
    SNATCH_GROUP(120210,"参团卡"),
    /** 抢全民拼卡 */
    SNATCH_JOIN(120310,"全民拼卡"),
    /** 抢金币 */
    TAKEGOLDCOIN(120410,"金币"),
    /** 抢特权金 */
    PRIVILEGE(130110,"特权金"),
    /** 老客拉新 */
    INVITE(140110,"老客拉新");

    public final int type;
    public final String desc;

    PostTypeOfParamEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static PostTypeOfParamEnum getPostTypeEnum(int postType) {
        for (PostTypeOfParamEnum e : values()) {
            if (e.type == postType) {
                return e;
            }
        }
        return null;
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
