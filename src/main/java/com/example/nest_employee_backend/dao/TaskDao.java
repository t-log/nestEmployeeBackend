package com.example.nest_employee_backend.dao;

import com.example.nest_employee_backend.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface TaskDao extends CrudRepository<Task,Integer> {


    @Query(value ="",nativeQuery = true)
    List<Map<String,String>> viewTaskStatus();

    @Query(value ="",nativeQuery = true)
    List<Task> viewTaskStatusUser(@Param("") Integer userId);
}
