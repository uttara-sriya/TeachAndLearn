package com.doit.Repository;

import com.doit.Domain.Role;

import com.doit.Domain.UserStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sampa on 24-07-2016.
 */
@Repository
public interface RoleRepository extends CrudRepository<UserStudent,Long> {
    @Query("select s from UserStudent s where s.studentId=?1")
     List<UserStudent> findByStudentId(@Param("studentId") Long studentId);
}
