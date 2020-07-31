package cn.txl.test;


import cn.txl.domain.Movies;
import cn.txl.service.IMoviesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {

    @Autowired
    private IMoviesService service;

//    查询所有
    @Test
    public void tsetFindAll(){
        List<Movies> movies=service.findAll();
        for(Movies movie:movies){
            System.out.println(movie);
        }
    }

    //根据id查询电影
    @Test
    public void testFindMovieById(){
        Integer id=5;
        System.out.println(service.findMovieById(id));
    }

    //增加电影
    @Test
    public void testAddMovie(){
        Movies movie=new Movies();
        movie.setName("电锯惊魂");
        movie.setDirector("温子仁");
        movie.setActor("雷沃纳尔");
        service.addMovie(movie);
    }

    //删除电影电影
    @Test
    public void testdeleteMovieById(){
        Integer id=1;
        service.deleteMovieById(id);
    }

    //修改电影
    @Test
    public void testModifyMovie(){
        Movies movie=service.findMovieById(2);
        movie.setActor("张国荣、张曼玉、林青霞、张家辉等");
        service.modifyMovie(movie);
    }


}
