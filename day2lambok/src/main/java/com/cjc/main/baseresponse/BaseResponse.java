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
	
private int Responsestatus;
private Date date=new Date();
private String ResponseMessage;
private T body;

	
	public BaseResponse(int responsestatus, String responseMessage, T body)//ToString 
	{
		super();
		Responsestatus = responsestatus;
		ResponseMessage = responseMessage;
		this.body = body;
	}
	
}
