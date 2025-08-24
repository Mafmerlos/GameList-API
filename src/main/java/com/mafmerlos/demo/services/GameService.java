package com.mafmerlos.demo.services;

import com.mafmerlos.demo.dto.GameMinDTO;
import com.mafmerlos.demo.entities.Game;
import com.mafmerlos.demo.repositories.GameRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRpository gameRepository;

    public List<GameMinDTO> findAll(){
       List <Game> result  = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;
    }

}
