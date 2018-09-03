package com.touresBalon.b2c.orders.consumer;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.touresBalon.b2c.orders.dto.FindProductRequest;
import com.touresBalon.b2c.orders.entities.Product;
import com.touresBalon.b2c.orders.interfaces.IProductConsumer;

@Component
public class ProductBDConsumer implements IProductConsumer{

	@Override
	public Product consumeProductConsult(FindProductRequest request) {
		// aqui va la conexion de BD
		
		//mientras tanto se mapea objeto Producto
		Product product = new Product((long) 1233,"hotel Zuana",new Date(),new Date(),new Date(),2,3,4,"ubicacion Santa Marta","H001","image.png",5,5);
		return product;
	}


	
}
