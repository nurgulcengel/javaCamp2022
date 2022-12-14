package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {

		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(ProgrammingLanguage programmingLanguage) {

		return programmingLanguageRepository.getById(programmingLanguage);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		isNotNullOrEmpty(programmingLanguage.getName());

		isNameAlreadyExists(programmingLanguage.getName());

		programmingLanguageRepository.add(programmingLanguage);

	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {

		programmingLanguageRepository.delete(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {

		isNotNullOrEmpty(programmingLanguage.getName());

		isNameAlreadyExists(programmingLanguage.getName());

		programmingLanguageRepository.update(programmingLanguage);

	}

	private void isNotNullOrEmpty(String text) {

		if (text == null || text.trim().isEmpty()) {
			/*
			 * 1-) Operasyonun basarili sonuclanip sonuclanmadigini bildiren bir yapiyi
			 * henuz tasarlamadigim icin hata firlattim(OperationResult.IsSucceeded)
			 */
			throw new IllegalArgumentException("Name parameter must not be null or empty");
		}
	}

	private void isNameAlreadyExists(String name) {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.getAll();

		for (ProgrammingLanguage pLanguage : programmingLanguages) {

			if (pLanguage.getName().equals(name)) {
				/*
				 * Operasyonun basarili sonuclanip sonuclanmadigini bildiren bir yapiyi henuz
				 * tasarlamadigim icin hata firlattim(OperationResult.IsSucceeded)
				 */
				throw new IllegalArgumentException("Name is already exists");
			}
		}
	}
}
