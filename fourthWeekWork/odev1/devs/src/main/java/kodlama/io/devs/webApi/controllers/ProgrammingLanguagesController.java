package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {

		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguageService.getAll();
	}

	@PostMapping("/getbyid")
	public ProgrammingLanguage getById(@RequestBody ProgrammingLanguage programmingLanguage) {

		return programmingLanguageService.getById(programmingLanguage);
	}

	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage programmingLanguage) {

		programmingLanguageService.add(programmingLanguage);

	}

	@PostMapping("/delete")
	public void delete(@RequestBody ProgrammingLanguage programmingLanguage) {

		programmingLanguageService.delete(programmingLanguage);

	}

	@PostMapping("/update")
	public void update(@RequestBody ProgrammingLanguage programmingLanguage) {

		programmingLanguageService.update(programmingLanguage);

	}

}
