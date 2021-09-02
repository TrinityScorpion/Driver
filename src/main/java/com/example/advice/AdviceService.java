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

    private final AdviceRepository adviceRepository;

    public void saveAdvice(Advice advice){
        adviceRepository.saveAdvice(advice);
    }
    public Advice findById(long id){
       return adviceRepository.findById(id);
    }

    public List<Advice> getAll(){
        return adviceRepository.getAllAdvices();
    }

    public void delete(long id){
        adviceRepository.delete(id);
    }

    public void update(Advice advice){
        adviceRepository.update(advice);
    }



}
