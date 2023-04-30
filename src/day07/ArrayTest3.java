package day07;

public class ArrayTest3 {
    public static void main(String[] args) {
        int [] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i =0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
        array2 = new int[array1.length];
        for (int i =0;i<array2.length;i++){
            array2[i] = array1[i];
        }
        for (int i=0;i<array2.length;i++){
            if (i % 2==0){
                array2[i] = i;
            }
        }
        System.out.println();
        for (int i =0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }

        // 线性查找
        String[] arr = new  String[]{"JJ","DD","MM","BB","GG","AA"};
        String dest = "CC";
        boolean isFlag = true;
        for (int i = 0;i< arr.length;i++){
            if(dest.equals(arr[i])){
                System.out.println("找到了指定的元素，位置为："+i);
                isFlag = false;
            }
        }
        if(isFlag){
            System.out.println("很遗憾，没有找到哦");
        }
        //二分法查找
        int[] arr2 = new int[]{98,-34,2,34,54,66,79,105,210,333};
        int dest1 = -34;
        int head =0;     //初始索引
        int end = arr2.length -1;  //终止索引
        boolean isFlag1 = true;
        while(head<=end){
            int middle = (head+end)/2;
            if(dest1 == arr2[middle]){
                isFlag1 = false;
                System.out.println("找到了指定元素，位置为："+middle);
                break;
            }else if(arr2[middle]>dest1){
                end = middle -1;
            }else{
                head = middle+1;
            }
        }
        if(isFlag1){
            System.out.println("很遗憾，没有找到");
        }


    }
}
