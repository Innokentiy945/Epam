public class Example1 {
    public static void main(String[] args) {

        Operationable operation;
        operation = (x,y)->x+y;

        int result = operation.calculate(10, 20);
        System.out.println(result);

        Operationable1 operation1;
        operation1 = (x, y) -> {
            if (x.length()>y.length()){
                return y;
            }
            else {
                return y;
            }
        };

        String result1 = operation1.compare("dddddd", "ddddddddddddddd");
        System.out.println(result1);
    }
}


interface Operationable{
    int calculate(int x, int y);
}

interface Operationable1{
    String compare(String x, String y);
}



