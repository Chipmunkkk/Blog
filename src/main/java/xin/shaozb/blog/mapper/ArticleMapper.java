package xin.shaozb.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xin.shaozb.blog.model.Article;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("select * from article where id = #{id} limit 1")
    Article selectArticleById(int id);

    @Select("select * from article limit #{arg0} , #{arg1}")
    List<Article> selectArticleList(int page, int numOfPage);
}
