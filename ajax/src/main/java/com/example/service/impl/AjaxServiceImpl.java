package com.example.service.impl;

import com.example.controller.AjaxController;
import com.example.service.AjaxService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AjaxServiceImpl implements AjaxService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AjaxController.class);

    @Override
    public List<String> findAll() {
        List<String> outputs = new ArrayList<>();
        outputs.add("test1");
        outputs.add("test2");
        return outputs;
    }
}
