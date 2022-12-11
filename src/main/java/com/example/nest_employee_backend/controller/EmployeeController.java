package com.example.nest_employee_backend.controller;

import com.example.nest_employee_backend.dao.EmployeeDao;
import com.example.nest_employee_backend.dao.TaskDao;
import com.example.nest_employee_backend.model.Employee;
import com.example.nest_employee_backend.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao edao;

    @Autowired
    private TaskDao tdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemployee",consumes = "application/json",produces = "application/json")
    public String addEmployee(@RequestBody Employee e)
    {
        edao.save(e);
        return "{\"status\":\"success\"}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addtask",consumes = "application/json",produces = "application/json")
    public String addTask(@RequestBody Task t)
    {
        tdao.save(t);
        return "{\"status\":\"success\"}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/adminviewtaskstatus")
    public List<Map<String,String>> viewTaskStatus(){
        return (List<Map<String,String>>) tdao.viewTaskStatus();}

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userviewtaskstatus",consumes = "application/json",produces = "application/json")
    public List<Task> getComplaint(@RequestBody Task t)
    {
        System.out.println(t.getId());
        return (List<Task>) tdao.viewTaskStatusUser(t.getId());
    }
//    @CrossOrigin(origins = "*")
//    @PostMapping(path = "/updatestatus",consumes = "application/json",produces = "application/json")
//    public List<Task> getComplaint(@RequestBody Task t)
//    {
//        System.out.println(t.getId());
//        return (List<Task>) tdao.userUpdateStatus(t.getId());
//    }

}
