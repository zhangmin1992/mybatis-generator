package day45ForMyvatisSource.dao;

import day45ForMyvatisSource.entity.AccTable;

public interface AccTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccTable record);

    int insertSelective(AccTable record);

    AccTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccTable record);

    int updateByPrimaryKey(AccTable record);
}