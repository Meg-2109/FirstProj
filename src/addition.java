import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class addition {

    public static void main(String[] args){

    }




    public int add(int a, int b){
        int c = a+b;
        System.out.println("Sum " + c);
        return c;
    }

  
    @Test
    public void Test1()
    {
        addition a = new addition();
        int c = a.add(5,6);


        Assert.assertEquals(11, c);
    }

    @Test
    public void Test2()
    {
        addition a = new addition();
        int c = a.add(5,6);

        Assert.assertEquals(10, c);
    }
}
