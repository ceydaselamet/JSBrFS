package entity;

import common.entites.BaseEntity;

public class ProgrammingLanguage extends BaseEntity {

    private int id;
    private String name;

    public ProgrammingLanguage(){

    }

    public ProgrammingLanguage(int id,String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Programming Language: " + name + " (ID: " + id + ") " +
                "Created Date: " + getCreatedDate() + " " +
                "Updated Date: " + getUpdatedDate();
    }

}
