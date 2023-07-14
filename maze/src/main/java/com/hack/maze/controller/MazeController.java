package com.hack.maze.controller;


import com.hack.maze.json.EmployeeDetails;
import com.hack.maze.util.LoadDataUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
public class MazeController {

    @GetMapping("employee/{name}")
    public ResponseEntity<Object> employee(@PathVariable("name") String employeename) {

        List<EmployeeDetails> list = LoadDataUtils.load();

        List<EmployeeDetails> collect = list.stream().filter(item -> item.getName().equals(employeename)).collect(Collectors.toList());

        return new ResponseEntity<>(collect, HttpStatus.OK);
    }

    @GetMapping("attachments/{date}")
    public ResponseEntity<Object> attachments(@PathVariable("date") String date) {

        List<EmployeeDetails> list = LoadDataUtils.load();

        String d = date.replaceAll("-", "/");

        List<EmployeeDetails> collect = list.stream()
                .filter(item -> item.getAsOf().equals(d))
                .collect(Collectors.toList());

        Map<String, Long> collect1 = collect.stream().collect(Collectors.groupingBy(EmployeeDetails::getType, Collectors.counting()));
        List<Map<String, String>> l =  new ArrayList<>();
        for(Map.Entry me : collect1.entrySet()) {
            Map<String, String> m = new HashMap<>();

            m.put("type", (String) me.getKey());
            m.put("count", String.valueOf(me.getValue()));
            l.add(m);
        }

        return new ResponseEntity<>(l, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("workstreams/{type}/{date}")
    public ResponseEntity<Object> workStreams(@PathVariable("type") String type, @PathVariable("date") String date) {

        List<EmployeeDetails> list = LoadDataUtils.load();

        String d = date.replaceAll("-", "/");

        List<String> collect = list.stream()
                .filter(item -> item.getAsOf().equals(d))
                .map(EmployeeDetails::getName)
                .collect(Collectors.toList());

        return new ResponseEntity<>(collect, HttpStatus.OK);
    }

}
