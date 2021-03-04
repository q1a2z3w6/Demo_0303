package com.example.web.controller;

import com.example.dao.Produces;
import com.example.service.ProducesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class ProducesController {

    @Autowired
    private ProducesService producesService;

    @PostMapping("/selectAll")
    @ResponseBody
    public List<Produces> selectAll(){

        return producesService.selectAll();

    }




}
