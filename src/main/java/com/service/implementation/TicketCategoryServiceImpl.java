package com.example.demo.service.implementation;

import com.example.demo.service.TicketCategoryService;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService {

    @Override
    public String getCategoryName(Long categoryId) {
        return "GENERAL";
    }
}
