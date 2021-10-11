package tallerBack.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tallerBack.Exception.ApiErrorNotFound;
import tallerBack.Model.MateriasModel;
import tallerBack.Repository.MateriasRepository;

@Service
public class MateriasService {
	
	@Autowired
	private MateriasRepository materiaRepository;
	
	//GetAll
	public List<MateriasModel> getAllMaterias(){
		return materiaRepository.findAll();
	}
	
	//GetByMateria
	public MateriasModel getMateriaByCodigo(int codigo) throws ApiErrorNotFound {
		return materiaRepository.findById(codigo).orElseThrow(()->new ApiErrorNotFound("no encontrado"));
	}
	
	//Delete
	public void deleteMateria(int codigo) {
		Optional <MateriasModel> materia = materiaRepository.findById(codigo);
		if(!materia.isPresent()) {
			throw new ApiErrorNotFound("no encontrado");
		}
		else {
			materiaRepository.deleteById(codigo);
		}
	}
	
	//Post
	public void saveMateria(MateriasModel materia) {
		materiaRepository.save(materia);
	}
	
	//put
	
	
}
