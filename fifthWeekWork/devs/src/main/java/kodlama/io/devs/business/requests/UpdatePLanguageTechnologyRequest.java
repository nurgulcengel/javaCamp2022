package kodlama.io.devs.business.requests;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public class UpdatePLanguageTechnologyRequest {

	public UpdatePLanguageTechnologyRequest() {
		
	}

	public UpdatePLanguageTechnologyRequest(int id, String name,ProgrammingLanguage programmingLanguage) {
		
		this.id = id;
		this.name = name;
		this.setProgrammingLanguage(programmingLanguage);
	}

	private int id;
	private String name;
	private ProgrammingLanguage programmingLanguage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
