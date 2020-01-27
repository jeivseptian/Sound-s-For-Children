package org.d3ifcool.soundforchildrens.Petunjuk;

public class ScreenItem {

    String Tittle,Description;
    int img;

    public ScreenItem(String tittle, String description, int img) {
        Tittle = tittle;
        Description = description;
        this.img = img;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
