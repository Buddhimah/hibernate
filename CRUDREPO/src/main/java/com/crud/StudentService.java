package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by buddhimah on 10/16/2017.
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository daoImp;

    public StudentEntity addNewSystemUser(StudentEntity studentEntity) {

        return this.daoImp.save(studentEntity);
    }

}
