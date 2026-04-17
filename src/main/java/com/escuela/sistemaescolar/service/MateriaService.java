package com.escuela.sistemaescolar.service;

import com.escuela.sistemaescolar.model.Materia;
import com.escuela.sistemaescolar.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> listarTodas() { return materiaRepository.findAll(); }
    public Materia guardar(Materia materia) { return materiaRepository.save(materia); }
    public Materia buscarPorId(Long id) { return materiaRepository.findById(id).orElse(null); }
    public void eliminar(Long id) { materiaRepository.deleteById(id); }
}