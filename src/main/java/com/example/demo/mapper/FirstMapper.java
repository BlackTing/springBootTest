package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FirstMapper {
    @Insert("INSERT INTO t_user (name) VALUES (#{name})")
    void createAccount(@Param("name") String name);
}
