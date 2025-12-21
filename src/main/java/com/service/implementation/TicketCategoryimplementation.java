package com.service.implementation;

import com.model.TicketCategory;
import com.repository.TicketCategoryRepository;
import com.service.TicketCategoryService;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService {

    private final TicketCategoryRepository ticketCategoryRepository;

    // Constructor order MUST match test suite
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
