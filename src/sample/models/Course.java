package sample.models;

public class Course {

    private String name;
    private String section;
    private String hours;

    public Course(String name, String section, String hours) {
        this.name = name;
        this.section = section;
        this.hours = hours;
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
