package com.hehez.stjude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/VisualizationDemo")
public class IndexController {

	@RequestMapping(value = {"", "/", "/index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/tsne")
	public String tsneDemo() {
		return "tsne_demo";
	}
	
	@RequestMapping("/network")
	public String networkDemo() {
		return "network_demo";
	}
}
