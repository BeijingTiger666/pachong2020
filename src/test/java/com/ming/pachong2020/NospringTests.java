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

import java.util.Date;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NospringTests {

    @Test
    public void quchong() throws Exception {
            String movieName = "hello, world我大卫·《伯恩》!";
//            final Pattern pattern = Pattern.compile("《.+》");
            final Pattern pattern = Pattern.compile("(?!=《)(.+)(?!=》)");

            final Matcher matcher = pattern.matcher(movieName);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }

    @Test
    public void test33() {
        String input = "hello, world我大卫·伯恩!";
        // 计算MD5
        System.out.println(Hashing.md5().hashBytes(input.getBytes()).toString());
        System.out.println(Hashing.md5().hashBytes(input.getBytes()).toString());
        System.out.println(Hashing.md5().hashBytes(input.getBytes()).toString());
        System.out.println(Hashing.md5().hashBytes(input.getBytes()).toString());
        System.out.println(Hashing.md5().hashBytes(input.getBytes()).toString());
//        // 计算sha256
//        System.out.println(Hashing.sha256().hashBytes(input.getBytes()).toString());
//        // 计算sha512
//        System.out.println(Hashing.sha512().hashBytes(input.getBytes()).toString());
//        // 计算crc32
//        System.out.println(Hashing.crc32().hashBytes(input.getBytes()).toString());
//        System.out.println(Hashing.md5().hashUnencodedChars(input).toString());
        final Pattern pattern = Pattern.compile("《.+?》");
        final Matcher matcher = pattern.matcher("2020年《.+》喜剧《我的女友是机器人》HD国语中字");
        final MatchResult matchResult = matcher.toMatchResult();
        System.out.println(matchResult.groupCount());
        System.out.println(matcher.groupCount());
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
