package com.doit.Service;

import com.doit.Domain.UserStudent;

import java.util.List;

/**
 * Created by sampa on 24-07-2016.
 */
public interface StudentService {
    List<UserStudent> findByStudentId(Long studentId);
}
