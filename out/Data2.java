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


@WTable(aliasName = "data2",tableName = "data2")
public class Data2 {


   
   @WField(aliasName = "id",columnName = "id")
   private int id;

   
   @WField(aliasName = "job",columnName = "job")
   private String job;

   
   @WField(aliasName = "num",columnName = "num")
   private int num;

   
   @WField(aliasName = "tip",columnName = "tip")
   private String tip;

   
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


   @WFieldToShow("job")
   public Object wjobFieldToShow(Object ob){
      System.out.println("------------- wjobFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("job")
   public Object wjobFieldToPersistence(Object ob){
      System.out.println("------------- wjobFieldToPersistence ------------- ");
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


   @WFieldToShow("tip")
   public Object wtipFieldToShow(Object ob){
      System.out.println("------------- wtipFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("tip")
   public Object wtipFieldToPersistence(Object ob){
      System.out.println("------------- wtipFieldToPersistence ------------- ");
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