package passByValue;

public class passByValueTest {
	public static void main(String[] args) 
    { 
        int temp = 7; 
        change(temp); 
        System.out.println(temp); 
    } 
    public static void change(int temp) 
    { 
        temp = 456; 
    } 
}
