package com.nati.tinyurl.repository;


import com.nati.tinyurl.model.UserClick;
import com.nati.tinyurl.model.UserClickKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

public interface UserClickRepository extends CassandraRepository<UserClick, UserClickKey> {
    @Query("SELECT * FROM userclick WHERE user_name=:userName")
    Iterable<UserClick> findByUserName(String userName);

}
