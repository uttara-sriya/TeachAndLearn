package com.doit.Controller;

import com.doit.Domain.Role;
import com.doit.Domain.UserStudent;
import com.doit.Repository.RoleRepository;
import com.doit.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sampa on 24-07-2016.
 */
@RestController
@RequestMapping("/std")
public class StudentController {
    private RoleRepository roleRepository;
    private StudentService studentService;
    @Autowired
    public  StudentController(RoleRepository roleRepository,StudentService studentService){
        this.studentService=studentService;
        this.roleRepository=roleRepository;
    }
    @RequestMapping(value = "/byStdId/{studentId}", method = RequestMethod.GET)
    public List<UserStudent> byRoleId(@PathVariable(value = "studentId") Long studentId){
        return  studentService.findByStudentId(studentId);
    }



}
