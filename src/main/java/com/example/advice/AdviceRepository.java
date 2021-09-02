package com.example.advice;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AdviceRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void saveAdvice(Advice advice){
        entityManager.persist(advice);
    }

    public Advice findById(Long id){
        return entityManager.find(Advice.class, id);
    }

    public List<Advice> getAllAdvices(){
        return entityManager.createQuery("SELECT a FROM Advice a").getResultList();
    }

    public void update(Advice advice){
        entityManager.merge(advice);
    }
    public void delete(Long id){
        Advice advice = findById(id);
        entityManager.remove(entityManager.contains(advice) ? advice:entityManager.merge(advice) );
    }


}
