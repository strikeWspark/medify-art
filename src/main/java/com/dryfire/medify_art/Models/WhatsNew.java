package com.dryfire.medify_art.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class WhatsNew {

    @Id
    @GeneratedValue
    private Long whatsnew_id;
    private String whatsnew_image;
    private String whatsnew_breif_description;
    private String whatsnew_small_brief;
    private String uploaded_by;
    private String name;

    public WhatsNew(){

    }

    public static class Builder{

        @Id
        @GeneratedValue
        private Long whatsnew_id;
        private String whatsnew_image;
        private String whatsnew_breif_description;
        private String whatsnew_small_brief;
        private String uploaded_by;
        private String name;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            WhatsNew whatsNew = (WhatsNew) o;
            return Objects.equals(whatsnew_id, whatsNew.whatsnew_id) && Objects.equals(whatsnew_image, whatsNew.whatsnew_image) && Objects.equals(whatsnew_breif_description, whatsNew.whatsnew_breif_description) && Objects.equals(whatsnew_small_brief, whatsNew.whatsnew_small_brief) && Objects.equals(uploaded_by, whatsNew.uploaded_by) && Objects.equals(name, whatsNew.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(whatsnew_id, whatsnew_image, whatsnew_breif_description, whatsnew_small_brief, uploaded_by, name);
        }

        @Override
        public String toString() {
            return "WhatsNew{" +
                    "whatsnew_id=" + whatsnew_id +
                    ", whatsnew_image='" + whatsnew_image + '\'' +
                    ", whatsnew_breif_description='" + whatsnew_breif_description + '\'' +
                    ", whatsnew_small_brief='" + whatsnew_small_brief + '\'' +
                    ", uploaded_by='" + uploaded_by + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
        public Builder setWhatsnew_id(Long whatsnew_id) {
            this.whatsnew_id = whatsnew_id;
            return this;
        }

        public Builder setWhatsnew_image(String whatsnew_image) {
            this.whatsnew_image = whatsnew_image;
            return this;
        }

        public Builder setWhatsnew_breif_description(String whatsnew_breif_description) {
            this.whatsnew_breif_description = whatsnew_breif_description;
            return this;
        }

        public Builder setWhatsnew_small_brief(String whatsnew_small_brief) {
            this.whatsnew_small_brief = whatsnew_small_brief;
            return this;
        }

        public Builder setUploaded_by(String uploaded_by) {
            this.uploaded_by = uploaded_by;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public WhatsNew build(){
            return new  WhatsNew(whatsnew_id,whatsnew_image,whatsnew_breif_description,whatsnew_small_brief,uploaded_by,name);
        }
    }
    private WhatsNew(Long whatsnew_id,String whatsnew_image, String whatsnew_breif_description, String whatsnew_small_brief, String uploaded_by, String name) {
        this.whatsnew_id = whatsnew_id;
        this.whatsnew_image = whatsnew_image;
        this.whatsnew_breif_description = whatsnew_breif_description;
        this.whatsnew_small_brief = whatsnew_small_brief;
        this.uploaded_by = uploaded_by;
        this.name = name;
    }

    public Long getWhatsnew_id() {
        return whatsnew_id;
    }


    public String getWhatsnew_image() {
        return whatsnew_image;
    }


    public String getWhatsnew_breif_description() {
        return whatsnew_breif_description;
    }


    public String getWhatsnew_small_brief() {
        return whatsnew_small_brief;
    }


    public String getUploaded_by() {
        return uploaded_by;
    }


    public String getName() {
        return name;
    }




}
