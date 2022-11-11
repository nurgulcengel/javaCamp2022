package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.PLanguageTechnologyService;
import kodlama.io.devs.business.requests.CreatePLanguageTechnologyRequest;
import kodlama.io.devs.business.requests.UpdatePLanguageTechnologyRequest;
import kodlama.io.devs.business.responses.GetPLanguageTechnologyResponse;
import kodlama.io.devs.dataAccess.abstracts.PLanguageTechnologyRepository;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.PLanguageTechnology;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Service
public class PLanguageTechnologyManager implements PLanguageTechnologyService {

	PLanguageTechnologyRepository pLanguageTechnologyRepository;
	ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public PLanguageTechnologyManager(PLanguageTechnologyRepository pLanguageTechnologyRepository,
			ProgrammingLanguageRepository programmingLanguageRepository) {

		this.pLanguageTechnologyRepository = pLanguageTechnologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetPLanguageTechnologyResponse> getAll() {

		List<PLanguageTechnology> pLanguageTechnologies = pLanguageTechnologyRepository.findAll();
		List<GetPLanguageTechnologyResponse> getPLanguageTechnologyResponses = new ArrayList<>();

		for (PLanguageTechnology pLanguageTechnology : pLanguageTechnologies) {

			GetPLanguageTechnologyResponse responseItem = new GetPLanguageTechnologyResponse();
			responseItem.setId(pLanguageTechnology.getId());
			responseItem.setName(pLanguageTechnology.getName());
			responseItem.setProgrammingLanguageId(pLanguageTechnology.getProgrammingLanguage().getId());

			getPLanguageTechnologyResponses.add(responseItem);
		}

		return getPLanguageTechnologyResponses;
	}

	@Override
	public List<GetPLanguageTechnologyResponse> findByProgrammingLanguageId(int pLanguageId) {

		List<PLanguageTechnology> pLanguageTechnologies = pLanguageTechnologyRepository.findAll();
		List<GetPLanguageTechnologyResponse> getPLanguageTechnologyResponses = new ArrayList<>();

		for (PLanguageTechnology pLanguageTechnology : pLanguageTechnologies) {

			if (pLanguageTechnology.getProgrammingLanguage().getId() == pLanguageId) {

				GetPLanguageTechnologyResponse responseItem = new GetPLanguageTechnologyResponse();
				responseItem.setId(pLanguageTechnology.getId());
				responseItem.setName(pLanguageTechnology.getName());
				responseItem.setProgrammingLanguageId(pLanguageTechnology.getProgrammingLanguage().getId());

				getPLanguageTechnologyResponses.add(responseItem);
			}

		}

		return getPLanguageTechnologyResponses;

	}

	@Override
	public GetPLanguageTechnologyResponse getById(int id) throws Exception {

		List<PLanguageTechnology> pLanguageTechnologies = pLanguageTechnologyRepository.findAll();
		GetPLanguageTechnologyResponse getPLanguageTechnologyResponse = null;

		for (PLanguageTechnology pLanguageTechnology : pLanguageTechnologies) {

			if (pLanguageTechnology.getId() == id) {

				getPLanguageTechnologyResponse = new GetPLanguageTechnologyResponse();
				getPLanguageTechnologyResponse.setId(pLanguageTechnology.getId());
				getPLanguageTechnologyResponse.setName(pLanguageTechnology.getName());
				getPLanguageTechnologyResponse
						.setProgrammingLanguageId(pLanguageTechnology.getProgrammingLanguage().getId());

			}
		}

		if (getPLanguageTechnologyResponse == null) {

			throw new Exception("Kayıt bulunamadı");
		}

		return getPLanguageTechnologyResponse;

	}

	@Override
	public void add(CreatePLanguageTechnologyRequest createPLanguageTechnologyRequest) {

		ProgrammingLanguage programmingLanguage = programmingLanguageRepository
				.findById(createPLanguageTechnologyRequest.getpLanguageId()).get();

		isNotNullOrEmpty(createPLanguageTechnologyRequest.getName());
		isNameAlreadyExists(createPLanguageTechnologyRequest.getName());

		PLanguageTechnology pLanguageTechnology = new PLanguageTechnology();
		pLanguageTechnology.setName(createPLanguageTechnologyRequest.getName());
		pLanguageTechnology.setProgrammingLanguage(programmingLanguage);
		// pLanguageTechnology.setProgrammingLanguage(programmingLanguageRepository.getReferenceById(createPLanguageTechnologyRequest.getpLanguageId()));

		pLanguageTechnologyRepository.save(pLanguageTechnology);

	}

	@Override
	public void delete(UpdatePLanguageTechnologyRequest updatePLanguageTechnologyRequest) {

		List<PLanguageTechnology> pLanguageTechnologies = pLanguageTechnologyRepository.findAll();
		for (PLanguageTechnology pLanguageTechnology : pLanguageTechnologies) {
			if (pLanguageTechnology.getId() == updatePLanguageTechnologyRequest.getId()) {

				pLanguageTechnologyRepository.delete(pLanguageTechnology);
			}
		}

	}

	@Override
	public void update(UpdatePLanguageTechnologyRequest updatePLanguageTechnologyRequest) {
       
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository
				.findById(updatePLanguageTechnologyRequest.getpLanguageId()).get();
		
		isNotNullOrEmpty(updatePLanguageTechnologyRequest.getName());
		isNameAlreadyExists(updatePLanguageTechnologyRequest.getName());

		List<PLanguageTechnology> pLanguageTechnologies = pLanguageTechnologyRepository.findAll();
		for (PLanguageTechnology pLanguageTechnology : pLanguageTechnologies) {
			if (pLanguageTechnology.getId() == updatePLanguageTechnologyRequest.getId()) {

				pLanguageTechnology.setName(updatePLanguageTechnologyRequest.getName());
				pLanguageTechnology.setProgrammingLanguage(programmingLanguage);
                pLanguageTechnologyRepository.save(pLanguageTechnology);
				
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
		List<PLanguageTechnology> pLanguageTechnologies = pLanguageTechnologyRepository.findAll();

		for (PLanguageTechnology pLanguageTechnology : pLanguageTechnologies) {

			if (pLanguageTechnology.getName().equals(name)) {
				/*
				 * Operasyonun basarili sonuclanip sonuclanmadigini bildiren bir yapiyi henuz
				 * tasarlamadigim icin hata firlattim(OperationResult.IsSucceeded)
				 */
				throw new IllegalArgumentException("Name is already exists");
			}
		}
	}

}
