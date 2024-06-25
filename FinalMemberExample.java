public class FinalMemberExample
{
    private final int instanceVar;
    public static final int  STATIC_VAR=100;
    public FinalMemberExample(int value)
    {
        this.instanceVar=value;

    } 
    public final void displayValues()
    {
        System.out.println("instance Variable:"+instanceVar);
        System.out.println("static variable:"+STATIC_VAR);
    }
    public static void main(String[] args)
    {
        FinalMemberExample example=new FinalMemberExample(42);
        example.displayValues();
    }
}