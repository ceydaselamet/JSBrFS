package repository.concrete.inMemory;

import entity.ProgrammingLanguage;
import repository.abstracts.ProgrammingLanguageRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    private List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository(){
        programmingLanguages = new ArrayList<>();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage lang : programmingLanguages) {
            if (lang.getId() == programmingLanguage.getId()) {
                lang.setName(programmingLanguage.getName());
                lang.setUpdatedDate(java.time.LocalDateTime.now());
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
         programmingLanguages.removeIf(p -> p.getId() == id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguages.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
