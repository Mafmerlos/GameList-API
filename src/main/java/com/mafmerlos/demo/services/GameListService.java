package com.mafmerlos.demo.services;

import com.mafmerlos.demo.dto.GameListDTO;
import com.mafmerlos.demo.dto.GameMinDTO;
import com.mafmerlos.demo.entities.Game;
import com.mafmerlos.demo.entities.GameList;
import com.mafmerlos.demo.repositories.GameListRepository;
import com.mafmerlos.demo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List <GameList> result  = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();

    }


}
