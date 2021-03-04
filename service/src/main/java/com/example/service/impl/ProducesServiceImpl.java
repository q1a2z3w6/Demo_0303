package com.example.service.impl;

import com.example.dao.Produces;
import com.example.mapper.ProducesMapper;
import com.example.service.ProducesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducesServiceImpl implements ProducesService {

    @Autowired
    private ProducesMapper producesMapper;

    @Override
    public List<Produces> selectAll(){

        List<Produces> produces = producesMapper.selectAll();

        return produces;

    }

}
