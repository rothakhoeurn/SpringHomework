package com.rothaspring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rothaspring.app.service.Service;

@Controller
public class MainController {
	@Autowired
	Service stuService;
	@RequestMapping(value = { "/", "/list" })
	public String homePage(ModelMap model) {
		model.addAttribute("welcome", "Welcome Homepage!");
		model.addAttribute("list", stuService.listStudent());
		return "studentform";
	}
}
