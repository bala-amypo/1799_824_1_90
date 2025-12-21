package com.example.demo.service.implementation;

import com.example.demo.model.TicketCategory;
import com.example.demo.repository.TicketCategoryRepository;
import com.example.demo.service.TicketCategoryService;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService {

    private final TicketCategoryRepository repo;

    public TicketCategoryServiceImpl(TicketCategoryRepository repo) {
        this.repo = repo;
    }

    public TicketCategory saveCategory(TicketCategory category) {
        return repo.save(category);
    }
}
