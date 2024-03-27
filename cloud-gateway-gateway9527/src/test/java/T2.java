import java.time.ZonedDateTime;

/**
 * @author: SL
 * @create 2020-12-21 15:50
 */
public class T2
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

       //2020-12-21T15:51:37.485+08:00[Asia/Shanghai]
    }
}
