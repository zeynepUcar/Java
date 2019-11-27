public class Task3 {
    public static void main(String[] args) {
        // Create 2D array
        // in first row put names
        // in second row put surnames
        String str1 [][] = { // 0      1        2  column  , second one is column
                             {"Ali", "Veli", "Ayse" },  //0. row, first write row

                           {"Yasar", "Sorar", "Gorur" }   // 1. row
        };
        System.out.println("length is " + str1.length);
        System.out.println(str1[0][1] + " " + str1[1][1]);


//        System.out.println(arr[0][0] + " " + arr[1][0]);
//        System.out.println(arr[0][1] + " " + arr[1][1]);
//        System.out.println(arr[0][2] + " " + arr[1][2]);
//        System.out.println(arr[0][3] + " " + arr[1][3]);

        for (int a = 0; a <= str1.length; a++){
            System.out.println(str1[0][a] + " " + str1 [1][a]); // alt alta yazdigimizda ikinci[] rakam degisiyor
                                                          //ve bu kismi a yi veirsek degisen rakamlarla sonucu alacagiz
        }
    }
}
