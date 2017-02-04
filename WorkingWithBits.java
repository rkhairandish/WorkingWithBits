package workingwithbits;
public class WorkingWithBits {
    public static void main(String[] args) {
        
        //combined flag status of 00110101
        int fs = 53;
        
        //Lines to retrieve the total status of each flag
        System.out.println("Flag 1: " + (( (fs&1)>0) ? "ON" : "OFF"));
        System.out.println("Flag 2: " + (( (fs&2)>0) ? "ON" : "OFF"));
        System.out.println("Flag 3: " + (( (fs&4)>0) ? "ON" : "OFF"));
        System.out.println("Flag 4: " + (( (fs&8)>0) ? "ON" : "OFF"));
        System.out.println("Flag 5: " + (( (fs&16)>0) ? "ON" : "OFF"));
        System.out.println("Flag 6: " + (( (fs&32)>0) ? "ON" : "OFF"));
        System.out.println("Flag 7: " + (( (fs&64)>0) ? "ON" : "OFF"));
        System.out.println("Flag 8: " + (( (fs&128)>0) ? "ON" : "OFF"));
    }
}
