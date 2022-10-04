package com.sambrac.fruityloops;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "<h1 style='color: red;'>hello world</h1>";
    }

    @RequestMapping("/index")
    public String index2() {
        return "hello world again";
    }

    @RequestMapping("/query")
    public String index(@RequestParam(value = "q") String searchQuery) {
        return "You searched for: " + searchQuery;
    }

    @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
        return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }

}
