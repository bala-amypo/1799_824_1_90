package com.example.demo.controller;

import com.example.demo.model.TicketCategory;
import com.example.demo.service.TicketCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket-categories")
public class TicketCategoryController {

    private final TicketCategoryService ticketCategoryService;

    // Constructor injection
    public TicketCategoryController(TicketCategoryService ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }

    // Create a new ticket category
    @PostMapping
    public TicketCategory createCategory(@RequestBody TicketCategory category) {
        return ticketCategoryService.createCategory(category);
    }

    // Get all ticket categories
    @GetMapping
    public List<TicketCategory> getAllCategories() {
        return ticketCategoryService.getAllCategories();
    }
}
