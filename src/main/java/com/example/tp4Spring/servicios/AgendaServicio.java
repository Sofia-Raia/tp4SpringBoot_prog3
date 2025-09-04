package com.example.tp4Spring.servicios;

import com.example.tp4Spring.managers.AgendaManager;
import com.example.tp4Spring.modelos.Agenda;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AgendaServicio implements BaseServicio<Agenda> {

    @Autowired //inyeccion de la clase
    private AgendaManager agendaManager;


    @Override
    @Transactional
    public List<Agenda> findAll() throws Exception{
        try{
            List<Agenda> entidades = agendaManager.findAll();
            return entidades;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Agenda findById(Long id)throws Exception {
        try{
            Optional<Agenda> entidad = agendaManager.findById(id);
            return entidad.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Agenda save(Agenda entity)throws Exception {
        try{
            entity=agendaManager.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Agenda update(Long id, Agenda nuevaAgenda)throws Exception {
        try{
            Optional<Agenda> entidad =agendaManager.findById(id); //BUSCO EN LA BD
            Agenda agenda = entidad.get(); //si la BD no devuelve nada el .get() tira un error que dice "No value present"
            agenda.setNombre(nuevaAgenda.getNombre());
            agenda.setApellido(nuevaAgenda.getApellido());
            agenda.setTelefono(nuevaAgenda.getTelefono());
            agenda.setEmail(nuevaAgenda.getEmail());
            agenda.setDomicilio(nuevaAgenda.getDomicilio());

            agenda =agendaManager.save(agenda);
            return agenda;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id)throws Exception {
        try{
            if(agendaManager.existsById(id)){
                agendaManager.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
