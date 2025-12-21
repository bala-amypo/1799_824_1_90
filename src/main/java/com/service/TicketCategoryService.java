package com.service;

import com.entity.TicketCategory;

public interface TicketCategoryService {

    boolean isCategoryDuplicate(TicketCategory ticketCategory);

    TicketCategory saveTicketCategory(TicketCategory ticketCategory);
}
