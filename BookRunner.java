package com.trimindtech.training.day03;

public class BookRunner {
    public static void main(String[] args) {
        Book java = new Book( "java", 499.0, 400,10, "sun microsystems");
        java.author  = "java author";
        java.cost = 499.0;
        java.noOfPages = 400;
        java.edition = 10;
        java.publisher = "sun microsystems";
       /*   System.out.println(java.author);
          System.out.println(java.cost);
          System.out.println(java.noOfPages);
          System.out.println(java.edition);
          System.out.println(java.publisher);*/
        printBookDetails(java);

       /* Book cpp = new Book();
        cpp.author = "cpp author";
        cpp.cost = 425.0;
        cpp.noOfPages = 355;
        cpp.edition = 9;
        cpp.publisher = "cpp";*/
         /* System.out.println(cpp.author);
          System.out.println(cpp.cost);
          System.out.println(cpp.noOfPages);
          System.out.println(cpp.edition);
          System.out.println(cpp.publisher);*/
       // printBookDetails(cpp);

        /*Book html = new Book();
        html.author = "html author";
        html.cost = 410.0;
        html.noOfPages = 375;
        html.edition = 8;
        html.publisher = "html";*/
          /*System.out.println(html.author);
          System.out.println(html.cost);
          System.out.println(html.noOfPages);
          System.out.println(html.edition);
          System.out.println(html.publisher);*/
       // printBookDetails(html);

    }
    public static void printBookDetails(Book obj){
        System.out.println(obj.author);
        System.out.println(obj.cost);
        System.out.println(obj.noOfPages);
        System.out.println(obj.edition);
        System.out.println(obj.publisher);
    }
}
