package com.example.training;

import com.example.answer.Answer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

//@RequestMapping("/advice/{id}/training")
@RestController
@RequiredArgsConstructor
@RequestMapping("/training")
public class TrainingController {

    private final TrainingService trainingService;

    @GetMapping("")
    @ResponseBody
    public List<Training> getAll(){
        return trainingService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Training getTraining(@PathVariable int id){
        return trainingService.findById(id);
    }

    @PostMapping("")
    public void addTraining(@RequestBody Training training){
        trainingService.saveTraining(training);
    }

    @DeleteMapping("/{id}")
    public void removeTraining(@PathVariable int id){
        trainingService.delete(id);
    }

    @PutMapping("/{id}")
    public String updateAnswer(@PathVariable int id){
        Training training = trainingService.findById(id);
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        training.setQuestion(question);
        trainingService.saveTraining(training);
        return "Updated";
    }
}
