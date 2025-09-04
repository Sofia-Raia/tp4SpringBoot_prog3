package com.example.tp4Spring.managers;

import com.example.tp4Spring.modelos.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//te sirve como DAO (Data Access Object) dentro del ecosistema Spring Data JPA.
@Repository
public interface AgendaManager extends JpaRepository<Agenda, Long> {
//ya trae implementados métodos CRUD y consultas básicas para la entidad
    /*
    disponibles métodos como:
findAll() → trae todos los registros.

findById(Long id) → busca por id.

save(Agenda agenda) → inserta o actualiza.

deleteById(Long id) → elimina por id.

count() → cuenta registros.
     */
}
