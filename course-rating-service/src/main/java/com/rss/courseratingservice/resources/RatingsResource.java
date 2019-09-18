package com.rss.courseratingservice.resources;

import com.rss.courseratingservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{courseId}")
    public Rating getRating(@PathVariable("courseId") String courseId){
        return new Rating(courseId, 5);
    }
}
