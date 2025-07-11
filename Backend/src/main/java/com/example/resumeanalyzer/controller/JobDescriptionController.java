package com.example.resumeanalyzer.controller;
import com.example.resumeanalyzer.model.JobDescription;
import com.example.resumeanalyzer.model.User;
import com.example.resumeanalyzer.repository.UserRepository;
import com.example.resumeanalyzer.service.JobDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jd")
@CrossOrigin(origins = "*")
public class JobDescriptionController {
    @Autowired private JobDescriptionService jdService;
    @Autowired private UserRepository userRepository;

    @PostMapping("/upload")
    public JobDescription uploadJD(@RequestBody JobDescription jd,
                                   @RequestParam Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        jd.setUser(user);
        return jdService.saveJD(jd);
    }
}
