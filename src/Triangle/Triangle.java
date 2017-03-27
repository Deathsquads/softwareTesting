package Triangle;
/*
 * Created by admin on 2017/3/10.
 */
public class Triangle {
    public String T(double a,double b,double c){
        double tem = Math.max(a, b);
        if(tem>c){
            if(tem==a){
                a = c;
            }else {
                b = c;
            }
            c = tem;
        }
        if(!(a+b>c&&Math.abs(a-b)<c)){
            return "无法构成三角形";
        }else if(a==b||a==c||b==c){
            if (a==b && b==c)
                return "等边三角形";
            else return "等腰三角形";
        }else if(a*a+b*b==c*c){
            return "直角三角形";
        }else if(a*a+b*b<c*c){
            return "锐角三角形";
        }else return "钝角三角形";
    }
}
