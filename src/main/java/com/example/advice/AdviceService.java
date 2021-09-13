package com.example.advice;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AdviceService {

    private final AdviceRepo adviceRepo;

    public void saveAdvice(Advice advice){
        adviceRepo.save(advice);
    }
    public Advice findById(Integer id){
       return adviceRepo.findById(id).orElse(null);
    }

    public List<Advice> getAll(){
        //System.out.println(adviceRepo.findAll());
        return adviceRepo.findAll();

    }

    public void delete(Integer id){
        Advice advice = findById(id);
        adviceRepo.delete(advice);
    }

    public void update(Advice advice){
        adviceRepo.save(advice);
    }



}
