package com.example.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.DuplicateDetectionLog;

public interface DuplicateDetectionLogRepository extends JpaRepository<DuplicateDetectionLog, Long> {

}
