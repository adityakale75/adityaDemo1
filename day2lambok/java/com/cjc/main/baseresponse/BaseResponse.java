package com.cjc.main.baseresponse;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T>
{
	
	public BaseResponse(int responsestatus, String responseMessage, T body) {
		super();
		Responsestatus = responsestatus;
		ResponseMessage = responseMessage;
		this.body = body;
	}
	private int Responsestatus;
	private Date date=new Date();
	private String ResponseMessage;
	private T body;

}
