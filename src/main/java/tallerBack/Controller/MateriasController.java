package tallerBack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tallerBack.Model.MateriasModel;
import tallerBack.Service.MateriasService;

@RestController
@RequestMapping("/taller")
public class MateriasController {
	
	@Autowired
	MateriasService materiasService;
	
	@GetMapping("/materias")
	public List <MateriasModel> list(){
		return materiasService.listAllMaterias();
		
	}
	

}
