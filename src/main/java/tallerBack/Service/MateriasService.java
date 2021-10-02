package tallerBack.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tallerBack.Model.MateriasModel;
import tallerBack.Repository.MateriasRepository;

@Service
public class MateriasService {
	
	@Autowired
	private MateriasRepository materiasRepository;
	
	public List<MateriasModel> listAllMaterias(){
		return materiasRepository.findAll();
	}
	
	

}
