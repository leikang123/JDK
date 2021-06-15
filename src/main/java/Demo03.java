import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class Demo03 {
	public static void main(String[] args) {
		Jedis js=new Jedis("localHost");
		System.out.println("连接成功");
		// 存储数据到列表中
		js.lpush("site-list","liehdg");
		js.lpush("site-list","baidu");
		js.lpush("site-list","tianmao");
		Set<String> keys = js.keys("*"); 
        Iterator<String> it=keys.iterator() ;   
        while(it.hasNext()){   
            String key = it.next();   
            System.out.println(key);   
		}
	}

}
