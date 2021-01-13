import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/10/26 14:19
 **/
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);

//        Stream<Integer> streamA = list.stream();

//        // 对每一个元素进行打印输出
//        streamA.forEach((String s) -> {
//            System.out.println(s);
//        });

//        list.stream().forEach(s -> System.out.println(s));

        list.stream().forEach(System.out::println);
    }
    public static void main3( String[] args ) {
        Set<String> set = new HashSet<>();
        set.add("5");
        set.add("3");
        set.add("1");
        set.add("4");
        set.add("5");
        System.out.println(set.toString());
        //这里后续用有序的list处理即可，因为流中进行了倒序处理，收集成set后会重排
        List<String> collect = set.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(collect);


    }
    public static void main2(String[] args) {
        LocalDateTime now = LocalDateTime.of(2020,12,4,9,12,5,8);
        System.out.println("计算两个时间的差：");
        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(now,end);
        long days = duration.toDays(); //相差的天数
        long hours = duration.toHours();//相差的小时数
        long minutes = duration.toMinutes();//相差的分钟数
        long millis = duration.toMillis();//相差毫秒数
        long nanos = duration.toNanos();//相差的纳秒数
        System.out.println(now);
        System.out.println(end);
        System.out.println("发送短信耗时【 "+days+"天："+hours+" 小时："+minutes+" 分钟："+millis+" 毫秒："+nanos+" 纳秒】");
    }
    public static void main1(String[] args) {

        for(int i = 0 ; i < 30;i++){
            StringBuffer sb = new StringBuffer();
            String s  = "";
            int j = new Random().nextInt(8)+1;
            int k = new Random().nextInt(8)+1;
            int l = new Random().nextInt(30)+1;
            if(i<10){
                s+="0"+i;
            }else{
                s+=i+"";
            }
            sb
                    .append("20160"+j+"0"+k).append(",")
                    .append(s).append(",")
                    .append("霾").append(",")
                    .append((int)(Math.random()*1024+1016)+"").append(",")
                    .append((int)(Math.random()*90+60)+"").append(",")
                    .append(l+"").append(",")
                    .append((int)(Math.random()*100+300)+"").append(",")
                    .append((int)(Math.random()*100+300)+"").append(",")
                    .append((int)(Math.random()*10+300)+"");
            System.out.println(sb.toString());
        }
    }

    public static void main0(String[] args) {
        String str = "";
        // 以 , 号为分隔符来分隔字符串
        StringTokenizer st=new StringTokenizer(str);
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }


}
