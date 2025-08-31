package com.example.demo.controller;

import com.example.demo.service.FamiliarityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fml")
public class FamiliarityController {
    @Autowired
    FamiliarityService familiarityService;
    @GetMapping("/{word}")
    public Integer getFamiliarity(@RequestParam String username,@PathVariable String word){
        return familiarityService.getFamiliarity(username,word);
    }
    @PostMapping("/{word}")
    public void setFamiliarity(@RequestParam String username,@PathVariable String word,@RequestParam Integer familiarity){
        familiarityService.updateFamiliarity(username,word,familiarity);
    }
}
