package com.doit.Service;

import com.doit.Domain.Role;
import com.doit.Domain.UserStudent;
import com.doit.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sampa on 24-07-2016.
 */
@Service
public class StudentServiceImpl implements  StudentService {
    private RoleRepository roleRepository;
    @Autowired
    public StudentServiceImpl(RoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }
    @Override
    public List<UserStudent> findByStudentId(Long studentId) {
        return roleRepository.findByStudentId(studentId);
    }
}
