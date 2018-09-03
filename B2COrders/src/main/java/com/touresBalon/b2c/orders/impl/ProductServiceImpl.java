package com.touresBalon.b2c.orders.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touresBalon.b2c.orders.dto.BaseProductResponse;
import com.touresBalon.b2c.orders.dto.FindProductRequest;
import com.touresBalon.b2c.orders.entities.Product;
import com.touresBalon.b2c.orders.interfaces.IProductConsumer;
import com.touresBalon.b2c.orders.interfaces.IProductMapper;
import com.touresBalon.b2c.orders.interfaces.IProductService;



@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductConsumer otpConsumer;

	@Autowired
	private IProductMapper otpMapper;

	@Override
	public BaseProductResponse findProductById(FindProductRequest request) {
//		ValidateOTP validateOTPRequest = otpMapper.buildValidateOTPRequest(bankOTPValidationRequest);
		Product productResponse = otpConsumer.consumeProductConsult(request);
		return otpMapper.buildProductResponse(productResponse);
	}


	
	
}
