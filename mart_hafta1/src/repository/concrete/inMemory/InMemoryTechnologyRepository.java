package repository.concrete.inMemory;

import entity.Technology;
import repository.abstracts.TechnologyRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InMemoryTechnologyRepository implements TechnologyRepository {
    private List<Technology> technologies;

    public InMemoryTechnologyRepository() {
        technologies = new ArrayList<>();

    }


    @Override
    public void add(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public void update(Technology technology) {
        for (Technology tech : technologies) {
            if (tech.getId() == technology.getId()) {
                tech.setName(technology.getName());
                tech.setUpdatedDate(java.time.LocalDateTime.now());
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        technologies.removeIf(t -> t.getId() == id);
    }

    @Override
    public List<Technology> getAll() {
        return technologies;
    }

    @Override
    public Technology getById(int id) {
        return technologies.stream().filter(t -> t.getId() == id).findAny().orElse(null);
    }
}
