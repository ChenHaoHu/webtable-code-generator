//create by webtable-code-generator webtable_v1 gen at May 18, 2020 14:32:22 UTC
//package 
package top.hcy.entity;

//import some packages and classes
import top.hcy.webtable.annotation.charts.WChart;
import top.hcy.webtable.annotation.field.*;
import top.hcy.webtable.annotation.method.WDeleteTrigger;
import top.hcy.webtable.annotation.method.WInsertTrigger;
import top.hcy.webtable.annotation.method.WSelectTrigger;
import top.hcy.webtable.annotation.method.WUpdateTrigger;
import top.hcy.webtable.annotation.table.*;
import top.hcy.webtable.charts.WCharts;
import top.hcy.webtable.common.WebTableContext;
import top.hcy.webtable.common.enums.WebFieldType;
import java.util.ArrayList;


@WTable(aliasName = "人员信息",tableName = "tb_user")
public class TbUser {


   
   @WField(aliasName = "userid",columnName = "userid")
   private int userid;

   
   @WField(aliasName = "openid",columnName = "openid")
   private String openid;

   
   @WField(aliasName = "name",columnName = "name")
   private String name;

   
   @WField(aliasName = "avatar",columnName = "avatar")
   private String avatar;

   
   @WField(aliasName = "gender",columnName = "gender")
   private String gender;

   
   @WField(aliasName = "province",columnName = "province")
   private String province;

   
   @WField(aliasName = "city",columnName = "city")
   private String city;

   
   @WField(aliasName = "country",columnName = "country")
   private String country;

   
   @WField(aliasName = "identifytype",columnName = "identifytype")
   private String identifytype;

   
   @WField(aliasName = "phone",columnName = "phone")
   private String phone;

   
   @WField(aliasName = "email",columnName = "email")
   private String email;

   
   @WField(aliasName = "time",columnName = "time")
   private String time;

   
   @WField(aliasName = "collection",columnName = "collection")
   private String collection;

   
   @WField(aliasName = "jointext",columnName = "jointext")
   private String jointext;

   
   @WField(aliasName = "build",columnName = "build")
   private String build;

   
   @WField(aliasName = "share",columnName = "share")
   private String share;

   
   @WField(aliasName = "signdaynum",columnName = "signdaynum")
   private int signdaynum;






   @WFieldToShow("userid")
   public Object wuseridFieldToShow(Object ob){
      System.out.println("------------- wuseridFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("userid")
   public Object wuseridFieldToPersistence(Object ob){
      System.out.println("------------- wuseridFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("openid")
   public Object wopenidFieldToShow(Object ob){
      System.out.println("------------- wopenidFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("openid")
   public Object wopenidFieldToPersistence(Object ob){
      System.out.println("------------- wopenidFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("name")
   public Object wnameFieldToShow(Object ob){
      System.out.println("------------- wnameFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("name")
   public Object wnameFieldToPersistence(Object ob){
      System.out.println("------------- wnameFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("avatar")
   public Object wavatarFieldToShow(Object ob){
      System.out.println("------------- wavatarFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("avatar")
   public Object wavatarFieldToPersistence(Object ob){
      System.out.println("------------- wavatarFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("gender")
   public Object wgenderFieldToShow(Object ob){
      System.out.println("------------- wgenderFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("gender")
   public Object wgenderFieldToPersistence(Object ob){
      System.out.println("------------- wgenderFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("province")
   public Object wprovinceFieldToShow(Object ob){
      System.out.println("------------- wprovinceFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("province")
   public Object wprovinceFieldToPersistence(Object ob){
      System.out.println("------------- wprovinceFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("city")
   public Object wcityFieldToShow(Object ob){
      System.out.println("------------- wcityFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("city")
   public Object wcityFieldToPersistence(Object ob){
      System.out.println("------------- wcityFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("country")
   public Object wcountryFieldToShow(Object ob){
      System.out.println("------------- wcountryFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("country")
   public Object wcountryFieldToPersistence(Object ob){
      System.out.println("------------- wcountryFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("identifytype")
   public Object widentifytypeFieldToShow(Object ob){
      System.out.println("------------- widentifytypeFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("identifytype")
   public Object widentifytypeFieldToPersistence(Object ob){
      System.out.println("------------- widentifytypeFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("phone")
   public Object wphoneFieldToShow(Object ob){
      System.out.println("------------- wphoneFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("phone")
   public Object wphoneFieldToPersistence(Object ob){
      System.out.println("------------- wphoneFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("email")
   public Object wemailFieldToShow(Object ob){
      System.out.println("------------- wemailFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("email")
   public Object wemailFieldToPersistence(Object ob){
      System.out.println("------------- wemailFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("time")
   public Object wtimeFieldToShow(Object ob){
      System.out.println("------------- wtimeFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("time")
   public Object wtimeFieldToPersistence(Object ob){
      System.out.println("------------- wtimeFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("collection")
   public Object wcollectionFieldToShow(Object ob){
      System.out.println("------------- wcollectionFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("collection")
   public Object wcollectionFieldToPersistence(Object ob){
      System.out.println("------------- wcollectionFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("jointext")
   public Object wjointextFieldToShow(Object ob){
      System.out.println("------------- wjointextFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("jointext")
   public Object wjointextFieldToPersistence(Object ob){
      System.out.println("------------- wjointextFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("build")
   public Object wbuildFieldToShow(Object ob){
      System.out.println("------------- wbuildFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("build")
   public Object wbuildFieldToPersistence(Object ob){
      System.out.println("------------- wbuildFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("share")
   public Object wshareFieldToShow(Object ob){
      System.out.println("------------- wshareFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("share")
   public Object wshareFieldToPersistence(Object ob){
      System.out.println("------------- wshareFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("signdaynum")
   public Object wsigndaynumFieldToShow(Object ob){
      System.out.println("------------- wsigndaynumFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("signdaynum")
   public Object wsigndaynumFieldToPersistence(Object ob){
      System.out.println("------------- wsigndaynumFieldToPersistence ------------- ");
      return ob;
   }


 
   @WSelectTrigger
   public void selectDataTrigger(WebTableContext ctx){
      System.out.println("------------- selectDataTrigger --------------");
   }

}