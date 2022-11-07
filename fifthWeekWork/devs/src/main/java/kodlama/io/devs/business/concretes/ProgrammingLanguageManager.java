package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetProgrammingLanguageResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {

		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetProgrammingLanguageResponse> getAll() {

		List<ProgrammingLanguage> pLanguages = programmingLanguageRepository.findAll();
		List<GetProgrammingLanguageResponse> programLanguageResponse = new ArrayList<GetProgrammingLanguageResponse>();

		for (ProgrammingLanguage pLanguage : pLanguages) {
			GetProgrammingLanguageResponse responseItem = new GetProgrammingLanguageResponse();
			responseItem.setId(pLanguage.getId());
			responseItem.setName(pLanguage.getName());

			programLanguageResponse.add(responseItem);

		}
		return programLanguageResponse;
	}

	@Override
	public GetProgrammingLanguageResponse getById(int id) throws Exception {

		List<ProgrammingLanguage> pLanguages = programmingLanguageRepository.findAll();
		GetProgrammingLanguageResponse getProgrammingLanguageResponse = null;

		for (ProgrammingLanguage pLanguage : pLanguages) {

			if (pLanguage.getId() == id) {

				getProgrammingLanguageResponse = new GetProgrammingLanguageResponse();
				getProgrammingLanguageResponse.setId(pLanguage.getId());
				getProgrammingLanguageResponse.setName(pLanguage.getName());

			}
		}

		if (getProgrammingLanguageResponse == null) {

			throw new Exception("Kayıt bulunamadı");
		}

		return getProgrammingLanguageResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {

		isNotNullOrEmpty(createProgrammingLanguageRequest.getName());
		isNameAlreadyExists(createProgrammingLanguageRequest.getName());

		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());

		this.programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void delete(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {

		List<ProgrammingLanguage> pLanguages = programmingLanguageRepository.findAll();

		for (ProgrammingLanguage programmingLanguage : pLanguages) {
			if (programmingLanguage.getId() == updateProgrammingLanguageRequest.getId()) {

				this.programmingLanguageRepository.delete(programmingLanguage);
			}
		}

	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {

		isNotNullOrEmpty(updateProgrammingLanguageRequest.getName());
		isNameAlreadyExists(updateProgrammingLanguageRequest.getName());

		List<ProgrammingLanguage> pLanguages = programmingLanguageRepository.findAll();

		for (ProgrammingLanguage pLanguage : pLanguages) {

			if (pLanguage.getId() == updateProgrammingLanguageRequest.getId()) {

				pLanguage.setName(updateProgrammingLanguageRequest.getName());
				this.programmingLanguageRepository.save(pLanguage);
			}
		}

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
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();

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
