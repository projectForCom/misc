package com.example.controller;

import com.example.service.AjaxService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AjaxController.class);

    @Autowired
    private AjaxService ajaxService;

    @RequestMapping("/")
    public String index(Model model) {
        LOGGER.info("index");
        model.addAttribute("now", getNowAsString());
        return "ajax/index";
    }

    @RequestMapping(value = "/get/", method = RequestMethod.GET)
    @ResponseBody
    public List<String> findAll() {
        LOGGER.info("findAll");
        return ajaxService.findAll();
    }

    private String getNowAsString() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
    }
}
