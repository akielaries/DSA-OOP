public class test{
    public static void main(String[] args){
        System.out.println("Beginning Program...");
    }

    void test(int n){
        if(n>0){
            System.out.println(n);
            test(n-1);
            System.out.println(n);
        }
    } 
}
