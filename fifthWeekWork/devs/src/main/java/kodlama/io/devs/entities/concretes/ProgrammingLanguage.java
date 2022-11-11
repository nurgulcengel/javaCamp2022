package kodlama.io.devs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "programminglanguages")
public class ProgrammingLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	
	
	@OneToMany(mappedBy ="programmingLanguage" )
	private List<PLanguageTechnology> pLanguageTechnologies;

	public ProgrammingLanguage() {

	}

	public ProgrammingLanguage(int id, String name,List<PLanguageTechnology> pLanguageTechnologies) {

		this.id = id;
		this.name = name;
		this.pLanguageTechnologies=pLanguageTechnologies;
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

	public List<PLanguageTechnology> getpLanguageTechnologies() {
		return pLanguageTechnologies;
	}

	public void setpLanguageTechnologies(List<PLanguageTechnology> pLanguageTechnologies) {
		this.pLanguageTechnologies = pLanguageTechnologies;
	}

}
