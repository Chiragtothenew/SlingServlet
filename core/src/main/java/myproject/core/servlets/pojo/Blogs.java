package myproject.core.servlets.pojo;

public class Blogs {

    private String date;
    private String title;

    public Blogs( String date, String title)
    {
        this.date=date;
        this.title=title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Blogs{" +
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
