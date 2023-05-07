package com.restapi.restapi.repository;

import com.restapi.restapi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, BigInteger> {

//    @Query(value = "Select * from m_user",nativeQuery = true)
//    List<UserModel> getUser();
//
//    @Query(value = "Select * from m_user where id = ?1",nativeQuery = true )
//    UserModel findUser(BigInteger id);
//
//    @Query(value = "Delete from m_user where id =?", nativeQuery = true)
//    void deleteUser(BigInteger id);
//
//    @Modifying
//    @Query(value = "insert into m_user (name, age) values (:name,:age) ", nativeQuery = true)
//    @Transactional
//    void addUser(@Param("name") String name, @Param("age") String age);
}
