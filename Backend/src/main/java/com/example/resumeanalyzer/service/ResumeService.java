package com.example.resumeanalyzer.service;
import com.example.resumeanalyzer.model.Resume;
import com.example.resumeanalyzer.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {
    @Autowired private ResumeRepository resumeRepository;

    public Resume saveResume(Resume resume) {
        return resumeRepository.save(resume);
    }
}
