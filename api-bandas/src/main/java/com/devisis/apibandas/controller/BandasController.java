package com.devisis.apibandas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devisis.apibandas.entity.Bandas;
import com.devisis.apibandas.service.BandasService;

@Controller
@RequestMapping("/bandas")
public class BandasController {
	
	@Autowired
	private BandasService bandasservice;
	
	@GetMapping("/list")
    public String listCustomers(Model theModel) {
        List < Bandas > theCustomers = bandasservice.getBandas();
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }
	
	@GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Bandas theBanda = new Bandas();
        theModel.addAttribute("banda", theBanda);
        return "bandas-form";
    }
	
	@PostMapping("/saveBandas")
    public String saveBanda(@ModelAttribute("banda") Bandas theBanda) {
        bandasservice.saveBandas(theBanda);
        return "redirect:/bandas/list";
    }
	
	@GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("bandaId") int theId,
        Model theModel) {
        Bandas theBanda = bandasservice.getBandas(theId);
        theModel.addAttribute("customer", theBanda);
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteBandas(@RequestParam("bandaId") int theId) {
        bandasservice.deleteBandas(theId);
        return "redirect:/banda/list";
    }

}
