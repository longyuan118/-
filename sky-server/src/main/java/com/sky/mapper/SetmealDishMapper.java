package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author longYuan
 * @date 2024/2/21 下午 09:37
 */
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品ID查询对应的套餐ID
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIDsByDishIds(List<Long> dishIds);
}
