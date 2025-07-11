package com.example.resumeanalyzer.model;
import jakarta.persistence.*;

@Entity
@Table(name = "job_descriptions")
public class JobDescription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jdId;
    private String title;
    @Lob
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getJdId() { return jdId; }
    public void setJdId(Long jdId) { this.jdId = jdId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
