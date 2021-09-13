package com.example.answer;

import com.example.advice.Advice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;
import java.util.Scanner;

@RestController
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {

    private final AnswerService answerService;

    @GetMapping("")
    @ResponseBody
    public List<Answer> getAll(){
        return answerService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Answer getAnswer(@PathVariable int id){
        return answerService.findById(id);
    }

    @PostMapping("")
    public void addAnswer(@RequestBody Answer answer){
        answerService.saveAdvice(answer);
    }

    @DeleteMapping("/{id}")
    public void removeAnswer(@PathVariable int id){
        answerService.delete(id);
    }

    @PutMapping("/{id}")
    public String updateAnswer(@PathVariable int id){
        Answer answer = answerService.findById(id);
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        answer.setOption1("pytanie test");
        answerService.saveAdvice(answer);
        return "Updated";
    }

}
