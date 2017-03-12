package Triangle;

import com.sun.org.apache.xpath.internal.operations.Bool;

/*
 * Created by admin on 2017/3/10.
 */
public class Triangle {
    public boolean IsAEquilateral(int a,int b,int c)
    {
        boolean IsAEquilateral = true;
        if((a+b>c)&&(b+c>a)&&(a+c>b)&&(a==b||a==c||b==c)){
            return IsAEquilateral;
        }
        else{
            IsAEquilateral = false;
            return IsAEquilateral;
        }
    }
}
