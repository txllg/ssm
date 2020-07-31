package cn.txl.dao;

import cn.txl.domain.Movies;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMoviesDao {

    //查询所有电影
    @Select("select * from movie_list")
    public List<Movies> findAll();

    //根据id查询电影
    @Select("select * from movie_list where id=#{id}")
    public Movies findMovieById(Integer id);

    //增加电影
    @Insert("insert  into movie_list(`name`,`director`,`actor`) values(#{name},#{director},#{actor})")
    public void addMovie(Movies movie);

    //删除电影
    @Delete("delete from movie_list where id=#{id}")
    public void deleteMovieById(Integer id);

    //修改电影信息
    @Update("update movie_list set name=#{name},director=#{director},actor=#{actor} where id=#{id}")
    public void modifyMovie(Movies movie);


}
