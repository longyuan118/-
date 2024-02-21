package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

/**
 * @author longYuan
 * @date 2024/2/21 下午 04:30
 */
public interface DishService {
    /**
     * 新增菜品和对应的口味数据
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     * @param dishDTO
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}
