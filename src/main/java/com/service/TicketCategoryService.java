package com.example.demo.service;

import com.example.demo.entity.TicketCategory;

public interface TicketCategoryService {

    // Check whether ticket category already exists (duplicate)
    boolean isCategoryDuplicate(TicketCategory ticketCategory);

    // Save ticket category if not duplicate
    TicketCategory saveTicketCategory(TicketCategory ticketCategory);
}
