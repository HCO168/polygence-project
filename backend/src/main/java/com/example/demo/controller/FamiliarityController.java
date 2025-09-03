package com.example.demo.controller;

import com.example.demo.service.FamiliarityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fml")
public class FamiliarityController {
    @Autowired
    FamiliarityService familiarityService;
    FamiliarityController() {
    }
    FamiliarityController(FamiliarityService familiarityService) {
        this.familiarityService = familiarityService;
    }
    @GetMapping()
    public Integer getFamiliarity(@RequestParam String username,@RequestParam String word){
        return familiarityService.getFamiliarity(username,word);
    }
    @PutMapping()
    public void setFamiliarity(@RequestParam String username,@RequestParam String word,@RequestParam Integer familiarity,@RequestParam String context){
        familiarityService.updateFamiliarity(username,word,familiarity,context);
    }
}
