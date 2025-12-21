package service.implementation;

import service.DuplicateRuleService;
import model.Ticket;
import org.springframework.stereotype.Service;

@Service
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    @Override
    public boolean isDuplicate(Ticket existing, Ticket incoming) {

        boolean sameTitle = existing.getTitle()
                .equalsIgnoreCase(incoming.getTitle());

        boolean sameCategory = existing.getCategoryId()
                .equals(incoming.getCategoryId());

        boolean sameUser = existing.getUserId()
                .equals(incoming.getUserId());

        return sameTitle && sameCategory && sameUser;
    }
}
