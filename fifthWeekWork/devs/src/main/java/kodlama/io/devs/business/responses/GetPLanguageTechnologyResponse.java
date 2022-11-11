package kodlama.io.devs.business.responses;

public class GetPLanguageTechnologyResponse {

	private int id;
	private String name;
	private int programmingLanguageId;

	public GetPLanguageTechnologyResponse() {

	}

	public GetPLanguageTechnologyResponse(int id, String name,int programmingLanguageId) {

		this.id = id;
		this.name = name;
		this.programmingLanguageId=programmingLanguageId;
	}

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

	public int getProgrammingLanguageId() {
		return programmingLanguageId;
	}

	public void setProgrammingLanguageId(int programmingLanguageId) {
		this.programmingLanguageId = programmingLanguageId;
	}
}
