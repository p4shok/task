package com.task.Egar.service;

import com.task.Egar.model.Documents;

import java.util.List;

public interface DocumentService {

    List<Documents> findAllDocuments();
    Documents saveDocument(Documents documents);
    Documents findByName(String name);
    Documents updateDocument(Documents documents);
    void deleteDocument(String name);

}
