package java8;

public class Java8Intro {

   public void greet(Greeting greeting){
       greeting.perform();
   }

   public static void main(String[] args){
       Java8Intro intro = new Java8Intro();
       Greeting helloGreeting = new HelloGreeting();
       intro.greet(helloGreeting);



   }
}
