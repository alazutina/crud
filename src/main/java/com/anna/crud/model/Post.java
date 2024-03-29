package com.anna.crud.model;

import java.util.List;

public class Post {

    private Long id;
    private String content;
    private List<Tag> tags;
    private PostStatus status;


    public  Post() {
    }

    public Post(Long id, String content, List<Tag> tags, PostStatus status) {
        this.id = id;
        this.content = content;
        this.tags = tags;
        this.status = status;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    public void setPostStatus(PostStatus status) {
        this.status=status;
    }


    public Long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }


    public List<Tag>  getTags() {
        return tags;
    }


    public PostStatus getPostStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                ", status=" + status +
                '}';
    }


}
