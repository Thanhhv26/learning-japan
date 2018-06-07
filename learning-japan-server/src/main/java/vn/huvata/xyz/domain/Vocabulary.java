package vn.huvata.xyz.domain;

import javax.persistence.*;

@Entity
@Table(name = "vocabulary")
public class Vocabulary {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int idLesson;
    @Column
    private int idPronounce;    
    @Column
    private String name;
    @Column
    private int idImage;
    @Column
    private String kana;
    @Column
    private String drought;
    @Column
    private int idMean;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }

    public String getDrought() {
        return drought;
    }

    public void setDrought(String drought) {
        this.drought = drought;
    }

    public int getIdMean() {
        return idMean;
    }

    public void setIdMean(int idMean) {
        this.idMean = idMean;
    }    

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
    
}
