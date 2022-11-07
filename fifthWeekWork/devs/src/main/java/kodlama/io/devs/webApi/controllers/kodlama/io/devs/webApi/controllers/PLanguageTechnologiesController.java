package kodlama.io.devs.webApi.controllers.kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.devs.business.abstracts.PLanguageTechnologyService;
import kodlama.io.devs.business.requests.CreatePLanguageTechnologyRequest;
import kodlama.io.devs.business.requests.UpdatePLanguageTechnologyRequest;
import kodlama.io.devs.business.responses.GetPLanguageTechnologyResponse;

@RestController
@RequestMapping("/api/planguagetechnologies")
public class PLanguageTechnologiesController {

	PLanguageTechnologyService pLanguageTechnologyService;

	@Autowired
	public PLanguageTechnologiesController(PLanguageTechnologyService pLanguageTechnologyService) {

		this.pLanguageTechnologyService = pLanguageTechnologyService;
	}

	@GetMapping("/getall")
	public List<GetPLanguageTechnologyResponse> getAll() {

		return pLanguageTechnologyService.getAll();
	};

	@GetMapping("/findbyprogramminlanguageid/{pLanguageId}")
	public List<GetPLanguageTechnologyResponse> findByProgrammingLanguageId(@PathVariable int pLanguageId) {

		return pLanguageTechnologyService.findByProgrammingLanguageId(pLanguageId);
	};

	@GetMapping("/getbyid/{id}")
	public GetPLanguageTechnologyResponse getById(@PathVariable int id) throws Exception {
		return pLanguageTechnologyService.getById(id);
	};

	@PostMapping("/add")
	public void add(@RequestBody CreatePLanguageTechnologyRequest createPLanguageTechnologyRequest) {

		pLanguageTechnologyService.add(createPLanguageTechnologyRequest);
	};

	@PostMapping("/delete")
	public void delete(@RequestBody UpdatePLanguageTechnologyRequest updatePLanguageTechnologyRequest) {

		pLanguageTechnologyService.delete(updatePLanguageTechnologyRequest);
	};

	@PostMapping("/update")
	public void update(@RequestBody UpdatePLanguageTechnologyRequest updatePLanguageTechnologyRequest) {
		pLanguageTechnologyService.update(updatePLanguageTechnologyRequest);
	};

}
