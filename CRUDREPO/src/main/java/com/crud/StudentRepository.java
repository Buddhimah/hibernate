package com.crud;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by buddhimah on 10/16/2017.
 */
public interface StudentRepository  extends CrudRepository<StudentEntity,Integer> {
    StudentEntity save(StudentEntity studentEntity);
}
