package com.dimthomas.service;

import com.dimthomas.entity.AppDocument;
import com.dimthomas.entity.AppPhoto;
import com.dimthomas.entity.BinaryContent;
import org.springframework.core.io.FileSystemResource;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
    FileSystemResource getFileSystemResource(BinaryContent binaryContent);
}
