package com.ming.pachong2020;

import com.ming.pachong2020.entity.Movie;
import com.ming.pachong2020.dao.MovieMapper;
import com.ming.pachong2020.entity.MovieExample;
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

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.ming.pachong2020.dao")
public class Pachong2020ApplicationTests {

    @Autowired
    private MovieMapper mapper;
    @Test
    public void contextLoads() throws Exception {

        String root = "https://www.ygdy8.net/html/gndy/china/list_4_";
        for (int a = 1; a < 130; a++){
            String url = root+a+".html";
            Document doc = Jsoup.connect(url).get();//解析Url链接地址
//        国内https://www.ygdy8.net/html/gndy/china/index.html
//        欧美https://www.ygdy8.net/html/gndy/oumei/index.html
//        日韩https://www.ygdy8.net/html/gndy/rihan/index.html
//        最新https://www.ygdy8.net/html/gndy/dyzz/index.html
            final Element first = doc.select("div.co_content8").first();
            final Elements tables = first.select("table a:eq(1)");
            for (int i = 0; i < tables.size(); i++) {
                final Element element = tables.get(i);
                String moviename = element.text();
                String movieurl = "https://www.ygdy8.net"+element.attr("href");
                String movietype = "国内电影";
                mapper.insert(new Movie(null,null,moviename,movietype,movieurl,new Date()));
            }
        }




    }

}
