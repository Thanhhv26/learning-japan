package vn.huvata.xyz.domain;

import javax.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise {
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

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
    
}
