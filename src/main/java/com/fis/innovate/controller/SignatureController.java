package com.fis.innovate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.fis.innovate.model.Signature;
 
@RestController
public class SignatureController
{
    @RequestMapping(value="{custnum}/signVerify",method = RequestMethod.POST)
    public Signature verifySignature(@PathVariable String custnum,@RequestBody String signature)
    {
    	Signature sign=new Signature(custnum,signature,true);
		/*if(signature.equals(sign.validSign())){
			return true;
		}
		else
			return false;*/
        return sign;
    }
}