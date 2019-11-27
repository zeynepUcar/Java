public class Array {
    public static void main(String[] args) {
        //the task is to find and print out the minimum & maximum element

                  // 0   1   2   3  4

        int[] xyz = {2, 11, 45, 9, 56};
        //int[] xyz = new int[3] gave the size
//        xyz[0]=2;
//        xyz[1]=11;
//        xyz[2]=45;
//        xyz[3]=9;
//        xyz[4]=56;
        //i starts with 0 as array index starts with 0 too
        int max = xyz[0];  // int min = 0; is not equal that one
        int min = xyz[0];  // doesnt matter which number choose from array


        for(int i = 0; i< xyz.length; i++){
//            for(int i : xyz){        //it is same
//                System.out.println(i);

           // System.out.println(xyz[i]); // it reads every element

            if(xyz[i] > max)
                max = xyz[i];
            else if (xyz[i] < min)
                min= xyz[i];
        }

        System.out.println("Largest Number is : " + max);
        System.out.println("Smallest Number is : " + min);
    }


}

