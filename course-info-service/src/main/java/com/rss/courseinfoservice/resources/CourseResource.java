package com.rss.courseinfoservice.resources;

import com.rss.courseinfoservice.models.Course;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseResource {

    @RequestMapping("{courseId}")
    public Course getCourseInfo(@PathVariable("courseId")  String courseId){
        return new Course(courseId, "Operating Systems");
    }
}
