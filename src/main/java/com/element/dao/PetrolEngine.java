package com.element.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("bean2")
public class PetrolEngine implements Engine{

	@Override
	public void startEngine() {
		System.out.println("Petrol engine started");
		
	}

}
