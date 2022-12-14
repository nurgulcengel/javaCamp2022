package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(ProgrammingLanguage programmingLanguage);

	void add(ProgrammingLanguage programmingLanguage);

	void delete(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage);

}
