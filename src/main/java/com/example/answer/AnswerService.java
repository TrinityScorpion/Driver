package com.example.answer;

import com.example.advice.Advice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void saveAdvice(Answer answer){
        answerRepository.save(answer);
    }
    public Answer findById(Integer id){
        return answerRepository.findById(id).orElse(null);
    }

    public List<Answer> getAll(){
        //System.out.println(adviceRepo.findAll());
        return answerRepository.findAll();

    }

    public void delete(Integer id){
        Answer answer = findById(id);
        answerRepository.delete(answer);
    }

    public void update(Answer answer){
        answerRepository.save(answer);
    }
}
