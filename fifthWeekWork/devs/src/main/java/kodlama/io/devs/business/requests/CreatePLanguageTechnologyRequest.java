package kodlama.io.devs.business.requests;

public class CreatePLanguageTechnologyRequest {

	public CreatePLanguageTechnologyRequest() {

	}

	public CreatePLanguageTechnologyRequest(String name, int pLanguageId) {

		this.name = name;
		this.pLanguageId=pLanguageId;
		
	}

	private String name;
	private int pLanguageId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getpLanguageId() {
		return pLanguageId;
	}

	public void setpLanguageId(int pLanguageId) {
		this.pLanguageId = pLanguageId;
	}




}
