package entity;

import common.entites.BaseEntity;

public class Technology extends BaseEntity {

    private int id;
    private String name;
    private ProgrammingLanguage programmingLanguage;

    public Technology(){

    }

    public Technology(int id, String name, ProgrammingLanguage programmingLanguage) {
        super();
        this.id = id;
        this.name = name;
        this.programmingLanguage = programmingLanguage;
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

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Technology: " + name + " (ID: " + id + ") " +
                "Programming Language: " + (programmingLanguage != null ? programmingLanguage.getName() : "N/A") + " " +
                "Created Date: " + getCreatedDate() + " " +
                "Updated Date: " + getUpdatedDate();
    }

}
