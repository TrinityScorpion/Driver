package com.example.advice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;
import java.util.Scanner;

@RestController
@RequiredArgsConstructor
@RequestMapping("/advice")
public class AdviceController {

    private final AdviceService adviceService;

    @GetMapping("")
    @ResponseBody
    public List<Advice> getAll(){
        return adviceService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Advice getAdvice(@PathVariable int id){
        return adviceService.findById(id);
    }

    @PostMapping("")
    public void addAdvice(@RequestBody Advice advice){
        adviceService.saveAdvice(advice);
    }

    @DeleteMapping("/{id}")
    public void removeAdvice(@PathVariable int id){
        adviceService.delete(id);
    }

    @PutMapping("/{id}")
    public String updateAdvice(@PathVariable int id){
        Advice advice = adviceService.findById(id);
        File file = new File("/home/mariusz/Obrazy/Kamera/pic.jpg");
        byte[] picArray = new byte[(int) file.length()];
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        advice.setTitle(title);
        advice.setPicture(picArray);
        adviceService.update(advice);
        return "Updated";
    }


}
