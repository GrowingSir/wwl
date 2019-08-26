package com.wwl.wwl.mapper;
import com.wwl.wwl.model.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert t_user (username,password) value (#{username},#{password})")
    public int insert(@Param("username") String username,@Param("password") String password);

    @Delete("delete from t_user where username=#{username}")
    public int delete(@Param("username") String username);

    @Update("update t_user set password=#{password} where username=#{username}")
    public int update(@Param("password") String password, @Param("username") String username);

    @Select("select * from t_user where username=#{username}")
    List<User> select(@Param("username") String username);

}
