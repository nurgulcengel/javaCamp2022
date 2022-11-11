package kodlama.io.devs.webApi.controllers.kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {

		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<GetProgrammingLanguageResponse> getAll() {

		return programmingLanguageService.getAll();
	}

	@GetMapping("/getbyid/{id}")
	public GetProgrammingLanguageResponse getById(@PathVariable int id) throws Exception {

		return programmingLanguageService.getById(id);
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {

		programmingLanguageService.add(createProgrammingLanguageRequest);

	}

	@PostMapping("/delete")
	public void delete(@RequestBody UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {

		programmingLanguageService.delete(updateProgrammingLanguageRequest);

	}

	@PostMapping("/update")
	public void update(@RequestBody UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {

		programmingLanguageService.update(updateProgrammingLanguageRequest);

	}

}
