package cn.txl.service;

import cn.txl.domain.Movies;
import java.util.List;

public interface IMoviesService {

    //查询所有电影
    public List<Movies> findAll();

    //根据id查询电影
    public Movies findMovieById(Integer id);

    //增加电影
    public void addMovie(Movies movie);

    //删除电影
    public void deleteMovieById(Integer id);

    //修改电影信息
    public void modifyMovie(Movies movie);

}
