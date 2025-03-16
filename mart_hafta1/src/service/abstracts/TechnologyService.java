package service.abstracts;

import entity.Technology;

import java.util.List;

public interface TechnologyService {
    void add(Technology technology);
    void update(Technology technology);
    void delete(int id);

    List<Technology> getAll();
    Technology getById(int id);
}
