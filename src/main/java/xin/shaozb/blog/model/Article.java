package xin.shaozb.blog.model;

import lombok.Data;

import java.util.Date;

@Data
public class Article {

    private int id;
    private String title;
    private String tag;
    private String archive;
    private Date create_time;
    private String content;

}
