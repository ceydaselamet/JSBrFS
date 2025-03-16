package service.concrete;

import entity.ProgrammingLanguage;
import entity.Technology;
import repository.abstracts.TechnologyRepository;
import service.abstracts.TechnologyService;

import java.time.LocalDateTime;
import java.util.List;

public class TechnologyImpl implements TechnologyService {
    private TechnologyRepository repository;

    public TechnologyImpl(TechnologyRepository repository){
        this.repository = repository;
    }


    @Override
    public void add(Technology technology) {
        technology.setCreatedDate(LocalDateTime.now());
        repository.add(technology);
    }

    @Override
    public void update(Technology technology) {
        var item = getById(technology.getId());
        if(item == null)
            System.out.println("Teknoloji bulunamadı.");
        else {
            item.setUpdatedDate(LocalDateTime.now());
            item.setName(technology.getName());
            item.setProgrammingLanguage(technology.getProgrammingLanguage());
            repository.update(item);
            System.out.println("Teknoloji güncellendi");
        }
    }

    @Override
    public void delete(int id) {
        var technology = getById(id);
        if(technology == null)
            System.out.println("Teknoloji bulunamadı.");
        else {
            repository.delete(technology.getId());
            System.out.println("Teknoloji silindi.");
        }

    }

    @Override
    public List<Technology> getAll() {
        List<Technology> technologies = repository.getAll();
        for (Technology technology : technologies) {
            System.out.println(technology);
        }
        return technologies;
    }

    @Override
    public Technology getById(int id) {
        return repository.getById(id);
    }
}
