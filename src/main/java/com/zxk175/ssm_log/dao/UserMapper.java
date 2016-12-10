package com.zxk175.ssm_log.dao;

import com.zxk175.ssm_log.pojo.User;
import com.zxk175.ssm_log.pojo.UserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface UserMapper {
    /**
     * 根据指定的条件获取数据库记录数
     */
    @SelectProvider(type = UserSqlProvider.class, method = "countByExample")
    int countByExample(UserExample example);

    /**
     * 根据指定的条件删除数据库符合条件的记录
     */
    @DeleteProvider(type = UserSqlProvider.class, method = "deleteByExample")
    int deleteByExample(UserExample example);

    /**
     * 根据主键删除数据库的记录
     */
    @Delete({
            "delete from t_user",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * 新写入数据库记录
     */
    @Insert({
            "insert into t_user (id, username, ",
            "nickname, realname, ",
            "password, salt, ",
            "email, email_status, ",
            "mobile, mobile_status, ",
            "telephone, amount, ",
            "gender, role, signature, ",
            "content_count, comment_count, ",
            "qq, wechat, weibo, ",
            "facebook, linkedin, ",
            "birthday, company, ",
            "occupation, address, ",
            "zipcode, site, graduateschool, ",
            "education, avatar, ",
            "idcardtype, idcard, ",
            "status, created, ",
            "create_source, logged, ",
            "activated)",
            "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
            "#{nickname,jdbcType=VARCHAR}, #{realname,jdbcType=VARCHAR}, ",
            "#{password,jdbcType=VARCHAR}, #{salt,jdbcType=VARCHAR}, ",
            "#{email,jdbcType=VARCHAR}, #{emailStatus,jdbcType=VARCHAR}, ",
            "#{mobile,jdbcType=VARCHAR}, #{mobileStatus,jdbcType=VARCHAR}, ",
            "#{telephone,jdbcType=VARCHAR}, #{amount,jdbcType=DECIMAL}, ",
            "#{gender,jdbcType=VARCHAR}, #{role,jdbcType=VARCHAR}, #{signature,jdbcType=VARCHAR}, ",
            "#{contentCount,jdbcType=INTEGER}, #{commentCount,jdbcType=INTEGER}, ",
            "#{qq,jdbcType=VARCHAR}, #{wechat,jdbcType=VARCHAR}, #{weibo,jdbcType=VARCHAR}, ",
            "#{facebook,jdbcType=VARCHAR}, #{linkedin,jdbcType=VARCHAR}, ",
            "#{birthday,jdbcType=TIMESTAMP}, #{company,jdbcType=VARCHAR}, ",
            "#{occupation,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
            "#{zipcode,jdbcType=VARCHAR}, #{site,jdbcType=VARCHAR}, #{graduateschool,jdbcType=VARCHAR}, ",
            "#{education,jdbcType=VARCHAR}, #{avatar,jdbcType=VARCHAR}, ",
            "#{idcardtype,jdbcType=VARCHAR}, #{idcard,jdbcType=VARCHAR}, ",
            "#{status,jdbcType=VARCHAR}, #{created,jdbcType=TIMESTAMP}, ",
            "#{createSource,jdbcType=VARCHAR}, #{logged,jdbcType=TIMESTAMP}, ",
            "#{activated,jdbcType=TIMESTAMP})"
    })
    int insert(User record);

    /**
     * 动态字段,写入数据库记录
     */
    @InsertProvider(type = UserSqlProvider.class, method = "insertSelective")
    int insertSelective(User record);

    /**
     * 根据指定的条件查询符合条件的数据库记录
     */
    @SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
    @ConstructorArgs({
            @Arg(column = "id", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "username", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "nickname", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "realname", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "salt", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email_status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "mobile", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "mobile_status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "telephone", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "amount", javaType = BigDecimal.class, jdbcType = JdbcType.DECIMAL),
            @Arg(column = "gender", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "role", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "signature", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "content_count", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "comment_count", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "qq", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "wechat", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "weibo", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "facebook", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "linkedin", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "birthday", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "company", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "occupation", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "address", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "zipcode", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "site", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "graduateschool", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "education", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "avatar", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "idcardtype", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "idcard", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "created", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "create_source", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "logged", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "activated", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP)
    })
    List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

    /**
     * 根据指定的条件查询符合条件的数据库记录
     */
    @SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
    @ConstructorArgs({
            @Arg(column = "id", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "username", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "nickname", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "realname", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "salt", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email_status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "mobile", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "mobile_status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "telephone", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "amount", javaType = BigDecimal.class, jdbcType = JdbcType.DECIMAL),
            @Arg(column = "gender", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "role", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "signature", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "content_count", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "comment_count", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "qq", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "wechat", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "weibo", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "facebook", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "linkedin", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "birthday", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "company", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "occupation", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "address", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "zipcode", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "site", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "graduateschool", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "education", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "avatar", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "idcardtype", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "idcard", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "created", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "create_source", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "logged", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "activated", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP)
    })
    List<User> selectByExample(UserExample example);

    /**
     * 根据指定主键获取一条数据库记录
     */
    @Select({
            "select",
            "id, username, nickname, realname, password, salt, email, email_status, mobile, ",
            "mobile_status, telephone, amount, gender, role, signature, content_count, comment_count, ",
            "qq, wechat, weibo, facebook, linkedin, birthday, company, occupation, address, ",
            "zipcode, site, graduateschool, education, avatar, idcardtype, idcard, status, ",
            "created, create_source, logged, activated",
            "from t_user",
            "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
            @Arg(column = "id", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "username", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "nickname", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "realname", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "salt", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "email_status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "mobile", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "mobile_status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "telephone", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "amount", javaType = BigDecimal.class, jdbcType = JdbcType.DECIMAL),
            @Arg(column = "gender", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "role", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "signature", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "content_count", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "comment_count", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
            @Arg(column = "qq", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "wechat", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "weibo", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "facebook", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "linkedin", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "birthday", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "company", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "occupation", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "address", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "zipcode", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "site", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "graduateschool", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "education", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "avatar", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "idcardtype", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "idcard", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "status", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "created", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "create_source", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "logged", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "activated", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP)
    })
    User selectByPrimaryKey(Long id);

    /**
     * 动态根据指定的条件来更新符合条件的数据库记录
     */
    @UpdateProvider(type = UserSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 根据指定的条件来更新符合条件的数据库记录
     */
    @UpdateProvider(type = UserSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录
     */
    @UpdateProvider(type = UserSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据主键来更新符合条件的数据库记录
     */
    @Update({
            "update t_user",
            "set username = #{username,jdbcType=VARCHAR},",
            "nickname = #{nickname,jdbcType=VARCHAR},",
            "realname = #{realname,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR},",
            "salt = #{salt,jdbcType=VARCHAR},",
            "email = #{email,jdbcType=VARCHAR},",
            "email_status = #{emailStatus,jdbcType=VARCHAR},",
            "mobile = #{mobile,jdbcType=VARCHAR},",
            "mobile_status = #{mobileStatus,jdbcType=VARCHAR},",
            "telephone = #{telephone,jdbcType=VARCHAR},",
            "amount = #{amount,jdbcType=DECIMAL},",
            "gender = #{gender,jdbcType=VARCHAR},",
            "role = #{role,jdbcType=VARCHAR},",
            "signature = #{signature,jdbcType=VARCHAR},",
            "content_count = #{contentCount,jdbcType=INTEGER},",
            "comment_count = #{commentCount,jdbcType=INTEGER},",
            "qq = #{qq,jdbcType=VARCHAR},",
            "wechat = #{wechat,jdbcType=VARCHAR},",
            "weibo = #{weibo,jdbcType=VARCHAR},",
            "facebook = #{facebook,jdbcType=VARCHAR},",
            "linkedin = #{linkedin,jdbcType=VARCHAR},",
            "birthday = #{birthday,jdbcType=TIMESTAMP},",
            "company = #{company,jdbcType=VARCHAR},",
            "occupation = #{occupation,jdbcType=VARCHAR},",
            "address = #{address,jdbcType=VARCHAR},",
            "zipcode = #{zipcode,jdbcType=VARCHAR},",
            "site = #{site,jdbcType=VARCHAR},",
            "graduateschool = #{graduateschool,jdbcType=VARCHAR},",
            "education = #{education,jdbcType=VARCHAR},",
            "avatar = #{avatar,jdbcType=VARCHAR},",
            "idcardtype = #{idcardtype,jdbcType=VARCHAR},",
            "idcard = #{idcard,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=VARCHAR},",
            "created = #{created,jdbcType=TIMESTAMP},",
            "create_source = #{createSource,jdbcType=VARCHAR},",
            "logged = #{logged,jdbcType=TIMESTAMP},",
            "activated = #{activated,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);


    @Select({
            "select username, password, salt from t_user",
            "where username = #{username,jdbcType=VARCHAR} and password = #{password,jdbcType=VARCHAR}"
    })
    User login(User user);
}