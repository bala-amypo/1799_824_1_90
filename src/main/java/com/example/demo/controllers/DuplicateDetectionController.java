package com.example.demo.controller;

import com.example.demo.model.DuplicateDetectionLog;
import com.example.demo.model.Ticket;
import com.example.demo.service.DuplicateDetectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duplicate-detection")
public class DuplicateDetectionController {

    private final DuplicateDetectionService duplicateDetectionService;

    
    public DuplicateDetectionController(DuplicateDetectionService duplicateDetectionService) {
        this.duplicateDetectionService = duplicateDetectionService;
    
    @PostMapping("/check")
    public List<DuplicateDetectionLog> detectDuplicates(@RequestBody Ticket ticket) {
        return duplicateDetectionService.detectDuplicates(ticket);
    }
}

