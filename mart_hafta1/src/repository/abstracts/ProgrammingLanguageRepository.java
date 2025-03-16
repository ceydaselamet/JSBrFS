package repository.abstracts;

import entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(int id);

    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
}
