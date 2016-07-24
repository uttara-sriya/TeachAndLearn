package com.doit.Repository;

import com.doit.Domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sampa on 24-07-2016.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

}
