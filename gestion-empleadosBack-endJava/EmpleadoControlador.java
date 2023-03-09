package com.gestion.empleados.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.entity.Empleado;

import com.gestion.empleados.repositorio.EmpleadoRepositorio;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoControlador {

	@Autowired
	private EmpleadoRepositorio repositorio;

	//este metodo sirve para listar todos los empleados
	@GetMapping("/empleados")
	public List<Empleado> listarTodosLosEmpleados() {
		return repositorio.findAll();
	}
	
/*
	//este metodo sirve para guardar el empleado
	@PostMapping("/postEmpleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return repositorio.save(empleado);
	}
    
	//este metodo sirve para buscar un empleado
	@GetMapping("/getEmpleados/{id}")
	public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id){
			Empleado empleado = repositorio.findById(id)
					            .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));
			return ResponseEntity.ok(empleado);
	}
	
	//este metodo sirve para actualizar empleado
	@PutMapping("/putEmpleado/{id}")
	public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id,@RequestBody Empleado detallesEmpleado){
		Empleado empleado = repositorio.findById(id)
				            .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));
		
		empleado.setNombre(detallesEmpleado.getNombre());
		empleado.setApellido(detallesEmpleado.getApellido());
		empleado.setEmail(detallesEmpleado.getEmail());
		
		Empleado empleadoActualizado = repositorio.save(empleado);
		return ResponseEntity.ok(empleadoActualizado);
    }
	
	//este metodo sirve para eliminar un empleado
	@DeleteMapping("/deteleEmpleado/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarEmpleado(@PathVariable Long id){
		Empleado empleado = repositorio.findById(id)
				            .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));
		
		repositorio.delete(empleado);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
    }
*/
	
	
	  @DeleteMapping("/empleados/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
	    try {
	    	repositorio.deleteById(id);
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	
}














