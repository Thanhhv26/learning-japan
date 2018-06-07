package vn.huvata.xyz.domain;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int idImange;
    @Column
    private int idPronounce;
    @Column
    private int idAnswer;  
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdImange() {
        return idImange;
    }

    public void setIdImange(int idImange) {
        this.idImange = idImange;
    }    

    public int getIdPronounce() {
        return idPronounce;
    }

    public void setIdPronounce(int idPronounce) {
        this.idPronounce = idPronounce;
    }    
    
}
