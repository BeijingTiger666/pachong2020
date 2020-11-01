package com.ming.pachong2020.dao;

import com.ming.pachong2020.entity.Movieanalysis;
import com.ming.pachong2020.entity.MovieanalysisExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MovieanalysisMapper {
    int countByExample(MovieanalysisExample example);

    int deleteByExample(MovieanalysisExample example);

    int deleteByPrimaryKey(Integer movieId);

    int insert(Movieanalysis record);

    int insertSelective(Movieanalysis record);

    List<Movieanalysis> selectByExample(MovieanalysisExample example);

    Movieanalysis selectByPrimaryKey(Integer movieId);

    int updateByExampleSelective(@Param("record") Movieanalysis record, @Param("example") MovieanalysisExample example);

    int updateByExample(@Param("record") Movieanalysis record, @Param("example") MovieanalysisExample example);

    int updateByPrimaryKeySelective(Movieanalysis record);

    int updateByPrimaryKey(Movieanalysis record);
}