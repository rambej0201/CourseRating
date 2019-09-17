package com.rss.coursecatalogservice.resources;

import com.rss.coursecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

// to make it as REST controller we need to declare annotation RestController
// whenever we make a request SpringBoot will look at this class and check whether it does have something to mapping
@RestController
@RequestMapping("/catalog")
public class CourseCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        // <CatalogItem is a model, controller will create multiple instances of model and it will return them all

        return Collections.singletonList(
                new CatalogItem("BookOne","Pehala Book", 45)
        );
    }
}
