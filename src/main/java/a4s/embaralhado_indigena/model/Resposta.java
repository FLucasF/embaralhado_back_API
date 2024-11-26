package a4s.embaralhado_indigena.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("userID")
    private String userId;

    @JsonProperty("idApp")
    private String idApp;

    @JsonProperty("phase")
    private String phase;

    @JsonProperty("activity")
    private String activity;

    @JsonProperty("question")
    private String question;

    @JsonProperty("expectedResponse")
    private String expectedResponse;

    @JsonProperty("userResponse")
    private String userResponse;

    @JsonProperty("isCorrect")
    private Boolean isCorrect;

    @JsonProperty("dateResponse")
    private LocalDateTime dateResponse;

    @JsonProperty("typeOfQuestion")
    private String typeOfQuestion;

    @PrePersist
    public void prePersist() {
        if (this.userId == null || this.userId.trim().isEmpty()) {
            this.userId = "Anônimo";
        }
        if (this.dateResponse == null) {
            this.dateResponse = LocalDateTime.now();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIdApp() {
        return idApp;
    }

    public void setIdApp(String idApp) {
        this.idApp = idApp;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getExpectedResponse() {
        return expectedResponse;
    }

    public void setExpectedResponse(String expectedResponse) {
        this.expectedResponse = expectedResponse;
    }

    public String getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(String userResponse) {
        this.userResponse = userResponse;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public LocalDateTime getDateResponse() {
        return dateResponse;
    }

    public void setDateResponse(LocalDateTime dateResponse) {
        this.dateResponse = dateResponse;
    }

    public String getTypeOfQuestion() {
        return typeOfQuestion;
    }

    public void setTypeOfQuestion(String typeOfQuestion) {
        this.typeOfQuestion = typeOfQuestion;
    }
}
