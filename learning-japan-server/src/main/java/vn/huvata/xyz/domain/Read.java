package vn.huvata.xyz.domain;

import javax.persistence.*;

@Entity
@Table(name = "read")
public class Read {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int idLesson;
    @Column
    private int idPronounce;
    @Column
    private int idQuestion;
    @Column
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
