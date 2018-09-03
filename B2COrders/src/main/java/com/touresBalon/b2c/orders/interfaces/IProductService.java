package com.touresBalon.b2c.orders.interfaces;

import com.touresBalon.b2c.orders.dto.BaseProductResponse;
import com.touresBalon.b2c.orders.dto.FindProductRequest;

public interface IProductService {
	BaseProductResponse findProductById (FindProductRequest request);
	

}
