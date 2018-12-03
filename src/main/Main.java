package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("hey, kid");
        System.out.println(foo());
        
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    
        System.out.println("why doesn't this show on github?");
    }
    
    private static String foo() {
        return "this is updated!";
    }
}