package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	
	@GetMapping("/sayHello")
	public String sayHello() 
	{
		return "Hello World";
	}

	
	@GetMapping("/sort")
	public int[] sortInteger() 
	{
		int [] arrayIntegers = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};
		
		int n = arrayIntegers.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arrayIntegers[j-1] < arrayIntegers[j])
                          {  
                                 temp = arrayIntegers[j-1];  
                                 arrayIntegers[j-1] = arrayIntegers[j];  
                                 arrayIntegers[j] = temp;  
                         }  
                          
                 }  
         }
         
		return arrayIntegers;  
          
	}
}
