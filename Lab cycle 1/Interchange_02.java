class Interchange_02 {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Before interchange a = "+a+" b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After interchange a = "+a+" b = "+b);
    }
}