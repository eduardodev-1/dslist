package com.eduardodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardodev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
