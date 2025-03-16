package service.abstracts;

import entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);

    void add(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(int id);
}
