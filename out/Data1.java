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


@WTable(aliasName = "data1",tableName = "data1")
public class Data1 {


   
   @WField(aliasName = "id",columnName = "id")
   private int id;

   
   @WField(aliasName = "name",columnName = "name")
   private String name;

   
   @WField(aliasName = "age",columnName = "age")
   private int age;

   
   @WField(aliasName = "passwd",columnName = "passwd")
   private String passwd;

   
   @WField(aliasName = "data1",columnName = "data1")
   private String data1;

   
   @WField(aliasName = "data2",columnName = "data2")
   private String data2;

   
   @WField(aliasName = "data3",columnName = "data3")
   private String data3;

   
   @WField(aliasName = "data4",columnName = "data4")
   private String data4;






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


   @WFieldToShow("passwd")
   public Object wpasswdFieldToShow(Object ob){
      System.out.println("------------- wpasswdFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("passwd")
   public Object wpasswdFieldToPersistence(Object ob){
      System.out.println("------------- wpasswdFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("data1")
   public Object wdata1FieldToShow(Object ob){
      System.out.println("------------- wdata1FieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("data1")
   public Object wdata1FieldToPersistence(Object ob){
      System.out.println("------------- wdata1FieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("data2")
   public Object wdata2FieldToShow(Object ob){
      System.out.println("------------- wdata2FieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("data2")
   public Object wdata2FieldToPersistence(Object ob){
      System.out.println("------------- wdata2FieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("data3")
   public Object wdata3FieldToShow(Object ob){
      System.out.println("------------- wdata3FieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("data3")
   public Object wdata3FieldToPersistence(Object ob){
      System.out.println("------------- wdata3FieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("data4")
   public Object wdata4FieldToShow(Object ob){
      System.out.println("------------- wdata4FieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("data4")
   public Object wdata4FieldToPersistence(Object ob){
      System.out.println("------------- wdata4FieldToPersistence ------------- ");
      return ob;
   }


 
   @WSelectTrigger
   public void selectDataTrigger(WebTableContext ctx){
      System.out.println("------------- selectDataTrigger --------------");
   }

}