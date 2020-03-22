//create by webtable-code-generator webtable_v1 gen at Mar 21, 2020 00:05:09 UTC
//package 
package top.hcy.entity;

//import some packages and classes
import top.hcy.webtable.annotation.charts.WChart;
import top.hcy.webtable.annotation.field.*;
import top.hcy.webtable.annotation.method.WDeleteTrigger;
import top.hcy.webtable.annotation.method.WInsertTrigger;
import top.hcy.webtable.annotation.method.WUpdateTrigger;
import top.hcy.webtable.annotation.table.*;
import top.hcy.webtable.charts.WCharts;
import top.hcy.webtable.common.enums.WebFieldType;


@WTable(aliasName = "user",tableName = "user")
public class User {


   
   @WField(aliasName = "id",columnName = "id")
   private int id;

   
   @WField(aliasName = "name",columnName = "name")
   private String name;

   
   @WField(aliasName = "age",columnName = "age")
   private int age;

   
   @WField(aliasName = "num",columnName = "num")
   private int num;






   @WFieldToShow("id")
   public Object widFieldToShow(Object ob){
      System.out.println("------------- widFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("id")
   public Object widFieldToPersistence(Object ob){
      System.out.println("------------- widFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("name")
   public Object wnameFieldToShow(Object ob){
      System.out.println("------------- wnameFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("name")
   public Object wnameFieldToPersistence(Object ob){
      System.out.println("------------- wnameFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("age")
   public Object wageFieldToShow(Object ob){
      System.out.println("------------- wageFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("age")
   public Object wageFieldToPersistence(Object ob){
      System.out.println("------------- wageFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("num")
   public Object wnumFieldToShow(Object ob){
      System.out.println("------------- wnumFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("num")
   public Object wnumFieldToPersistence(Object ob){
      System.out.println("------------- wnumFieldToPersistence ------------- ");
      return ob;
   }


 
   @WSelectTrigger
   public void selectDataTrigger(WebTableContext ctx){
      System.out.println("------------- selectDataTrigger --------------");
   }

}