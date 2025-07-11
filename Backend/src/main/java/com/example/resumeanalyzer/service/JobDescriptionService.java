package com.example.resumeanalyzer.service;
import com.example.resumeanalyzer.model.JobDescription;
import com.example.resumeanalyzer.repository.JobDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobDescriptionService {
    @Autowired private JobDescriptionRepository jdRepository;

    public JobDescription saveJD(JobDescription jd) {
        return jdRepository.save(jd);
    }
}
