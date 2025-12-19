package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.TicketCategory;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Long> {

}
