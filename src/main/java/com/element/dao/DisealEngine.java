package com.element.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("bean1")
//@Primary
public class DisealEngine implements Engine{

	@Override
	public void startEngine() {
		System.out.println("Diseal engine started");
	}

}
