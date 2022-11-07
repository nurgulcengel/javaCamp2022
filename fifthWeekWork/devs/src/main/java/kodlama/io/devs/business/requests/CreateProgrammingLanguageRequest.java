package kodlama.io.devs.business.requests;

public class CreateProgrammingLanguageRequest {

	public CreateProgrammingLanguageRequest() {

	}

	public CreateProgrammingLanguageRequest(String name) {

		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
