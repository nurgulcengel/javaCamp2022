package kodlama.io.devs.business.requests;

public class CreatePLanguageTechnologyRequest {

	public CreatePLanguageTechnologyRequest() {

	}

	public CreatePLanguageTechnologyRequest(String name, int programmingLanguageId) {

		this.name = name;
		this.programmingLanguageId = programmingLanguageId;
	}

	private String name;
	private int programmingLanguageId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProgrammingLanguageId() {
		return programmingLanguageId;
	}

	public void setProgrammingLanguageId(int programmingLanguageId) {
		this.programmingLanguageId = programmingLanguageId;
	}

}
