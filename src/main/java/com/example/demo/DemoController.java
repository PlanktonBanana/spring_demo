package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitys.InformationEntity;


@RestController
public class DemoController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name); 
    }

	@GetMapping("/bye")
    public String anotherName(@RequestParam(value = "name", defaultValue = "man") String name) {
      InformationEntity iEntity = new InformationEntity(name);
      return String.format("Goodbye! %s!\nYou leave us at %s", iEntity.getName(), iEntity.getDate()); 
    }

	
}
