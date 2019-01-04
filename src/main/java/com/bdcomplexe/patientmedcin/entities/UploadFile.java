package com.bdcomplexe.patientmedcin.entities;

public class UploadFile {
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UploadFile(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

    // Getters and Setters (Omitted for brevity)
}
