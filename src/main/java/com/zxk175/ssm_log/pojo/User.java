package com.zxk175.ssm_log.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    /**
     * 主键ID
     * 表 : t_user
     * 对应字段 : id
     */
    private Long id;

    /**
     * 登陆名
     * 表 : t_user
     * 对应字段 : username
     */
    private String username;

    /**
     * 昵称
     * 表 : t_user
     * 对应字段 : nickname
     */
    private String nickname;

    /**
     * 实名
     * 表 : t_user
     * 对应字段 : realname
     */
    private String realname;

    /**
     * 密码
     * 表 : t_user
     * 对应字段 : password
     */
    private String password;

    /**
     * 盐
     * 表 : t_user
     * 对应字段 : salt
     */
    private String salt;

    /**
     * 邮件
     * 表 : t_user
     * 对应字段 : email
     */
    private String email;

    /**
     * 邮箱状态（是否认证等）
     * 表 : t_user
     * 对应字段 : email_status
     */
    private String emailStatus;

    /**
     * 手机电话
     * 表 : t_user
     * 对应字段 : mobile
     */
    private String mobile;

    /**
     * 手机状态（是否认证等）
     * 表 : t_user
     * 对应字段 : mobile_status
     */
    private String mobileStatus;

    /**
     * 固定电话
     * 表 : t_user
     * 对应字段 : telephone
     */
    private String telephone;

    /**
     * 金额（余额）
     * 表 : t_user
     * 对应字段 : amount
     */
    private BigDecimal amount;

    /**
     * 性别
     * 表 : t_user
     * 对应字段 : gender
     */
    private String gender;

    /**
     * 权限
     * 表 : t_user
     * 对应字段 : role
     */
    private String role;

    /**
     * 签名
     * 表 : t_user
     * 对应字段 : signature
     */
    private String signature;

    /**
     * 内容数量
     * 表 : t_user
     * 对应字段 : content_count
     */
    private Integer contentCount;

    /**
     * 评论数量
     * 表 : t_user
     * 对应字段 : comment_count
     */
    private Integer commentCount;

    /**
     * QQ号码
     * 表 : t_user
     * 对应字段 : qq
     */
    private String qq;

    /**
     * 微信号
     * 表 : t_user
     * 对应字段 : wechat
     */
    private String wechat;

    /**
     * 微博
     * 表 : t_user
     * 对应字段 : weibo
     */
    private String weibo;

    /**
     * 脸书账号
     * 表 : t_user
     * 对应字段 : facebook
     */
    private String facebook;

    /**
     * 领英账号
     * 表 : t_user
     * 对应字段 : linkedin
     */
    private String linkedin;

    /**
     * 生日
     * 表 : t_user
     * 对应字段 : birthday
     */
    private Date birthday;

    /**
     * 公司
     * 表 : t_user
     * 对应字段 : company
     */
    private String company;

    /**
     * 职位、职业
     * 表 : t_user
     * 对应字段 : occupation
     */
    private String occupation;

    /**
     * 地址
     * 表 : t_user
     * 对应字段 : address
     */
    private String address;

    /**
     * 邮政编码
     * 表 : t_user
     * 对应字段 : zipcode
     */
    private String zipcode;

    /**
     * 个人网址
     * 表 : t_user
     * 对应字段 : site
     */
    private String site;

    /**
     * 毕业学校
     * 表 : t_user
     * 对应字段 : graduateschool
     */
    private String graduateschool;

    /**
     * 学历
     * 表 : t_user
     * 对应字段 : education
     */
    private String education;

    /**
     * 头像
     * 表 : t_user
     * 对应字段 : avatar
     */
    private String avatar;

    /**
     * 证件类型：身份证 护照 军官证等
     * 表 : t_user
     * 对应字段 : idcardtype
     */
    private String idcardtype;

    /**
     * 证件号码
     * 表 : t_user
     * 对应字段 : idcard
     */
    private String idcard;

    /**
     * 状态
     * 表 : t_user
     * 对应字段 : status
     */
    private String status;

    /**
     * 创建日期
     * 表 : t_user
     * 对应字段 : created
     */
    private Date created;

    /**
     * 用户来源（可能来之oauth第三方）
     * 表 : t_user
     * 对应字段 : create_source
     */
    private String createSource;

    /**
     * 最后的登陆时间
     * 表 : t_user
     * 对应字段 : logged
     */
    private Date logged;

    /**
     * 激活时间
     * 表 : t_user
     * 对应字段 : activated
     */
    private Date activated;

    //默认的序列化版本Id
    private static final long serialVersionUID = 1L;

    /**
     *  构造函数
     */
    public User(Long id, String username, String nickname, String realname, String password, String salt, String email, String emailStatus, String mobile, String mobileStatus, String telephone, BigDecimal amount, String gender, String role, String signature, Integer contentCount, Integer commentCount, String qq, String wechat, String weibo, String facebook, String linkedin, Date birthday, String company, String occupation, String address, String zipcode, String site, String graduateschool, String education, String avatar, String idcardtype, String idcard, String status, Date created, String createSource, Date logged, Date activated) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.realname = realname;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.emailStatus = emailStatus;
        this.mobile = mobile;
        this.mobileStatus = mobileStatus;
        this.telephone = telephone;
        this.amount = amount;
        this.gender = gender;
        this.role = role;
        this.signature = signature;
        this.contentCount = contentCount;
        this.commentCount = commentCount;
        this.qq = qq;
        this.wechat = wechat;
        this.weibo = weibo;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.birthday = birthday;
        this.company = company;
        this.occupation = occupation;
        this.address = address;
        this.zipcode = zipcode;
        this.site = site;
        this.graduateschool = graduateschool;
        this.education = education;
        this.avatar = avatar;
        this.idcardtype = idcardtype;
        this.idcard = idcard;
        this.status = status;
        this.created = created;
        this.createSource = createSource;
        this.logged = logged;
        this.activated = activated;
    }

    /**
     *  构造函数
     */
    public User() {
        super();
    }

    /**
     * Get Value：主键ID
     * @return id 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Set Value：主键ID
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get Value：登陆名
     * @return username 登陆名
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set Value：登陆名
     * @param username 登陆名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * Get Value：昵称
     * @return nickname 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Set Value：昵称
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * Get Value：实名
     * @return realname 实名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * Set Value：实名
     * @param realname 实名
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * Get Value：密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set Value：密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * Get Value：盐
     * @return salt 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Set Value：盐
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * Get Value：邮件
     * @return email 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set Value：邮件
     * @param email 邮件
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * Get Value：邮箱状态（是否认证等）
     * @return email_status 邮箱状态（是否认证等）
     */
    public String getEmailStatus() {
        return emailStatus;
    }

    /**
     * Set Value：邮箱状态（是否认证等）
     * @param emailStatus 邮箱状态（是否认证等）
     */
    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus == null ? null : emailStatus.trim();
    }

    /**
     * Get Value：手机电话
     * @return mobile 手机电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Set Value：手机电话
     * @param mobile 手机电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * Get Value：手机状态（是否认证等）
     * @return mobile_status 手机状态（是否认证等）
     */
    public String getMobileStatus() {
        return mobileStatus;
    }

    /**
     * Set Value：手机状态（是否认证等）
     * @param mobileStatus 手机状态（是否认证等）
     */
    public void setMobileStatus(String mobileStatus) {
        this.mobileStatus = mobileStatus == null ? null : mobileStatus.trim();
    }

    /**
     * Get Value：固定电话
     * @return telephone 固定电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Set Value：固定电话
     * @param telephone 固定电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * Get Value：金额（余额）
     * @return amount 金额（余额）
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Set Value：金额（余额）
     * @param amount 金额（余额）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Get Value：性别
     * @return gender 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set Value：性别
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * Get Value：权限
     * @return role 权限
     */
    public String getRole() {
        return role;
    }

    /**
     * Set Value：权限
     * @param role 权限
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * Get Value：签名
     * @return signature 签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Set Value：签名
     * @param signature 签名
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * Get Value：内容数量
     * @return content_count 内容数量
     */
    public Integer getContentCount() {
        return contentCount;
    }

    /**
     * Set Value：内容数量
     * @param contentCount 内容数量
     */
    public void setContentCount(Integer contentCount) {
        this.contentCount = contentCount;
    }

    /**
     * Get Value：评论数量
     * @return comment_count 评论数量
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * Set Value：评论数量
     * @param commentCount 评论数量
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * Get Value：QQ号码
     * @return qq QQ号码
     */
    public String getQq() {
        return qq;
    }

    /**
     * Set Value：QQ号码
     * @param qq QQ号码
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * Get Value：微信号
     * @return wechat 微信号
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * Set Value：微信号
     * @param wechat 微信号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * Get Value：微博
     * @return weibo 微博
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * Set Value：微博
     * @param weibo 微博
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    /**
     * Get Value：脸书账号
     * @return facebook 脸书账号
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * Set Value：脸书账号
     * @param facebook 脸书账号
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook == null ? null : facebook.trim();
    }

    /**
     * Get Value：领英账号
     * @return linkedin 领英账号
     */
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * Set Value：领英账号
     * @param linkedin 领英账号
     */
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin == null ? null : linkedin.trim();
    }

    /**
     * Get Value：生日
     * @return birthday 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Set Value：生日
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * Get Value：公司
     * @return company 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * Set Value：公司
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * Get Value：职位、职业
     * @return occupation 职位、职业
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Set Value：职位、职业
     * @param occupation 职位、职业
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    /**
     * Get Value：地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set Value：地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * Get Value：邮政编码
     * @return zipcode 邮政编码
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Set Value：邮政编码
     * @param zipcode 邮政编码
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    /**
     * Get Value：个人网址
     * @return site 个人网址
     */
    public String getSite() {
        return site;
    }

    /**
     * Set Value：个人网址
     * @param site 个人网址
     */
    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    /**
     * Get Value：毕业学校
     * @return graduateschool 毕业学校
     */
    public String getGraduateschool() {
        return graduateschool;
    }

    /**
     * Set Value：毕业学校
     * @param graduateschool 毕业学校
     */
    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool == null ? null : graduateschool.trim();
    }

    /**
     * Get Value：学历
     * @return education 学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * Set Value：学历
     * @param education 学历
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * Get Value：头像
     * @return avatar 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Set Value：头像
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * Get Value：证件类型：身份证 护照 军官证等
     * @return idcardtype 证件类型：身份证 护照 军官证等
     */
    public String getIdcardtype() {
        return idcardtype;
    }

    /**
     * Set Value：证件类型：身份证 护照 军官证等
     * @param idcardtype 证件类型：身份证 护照 军官证等
     */
    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype == null ? null : idcardtype.trim();
    }

    /**
     * Get Value：证件号码
     * @return idcard 证件号码
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * Set Value：证件号码
     * @param idcard 证件号码
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * Get Value：状态
     * @return status 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set Value：状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * Get Value：创建日期
     * @return created 创建日期
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Set Value：创建日期
     * @param created 创建日期
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Get Value：用户来源（可能来之oauth第三方）
     * @return create_source 用户来源（可能来之oauth第三方）
     */
    public String getCreateSource() {
        return createSource;
    }

    /**
     * Set Value：用户来源（可能来之oauth第三方）
     * @param createSource 用户来源（可能来之oauth第三方）
     */
    public void setCreateSource(String createSource) {
        this.createSource = createSource == null ? null : createSource.trim();
    }

    /**
     * Get Value：最后的登陆时间
     * @return logged 最后的登陆时间
     */
    public Date getLogged() {
        return logged;
    }

    /**
     * Set Value：最后的登陆时间
     * @param logged 最后的登陆时间
     */
    public void setLogged(Date logged) {
        this.logged = logged;
    }

    /**
     * Get Value：激活时间
     * @return activated 激活时间
     */
    public Date getActivated() {
        return activated;
    }

    /**
     * Set Value：激活时间
     * @param activated 激活时间
     */
    public void setActivated(Date activated) {
        this.activated = activated;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", nickname=").append(nickname);
        sb.append(", realname=").append(realname);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", email=").append(email);
        sb.append(", emailStatus=").append(emailStatus);
        sb.append(", mobile=").append(mobile);
        sb.append(", mobileStatus=").append(mobileStatus);
        sb.append(", telephone=").append(telephone);
        sb.append(", amount=").append(amount);
        sb.append(", gender=").append(gender);
        sb.append(", role=").append(role);
        sb.append(", signature=").append(signature);
        sb.append(", contentCount=").append(contentCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", qq=").append(qq);
        sb.append(", wechat=").append(wechat);
        sb.append(", weibo=").append(weibo);
        sb.append(", facebook=").append(facebook);
        sb.append(", linkedin=").append(linkedin);
        sb.append(", birthday=").append(birthday);
        sb.append(", company=").append(company);
        sb.append(", occupation=").append(occupation);
        sb.append(", address=").append(address);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", site=").append(site);
        sb.append(", graduateschool=").append(graduateschool);
        sb.append(", education=").append(education);
        sb.append(", avatar=").append(avatar);
        sb.append(", idcardtype=").append(idcardtype);
        sb.append(", idcard=").append(idcard);
        sb.append(", status=").append(status);
        sb.append(", created=").append(created);
        sb.append(", createSource=").append(createSource);
        sb.append(", logged=").append(logged);
        sb.append(", activated=").append(activated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}