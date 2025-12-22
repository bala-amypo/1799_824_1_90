// package com.example.demo.service.implementation;

// import com.example.demo.model.TicketCategory;
// import com.example.demo.repository.TicketCategoryRepository;
// import com.example.demo.service.TicketCategoryService;
// import org.springframework.stereotype.Service;
// import java.util.List;

// @Service
// public class TicketCategoryServiceImpl implements TicketCategoryService {

//     private final TicketCategoryRepository repository;

//     public TicketCategoryServiceImpl(TicketCategoryRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public TicketCategory createCategory(TicketCategory category) {
//         return repository.save(category);
//     }

//     @Override
//     public List<TicketCategory> getAllCategories() {
//         return repository.findAll();
//     }
// }
