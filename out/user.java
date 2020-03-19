//create by webtable-code-generator webtable_v1 gen at Mar 19, 2020 08:24:08 UTC
//package 
package 3;

//import some package and class
import top.hcy.webtable.annotation.charts.WChart;
import top.hcy.webtable.annotation.field.*;
import top.hcy.webtable.annotation.method.WDeleteTrigger;
import top.hcy.webtable.annotation.method.WInsertTrigger;
import top.hcy.webtable.annotation.method.WUpdateTrigger;
import top.hcy.webtable.annotation.table.*;
import top.hcy.webtable.charts.WCharts;
import top.hcy.webtable.common.enums.WebFieldType;







@WTable(aliasName = "user",tableName = "user")
public class user {


   @WField(aliasName = "id",columnName = "id")
   private int id;

   @WField(aliasName = "name",columnName = "name")
   private String name;

   @WField(aliasName = "age",columnName = "age")
   private int age;

   @WField(aliasName = "num",columnName = "num")
   private int num;



// @WFieldToShow("")
// public void wFieldToPersistence(Object ob){
//  System.out.println("------------- wFieldToPersistence ------------- ");
// }

// @WFieldToShow("")
// public void wFieldToPersistence(){
//  System.out.println("------------- wFieldToPersistence ------------- ");
// }

// @WFieldToPersistence("")
// public void wFieldToPersistence(Object ob){
//  System.out.println("------------- wFieldToPersistence ------------- ");
// }

// @WFieldToPersistence("")
// public void wFieldToPersistence(){
//  System.out.println("------------- wFieldToPersistence ------------- ");
// }

// @WInsertTrigger
// public void insertDataTrigger(WebTableContext ctx){
//  System.out.println("------------- insertDataTrigger --------------");
// }
//
// @WUpdateTrigger
// public void updateDataTrigger(WebTableContext ctx){
//  System.out.println("------------- updateDataTrigger --------------");
// }
//
// @WDeleteTrigger
// public void deleteDataTrigger(WebTableContext ctx){
//  System.out.println("------------- deleteDataTrigger --------------");
// }


//   @WChart(value = " ",showDashboard = true)
//   public WCharts chart3(){
//
//
//   }
}