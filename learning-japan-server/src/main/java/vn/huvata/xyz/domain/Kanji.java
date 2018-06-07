package vn.huvata.xyz.domain;

import javax.persistence.*;

@Entity
@Table(name = "kanji")
public class Kanji {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int idLesson;
    @Column
    private String name;
    @Column
    private String drought;
    @Column
    private String hiragana;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrought() {
        return drought;
    }

    public void setDrought(String drought) {
        this.drought = drought;
    }

    public String getHiragana() {
        return hiragana;
    }

    public void setHiragana(String hiragana) {
        this.hiragana = hiragana;
    }
    
}
