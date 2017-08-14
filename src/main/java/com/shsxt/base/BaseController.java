package com.shsxt.base;

import com.shsxt.constant.Constant;
import com.shsxt.exception.ParamException;

public class BaseController {
	
	
	/**
	 * 返回失败
	 * @param errorCode
	 * @param errorMessage
	 * @return
	 */
	protected ResultInfo failure(Integer errorCode, String errorMessage) {
		ResultInfo result = new ResultInfo(errorCode, errorMessage, errorMessage);
		return result;
	}
	
	protected ResultInfo failure(String errorMessage) {
		ResultInfo result = failure(Constant.ERROR_CODE, errorMessage);
		return result;
	}
	
	protected ResultInfo failure(ParamException exception) {
		ResultInfo result = failure(exception.getErrorCode(), exception.getMessage());
		return result;
	}
	
	protected ResultInfo success(Object result) {
		ResultInfo resultInfo = new ResultInfo(Constant.SUCCESS_CODE, Constant.ERROR_MESSAGE, result);
		return resultInfo;
	}
	

}
