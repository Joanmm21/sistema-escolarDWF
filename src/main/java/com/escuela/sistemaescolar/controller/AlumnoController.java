package com.escuela.sistemaescolar.controller;

import com.escuela.sistemaescolar.model.Alumno;
import com.escuela.sistemaescolar.service.AlumnoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@Tag(name = "Alumnos", description = "Endpoints para gestionar alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    @Operation(summary = "Obtener lista de alumnos")
    public List<Alumno> obtenerTodos() {
        return alumnoService.listarTodos();
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo alumno")
    public Alumno crear(@RequestBody Alumno alumno) {
        return alumnoService.guardar(alumno);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un alumno existente")
    public Alumno actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        Alumno existente = alumnoService.buscarPorId(id);
        if (existente != null) {
            alumno.setId(id);
            return alumnoService.guardar(alumno);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un alumno")
    public void borrar(@PathVariable Long id) {
        alumnoService.eliminar(id);
    }
}