package com.notebook.service;


import com.notebook.entity.User;

public interface FaceEngineService {

    User detectFaces(String file);
}
