package vn.huvata.xyz.domain;

import javax.persistence.*;

@Entity
@Table(name = "grammar")
public class Grammar {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int idLesson;
    @Column
    private int idQuestion;
    @Column
    private String name;
    @Column
    private String structuer;
    @Column
    private int idMean;
    @Column
    private String example;

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

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStructuer() {
        return structuer;
    }

    public void setStructuer(String structuer) {
        this.structuer = structuer;
    }

    public int getIdMean() {
        return idMean;
    }

    public void setIdMean(int idMean) {
        this.idMean = idMean;
    }    

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
    
}
