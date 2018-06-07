package vn.huvata.xyz.domain;

import javax.persistence.*;
@Entity
@Table(name = "listen")
public class Listen {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int idLesson;
    @Column
    private int idMean;
    @Column
    private String name;
    @Column
    private int idImage;
    @Column
    private int idPronounce;
    @Column
    private int idQuestion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdPronounce() {
        return idPronounce;
    }

    public void setIdPronounce(int idPronounce) {
        this.idPronounce = idPronounce;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
    
}
