import java.util.ArrayList;
class Wrapper
{
    public static void main(String args[])
    {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(2);
        nums.add(3);
        System.out.println(nums.get(0));
        System.out.println(nums);
        
        
        Integer agee= Integer.parseInt("23");
        int age=agee;
        System.out.println(age);//it is priniting primitve data
        
        
        Integer marks = Integer.parseInt("99");
        System.out.println(marks); //it is priting an obkect of interger class 
    }
}