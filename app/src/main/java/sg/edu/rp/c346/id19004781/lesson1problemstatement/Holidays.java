package sg.edu.rp.c346.id19004781.lesson1problemstatement;

public class Holidays {
    private String Title;
    private String date;
    private boolean image;

    public Holidays(String Title, String date, Boolean image) {
        this.Title = Title;
        this.date = date;
        this.image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isImage() {
        return image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }
}
