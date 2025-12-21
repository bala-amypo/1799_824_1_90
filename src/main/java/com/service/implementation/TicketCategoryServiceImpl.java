package service.implementation;

import service.TicketCategoryService;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService {

    @Override
    public String getCategoryById(Long categoryId) {
        return "Technical Support";
    }
}
