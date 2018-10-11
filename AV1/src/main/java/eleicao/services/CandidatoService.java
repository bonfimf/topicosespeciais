package eleicao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eleicao.domain.Candidato;
import eleicao.repositories.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository repository;
	
	public Candidato buscarCandidato(Integer id) {
		Optional<Candidato> opt = repository.findById(id);
		return opt.orElse(null);
	}
	
}
