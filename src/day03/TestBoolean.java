package day03;

public class TestBoolean {
    public static  void  main(String[] args){
        boolean x= true;
        boolean y = false;
        short z =42;
        if (y=true){
            System.out.println("true");
        }
        //
        if ((z++ ==42)&&(y==true)){
            z++;
        }
        if ((x=false)||(++z==45)){
            z++;
        }
        System.out.println("z="+z);
    }
}
