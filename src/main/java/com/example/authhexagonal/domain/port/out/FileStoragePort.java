package com.example.authhexagonal.domain.port.out;

import com.example.authhexagonal.domain.model.StoredFileReference;

public interface FileStoragePort {

    StoredFileReference storePlanningClassDocument(String originalName, String mimeType, byte[] content);

    StoredFileReference storeEnrollmentDocument(
            String courseFolder,
            String studentFolder,
            String documentKey,
            String originalName,
            String mimeType,
            byte[] content
    );

    byte[] read(String filePath);

    void delete(String filePath);
}
