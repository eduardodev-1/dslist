package com.eduardodev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardodev.dslist.dto.GameListDTO;
import com.eduardodev.dslist.entities.GameList;
import com.eduardodev.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gamelistRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gamelistRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
