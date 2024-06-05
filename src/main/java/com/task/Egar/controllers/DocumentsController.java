package com.task.Egar.controllers;

import com.task.Egar.model.Documents;
import com.task.Egar.service.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/documents")
@AllArgsConstructor
public class DocumentsController {

    private DocumentService service;

    @GetMapping
    public List<Documents> findDocuments(){
        return service.findAllDocuments();
    }

    @PostMapping("save_document")
    public Documents saveDocuments(@RequestBody Documents documents){
        return service.saveDocument(documents);
    }

    @GetMapping("/{name}")
    public Documents findByName(@PathVariable("name ") String name){
        return service.findByName(name);
    }

    @PutMapping("update_document")
    public Documents updateDocument(Documents documents){
        return service.updateDocument(documents);
    }

    @DeleteMapping("delete_document/{name}")
    public void deleteDocument(@PathVariable String name){
        service.deleteDocument(name);
    }
}
