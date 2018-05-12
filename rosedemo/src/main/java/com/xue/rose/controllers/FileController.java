package com.xue.rose.controllers;

import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Post;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@Path("/hello/")
public class FileController {

    // 不声明@Param
// files可以是一个数组或者List
    @Post("/doUpload")
    public String upload(MultipartFile[] files) {
        return "@ok-" + Arrays.toString(files);
    }
}
