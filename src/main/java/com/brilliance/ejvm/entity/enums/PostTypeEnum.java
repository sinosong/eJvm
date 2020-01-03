package com.brilliance.ejvm.entity.enums;


public enum PostTypeEnum {
    /*关注店铺*/
    SHOP_ATTENTION(1, "用户对店铺的关注", "我关注了店铺{DP}，来看看我心中所爱吧！", 1),
    /* 收藏商品 */
    PRODUCT_COLLECT(2, "用户对商品的收藏", "我收藏了{SP}，物超所值的好物当然要收藏起来随时下单", 1),
    /* 分享商品 */
    PRODUCT_SHARE(3, "用户对商品分享", "我分享了{SP}，让我来给你种草这个超有品质的美物吧！", 1),
    /* 分享店铺 */
    SHOP_SHARE(4, "用户对店铺的分享", "我分享了店铺{DP}，这家超专业的店铺只生产最优质的好物", 1),
    /* 好评商品 */
    PRODUCT_COMMENT(5, "用户的好评信息", "我发布了对{SP}的好评，亲测好用，品质是王道", 1),
    /* 点赞动态 */
    POST_THUMBSUP(6, "点赞", "我点赞了这条信息，一般人我不告诉他", 1),
    /* 分享动态 */
    POST_SHARE(7, "必要朋友分享动态", "", 1),
    /* 分享大V */
    VIP_SHARE(8, "分享大V", "", 1),
    /* 主动发布动态 */
    POST_PUBLISH(9, "主动发布动态", "", 1),
    /* 分享企业定制 */
    CUSTOMIZE2B_SHARE(12, "分享企业定制", "", 1),
    /* 裂变-帮签 */
    FISSION_SIGN_SUCCESS_SPONSOR(100111, "裂变-帮签-成功-发起者", "", 1),
    FISSION_SIGN_SUCCESS_PARTICIPATOR(100112, "裂变-帮签-成功-参与者", "", 1),
    FISSION_SIGN_FAILED(100120, "裂变-帮签-未成功", "", 1),
    /* 裂变-抽奖 */
    FISSION_LOTTERY_SUCCESS_SPONSOR(100211, "裂变-抽奖-成功-发起者", "", 1),
    FISSION_LOTTERY_SUCCESS_PARTICIPATOR(100212, "裂变-抽奖-成功-参与者", "", 1),
    FISSION_LOTTERY_FAILED(100220, "裂变-抽奖-未成功", "", 1),
    /* 裂变-一起拼 */
    FISSION_TOGETHER_SUCCESS_SPONSOR(100311, "裂变-一起拼-成功-发起者", "", 1),
    FISSION_TOGETHER_SUCCESS_PARTICIPATOR(100312, "裂变-一起拼-成功-参与者", "", 1),
    FISSION_TOGETHER_FAILED(100320, "裂变-一起拼-未成功", "", 1),
    /* 裂变-红包 */
    FISSION_REDPACKAGE_SPONSOR(100411, "裂变-红包-发起者", "", 1),
    FISSION_REDPACKAGE_PARTICIPATOR(100412, "裂变-红包-参与者", "", 1),
    /* 商家-店铺上新 */
    SHOP_NEW(110100, "商家-店铺上新", "新商品上线了，快来看看吧", 1),
    /* 商家-订单生产 */
    SHOP_MAKEORDER(110200, "商家-订单生产", "您购买的{SP}已经开始生产了", 1),
    /* 商家-发货 */
    SHOP_DELIVER(110300, "商家-发货", "您购买的{SP}已发货", 1),
    /* 商家-签收 */
    SHOP_SIGNFOR(110400, "商家-签收", "您购买的{SP}已被签收", 1),
    /* 商家-订单行退款 */
    SHOP_RETURN(110500, "商家-订单行退款", "您购买的{SP}已退款成功", 1),
    /* 分享海报 不生成动态*/
    SHARING_ECONOMY_ONESELF(990101, "分享海报（自己动态）", "动态的长图分享文案：这条内容超棒，分享给你~", 3),
    SHARING_ECONOMY_OTHERS(990102, "分享海报（他人动态）", "动态的长图分享文案：这条内容超棒，分享给你~", 3),
    /* 大运河1.2 */
    HOMEPAGE_HELP_SIGNIN(100501, "home页帮签用户B", "你帮{NC}挖宝了", 4),
    HOMEPAGE_SIGNIN(100502, "home页签到发起者A", "{NC}帮你挖宝了", 4),
    HOMEPAGE_HELP_DRAW(100503, "home页帮抽用户B", "你帮{NC}抽奖助力了", 4),
    HOMEPAGE_DRAW(100504, "home页抽奖发起者A", "{NC}帮你抽奖助力了", 4),
    HOMEPAGE_HELP_TOG(100505, "home页帮拼用户B", "你与{NC}拼了团", 4),
    HOMEPAGE_TOG(100506, "home页拼团发起者A", "{NC}与你拼了团", 4),
    HOMEPAGE_HELP_OPEN(100507, "home页帮拆用户B", "你帮{NC}拆红包了", 4),
    HOMEPAGE_OPEN(100508, "home页红包发起者A", "{NC}帮你拆红包了", 4),
    HOMEPAGE_COMMENT(100509, "home页评论/回复用户B", "你评论/回复了{NC}的动态/评论", 4),
    HOMEPAGE_BE_COMMENT(100510, "home页被评论/回复用户A", "{NC}评论/回复了你的动态/评论", 4),
    PROFILEPAGE_HELP_SIGNIN(100511, "profile页帮签用户B", "{NC}帮你挖宝了", 4),
    PROFILEPAGE_SIGNIN(100512, "profile页签到发起者A", "你帮{NC}挖宝了", 4),
    PROFILEPAGE_HELP_DRAW(100513, "profile页帮抽用户B", "{NC}帮你抽奖助力了", 4),
    PROFILEPAGE_DRAW(100514, "profile页抽奖发起者A", "你帮{NC}抽奖助力了", 4),
    PROFILEPAGE_HELP_TOG(100515, "profile页帮拼用户B", "{NC}与你拼了团", 4),
    PROFILEPAGE_TOG(100516, "profile页拼团发起者A", "你与{NC}拼了团", 4),
    PROFILEPAGE_HELP_OPEN(100517, "profile页帮拆用户B", "{NC}帮你拆红包了", 4),
    PROFILEPAGE_OPEN(100518, "profile页红包发起者A", "你帮{NC}拆红包了", 4),
    PROFILEPAGE_COMMENT(100519, "profile页评论/回复用户B", "{NC}评论/回复了你的动态/评论", 4),
    PROFILEPAGE_BE_COMMENT(100520, "profile页被评论/回复用户A", "你评论/回复了{NC}的动态/评论", 4),
    /* 大运河1.3 */
    //12抢（业务组） 01（小业务品类） 1(成功）1（发起者)
    /** 通用文案模板 抢返现卡、抢参团卡、抢全民拼卡、抢特权金 */
    SNATCH_PARTICIPATOR(120012, "抢返现卡参团卡全民拼卡特权金-被抢卡用户A", "{NC}抢了我的{K}", 1),
    SNATCH_SPONSOR(120011, "抢返现卡参团卡全民拼卡特权金-抢卡用户B", "我抢了{NC}的{K}", 1),

    /** 抢返现卡 (模板未使用) */
    SNATCH_CASH_PARTICIPATOR(120112, "抢返现卡参团卡全民拼卡-被抢卡用户A", "{NC}抢了我的{K}", 1),
    SNATCH_CASH_SPONSOR(120111, "抢返现卡参团卡全民拼卡-抢卡用户B", "我抢了{NC}的{K}", 1),

    /** 抢参团卡 (模板未使用 */
    SNATCH_GROUP_PARTICIPATOR(120212, "抢返现卡参团卡全民拼卡-被抢卡用户A", "{NC}抢了我的{K}", 1),
    SNATCH_GROUP_SPONSOR(120211, "抢返现卡参团卡全民拼卡-抢卡用户B", "我抢了{NC}的{K}", 1),

    /** 抢全民拼卡 (模板未使用 */
    SNATCH_JOIN_PARTICIPATOR(120312, "抢返现卡参团卡全民拼卡-被抢卡用户A", "{NC}抢了我的{K}", 1),
    SNATCH_JOIN_SPONSOR(120311, "抢返现卡参团卡全民拼卡-抢卡用户B", "我抢了{NC}的{K}", 1),

    /** 抢特权金 (模板未使用 */
    PRIVILEGE_SUCCESS_PARTICIPATOR(130112, "抢特权金-被抢特权金用户B", "{NC}抢了我的{K}", 1),
    PRIVILEGE_SUCCESS_SPONSOR(130111, "抢特权金-抢特权金用户A", "我抢了{NC}的{K}", 1),

    /** 抢金币 */
    TAKEGOLDCOIN_SUCCESS_PARTICIPATOR(120412, "抢金币-被抢金币用户A", "{NC}抢了我的{NUM}个金币", 1),
    TAKEGOLDCOIN_SUCCESS_SPONSOR(120411, "抢金币-抢金币用户B", "我抢了{NC}的{NUM}个金币", 1),

    /** 老客拉新 */
    INVITE_SUCCESS_PARTICIPATOR(140112, "老客拉新-新用户B", "{NC}推荐我来到必要App", 1),
    INVITE_SUCCESS_SPONSOR(140111, "老客拉新-老用户A", "我推荐{NC}来到必要App", 1),


    FRIENDS_LIKE_COFFEE(130001, "好友点赞咖啡商品", "我赞了{NC}的咖啡", 1),
    FRIENDS_LOOK_COFFEE(130002, "好友浏览咖啡", "{NC}浏览了你的咖啡馆", 2),
    FRIENDS_BUY_COFFEE(130003, "好友购买咖啡", "{NC}购买了你的咖啡", 2),
    SHARE_COFFEE1(130004, "分享咖啡馆", "这家咖啡馆很洋气，推荐你也来逛逛~", 1),
    SHARE_COFFEE2(130004, "分享咖啡馆", "我常去的这家咖啡不错，你也来尝尝？", 1),
    SHARE_COFFEE3(130004, "分享咖啡馆", "这家手冲咖啡味道太棒了，你一定要试试！", 1),;


    public final int type;
    public final String desc;
    public final String defaultContext;
    public final int postType;  //1动态模板 2朋友消息 3分享海报 4互动轨迹

    PostTypeEnum(int type, String desc, String defaultContext, int postType) {
        this.postType = postType;
        this.type = type;
        this.desc = desc;
        this.defaultContext = defaultContext;
    }

    public static PostTypeEnum getPostTypeEnum(int postType) {
        for (PostTypeEnum e : values()) {
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

    public String getDefaultContext() {
        return defaultContext;
    }
}
