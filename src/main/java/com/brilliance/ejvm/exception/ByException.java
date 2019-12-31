package com.brilliance.ejvm.exception;

/**
 * @version 1.0
 * @description 必要异常，用来承载业务异常
 */
public class ByException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String errorCode;


    public ByException(String errorCode, String msg){
        super(msg);
        this.errorCode = errorCode;
    }
    
    public ByException(String errorCode){
        this.errorCode = errorCode;
    }

    public ByException(ByErrorCode errorCode){
        super(errorCode.msg);
        this.errorCode = errorCode.code;
    }
    
    public ByException(String errorCode, String msg, Throwable e){
        super(msg,e);
        this.errorCode = errorCode;
    }
    
    public ByException(String errorCode, Throwable e){
    	super(e);
        this.errorCode = errorCode;
    }

    public ByException(ByErrorCode errorCode, Throwable e){
        super(errorCode.msg,e);
        this.errorCode = errorCode.code;
    }

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

  
}
