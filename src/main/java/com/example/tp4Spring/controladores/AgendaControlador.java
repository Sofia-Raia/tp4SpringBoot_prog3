package com.example.tp4Spring.controladores;

import com.example.tp4Spring.modelos.Agenda;
import com.example.tp4Spring.servicios.AgendaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") //varios clientes pueden acceder
@RequestMapping(path = "/agenda") //http://localhost:8080/agenda
public class AgendaControlador {
    @Autowired
    private AgendaServicio agendaServicio;

    public AgendaControlador(AgendaServicio agendaServicio) {
        this.agendaServicio = agendaServicio;
    }
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(agendaServicio.findAll());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\" + Error, intente mas tarde \"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(agendaServicio.findById(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\" + Error, intente mas tarde \"}");
        }
    }

    @PostMapping("") //GUADAR
    public ResponseEntity<?> save(@RequestBody Agenda agenda) {//RequestBody para enviar y response para responder.
        try{
            return ResponseEntity.status(HttpStatus.OK).body(agendaServicio.save(agenda));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, al guardar un contacto \",\"detalles\": \""+e.getMessage()+"\"}");
        }
    }

    @PutMapping("/{id}")//para actualizaciones
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Agenda agenda) { //no necesariamente tiene que pasar el id
        try{
            return ResponseEntity.status(HttpStatus.OK).body(agendaServicio.update(id, agenda));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\" + Error, intente mas tarde \",\"detalles\": \""+e.getMessage()+"\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(agendaServicio.delete(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\" + Error, intente mas tarde \"}");
        }
    }

}
