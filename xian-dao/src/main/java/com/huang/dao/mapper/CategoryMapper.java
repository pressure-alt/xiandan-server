package com.huang.dao.mapper;

import com.huang.dao.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    /**
     * 查询商品分类
     *
     * @param categoryId 商品分类主键
     * @return 商品分类
     */
    public Category selectCategoryByCategoryId(Long categoryId);

    /**
     * 查询商品分类列表
     *
     *
     * @return 商品分类集合
     */
    public List<Category> selectCategoryList();

    /**
     * 新增商品分类
     *
     * @param category 商品分类
     * @return 结果
     */
    public int insertCategory(Category category);

    /**
     * 修改商品分类
     *
     * @param category 商品分类
     * @return 结果
     */
    public int updateCategory(Category category);

    /**
     * 删除商品分类
     *
     * @param categoryId 商品分类主键
     * @return 结果
     */
    public int deleteCategoryByCategoryId(Long categoryId);

    /**
     * 批量删除商品分类
     *
     * @param categoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCategoryByCategoryIds(String[] categoryIds);
}
