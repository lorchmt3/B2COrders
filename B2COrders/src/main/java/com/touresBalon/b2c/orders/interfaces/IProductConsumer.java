package com.touresBalon.b2c.orders.interfaces;

import com.touresBalon.b2c.orders.dto.FindProductRequest;
import com.touresBalon.b2c.orders.entities.Product;

public interface IProductConsumer {
	  Product consumeProductConsult(FindProductRequest request);
}
