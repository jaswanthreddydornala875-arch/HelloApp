public class HelloApp{
    public static void main(String[]args){
        // here yourname is taken in args array with index 0
        //and it is taken when you pass java filename Name in command/terminal.
        String name = args[0];
        System.out.println("Hello, "+ name +"!");
    }
}