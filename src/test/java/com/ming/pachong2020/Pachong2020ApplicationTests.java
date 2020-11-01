package com.ming.pachong2020;

import com.google.common.hash.Hashing;
import com.ming.pachong2020.dao.MovieMapper;
import com.ming.pachong2020.dao.MovieanalysisMapper;
import com.ming.pachong2020.entity.Movie;
import com.ming.pachong2020.entity.Movieanalysis;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.ming.pachong2020.dao")
public class Pachong2020ApplicationTests {

    @Autowired
    private MovieMapper mapper;
    @Autowired
    private MovieanalysisMapper amapper;
    @Test
    public void contextLoads() throws Exception {

        String root = "https://www.ygdy8.net/html/gndy/china/list_4_";
        for (int a = 1; a < 2; a++){
            String url = root+a+".html";
            Document doc = Jsoup.connect(url).get();//解析Url链接地址
//        国内https://www.ygdy8.net/html/gndy/china/index.html
//        欧美https://www.ygdy8.net/html/gndy/oumei/index.html
//        日韩https://www.ygdy8.net/html/gndy/rihan/index.html
//        最新https://www.ygdy8.net/html/gndy/dyzz/index.html
            final Element first = doc.select("div.co_content8").first();
            final Elements tables = first.select("table a:eq(1)");
            System.out.println(tables.size());
            for (int i = 0; i < tables.size(); i++) {
                final Element element = tables.get(i);
                String moviename = element.text();
                String movieurl = "https://www.ygdy8.net"+element.attr("href");
                String movietype = "国内电影";
//                mapper.insert(new Movie(null,null,moviename,movietype,movieurl,new Date()));
            }
        }
    }
    @Test
    public void contextLoads2() throws Exception {
        String root = "https://www.ygdy8.net/html/gndy/oumei/list_7_";
        for (int a = 1; a < 248; a++){
            String url = root+a+".html";
            Document doc = Jsoup.connect(url).get();//解析Url链接地址
            final Element first = doc.select("div.co_content8").first();
            final Elements tables = first.select("table a:eq(1)");
            System.out.println(tables.size());
            for (int i = 0; i < tables.size(); i++) {
                final Element element = tables.get(i);
                String moviename = element.text();
                System.out.println(moviename);
                String movieurl = "https://www.ygdy8.net"+element.attr("href");
                String movietype = "欧美电影";
//                mapper.insert(new Movie(null,null,moviename,movietype,movieurl,new Date()));
            }
        }
    }
    @Test
    public void contextLoads3() throws Exception {
        String root = "https://www.ygdy8.net/html/gndy/dyzz/list_23_";
        for (int a = 1; a < 248; a++){
            String url = root+a+".html";
            Document doc = Jsoup.connect(url).get();//解析Url链接地址
            final Element first = doc.select("div.co_content8").first();
            final Elements tables = first.select("td a");
            System.out.println(tables.size());
            for (int i = 0; i < tables.size(); i++) {
                final Element element = tables.get(i);
                String moviename = element.text();
                System.out.println(moviename);
                String movieurl = "https://www.ygdy8.net"+element.attr("href");
                String movietype = "最新电影";
//                mapper.insert(new Movie(null,null,moviename,movietype,movieurl,new Date()));
            }
        }
    }
    @Test
    public void contextLoads4() throws Exception {
        String root = "https://www.ygdy8.net/html/gndy/rihan/list_6_";
        for (int a = 1; a < 248; a++){
            String url = root+a+".html";
            Document doc = Jsoup.connect(url).get();//解析Url链接地址
            final Element first = doc.select("div.co_content8").first();
            final Elements tables = first.select("td a:eq(1)");
            System.out.println(tables.size());
            for (int i = 0; i < tables.size(); i++) {
                final Element element = tables.get(i);
                String moviename = element.text();
                System.out.println(moviename);
                String movieurl = "https://www.ygdy8.net"+element.attr("href");
                String movietype = "日韩电影";
//                mapper.insert(new Movie(null,null,moviename,movietype,movieurl,new Date()));
            }
        }
    }
    @Test
    public void contextLoads5() throws Exception {
        String root = "https://www.ygdy8.net/html/gndy/jddy/list_63_";
        for (int a = 1; a < 248; a++){
            String url = root+a+".html";
            Document doc = Jsoup.connect(url).get();//解析Url链接地址
            final Element first = doc.select("div.co_content8").first();
            final Elements tables = first.select("td a");
            System.out.println(tables.size());
            for (int i = 0; i < tables.size(); i++) {
                final Element element = tables.get(i);
                String moviename = element.text();
                System.out.println(moviename);
                String movieurl = "https://www.ygdy8.net"+element.attr("href");
                String movietype = "综合电影";
//                mapper.insert(new Movie(null,null,moviename,movietype,movieurl,new Date()));
            }
        }
    }
    @Test
    public void hash() {
//        解析电影名字 例如2015年科幻动作《移动迷宫2》BD国英双语双字幕  解析为: 移动迷宫2,存入sname字段
//        根据电影名字生产hash  去重 存入另一张表
        int i = 0;
        try {
            for (i = 1; i < 240000; i++) {
                final Movie movie = mapper.selectByPrimaryKey(i);
                movie.setNamehash(Hashing.md5().hashBytes(movie.getMovieName().getBytes()).toString());
                final Pattern pattern = Pattern.compile("《.+》");
                final Matcher matcher = pattern.matcher(movie.getMovieName());
                if(matcher.find()){
                    String replace = matcher.group().replaceAll("《","");
                    replace = replace.replaceAll("》","");
                    movie.setSname(replace);
                    mapper.updateByPrimaryKey(movie);
                }else{
                    System.out.println("name未能解析, "+movie.getMovieName() +"   "+movie.getMovieId());
                }

            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println(i);
        }

    }
    @Test
    public void quchong() {
//        解析电影名字 例如2015年科幻动作《移动迷宫2》BD国英双语双字幕  解析为: 移动迷宫2,存入sname字段
//        根据电影名字生产hash  去重 存入另一张表
        for (int i = 0; i < 240000; i++) {
            final Movie movie = mapper.selectByPrimaryKey(1);
            final Movieanalysis moviea = new Movieanalysis();
            moviea.setCollectingTime(new Date());
            moviea.setMovieName(movie.getMovieName());
            moviea.setMovieType(movie.getMovieType());
            moviea.setMovieUrl(movie.getMovieUrl());
            moviea.setNamehash(Hashing.md5().hashBytes(movie.getMovieName().getBytes()).toString());
            String movieName = movie.getMovieName();
            final Pattern pattern = Pattern.compile("《.+》");
            final Matcher matcher = pattern.matcher(movieName);
            if(matcher.groupCount() != 1){
                System.out.println("name未能解析, "+movieName +"   "+movie);
            }else{
                moviea.setSname(matcher.group());
                amapper.insert(moviea);
            }
        }
    }
}
