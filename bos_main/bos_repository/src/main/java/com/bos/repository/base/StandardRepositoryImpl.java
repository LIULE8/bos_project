package com.bos.repository.base;

import com.bos.entity.base.Standard;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StandardRepositoryImpl implements StandardRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Standard standard) {
        entityManager.persist(standard);
    }

    @Override
    public List<Standard> findAll() {
        return entityManager.createQuery("from Standard", Standard.class).getResultList();
    }
}
