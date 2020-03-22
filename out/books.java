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


@WTable(aliasName = "books",tableName = "books")
public class Books {


   
   @WField(aliasName = "book_id",columnName = "book_id")
   private int bookId;

   
   @WField(aliasName = "book_name",columnName = "book_name")
   private String bookName;

   
   @WField(aliasName = "book_desc",columnName = "book_desc")
   private String bookDesc;

   
   @WField(aliasName = "book_price",columnName = "book_price")
   private double bookPrice;

   
   @WField(aliasName = "book_num",columnName = "book_num")
   private int bookNum;

   
   @WField(aliasName = "book_pic",columnName = "book_pic")
   private String bookPic;






   @WFieldToShow("bookId")
   public Object wbookIdFieldToShow(Object ob){
      System.out.println("------------- wbookIdFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("bookId")
   public Object wbookIdFieldToPersistence(Object ob){
      System.out.println("------------- wbookIdFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("bookName")
   public Object wbookNameFieldToShow(Object ob){
      System.out.println("------------- wbookNameFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("bookName")
   public Object wbookNameFieldToPersistence(Object ob){
      System.out.println("------------- wbookNameFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("bookDesc")
   public Object wbookDescFieldToShow(Object ob){
      System.out.println("------------- wbookDescFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("bookDesc")
   public Object wbookDescFieldToPersistence(Object ob){
      System.out.println("------------- wbookDescFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("bookPrice")
   public Object wbookPriceFieldToShow(Object ob){
      System.out.println("------------- wbookPriceFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("bookPrice")
   public Object wbookPriceFieldToPersistence(Object ob){
      System.out.println("------------- wbookPriceFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("bookNum")
   public Object wbookNumFieldToShow(Object ob){
      System.out.println("------------- wbookNumFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("bookNum")
   public Object wbookNumFieldToPersistence(Object ob){
      System.out.println("------------- wbookNumFieldToPersistence ------------- ");
      return ob;
   }


   @WFieldToShow("bookPic")
   public Object wbookPicFieldToShow(Object ob){
      System.out.println("------------- wbookPicFieldToShow ------------- ");
      return ob;
   }

   @WFieldToShow("bookPic")
   public Object wbookPicFieldToPersistence(Object ob){
      System.out.println("------------- wbookPicFieldToPersistence ------------- ");
      return ob;
   }


 
   @WSelectTrigger
   public void selectDataTrigger(WebTableContext ctx){
      System.out.println("------------- selectDataTrigger --------------");
   }

}