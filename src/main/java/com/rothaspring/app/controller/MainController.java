package com.rothaspring.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "/addStudent")
	public String add(ModelMap model){
		model.addAttribute("action", "addStudentPro");
		model.addAttribute("addmess", "Welcome to Add Student Form");
		return "studentform";
	}
	@RequestMapping(value="/addStudentPro")
	public String addStudentPro(ModelMap model){
		model.addAttribute("addpromess", "Added Successfully!");
		return "redirect:/";
	}
	@RequestMapping(value="/delete-{id}", method=RequestMethod.GET)
	public String deletePro(ModelMap model, @PathVariable("id") int id){
		stuService.deleteUser(id);
		return "redirect:/";
	}
	@RequestMapping(value="/update-{id}", method = RequestMethod.GET)
	public String update(ModelMap model, @PathVariable("id") int id){
		model.addAttribute("students", stuService.getUserById(id));
		model.addAttribute("action", "updateStudentPro");
		model.addAttribute("btnSubmit", "Save");
		return "studentform";
	}
}
