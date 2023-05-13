package com.eduardodev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardodev.dslist.dto.GameListDTO;
import com.eduardodev.dslist.entities.GameList;
import com.eduardodev.dslist.projections.GameMinProjection;
import com.eduardodev.dslist.repositories.GameListRepository;
import com.eduardodev.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gamelistRepository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gamelistRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}

	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;
		
		for (int i = min;i <= max; i++) {
			
			gamelistRepository.updateBelongingPosition(listId, list.get(i).getId(), i); 
			
		}
	}
}
