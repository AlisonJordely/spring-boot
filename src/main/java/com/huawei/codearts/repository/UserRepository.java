package com.huawei.codearts.repository;

import com.huawei.codearts.entity.Users;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Luis Enrique Carranza - Huawei Cloud
 * 
 * Spring Data JPA focuses on using JPA to store data in a relational database. 
 * Its most compelling feature is the ability to create repository implementations automatically, at runtime, from a repository interface.
 *
 * El repository se encarga de hacer la consulta a la base de datos
 *
 */

@Repository
public interface UserRepository extends CrudRepository<Users, Integer>{

    void save(User users);
}