package com.hope.file_upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    // Upload a file
    public File uploadFile(MultipartFile file) throws IOException {
        File uploadedFile = File.builder()
                .fileName(file.getOriginalFilename())
                .fileType(file.getContentType())
                .data(file.getBytes())
                .build();
        return fileRepository.save(uploadedFile);
    }

    // Retrieve a file by ID
    public File getFileById(String fileId) {
        Optional<File> file = fileRepository.findById(fileId);
        return file.orElse(null);
    }
}
