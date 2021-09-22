package com.myfirst.demoproject.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	//GET
	//URI - /hello-world
	//method - Hello World
	// we can also use GetMapping as well
	@GetMapping(path="/")
	public String HelloWorld()
	{
		return "Hello World with get mapping";
	}
	
	//method return Bean along with path variable arpit sharma
	@GetMapping(path="/Hello-World-Bean/path-variable/{name}")
	public HelloWorldBean HelloWorldBean(@PathVariable String name)
	{
		
		return new HelloWorldBean(String.format("HelloWorldBean, %s" , name));
	}
}
