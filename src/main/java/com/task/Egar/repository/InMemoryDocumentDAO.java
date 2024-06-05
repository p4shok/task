package com.task.Egar.repository;

import com.task.Egar.model.Documents;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.IntStream;

@Repository
public class InMemoryDocumentDAO {
    private final List<Documents> DOCUMENTS = new ArrayList<>();

    public Documents saveDocuments(Documents documents) {
        DOCUMENTS.add(documents);
        return documents;
    }

    public Documents findByName(String name) {
        return DOCUMENTS.stream()
                .filter(element -> element.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Documents updateDocuments(Documents documents) {
        var documentsIndex = IntStream.range(0, DOCUMENTS.size())
                .filter(index -> DOCUMENTS.get(index).getName().equals(documents.getName()))
                .findFirst()
                .orElse(-1);

        if(documentsIndex > -1){
            DOCUMENTS.set(documentsIndex, documents);
            return documents;
        }
        return null;
    }

    public void deleteDocuments(String name) {
        var document = findByName(name);
        if (document != null) {
            DOCUMENTS.remove(document);
        }
    }

    public List<Documents> findAllDocuments() {
        return DOCUMENTS;
    }
}
