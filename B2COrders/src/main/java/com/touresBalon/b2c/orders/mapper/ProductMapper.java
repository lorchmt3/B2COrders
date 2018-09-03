package com.touresBalon.b2c.orders.mapper;

import org.springframework.stereotype.Service;

import com.touresBalon.b2c.orders.dto.BaseProductResponse;
import com.touresBalon.b2c.orders.entities.Product;
import com.touresBalon.b2c.orders.interfaces.IProductMapper;

@Service
public class ProductMapper implements IProductMapper {

	@Override
	public BaseProductResponse buildProductResponse(Product productInfoResponse) {
		BaseProductResponse productResponse = new BaseProductResponse();
		productResponse.setCode(productInfoResponse.getCode());
		productResponse.setArrival_date(productInfoResponse.getArrival_date().toString());
		productResponse.setDeparture_date(productInfoResponse.getDeparture_date().toString());
		productResponse.setDescription(productInfoResponse.getDescription());
		productResponse.setImage_ref(productInfoResponse.getImage_ref());
		productResponse.setLogying_type(productInfoResponse.getLogying_type());
		productResponse.setName(productInfoResponse.getName());
		productResponse.setSource_city(productInfoResponse.getSource_city()!=0 ? "Bogota":"N/A");
		productResponse.setSpectacle_date(productInfoResponse.getSpectacle_date().toString());
		productResponse.setSpectacle_type(productInfoResponse.getSpectacle_type());
		productResponse.setTarget_city(productInfoResponse.getTarget_city()!=0 ? "Medellin":"N/A");
		productResponse.setTransport_type(productInfoResponse.getTransport_type());
		
		return productResponse;
	}

}
