package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
	
      @RequestMapping("/search")
	  public String viewSearchLeadForm() {
		  return"search_lead";
	  }
      @RequestMapping("/searchLead")
      public String getLead(@RequestParam("id") long id) {
    	  System.out.println(id);
		  return"search_lead";

      }
      
}
