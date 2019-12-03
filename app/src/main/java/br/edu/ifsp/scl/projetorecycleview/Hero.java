package br.edu.ifsp.scl.projetorecycleview;

public class Hero {

    private int id;
    private int image;
    private  String title;
    private String desc;
    private String company;

    public Hero(int id, int image, String title, String desc, String company) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.desc = desc;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
