package com.example.advice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/advice")
public class AdviceController {

    private final AdviceService adviceService;

    @GetMapping("/all")
    @ResponseBody
    public List<Advice> getAll(){
        return adviceService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Advice getAdvice(@PathVariable long id){
        return adviceService.findById(id);
    }

    @PostMapping("")
    public String addAdvice(@RequestBody Advice advice){
        adviceService.saveAdvice(advice);
        return "Added";
    }

    @DeleteMapping("/{id}")
    public String removeAdvice(@PathVariable long id){
        adviceService.delete(id);
        return "Removed";
    }

    @PutMapping("/{id}")
    public String updateAdvice(@PathVariable long id){
        Advice advice = adviceService.findById(id);
        advice.setTitle("Updated Title");
        adviceService.update(advice);
        return "Updated";
    }


}
