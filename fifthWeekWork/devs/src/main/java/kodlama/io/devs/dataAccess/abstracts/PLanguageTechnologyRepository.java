package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.concretes.PLanguageTechnology;

public interface PLanguageTechnologyRepository extends JpaRepository<PLanguageTechnology, Integer> {

	List<PLanguageTechnology> findByProgrammingLanguageId(int pLanguageId);

}
