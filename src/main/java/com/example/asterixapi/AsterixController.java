package com.example.asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/asterix/character")
public class AsterixController {

    private final CharacterRepo characterRepo;




    @GetMapping
    public List<Character> getAllCharacters() {
        return characterRepo.findAll();
    }

    @PostMapping("/add")
    public Character addCharacter(@RequestBody Character character) {
        return characterRepo.save(character);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCharakter(@PathVariable String id) {
        characterRepo.deleteById(id);
    }




}
