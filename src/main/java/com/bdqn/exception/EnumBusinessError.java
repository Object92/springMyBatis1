package com.bdqn.exception;

import com.bdqn.pojo.User;

/**
 *@ClassName:业务异常通用的枚举
 *@Description:
 *@Author:lzq
 *@Date: 2019/9/9 9:05
 **/
public enum EnumBusinessError implements CommonError{

    UNKNOWERROR(10001,"未知错误"),
    USER_NOT_FOUND(20001,"用户未找到"),
    ROLES_NOT_FOUND(30001,"用户角色数据未找到"),
    ;

    private int errCode;//错误代码
    private String errMsg;//错误描述

    EnumBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    EnumBusinessError() {
    }

    public int getErrorCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public CommonError setErrMsg(String errMsg) {
        this.errMsg=errMsg;
        return this;
    }

    public static void main(String[] args) {
//        Object o=new User();
//        o.toString();
//        CommonError commonError=new EnumBusinessError(30000,"供应商信息错误");
//        BusinessExcpetion businessExcpetion=new BusinessExcpetion(EnumBusinessError.UNKNOWERROR);
        BusinessExcpetion businessExcpetion=new BusinessExcpetion(EnumBusinessError.USER_NOT_FOUND);
        System.out.println( businessExcpetion.getErrMsg());
        System.out.println( businessExcpetion.getErrorCode());


    }
}
