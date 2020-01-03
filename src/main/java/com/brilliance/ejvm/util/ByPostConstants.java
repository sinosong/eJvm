package com.brilliance.ejvm.util;



import com.brilliance.ejvm.entity.enums.InteractionTypeEnum;
import com.brilliance.ejvm.entity.enums.PostTypeEnum;
import com.brilliance.ejvm.entity.enums.PostTypeOfParamEnum;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author xushaobo (xushaobo@idstaff.com)
 * @date 2018/7/27 17:12
 * <p>
 * 常量类
 */
public class ByPostConstants {

    /**
     * 裂变类动态列表
     */
    public static final List<Integer> FISSION_TYPES = Lists.newArrayList(
            PostTypeEnum.FISSION_SIGN_SUCCESS_SPONSOR.type,
            PostTypeEnum.FISSION_SIGN_SUCCESS_PARTICIPATOR.type,
            PostTypeEnum.FISSION_SIGN_FAILED.type,
            PostTypeEnum.FISSION_LOTTERY_SUCCESS_SPONSOR.type,
            PostTypeEnum.FISSION_LOTTERY_SUCCESS_PARTICIPATOR.type,
            PostTypeEnum.FISSION_LOTTERY_FAILED.type,
            PostTypeEnum.FISSION_TOGETHER_SUCCESS_SPONSOR.type,
            PostTypeEnum.FISSION_TOGETHER_SUCCESS_PARTICIPATOR.type,
            PostTypeEnum.FISSION_TOGETHER_FAILED.type,
            PostTypeEnum.FISSION_REDPACKAGE_SPONSOR.type,
            PostTypeEnum.FISSION_REDPACKAGE_PARTICIPATOR.type
    );

    /**
     * 商家订单类动态
     */
    public static final List<Integer> SHOP_ORDER_TYPES = Lists.newArrayList(
            PostTypeEnum.SHOP_MAKEORDER.type,
            PostTypeEnum.SHOP_DELIVER.type,
            PostTypeEnum.SHOP_SIGNFOR.type,
            PostTypeEnum.SHOP_RETURN.type
    );


    /**
     * 裂变类动态列表
     */
    public static final List<Integer> PARAM_FISSION_TYPES = Lists.newArrayList(
            PostTypeOfParamEnum.FISSION_SIGN.type,
            PostTypeOfParamEnum.FISSION_LOTTERY.type,
            PostTypeOfParamEnum.FISSION_TOGETHER.type,
            PostTypeOfParamEnum.FISSION_REDPACKAGE.type
    );

    /**
     * 商家订单类动态
     */
    public static final List<Integer> PARAM_SHOP_ORDER_TYPES = Lists.newArrayList(
            PostTypeOfParamEnum.SHOP_MAKEORDER.type,
            PostTypeOfParamEnum.SHOP_DELIVER.type,
            PostTypeOfParamEnum.SHOP_SIGNFOR.type,
            PostTypeOfParamEnum.SHOP_RETURN.type
    );

    /**
     * 抢夺资产类动态
     */
    public static final List<Integer> SNATCH_TYPES = Lists.newArrayList(
            PostTypeOfParamEnum.SNATCH_CASH.type,
            PostTypeOfParamEnum.SNATCH_GROUP.type,
            PostTypeOfParamEnum.SNATCH_JOIN.type,
            PostTypeOfParamEnum.TAKEGOLDCOIN.type,
            PostTypeOfParamEnum.PRIVILEGE.type
    );

    /**
     * 抢夺资产类互动
     */
    public static final List<Integer> SNATCH_INTERACTION_TYPES = Lists.newArrayList(

            InteractionTypeEnum.SNATCH_CASH.type,
            /** 抢参团卡 */
            InteractionTypeEnum.SNATCH_GROUP.type,
            /** 抢全民拼卡 */
            InteractionTypeEnum.SNATCH_JOIN.type,
            /** 抢特权金 */
            InteractionTypeEnum.PRIVILEGE.type,
            /** 抢金币 */
            InteractionTypeEnum.TAKEGOLDCOIN.type,
            /** 老客拉新 */
            InteractionTypeEnum.INVITE.type

    );

}
