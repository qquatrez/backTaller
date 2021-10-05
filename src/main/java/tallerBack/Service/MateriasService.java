package tallerBack.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public MateriasModel getMateriaByCodigo(int codigo) {
		return materiaRepository.findById(codigo).get();
	}
	
	//Delete
	public void deleteMateria(int codigo) {
		materiaRepository.deleteById(codigo);			
	}
	
	//Post
	public void saveMateria(MateriasModel materia) {
		materiaRepository.save(materia);
	}
	
}
