package com.example.tp4Spring.managers;

import com.example.tp4Spring.modelos.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//Sirve como DAO (Data Access Object) dentro del ecosistema Spring Data JPA.
@Repository
public interface AgendaManager extends JpaRepository<Agenda, Long> {
//ya trae implementados métodos CRUD y consultas básicas para la entidad
/*
Dispone métodos como:
findAll() → trae todos los registros.
findById(Long id) → busca por id.
save(Agenda agenda) → inserta o actualiza.
deleteById(Long id) → elimina por id.
*/
//Query personalizada para hacer busquedas parciales.
@Query("SELECT a FROM Agenda a WHERE LOWER(a.nombre) LIKE LOWER(CONCAT('%', :param, '%')) " +
        "OR LOWER(a.apellido) LIKE LOWER(CONCAT('%', :param, '%'))")
List<Agenda> getItemsXNombreApellidoParcial(@Param("param") String param);
}
