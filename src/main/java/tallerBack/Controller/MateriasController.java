package tallerBack.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tallerBack.Model.MateriasModel;
import tallerBack.Service.MateriasService;

@Validated
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/taller")
public class MateriasController {
	
	@Autowired
	MateriasService materiaService;
	
	@GetMapping("/materias")
	public List <MateriasModel> getMaterias(){
		return materiaService.getAllMaterias();
	}
	
	@GetMapping("/materias/{codigo}")
	public ResponseEntity <MateriasModel> getMateriaByCodigo(@PathVariable("codigo")int codigo){
		MateriasModel materia=materiaService.getMateriaByCodigo(codigo);
		return new ResponseEntity<>(materia, HttpStatus.OK);
	}
	
	@DeleteMapping("/materias/{codigo}")
	public ResponseEntity<?> deleteMateria(@PathVariable("codigo")int codigo){
		materiaService.deleteMateria(codigo);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
		
	@PostMapping("/materias")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MateriasModel agregarMateria(@Valid @RequestBody MateriasModel materia) {
		materiaService.saveMateria(materia);
		return materia;
	}
	
	
	@PutMapping("/materias/{codigo}")
	public ResponseEntity<?> actualizarMateria(@Valid @RequestBody MateriasModel materia, @PathVariable("codigo")int codigo){
		try {
			MateriasModel materiaExiste= materiaService.getMateriaByCodigo(codigo);
			materia.setCodigo(codigo);
			materiaService.saveMateria(materia);
			return new ResponseEntity<>(materiaExiste,HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
}
