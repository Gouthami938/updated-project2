package com.knf.dev.security.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface ImageService {

    void uploadImage(String path, MultipartFile file);



}
