package com.task.Egar.service.impl;

import com.task.Egar.model.Documents;
import com.task.Egar.repository.InMemoryDocumentDAO;
import com.task.Egar.service.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryDocumentsService implements DocumentService {

    private final InMemoryDocumentDAO repository;

    @Override
    public Documents saveDocument(Documents documents) {
        return repository.saveDocuments(documents);
    }

    @Override
    public Documents findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Documents updateDocument(Documents documents) {
        return repository.updateDocuments(documents);
    }

    @Override
    public void deleteDocument(String name) {
        repository.deleteDocuments(name);
    }

    @Override
    public List<Documents> findAllDocuments() {
        return repository.findAllDocuments();
    }
}
