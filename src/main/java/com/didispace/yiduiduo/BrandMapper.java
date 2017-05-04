package com.didispace.yiduiduo;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by lance017 on 2017/5/4.
 */
@Mapper
public interface BrandMapper {

    @Select("select * from product where brand_id = #{brand_id}")
    @Results(
            {
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "name", column = "name"),
                    @Result(property = "brand_id", column = "brand_id")
            }
    )
    List<Product> findProductList(@Param("brand_id") int brand_id);


    @Select("select * from brand where id = #{id}")
    @Results(
            {
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "name", column = "name"),
                    @Result(property = "products", column = "id", many = @Many(select = "com.didispace.yiduiduo.BrandMapper.findProductList"))
            }
    )
    Brand findBrand(int id);

}
