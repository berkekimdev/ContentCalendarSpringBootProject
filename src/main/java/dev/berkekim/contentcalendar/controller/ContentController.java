package dev.berkekim.contentcalendar.controller;


import dev.berkekim.contentcalendar.model.Content;
import dev.berkekim.contentcalendar.model.Status;
import dev.berkekim.contentcalendar.repository.ContentCollectionRepository;
import dev.berkekim.contentcalendar.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
@CrossOrigin
public class ContentController {

   //private final ContentCollectionRepository repository;
    private final ContentRepository repository;


    public ContentController(ContentRepository repository) {
        this.repository = repository;
    }

 // bir istek yapmak için ve content parçalarını  sistemde bulmak için
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }


    // CRUD OPERASYONLARI

    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Content not found"));
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody Content content) {
        repository.save(content);
    }





    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if(!repository.existsById(id)) {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Content not found");
        }
        repository.save(content);

    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/filter/type/{type}")
    public List<Content> filterByType(@PathVariable String type) {
        return repository.findAllByContentType(type.toUpperCase());
    }

}






