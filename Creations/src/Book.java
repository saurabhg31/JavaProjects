/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh
 */
public class Book {
class Library{
String Title,Author,Subject;
int Edition;
float Price;
public Library(){
    this.Title="";
    this.Author="";
    this.Subject="";
    this.Edition=0;
    this.Price=0;
}
public Library(String Title,String Author,String Subject,int Edition,float Price){
    this.Title=Title;
    this.Author=Author;
    this.Edition=Edition;
    this.Price=Price;
    this.Subject=Subject;
}
void display(){
    System.out.println("Title :"+Title);
    System.out.println("Author :"+Author);
    System.out.println("Subject :"+Subject);
    System.out.println("Edition :"+Edition);
    System.out.println("Price :"+Price);
}
}
}

