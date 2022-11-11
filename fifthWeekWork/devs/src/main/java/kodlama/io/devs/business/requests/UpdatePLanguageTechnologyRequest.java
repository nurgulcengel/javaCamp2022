package kodlama.io.devs.business.requests;

public class UpdatePLanguageTechnologyRequest {

	public UpdatePLanguageTechnologyRequest() {
		
	}

	public UpdatePLanguageTechnologyRequest(int id, String name, int pLanguageId) {
		
		this.id = id;
		this.name = name;
	    this.setpLanguageId(pLanguageId);
		
	}

	private int id;
	private String name;
	private int pLanguageId;
	

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

	public int getpLanguageId() {
		return pLanguageId;
	}

	public void setpLanguageId(int pLanguageId) {
		this.pLanguageId = pLanguageId;
	}



}
