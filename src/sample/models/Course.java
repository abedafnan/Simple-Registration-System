package sample.models;

public class Course {

    private int id;
    private String name;
    private String section;
    private String hours;

    public Course(int id, String name, String section, String hours) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.hours = hours;
    }

    // Constructor for inserting into the DB, id will be automatically added
    public Course(String name, String section, String hours) {
        this.name = name;
        this.section = section;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
}
