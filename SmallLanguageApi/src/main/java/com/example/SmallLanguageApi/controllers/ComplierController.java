package com.example.SmallLanguageApi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SmallLanguageApi.models.*;

@RestController
@RequestMapping("/compiler")
public class ComplierController {
    

    @PostMapping("/Compilar")
    public String Compilar(@RequestBody CompilerRequest request){

        return request.Codigo;
    }

    @PostMapping("/Correr")
    public String Correr(@RequestBody CompilerRequest request){


        return request.Codigo;
    }



}
