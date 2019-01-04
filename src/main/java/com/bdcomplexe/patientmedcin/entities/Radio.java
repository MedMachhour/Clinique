package com.bdcomplexe.patientmedcin.entities;

import org.springframework.data.couchbase.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document
public class Radio {
    private String _id ;
    private String _rev = null;
    private List<UploadFile> images;
    private LocalDateTime date_radio;


    public Radio(List<UploadFile> images, LocalDateTime date_radio) {
        images=new ArrayList<>();
        this.images = images;
        this.date_radio = date_radio;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public List<UploadFile> getImages() {
        return images;
    }

    public void setImages(List<UploadFile> image) {
        this.images = image;
    }

    public LocalDateTime getDate_radio() {
        return date_radio;
    }

    public void setDate_radio(LocalDateTime date_radio) {
        this.date_radio = date_radio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("'\n'").append("_id='").append(_id).append(",'\n'");
        sb.append("_rev='").append(_rev).append(",'\n'");
        sb.append("image='").append(images).append(",'\n'");
        sb.append("date_radio=").append(date_radio).append(",'\n'");
        sb.append('}');
        return sb.toString();
    }
}
