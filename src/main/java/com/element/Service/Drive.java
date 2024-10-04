package com.element.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.element.dao.Engine;
@Service
public class Drive {
	@Autowired
	@Qualifier("bean1")
	private Engine engine;
	public void drive() {
		engine.startEngine();
	}

}
