package vn.huvata.xyz.domain;

import javax.persistence.*;

@Entity
@Table(name = "conversation")
public class Conversation {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int idPronounce;
    @Column
    private int idLesson;
    @Column
    private String name;
    @Column
    private int idImage;
    @Column
    private String content;
    @Column
    private int idQuestion;
    @Column
    private int idMean;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPronounce() {
        return idPronounce;
    }

    public void setIdPronounce(int idPronounce) {
        this.idPronounce = idPronounce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    public int getIdMean() {
        return idMean;
    }

    public void setIdMean(int idMean) {
        this.idMean = idMean;
    }
    
}
