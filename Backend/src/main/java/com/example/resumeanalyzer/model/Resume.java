package com.example.resumeanalyzer.model;
import jakarta.persistence.*;

@Entity
@Table(name = "resumes")
public class Resume {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resumeId;
    private String fileName;
    @Lob
    @Column(name = "file_data", columnDefinition = "BYTEA")
    private byte[] fileData;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getResumeId() { return resumeId; }
    public void setResumeId(Long resumeId) { this.resumeId = resumeId; }
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public byte[] getFileData() { return fileData; }
    public void setFileData(byte[] fileData) { this.fileData = fileData; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
