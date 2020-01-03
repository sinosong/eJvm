package com.brilliance.ejvm.entity.enums;

/**
 * Created with IDEA
 * @author :HuXiaoLong
 * Date:2019/12/11
 * Time:19:29
 * @""ription 跳转类型
 */
public enum InteractionTypeEnum {
    /*1-签到 */
    SIGN(1, "签到"),
    /*2-抽奖 */
    LOTTERY(2, "抽奖"),
    /*3-一起拼 */
    TOGETHER(3, "一起拼"),
    /* 4-红包*/
    RED_BAG(4, "红包"),
    /* 5-评论 */
    COMMENT(5, "评论"),
    /** 6-抢返现卡 */
    SNATCH_CASH(6, "返现卡"),
    /** 7-抢参团卡 */
    SNATCH_GROUP(7, "参团卡"),
    /** 8-抢全民拼卡 */
    SNATCH_JOIN(8, "全民拼卡"),
    /** 9-抢特权金 */
    PRIVILEGE(9, "特权金"),
    /** 10-抢金币 */
    TAKEGOLDCOIN(10, "抢金币"),
    /** 11-老客拉新 */
    INVITE(11, "老客拉新");

    public final int type;

    public final String desc;

    InteractionTypeEnum(int type) {
        this.type = type;
        this.desc = "";
    }

    InteractionTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static InteractionTypeEnum getInteractionTypeEnum(int type) {
        for (InteractionTypeEnum e : values()) {
            if (e.type == type) {
                return e;
            }
        }
        return null;
    }
}
