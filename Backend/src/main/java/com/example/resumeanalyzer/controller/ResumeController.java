package com.example.resumeanalyzer.controller;
import com.example.resumeanalyzer.model.Resume;
import com.example.resumeanalyzer.model.User;
import com.example.resumeanalyzer.repository.UserRepository;
import com.example.resumeanalyzer.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping("/api/resume")
@CrossOrigin(origins = "*")
public class ResumeController {
    @Autowired private ResumeService resumeService;
    @Autowired private UserRepository userRepository;

    @PostMapping("/upload")
    public Resume uploadResume(@RequestParam("file") MultipartFile file,
                               @RequestParam("userId") Long userId) throws IOException {
        User user = userRepository.findById(userId).orElseThrow();
        Resume resume = new Resume();
        resume.setFileName(file.getOriginalFilename());
        resume.setFileData(file.getBytes());
        resume.setUser(user);
        return resumeService.saveResume(resume);
    }
}
