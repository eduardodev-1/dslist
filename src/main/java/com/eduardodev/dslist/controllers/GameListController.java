package com.eduardodev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardodev.dslist.dto.GameListDTO;
import com.eduardodev.dslist.dto.GameMinDTO;
import com.eduardodev.dslist.dto.ReplacementDTO;
import com.eduardodev.dslist.services.GameListService;
import com.eduardodev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		return gameService.findByList(listId);
	}
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
		
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}

}
