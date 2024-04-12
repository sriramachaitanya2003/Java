// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class factorial {
    public static int factorial1(int a){
        int f = 1;
        for(int i = 1; i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial1(7));
    }
}