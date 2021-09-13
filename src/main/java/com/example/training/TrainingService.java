package com.example.training;

import com.example.advice.Advice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TrainingService {

    private final TrainingRepository trainingRepository;

    public void saveTraining(Training training){
        trainingRepository.save(training);
    }

    public Training findById(Integer id){
        return trainingRepository.findById(id).orElse(null);
    }

    public List<Training> getAll(){
//        System.out.println(trainingRepository.findAll());
        return trainingRepository.findAll();
    }

    public void delete(Integer id){
        Training training = findById(id);
        trainingRepository.delete(training);
    }

    public void update(Training training){
        trainingRepository.save(training);
    }

}
