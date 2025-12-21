package com.example.demo.service.implementation;

import com.example.demo.model.TicketCategory;
import com.example.demo.repository.TicketCategoryRepository;
import com.example.demo.service.TicketCategoryService;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService {

    private final TicketCategoryRepository ticketCategoryRepository;

    // Constructor order EXACT
    public TicketCategoryServiceImpl(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public TicketCategory saveCategory(TicketCategory category) {
        if (ticketCategoryRepository.existsByCategoryName(category.getCategoryName())) {
            throw new RuntimeException("category already exists");
        }
        return ticketCategoryRepository.save(category);
    }
}
