package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.DuplicateDetectionLog;

public interface DuplicateDetectionLogRepository extends JpaRepository<DuplicateDetectionLog, Long> {

}
