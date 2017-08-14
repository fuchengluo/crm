package com.shsxt.base;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shsxt.exception.ParamException;

public class GlobalExceptionHandler extends BaseController {

	@ExceptionHandler( value = {ParamException.class, IllegalAccessError.class})
	@ResponseBody
	public ResultInfo handlerParamException(ParamException paramException) {
		return failure(paramException);
	}
	
	
}
