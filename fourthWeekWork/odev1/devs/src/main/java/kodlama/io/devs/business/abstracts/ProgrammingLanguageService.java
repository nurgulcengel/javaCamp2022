package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(ProgrammingLanguage programmingLanguage);

	void add(ProgrammingLanguage programmingLanguage);

	void delete(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage);
}
