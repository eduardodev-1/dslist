package com.eduardodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardodev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
