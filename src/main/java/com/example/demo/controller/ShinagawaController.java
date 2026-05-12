package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShinagawaController {
	// チーム演習の練習
	@GetMapping("/")
	public String index() {
		return "hello";
	}
}
