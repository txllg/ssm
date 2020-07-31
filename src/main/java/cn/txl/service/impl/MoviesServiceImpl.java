package cn.txl.service.impl;




import cn.txl.dao.IMoviesDao;
import cn.txl.domain.Movies;
import cn.txl.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("moviesService")
public class MoviesServiceImpl implements IMoviesService {

    @Autowired
    private IMoviesDao dao;

    @Override
    public List<Movies> findAll() {
        System.out.println("MoviesServiceImpl的findAll方法执行了.............");
        return dao.findAll();
    }

    @Override
    public Movies findMovieById(Integer id) {
        return dao.findMovieById(id);
    }

    @Override
    public void addMovie(Movies movie) {
        dao.addMovie(movie);
    }

    @Override
    public void deleteMovieById(Integer id) {
        dao.deleteMovieById(id);
    }

    @Override
    public void modifyMovie(Movies movie) {
        dao.modifyMovie(movie);
    }
}
