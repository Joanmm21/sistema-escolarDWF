package com.escuela.sistemaescolar.controller;

import com.escuela.sistemaescolar.model.Profesor;
import com.escuela.sistemaescolar.service.ProfesorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
@Tag(name = "Profesores", description = "Endpoints para la gestión de profesores") //interfaz visual de las pruebas
public class ProfesorController {

    //inyeccion de dependencias
    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    @Operation(summary = "Obtener lista de todos los profesores")
    public List<Profesor> obtenerTodos() {
        return profesorService.listarTodos();
    }

    @PostMapping
    @Operation(summary = "Registrar un nuevo profesor")
    public Profesor crear(@RequestBody Profesor profesor) {
        return profesorService.guardar(profesor);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar datos de un profesor")
    public Profesor actualizar(@PathVariable Long id, @RequestBody Profesor profesor) {
        Profesor existente = profesorService.buscarPorId(id);
        if (existente != null) {
            profesor.setId(id);
            return profesorService.guardar(profesor);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un profesor del sistema")
    public void borrar(@PathVariable Long id) {
        profesorService.eliminar(id);
    }
}