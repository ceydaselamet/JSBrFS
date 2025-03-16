package service.concrete;

import entity.ProgrammingLanguage;
import repository.abstracts.ProgrammingLanguageRepository;
import service.abstracts.ProgrammingLanguageService;

import java.time.LocalDateTime;
import java.util.List;

public class ProgrammingLanguageImpl implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository repository;

    public ProgrammingLanguageImpl(ProgrammingLanguageRepository repository){
        this.repository = repository;
    }


    @Override
    public List<ProgrammingLanguage> getAll() {
        List<ProgrammingLanguage> languages = repository.getAll();
        for (ProgrammingLanguage language : languages) {
            System.out.println(language);
        }
        return languages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return repository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguage.setCreatedDate(LocalDateTime.now());
        repository.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        var language = getById(programmingLanguage.getId());
        if(language != null){
            language.setUpdatedDate(LocalDateTime.now());
            language.setName(programmingLanguage.getName());
            repository.update(language);
        }
        else
            System.out.println("Programlama dili bulunamadı.");
    }

    @Override
    public void delete(int id) {
        var language = getById(id);
        if(language != null)
            repository.delete(id);
        else
            System.out.println("Programlama dili bulunamadı.");
    }
}
