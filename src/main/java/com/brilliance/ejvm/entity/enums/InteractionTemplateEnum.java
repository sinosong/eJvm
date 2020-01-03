package com.brilliance.ejvm.entity.enums;

/**
 * 互动类型枚举
 * @author Administrator
 */
public enum InteractionTemplateEnum {


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
    /** 抢返现卡、抢参团卡、抢全民拼卡 抢特权金 */
    //12抢（业务组） 01（小业务品类） 1(成功）1（发起者)
    HOMEPAGE_BE_SNATCH(100531, "HOME页被抢用户B", "你的{K}被{NC}抢走了", 4),
    HOMEPAGE_SNATCH(100532, "HOME页抢卡用户A", "你抢了{NC}的{K}", 4),
    PROFILEPAGE_BE_SNATCH(100541, "PROFILE页被抢用户B", "你抢了{NC}的{K}", 4),
    PROFILEPAGE_SNATCH(100542, "PROFILE页抢卡用户A", "你的{K}被{NC}抢走了", 4),

    /** 抢金币 */
    HOMEPAGE_BE_TAKEGOLDCOIN(100533, "HOME页被抢用户B", "{NC}抢走了你{NUM}个金币", 4),
    HOMEPAGE_TAKEGOLDCOIN(100534, "HOME页抢金币用户A", "你抢了{NC}的{NUM}个金币", 4),
    PROFILEPAGE_BE_TAKEGOLDCOIN(100543, "PROFILE页被抢用户B", "你抢了{NC}的{NUM}个金币", 4),
    PROFILEPAGE_TAKEGOLDCOIN(100544, "PROFILE页抢金币用户A", "{NC}抢走了你{NUM}个金币", 4),
    /** 老客拉新 */
    HOMEPAGE_BE_INVITE(100535, "新客", "你的好友{PN}推荐你注册必要APP", 4),
    HOMEPAGE_INVITE(100536, "老客", "你推荐的好友{PN}注册了必要APP", 4),
    PROFILEPAGE_BE_INVITE(100545, "新客", "你推荐的好友{PN}注册了必要APP", 4),
    PROFILEPAGE_INVITE(100546, "老客", "你的好友{PN}推荐你注册必要APP", 4);

    public final int type;
    public final String desc;
    public final String defaultContext;
    public final int postType;

    InteractionTemplateEnum(int type, String desc, String defaultContext, int postType) {
        this.postType = postType;
        this.type = type;
        this.desc = desc;
        this.defaultContext = defaultContext;
    }

    public static InteractionTemplateEnum getPostTypeEnum(int postType) {
        for (InteractionTemplateEnum e : values()) {
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
