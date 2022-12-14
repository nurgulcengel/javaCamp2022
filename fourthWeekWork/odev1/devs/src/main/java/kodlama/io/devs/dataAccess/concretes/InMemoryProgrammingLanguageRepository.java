package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {

		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Phyton"));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(ProgrammingLanguage programmingLanguage) {

		for (ProgrammingLanguage pLanguage : programmingLanguages) {

			if (pLanguage.getId() == programmingLanguage.getId()) {

				return pLanguage;
			}

		}

		return null;

	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		programmingLanguages.add(programmingLanguage);

	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {

		for (ProgrammingLanguage pLanguage : programmingLanguages) {

			if (pLanguage.getId() == programmingLanguage.getId()) {

				programmingLanguages.remove(programmingLanguages.indexOf(pLanguage));
			}

		}

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {

		for (ProgrammingLanguage pLanguage : programmingLanguages) {

			if (pLanguage.getId() == programmingLanguage.getId()) {

				pLanguage.setName(programmingLanguage.getName());
			}

		}

	}

}
