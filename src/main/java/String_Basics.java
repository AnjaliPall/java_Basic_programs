
public class String_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1= "Hemlo pemlo temlo";
        String str2 = "Hello pello Tello";
        
        String str3= str1 + str2;
        System.out.println(str3);
        
        String str4 = str1.concat(str2);
        System.out.println(str4);
        
        int num1 = 100;
        System.out.println(str1 + num1);  // even if one is string the also + acts as concate operator
        
        System.out.println(str1.length());
        
        String str5 = "  jhdhfJJKehf HYTYoiois shuuisLLKIUDFSZdcrwk   ";
        System.out.println(str5.trim());
        System.out.println(str5.trim().toLowerCase());
        System.out.println(str5.trim().toUpperCase());
        
        String str6= "";
        System.out.println(str6.isEmpty());
        System.out.println(str1.isEmpty());
	}

}
