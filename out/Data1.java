//create by webtable-code-generator webtable_v1 gen at Mar 19, 2020 01:17:26 UTC
//package 
package cccc;

//import some package and class
import top.hcy.webtable.annotation.charts.WChart;
import top.hcy.webtable.annotation.field.*;
import top.hcy.webtable.annotation.method.WDeleteTrigger;
import top.hcy.webtable.annotation.method.WInsertTrigger;
import top.hcy.webtable.annotation.method.WUpdateTrigger;
import top.hcy.webtable.annotation.table.*;
import top.hcy.webtable.charts.WCharts;
import top.hcy.webtable.common.enums.WebFieldType;







@WTable(aliasName = "data1",tableName = "data1")
public class data1 {


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



// @WFieldToShow("")
// public void wFieldToPersistenceAge(Object ob){
//  System.out.println("------------- 展示时，调用 ------------- ");
// }

// @WFieldToShow("")
// public void wFieldToPersistenceAge(){
//  System.out.println("------------- 展示时，调用 ------------- ");
// }

// @WFieldToPersistence("")
// public void wFieldToPersistenceAge(Object ob){
//  System.out.println("------------- 存储时，调用 ------------- ");
// }

// @WFieldToPersistence("")
// public void wFieldToPersistenceAge(){
//  System.out.println("------------- 存储时，调用 ------------- ");
// }

// @WInsertTrigger
// public void insertDataTrigger(WebTableContext ctx){
//  System.out.println("------------- 插入触发器 --------------");
// }
//
// @WUpdateTrigger
// public void updateDataTrigger(WebTableContext ctx){
//  System.out.println("------------- 更新触发器 --------------");
// }
//
// @WDeleteTrigger
// public void deleteDataTrigger(WebTableContext ctx){
//  System.out.println("------------- 删除触发器 --------------");
// }


//   @WChart(value = " ",showDashboard = true)
//   public WCharts chart3(){
//
//
//   }
}