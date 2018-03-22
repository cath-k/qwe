
package javaapplication1;

/**
 this is Kate's playground!!!
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        { System.out.println("Hello world from Kate!");
        }
        // 20ˣ⅓+158²=24964+6.67
        {
        double a,b,c,j;
        double Double;
        a=20;
        b=1;
        j=3;
        c=158;
        Double=(a*(b/j))+(c*c);
        System.out.println(Double);
        }
        //14/209+14ˣ(29-13²+14/3)
        {
        double a,s,d,f,g,h;
        double res;
        a=14;
        s=209;
        d=29;
        f=13;
        h=3;
        res=(a/s)+(a*(d-(f*f)+(a/h)));
        System.out.println(res);
    }
        /**В переменной n хранится двузначное число. 
         * Создайте программу, вычисляющую и выводящую 
         * на экран сумму цифр n.
         * */
        {
            int n,q,w,s;
          for(n=10; n<100; n++) {
          System.out.print("Сумма цифр числа " +n);
            q=n/10;
            w=n%10;
            s=q+w;
          System.out.print(" равна " + s);
         System.out.println("."); 
         
          }
            }
        {int n,q,w,e,s;
          for(n=100; n<1000; n++) {
          System.out.print("Сумма цифр числа " +n);
            q=n/100;
            w=(n%100)/10;
            e=(n%100)%10;
            s=q+w+e;
          System.out.print(" равна " + s);
         System.out.println("."); 
        }
        }
        {
 /**В переменных q и w хранятся два натуральных числа. Создайте программу, 
  * выводящую на экран результат деления q на w с остатком. 
  * Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
21 / 8 = 2 и 5 в остатке
*/
            {int q=21, w=8;{
                System.out.print(q);
                System.out.print(" / " + w);
                System.out.print(" равнo " + q/w);
                System.out.print(" и " + q%w);
                System.out.println(" в остатке.");
            }
 /**В переменной n хранится вещественное число с ненулевой дробной частью. 
  * Создайте программу, округляющую число n до ближайшего целого 
  * и выводящую результат на экран.
*/
            {double r;
            r=21.5;
            {
               System.out.println((int)r);
            } 
            }
            /**Вычислить и вывести на экран 
             * косинусы углов в 60, 45 и 40 градусов 
             * без использования функции Math.toDegrees(n).
*/
            {
               System.out.println(Math.cos(Math.toRadians(40)));
               System.out.println(Math.cos(Math.toRadians(45)));
               System.out.println(Math.cos(Math.toRadians(60)));
            }  
/**В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 * Вычислить и вывести на экран площадь треугольника и его периметр.
 * */
         {double a,b,c,d;
         d=90;
         a=7;
         b= 6;
         System.out.print("Площадь треугольника равна ");
         System.out.println((a*b*Math.sin(Math.toRadians(d)))/2);
         System.out.print("Периметр треугольника равен ");
         System.out.println(Math.sqrt((a*a)+(b*b))+a+b);
 
            }
            }   
            }
            }
        }
            
          
   
    

