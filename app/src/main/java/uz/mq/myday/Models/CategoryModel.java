package uz.mq.myday.Models;

public class CategoryModel {
    int id;
    String title;
    int icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public CategoryModel(int id, String title, int icon) {
        this.id = id;
        this.title = title;
        this.icon = icon;
    }
}
