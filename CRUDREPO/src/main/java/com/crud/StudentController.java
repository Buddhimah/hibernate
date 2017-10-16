package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by buddhimah on 10/16/2017.
 */
@Controller
@RequestMapping(path="/student")
@ResponseBody
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public boolean addNewStudent (@RequestBody StudentEntity studentEntity) {

        if(studentService.addNewSystemUser(studentEntity)!=null){
            return true;
        }
        else{
            return false;
        }
    }
}
