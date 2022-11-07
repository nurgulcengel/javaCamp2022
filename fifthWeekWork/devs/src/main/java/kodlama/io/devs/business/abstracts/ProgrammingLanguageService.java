package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetProgrammingLanguageResponse;

public interface ProgrammingLanguageService {

	List<GetProgrammingLanguageResponse> getAll();

	GetProgrammingLanguageResponse getById(int id) throws Exception;

	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

	void delete(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);

	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
}
