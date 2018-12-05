package com.bos.repository.base;

import com.bos.entity.base.Standard;

import java.util.List;

/**
 * 收派标准
 */
public interface StandardRepository {

    void save(Standard standard);

    List<Standard> findAll();
}
