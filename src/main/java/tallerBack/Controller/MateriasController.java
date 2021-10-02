package tallerBack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tallerBack.Model.MateriasModel;
import tallerBack.Service.MateriasService;

@RestController
@RequestMapping("/taller")
public class MateriasController {
	
	@Autowired
	MateriasService materiaService;
	
	@GetMapping("/materias")
	public List <MateriasModel> getMaterias(){
		return materiaService.getAllMaterias();
	}
	
	@GetMapping("/materias/{codigo}")
	public MateriasModel getMateriaByCodigo(@PathVariable("codigo")int codigo) {
		return materiaService.getMateriaByCodigo(codigo);
		
	}
	
	
	

}
