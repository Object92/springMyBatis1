package com.bdqn.exception;

public class BusinessExcpetion extends Exception implements CommonError{

    private CommonError commonError;

    public BusinessExcpetion(CommonError commonError){
        /**
         * Description:构造业务异常类
         * param:
         * return:
         * Date:
         */
        super();
        this.commonError=commonError;
    }

    /**
     * Description:构造业务异常类（需要构造自定义业务异常信息）
     * param:
     * return:
     * Date:
     */
    public BusinessExcpetion(CommonError commonError,String errMsg){
        this(commonError);
        this.commonError.setErrMsg(errMsg);
    }

    /**
     * Description:获取错误代码
     * param: []
     * return:
     * Date:
     */
    public int getErrorCode() {
        return commonError.getErrorCode();
    }

    /**
     * Description:获取错误的信息
     * param: []
     * return:
     * Date:
     */
    public String getErrMsg() {
        return commonError.getErrMsg();
    }

    /**
     * Description:手动设置错误的业务信息（定制化）
     * param:
     * return:
     * Date:
     */
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return commonError;
    }
}
