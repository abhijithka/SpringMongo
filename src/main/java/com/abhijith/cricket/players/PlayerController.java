package com.abhijith.cricket.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Users", description = "Tool user related operations")
@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @Operation(summary = "Create a new player profile")
    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Validated Player player) {

        Player savedPlayer = playerRepository.save(player);
        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
    }

    @Operation(summary = "Get all player profiles")
    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers() {

        List<Player> players = playerRepository.findAll();
        return ResponseEntity.ok(players);
    }

}
