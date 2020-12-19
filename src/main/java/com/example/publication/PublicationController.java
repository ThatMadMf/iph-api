package com.example.publication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/publications")
public class PublicationController {
    PublicationService publicationService = new PublicationService();

    @CrossOrigin
    @GetMapping
    public List<Publication> GetAll() {
        return publicationService.getAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Optional<Publication> GetById(@PathVariable int id) {
        return publicationService.getById(id);
    }

    @CrossOrigin
    @PostMapping()
    public ResponseEntity CreatePublication(@RequestBody Publication publication) {
        publicationService.createNewPublication(publication);
        return ResponseEntity.ok(HttpStatus.OK);
    }

//    @CrossOrigin
//    @PutMapping("/{id}")
//    public Publication ChangePublicationTitle(@RequestBody String title, @PathVariable int id) {
//        return publicationService.changeTitle(id, title);
//    }
}
