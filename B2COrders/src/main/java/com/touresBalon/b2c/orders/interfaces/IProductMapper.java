package com.touresBalon.b2c.orders.interfaces;

import com.touresBalon.b2c.orders.dto.BaseProductResponse;
import com.touresBalon.b2c.orders.entities.Product;

public interface IProductMapper {

	BaseProductResponse buildProductResponse(Product productInfoResponse);

}
