public class Main {
    static boolean isPalindromik(String str){
        String reverse = "";

        for(int i = str.length()-1; i >=0 ; i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);

    }

    public static void main(String[] args){

        if(isPalindromik("akj")){
            System.out.println("Palindromik kelime");
        }else{
            System.out.println("Palindromik kelime değil");
        }
    }
}
