package kodlama.io.devs.business.requests;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public class CreatePLanguageTechnologyRequest {

	public CreatePLanguageTechnologyRequest() {

	}

	public CreatePLanguageTechnologyRequest(String name,  ProgrammingLanguage programmingLanguage) {

		this.name = name;
		this.setProgrammingLanguage(programmingLanguage);
	}

	private String name;
	private ProgrammingLanguage programmingLanguage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProgrammingLanguage getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}


}
