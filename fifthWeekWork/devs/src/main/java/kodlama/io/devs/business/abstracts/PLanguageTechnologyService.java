package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreatePLanguageTechnologyRequest;
import kodlama.io.devs.business.requests.UpdatePLanguageTechnologyRequest;
import kodlama.io.devs.business.responses.GetPLanguageTechnologyResponse;

public interface PLanguageTechnologyService {

	List<GetPLanguageTechnologyResponse> getAll();
	List<GetPLanguageTechnologyResponse> findByProgrammingLanguageId(int pLanguageId);

	GetPLanguageTechnologyResponse getById(int id) throws Exception;

	void add(CreatePLanguageTechnologyRequest createPLanguageTechnologyRequest);

	void delete(UpdatePLanguageTechnologyRequest updatePLanguageTechnologyRequest);

	void update(UpdatePLanguageTechnologyRequest updatePLanguageTechnologyRequest);
	
	
	
	
	
}
