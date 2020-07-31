package cn.txl.controller;

import cn.txl.domain.Movies;
import cn.txl.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/moviesController")
public class MoviesController {

    @Autowired
    private IMoviesService service;

//    查询所有
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Movies> movies=service.findAll();
        model.addAttribute("movies",movies);
        return "success";
    }


//    根据id查询一个
    @RequestMapping("findOne")
    public String findOne(Integer id,Model model){
        Movies movie=service.findMovieById(id);
        model.addAttribute("movie",movie);
        return "success";
    }


//    添加电影
    @RequestMapping("addMovie")
    public String addMovie(Movies movie,Model model){
        service.addMovie(movie);
        return "success";
    }

//    修改电影
    @RequestMapping("modifyMovie")
    public String modifyMovie(Movies movie,Model model){
        service.modifyMovie(movie);
        return "success";
    }


    //    删除电影
    @RequestMapping("deleteMovie")
    public String deleteMovie(Integer id){
        service.deleteMovieById(id);
        return "success";
    }
}
