package com.example.fabianworkshopbackend.Controller;

import com.example.fabianworkshopbackend.Model.GalleryImages;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

@RestController
@CrossOrigin
public class GalleryController
{
    @GetMapping("/gallery/images")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getImages () throws JsonProcessingException
    {
        var reponse    = new GalleryImages();
        // Hino
        //var folder     = new File("C:/Users/SnowPiercer/Documents/GitHub/Fabian-workshop/HTML/Gallery");
        // Batman hjemme
        var folder     = new File("G:/Andre computere/Min PC/KEA/3. Semester/Projects/Fabian workshop/Fabian-workshop/HTML/Gallery");
        // Batman remote
        //    var folder     = new File("C:/Users/micha/Desktop/KEA/3. Semester/Projects/Fabian workshop/Fabian-workshop/HTML/Gallery");
        // Fluttendut
        //var folder     = new File("");
        var serializer = new ObjectMapper().writer().withDefaultPrettyPrinter();

        for (var img : folder.listFiles())
        {
            if (img.isFile())
            {
                reponse.images.add(img.getName());
            }
        }

        return ResponseEntity.ok(serializer.writeValueAsString(reponse));
    }
}
