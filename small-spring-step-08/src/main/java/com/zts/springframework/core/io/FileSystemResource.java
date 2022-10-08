package com.zts.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author zhangtusheng
 * @Date 2022 10 06 18 19
 * @describe：
 **/
public class FileSystemResource implements Resource{

    private final File file;

    private final String path;

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    public FileSystemResource(String path) {
        this.path = path;
        this.file = new File(path);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    public String getPath() {
        return path;
    }
}
