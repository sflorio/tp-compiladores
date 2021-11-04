package com.example.SmallLanguageApi.controllers;

import java.io.StringReader;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SmallLanguageApi.models.*;
import simplelanguage.Parser;
import simplelanguage.Scanner;


@RestController
@RequestMapping("/compiler")
public class ComplierController {
    

    @PostMapping("/compilar")
    public String Compilar(@RequestBody CompilerRequest request) throws Exception{
    	/*new StringReader(request.Codigo)*/
    	new Parser(new Scanner(new StringReader(request.Codigo))).parse();
    	return "aaa";
    }

    @PostMapping("/correr")
    public String Correr(@RequestBody CompilerRequest request) throws Exception{
    	try {
    		var result = new Parser(new Scanner(new StringReader(request.Codigo))).parse();
    		return result.toString();
		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}
    }



}
