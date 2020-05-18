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


@WTable(aliasName = "任务信息",tableName = "tb_task")
public class TbTask {


   
   @WField(aliasName = "task_id",columnName = "task_id")
   private int taskId;

   
   @WField(aliasName = "author",columnName = "author")
   private String author;

   
   @WField(aliasName = "create_time",columnName = "create_time")
   private String createTime;

   
   @WField(aliasName = "desct",columnName = "desct")
   private String desct;

   
   @WField(aliasName = "end_time",columnName = "end_time")
   private String endTime;

   
   @WField(aliasName = "modife_time",columnName = "modife_time")
   private String modifeTime;

   
   @WField(aliasName = "passwd",columnName = "passwd")
   private String passwd;

   
   @WField(aliasName = "task_name",columnName = "task_name")
   private String taskName;






   @WFieldToShow("taskId")
   public Object wtaskIdFieldToShow(Object ob){
      System.out.println("------------- wtaskIdFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("taskId")
   public Object wtaskIdFieldToPersistence(Object ob){
      System.out.println("------------- wtaskIdFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("author")
   public Object wauthorFieldToShow(Object ob){
      System.out.println("------------- wauthorFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("author")
   public Object wauthorFieldToPersistence(Object ob){
      System.out.println("------------- wauthorFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("createTime")
   public Object wcreateTimeFieldToShow(Object ob){
      System.out.println("------------- wcreateTimeFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("createTime")
   public Object wcreateTimeFieldToPersistence(Object ob){
      System.out.println("------------- wcreateTimeFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("desct")
   public Object wdesctFieldToShow(Object ob){
      System.out.println("------------- wdesctFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("desct")
   public Object wdesctFieldToPersistence(Object ob){
      System.out.println("------------- wdesctFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("endTime")
   public Object wendTimeFieldToShow(Object ob){
      System.out.println("------------- wendTimeFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("endTime")
   public Object wendTimeFieldToPersistence(Object ob){
      System.out.println("------------- wendTimeFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("modifeTime")
   public Object wmodifeTimeFieldToShow(Object ob){
      System.out.println("------------- wmodifeTimeFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("modifeTime")
   public Object wmodifeTimeFieldToPersistence(Object ob){
      System.out.println("------------- wmodifeTimeFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("passwd")
   public Object wpasswdFieldToShow(Object ob){
      System.out.println("------------- wpasswdFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("passwd")
   public Object wpasswdFieldToPersistence(Object ob){
      System.out.println("------------- wpasswdFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("taskName")
   public Object wtaskNameFieldToShow(Object ob){
      System.out.println("------------- wtaskNameFieldToShow ------------- ");
      return ob;
   }

   @WFieldToPersistence("taskName")
   public Object wtaskNameFieldToPersistence(Object ob){
      System.out.println("------------- wtaskNameFieldToPersistence ------------- ");
      return ob;
   }


 
   @WSelectTrigger
   public void selectDataTrigger(WebTableContext ctx){
      System.out.println("------------- selectDataTrigger --------------");
   }

}