public class Question2 {

        public static String reverseString(String str){
            char[] ch =str.toCharArray();
            int length = ch.length;
            System.out.println(length);
            StringBuilder rev= new StringBuilder();
            rev.ensureCapacity(length);

            int n = 3;
            do{

                for(int i=n;i>=0;i--){
                    rev.append(ch[i]);
                }
                n=n+4;
            }while (n <= length);


            rev.setLength( length );


            return rev.toString();
        }
        public static void main(String[] args) {
            System.out.println(reverseString("Lorem at"));
        }

}
