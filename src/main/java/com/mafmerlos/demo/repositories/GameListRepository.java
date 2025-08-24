package com.mafmerlos.demo.repositories;


import com.mafmerlos.demo.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
