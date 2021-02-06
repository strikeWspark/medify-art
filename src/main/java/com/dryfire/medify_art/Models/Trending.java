package com.dryfire.medify_art.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Trending {

    @Id
    @GeneratedValue
    private Long trending_id;
    private String trending_image;
    private String trending_small_brief;

    public Trending(){

    }

    public static class Builder{

        @Id
        @GeneratedValue
        private Long trending_id;
        private String trending_image;
        private String trending_small_brief;


        @Override
        public String toString() {
            return "Builder{" +
                    "trending_id=" + trending_id +
                    ", trending_image='" + trending_image + '\'' +
                    ", trending_small_brief='" + trending_small_brief + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(trending_id, builder.trending_id) && Objects.equals(trending_image, builder.trending_image) && Objects.equals(trending_small_brief, builder.trending_small_brief);
        }

        @Override
        public int hashCode() {
            return Objects.hash(trending_id, trending_image, trending_small_brief);
        }

        public Builder setTrending_id(Long trending_id) {
            this.trending_id = trending_id;
            return this;
        }

        public Builder setTrending_image(String trending_image) {
            this.trending_image = trending_image;
            return this;
        }

        public Builder setTrending_small_brief(String trending_small_brief) {
            this.trending_small_brief = trending_small_brief;
            return this;
        }

        public Trending build(){
            return new Trending(trending_id,trending_image,trending_small_brief);
        }
    }
    private Trending(Long trending_id,String trending_image, String trending_small_brief) {
        this.trending_id = trending_id;
        this.trending_image = trending_image;
        this.trending_small_brief = trending_small_brief;
    }

    public Long getTrending_id() {
        return trending_id;
    }


    public String getTrending_image() {
        return trending_image;
    }


    public String getTrending_small_brief() {
        return trending_small_brief;
    }




}
