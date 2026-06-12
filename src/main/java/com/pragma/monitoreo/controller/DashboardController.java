package com.pragma.monitoreo.controller;

import com.pragma.monitoreo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        transactionService.processTransaction();
        model.addAttribute("metrics", "Metrics data");
        return "dashboard";
    }
}