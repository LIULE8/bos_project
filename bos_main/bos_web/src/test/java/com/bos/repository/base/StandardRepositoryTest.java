package com.bos.repository.base;


import com.bos.entity.base.Standard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class StandardRepositoryTest {

    @Autowired
    private StandardRepository standardRepository;

    @Test
    @Transactional
    @Rollback(false) // 取消自动回滚功能
    public void save() {
        Standard standard = new Standard();
        standard.setMinLength(10L);
        standard.setMaxLength(20L);
        standard.setMinWeight(5L);
        standard.setMaxWeight(10L);
        standard.setStandardName("5-10斤的标准");
        standardRepository.save(standard);
    }

    @Test
    public void findAll() {
      standardRepository.findAll().forEach(System.out::println);
    }
}
