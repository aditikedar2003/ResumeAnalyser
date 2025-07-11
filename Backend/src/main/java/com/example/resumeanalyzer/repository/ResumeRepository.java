package com.example.resumeanalyzer.repository;
import com.example.resumeanalyzer.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
