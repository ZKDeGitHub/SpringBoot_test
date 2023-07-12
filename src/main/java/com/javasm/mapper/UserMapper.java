package com.javasm.mapper;

import com.javasm.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/12 14:34
 * @description:
 */

@Mapper
public interface UserMapper {
   @Select("select * from tb_user where id=#{id}")
   User selectUser(int id);

   @Select("select * from tb_user ")
   List<User> selectAll();

   @Update("update tb_user set user_name=#{userName},birthday=#{birthday} where id=#{id} ")
   int updateUser(User user);

   @Delete("delete from tb_user where id=#{id}")
   int deleteUser(int id);

   @Insert("insert into tb_user values(#{id},#{userName},#{birthday},#{gender},#{address})")
   int insertUser(User user);
}
