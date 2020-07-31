package cn.txl.test;

import cn.txl.dao.IMoviesDao;
import cn.txl.domain.Movies;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatis {

    @Autowired
    private IMoviesDao dao;

    //查询所有电影
    @Test
    public void testFindAll(){
        List<Movies> movies=dao.findAll();
        for(Movies movie:movies){
            System.out.println(movie);
        }
    }


    //根据id查询电影
    @Test
    public void testFindMovieById(){
        Integer id=2;
        System.out.println(dao.findMovieById(id));
    }

    //增加电影
    @Test
    public void testAddMovie(){
        Movies movie=new Movies();
        movie.setName("八恶人");
        movie.setDirector("塞缪尔杰克逊");
        dao.addMovie(movie);
    }

    //删除电影电影
    @Test
    public void testdeleteMovieById(){
        Integer id=7;
        dao.deleteMovieById(id);
    }

    //修改电影
    @Test
    public void testModifyMovie(){
        Movies movie=dao.findMovieById(7);
        movie.setDirector("昆汀");
        movie.setActor("塞缪尔杰克逊");
        dao.modifyMovie(movie);
    }



}
