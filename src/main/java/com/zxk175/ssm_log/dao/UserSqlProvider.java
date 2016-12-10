package com.zxk175.ssm_log.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.zxk175.ssm_log.pojo.User;
import com.zxk175.ssm_log.pojo.UserExample.Criteria;
import com.zxk175.ssm_log.pojo.UserExample.Criterion;
import com.zxk175.ssm_log.pojo.UserExample;
import java.util.List;
import java.util.Map;

public class UserSqlProvider {

    /**
     *  根据指定的条件获取数据库记录数
     *
     */
    public String countByExample(UserExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("t_user");
        applyWhere(example, false);
        return SQL();
    }

    /**
     *  根据指定的条件删除数据库符合条件的记录
     *
     */
    public String deleteByExample(UserExample example) {
        BEGIN();
        DELETE_FROM("t_user");
        applyWhere(example, false);
        return SQL();
    }

    /**
     *  动态字段,写入数据库记录
     *
     */
    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("t_user");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getRealname() != null) {
            VALUES("realname", "#{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            VALUES("salt", "#{salt,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEmailStatus() != null) {
            VALUES("email_status", "#{emailStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getMobileStatus() != null) {
            VALUES("mobile_status", "#{mobileStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            VALUES("telephone", "#{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getGender() != null) {
            VALUES("gender", "#{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            VALUES("role", "#{role,jdbcType=VARCHAR}");
        }
        
        if (record.getSignature() != null) {
            VALUES("signature", "#{signature,jdbcType=VARCHAR}");
        }
        
        if (record.getContentCount() != null) {
            VALUES("content_count", "#{contentCount,jdbcType=INTEGER}");
        }
        
        if (record.getCommentCount() != null) {
            VALUES("comment_count", "#{commentCount,jdbcType=INTEGER}");
        }
        
        if (record.getQq() != null) {
            VALUES("qq", "#{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getWechat() != null) {
            VALUES("wechat", "#{wechat,jdbcType=VARCHAR}");
        }
        
        if (record.getWeibo() != null) {
            VALUES("weibo", "#{weibo,jdbcType=VARCHAR}");
        }
        
        if (record.getFacebook() != null) {
            VALUES("facebook", "#{facebook,jdbcType=VARCHAR}");
        }
        
        if (record.getLinkedin() != null) {
            VALUES("linkedin", "#{linkedin,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            VALUES("birthday", "#{birthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCompany() != null) {
            VALUES("company", "#{company,jdbcType=VARCHAR}");
        }
        
        if (record.getOccupation() != null) {
            VALUES("occupation", "#{occupation,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getZipcode() != null) {
            VALUES("zipcode", "#{zipcode,jdbcType=VARCHAR}");
        }
        
        if (record.getSite() != null) {
            VALUES("site", "#{site,jdbcType=VARCHAR}");
        }
        
        if (record.getGraduateschool() != null) {
            VALUES("graduateschool", "#{graduateschool,jdbcType=VARCHAR}");
        }
        
        if (record.getEducation() != null) {
            VALUES("education", "#{education,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            VALUES("avatar", "#{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcardtype() != null) {
            VALUES("idcardtype", "#{idcardtype,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcard() != null) {
            VALUES("idcard", "#{idcard,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            VALUES("created", "#{created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateSource() != null) {
            VALUES("create_source", "#{createSource,jdbcType=VARCHAR}");
        }
        
        if (record.getLogged() != null) {
            VALUES("logged", "#{logged,jdbcType=TIMESTAMP}");
        }
        
        if (record.getActivated() != null) {
            VALUES("activated", "#{activated,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     *  根据指定的条件查询符合条件的数据库记录
     *
     */
    public String selectByExample(UserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("username");
        SELECT("nickname");
        SELECT("realname");
        SELECT("password");
        SELECT("salt");
        SELECT("email");
        SELECT("email_status");
        SELECT("mobile");
        SELECT("mobile_status");
        SELECT("telephone");
        SELECT("amount");
        SELECT("gender");
        SELECT("role");
        SELECT("signature");
        SELECT("content_count");
        SELECT("comment_count");
        SELECT("qq");
        SELECT("wechat");
        SELECT("weibo");
        SELECT("facebook");
        SELECT("linkedin");
        SELECT("birthday");
        SELECT("company");
        SELECT("occupation");
        SELECT("address");
        SELECT("zipcode");
        SELECT("site");
        SELECT("graduateschool");
        SELECT("education");
        SELECT("avatar");
        SELECT("idcardtype");
        SELECT("idcard");
        SELECT("status");
        SELECT("created");
        SELECT("create_source");
        SELECT("logged");
        SELECT("activated");
        FROM("t_user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录
     *
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        BEGIN();
        UPDATE("t_user");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getRealname() != null) {
            SET("realname = #{record.realname,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            SET("salt = #{record.salt,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getEmailStatus() != null) {
            SET("email_status = #{record.emailStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getMobileStatus() != null) {
            SET("mobile_status = #{record.mobileStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            SET("telephone = #{record.telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("amount = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getGender() != null) {
            SET("gender = #{record.gender,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            SET("role = #{record.role,jdbcType=VARCHAR}");
        }
        
        if (record.getSignature() != null) {
            SET("signature = #{record.signature,jdbcType=VARCHAR}");
        }
        
        if (record.getContentCount() != null) {
            SET("content_count = #{record.contentCount,jdbcType=INTEGER}");
        }
        
        if (record.getCommentCount() != null) {
            SET("comment_count = #{record.commentCount,jdbcType=INTEGER}");
        }
        
        if (record.getQq() != null) {
            SET("qq = #{record.qq,jdbcType=VARCHAR}");
        }
        
        if (record.getWechat() != null) {
            SET("wechat = #{record.wechat,jdbcType=VARCHAR}");
        }
        
        if (record.getWeibo() != null) {
            SET("weibo = #{record.weibo,jdbcType=VARCHAR}");
        }
        
        if (record.getFacebook() != null) {
            SET("facebook = #{record.facebook,jdbcType=VARCHAR}");
        }
        
        if (record.getLinkedin() != null) {
            SET("linkedin = #{record.linkedin,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            SET("birthday = #{record.birthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCompany() != null) {
            SET("company = #{record.company,jdbcType=VARCHAR}");
        }
        
        if (record.getOccupation() != null) {
            SET("occupation = #{record.occupation,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getZipcode() != null) {
            SET("zipcode = #{record.zipcode,jdbcType=VARCHAR}");
        }
        
        if (record.getSite() != null) {
            SET("site = #{record.site,jdbcType=VARCHAR}");
        }
        
        if (record.getGraduateschool() != null) {
            SET("graduateschool = #{record.graduateschool,jdbcType=VARCHAR}");
        }
        
        if (record.getEducation() != null) {
            SET("education = #{record.education,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcardtype() != null) {
            SET("idcardtype = #{record.idcardtype,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcard() != null) {
            SET("idcard = #{record.idcard,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            SET("created = #{record.created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateSource() != null) {
            SET("create_source = #{record.createSource,jdbcType=VARCHAR}");
        }
        
        if (record.getLogged() != null) {
            SET("logged = #{record.logged,jdbcType=TIMESTAMP}");
        }
        
        if (record.getActivated() != null) {
            SET("activated = #{record.activated,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     *  根据指定的条件来更新符合条件的数据库记录
     *
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("t_user");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("username = #{record.username,jdbcType=VARCHAR}");
        SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        SET("realname = #{record.realname,jdbcType=VARCHAR}");
        SET("password = #{record.password,jdbcType=VARCHAR}");
        SET("salt = #{record.salt,jdbcType=VARCHAR}");
        SET("email = #{record.email,jdbcType=VARCHAR}");
        SET("email_status = #{record.emailStatus,jdbcType=VARCHAR}");
        SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        SET("mobile_status = #{record.mobileStatus,jdbcType=VARCHAR}");
        SET("telephone = #{record.telephone,jdbcType=VARCHAR}");
        SET("amount = #{record.amount,jdbcType=DECIMAL}");
        SET("gender = #{record.gender,jdbcType=VARCHAR}");
        SET("role = #{record.role,jdbcType=VARCHAR}");
        SET("signature = #{record.signature,jdbcType=VARCHAR}");
        SET("content_count = #{record.contentCount,jdbcType=INTEGER}");
        SET("comment_count = #{record.commentCount,jdbcType=INTEGER}");
        SET("qq = #{record.qq,jdbcType=VARCHAR}");
        SET("wechat = #{record.wechat,jdbcType=VARCHAR}");
        SET("weibo = #{record.weibo,jdbcType=VARCHAR}");
        SET("facebook = #{record.facebook,jdbcType=VARCHAR}");
        SET("linkedin = #{record.linkedin,jdbcType=VARCHAR}");
        SET("birthday = #{record.birthday,jdbcType=TIMESTAMP}");
        SET("company = #{record.company,jdbcType=VARCHAR}");
        SET("occupation = #{record.occupation,jdbcType=VARCHAR}");
        SET("address = #{record.address,jdbcType=VARCHAR}");
        SET("zipcode = #{record.zipcode,jdbcType=VARCHAR}");
        SET("site = #{record.site,jdbcType=VARCHAR}");
        SET("graduateschool = #{record.graduateschool,jdbcType=VARCHAR}");
        SET("education = #{record.education,jdbcType=VARCHAR}");
        SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        SET("idcardtype = #{record.idcardtype,jdbcType=VARCHAR}");
        SET("idcard = #{record.idcard,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=VARCHAR}");
        SET("created = #{record.created,jdbcType=TIMESTAMP}");
        SET("create_source = #{record.createSource,jdbcType=VARCHAR}");
        SET("logged = #{record.logged,jdbcType=TIMESTAMP}");
        SET("activated = #{record.activated,jdbcType=TIMESTAMP}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录
     *
     */
    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("t_user");
        
        if (record.getUsername() != null) {
            SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getRealname() != null) {
            SET("realname = #{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            SET("salt = #{salt,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEmailStatus() != null) {
            SET("email_status = #{emailStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getMobileStatus() != null) {
            SET("mobile_status = #{mobileStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getTelephone() != null) {
            SET("telephone = #{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            SET("amount = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getGender() != null) {
            SET("gender = #{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            SET("role = #{role,jdbcType=VARCHAR}");
        }
        
        if (record.getSignature() != null) {
            SET("signature = #{signature,jdbcType=VARCHAR}");
        }
        
        if (record.getContentCount() != null) {
            SET("content_count = #{contentCount,jdbcType=INTEGER}");
        }
        
        if (record.getCommentCount() != null) {
            SET("comment_count = #{commentCount,jdbcType=INTEGER}");
        }
        
        if (record.getQq() != null) {
            SET("qq = #{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getWechat() != null) {
            SET("wechat = #{wechat,jdbcType=VARCHAR}");
        }
        
        if (record.getWeibo() != null) {
            SET("weibo = #{weibo,jdbcType=VARCHAR}");
        }
        
        if (record.getFacebook() != null) {
            SET("facebook = #{facebook,jdbcType=VARCHAR}");
        }
        
        if (record.getLinkedin() != null) {
            SET("linkedin = #{linkedin,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            SET("birthday = #{birthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCompany() != null) {
            SET("company = #{company,jdbcType=VARCHAR}");
        }
        
        if (record.getOccupation() != null) {
            SET("occupation = #{occupation,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getZipcode() != null) {
            SET("zipcode = #{zipcode,jdbcType=VARCHAR}");
        }
        
        if (record.getSite() != null) {
            SET("site = #{site,jdbcType=VARCHAR}");
        }
        
        if (record.getGraduateschool() != null) {
            SET("graduateschool = #{graduateschool,jdbcType=VARCHAR}");
        }
        
        if (record.getEducation() != null) {
            SET("education = #{education,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            SET("avatar = #{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcardtype() != null) {
            SET("idcardtype = #{idcardtype,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcard() != null) {
            SET("idcard = #{idcard,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            SET("created = #{created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateSource() != null) {
            SET("create_source = #{createSource,jdbcType=VARCHAR}");
        }
        
        if (record.getLogged() != null) {
            SET("logged = #{logged,jdbcType=TIMESTAMP}");
        }
        
        if (record.getActivated() != null) {
            SET("activated = #{activated,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    /**
     * 
     *
     */
    protected void applyWhere(UserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}