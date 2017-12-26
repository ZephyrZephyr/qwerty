package com.tss.qwerty.web.controller;

import com.tss.qwerty.domain.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tss.qwerty.repository.LessonRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StindexController {
    @Autowired
    private LessonRepository lessonRepository;

    @GetMapping(value = "/loadLessonList")
    @ResponseBody
    public List<Lesson> loadLessonList(){
        return lessonRepository.findAll();
    }
}
