/*@Time : 2020/9/11 16:13
 *@Author : 韦佗
 *@File : model.java
 *@Software : IntelliJ IDEA
 */
package Demo;
import java.util.Date;

public class model {
    private String SchoolNumber;//学校标识码
    private String Name;//学生姓名
    private Integer Sex;//学生性别。1表示男，2表示女，0表示保密
    private Date BirthDate;//出生日期
    private String  BirthPlaceCode;//出生地行政区划代码
    private String  NativePlace;//籍贯
    private String Nation;//民族
    private String Nationality;//国籍
    private Integer IdCardType;//身份证类型。1为中华人民共和国居民身份证，2为海外护照
    private boolean ForeignOrTheMainland;//港澳台侨外
    private boolean Health;//健康状况
    private Integer politics;//政治面貌。1为群众，2为党员
    private String IdNumber;//身份证号
    private String Category;//户口性质
    private String DomicilePlace;//户口所在地行政区划
    private String ClassNumber;//班号
    private Date AdmissionDate;//入学年月
    private Integer TheEntranceWay;//入学方式。1为本地户籍入学，2为借读入学，3为考试入学
    private Integer StudyingWay;//就读方式。1为寄宿，2为走读
    private String PresentAddress;//现住址
    private String MailingAddress;//通信地址
    private String FamilyAddress;//家庭住址
    private String  PhoneNumber;//联系电话
    private String  PostalCode;//邮政编码
    private boolean OnlyChild;//是否独生子女
    private boolean PreschoolEducation;//是否受过学前教育
    private boolean LeftoverChildren;//是否留守儿童
    private boolean AmountSought;//是否申请资助
    private boolean PublicSubsidies;//是否享受一补
    private boolean Orphan;//是否孤儿
    private boolean Martyr;//是否烈士或优抚子女
    private String DistanceFromSchool;//上下学距离
    private String Commuting;//上下学方式
    private boolean NeedTakeTheSchoolBus;//是否需要乘坐校车
    private String FormerName;//曾用名
    private Date IdCardOverdueTime;//身份证有效期
    private Integer  BloodType;//血型。1为a型，2为b型，3为o型，4为ab型，5为未知
    private String Specialty;//特长
    private String StudentStatusNumber;//学籍辅号
    private String ClassStudentId;//班内学号
    private String StudentsSource;//学生来源
    private String Email;//电子邮箱
    private String BusinessPage;//主页地址
    private String DisabilityTypes;//残疾类型
    private boolean GovernmentBuyDegree;//是否为政府购买学位
    private boolean LearningInRegularClassroom;//随班就读
    private String NameOfFamilyMember1;//成员1姓名
    private Integer MemberRelationship1;//成员1关系。1为父子，2为母子，3为姐妹，4为兄弟，5祖父，6祖母
    private String MembershipStatement1;//成员1关系说明
    private String MemberPresentAddress1;//成员1现住址
    private String MemberDomicilePlace1;//成员1户口所在地行政区划
    private String MemberNumberPhoneNumber1;//成员1联系电话
    private boolean MemberWhetherGuardian1;//成员1是否监护人;
    private Integer MemberIdCardType1;//成员1身份证类型。1为中华人民共和国居民身份证，2为海外护照
    private String MemberIdNumber1;//成员1身份证件号
    private String MemberNation1;//成员1民族
    private String MemberWorkUniT1;//成员1工作单位
    private String MemberPost1;//成员1职务
    private String NameOfFamilyMember2;//成员2姓名
    private Integer MemberRelationship2;//成员2关系。1为父子，2为母子，3为姐妹，4为兄弟，5祖父，6祖母
    private String MembershipStatement2;//成员2关系说明
    private String MemberPresentAddress2;//成员2现住址
    private String MemberDomicilePlace2;//成员2户口所在地行政区划
    private String MemberNumberPhoneNumber2;//成员2联系电话
    private boolean MemberWhetherGuardian2;//成员2是否监护人;
    private Integer MemberIdCardType2;//成员2身份证类型。1为中华人民共和国居民身份证，2为海外护照
    private String MemberIdNumber2;//成员2身份证件号
    private String MemberNation2;//成员2民族
    private String MemberWorkUniT2;//成员2工作单位
    private String MemberPost2;//成员2职务
}
