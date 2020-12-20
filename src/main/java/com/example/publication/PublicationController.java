package com.example.publication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseModel getFullPublicationById(@PathVariable int id) {
        return publicationService.getFullPublicationById(id);
    }

    @CrossOrigin
    @GetMapping("student/{id}")
    public List<ResponseModel> GetByStudentId(@PathVariable int id) {
        return publicationService.getPublicationsOfStudent(id);
    }

    @CrossOrigin
    @PostMapping()
    public ResponseEntity CreatePublication(@RequestBody InputData input) {
        if(input.getType() == Type.ANNOUNCEMENT) {
            Announcement announcement = new Announcement(input.getId(), input.getSubjectId(), input.getTitle(), input.getText(), input.getAuthorId());
            publicationService.createNewAnnouncement(announcement);
        }
        if(input.getType() == Type.WORK) {
            Work work = new Work(input.getId(), input.getSubjectId(), input.getTitle(), input.getText(), input.getAuthorId(), input.getDeadline());
            publicationService.createNewWork(work);
        }

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public Publication ChangePublicationTitle(@RequestBody InputData input, @PathVariable int id) {
        return publicationService.changeTitle(id, input.getTitle());
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public Publication RemovePublication(@PathVariable int id) {
        return publicationService.removePublication(id);
    }
}
