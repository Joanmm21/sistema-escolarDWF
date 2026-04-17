package com.escuela.sistemaescolar.controller;

import com.escuela.sistemaescolar.model.Materia;
import com.escuela.sistemaescolar.service.MateriaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
@Tag(name = "Materias", description = "Endpoints para gestionar las materias y sus profesores")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    @Operation(summary = "Obtener todas las materias")
    public List<Materia> obtenerTodas() {
        return materiaService.listarTodas();
    }

    @PostMapping
    @Operation(summary = "Crear una nueva materia")
    public Materia crear(@RequestBody Materia materia) {
        return materiaService.guardar(materia);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar una materia")
    public Materia actualizar(@PathVariable Long id, @RequestBody Materia materia) {
        Materia existente = materiaService.buscarPorId(id);
        if (existente != null) {
            materia.setId(id);
            return materiaService.guardar(materia);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una materia")
    public void borrar(@PathVariable Long id) {
        materiaService.eliminar(id);
    }
}