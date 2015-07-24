import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/*分析https://github.com/zhutao2015/intern-test/blob/master/test2/src.txt文章中最高权重的10个单词并输出
说明：
1. 单词总权重=出现次数*单词权重

2. 如下的单词权重为0.2, [am, is, are, was, been, has, have, had, a, an, the, in, at, on, to, or]

3. 2以外的单词权重为1
*/
public class TestDemo2{
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("src.txt");
		BufferedReader br = new BufferedReader(reader);
		Map<String,Integer>map = new HashMap<String,Integer>();
		Map<String,Double>m = new HashMap<String,Double>();
		String s;
		String c;
		while(true){
			s = br.readLine();
			if (s == null){
				break;
			}
			//System.out.println(s);
			String[] str = s.split(" ");
			//求出每个单词出现的次数
			for(int i=0;i<str.length;i++){
				c = str[i];
				Integer count = map.get(c);
				map.put(c, count ==null ?1:count+1);
				//计算权重
				m = getCount(map);
				//排序
				sort(m);
			}
		}
	}

	public static void sort(Map<String, Double> m) {
		int j=0;
		//Map<String,String> haha=new HashMap<String,String>();
	     List<String> order=new ArrayList<String>();
	     order.addAll(m.keySet());
	     Collections.sort(order);
	     Set entries = m.entrySet();
	     Iterator it = null;
	     if (entries != null){
	    	 it = entries.iterator();
	    	 for(int k=1; it.hasNext();k++){
	    		 Map.Entry entry = (Map.Entry) it.next();
	    		 String key = (String)entry.getKey(); 
	    		 if(k<10)
	    			 System.out.println("key:" + key);
	    	 }
	     }		
	}

	public static Map<String, Double> getCount(Map<String, Integer> map) {
		Map<String, Double> maps = new HashMap<String,Double>();
		double value;
		String[] weight = {"am", "is", "are", "was", "been", "has", "have", "had", "a", "an", "the", "in", "at", "on", "to", "or"};
		Set<Map.Entry<String, Integer>> entryseSet=map.entrySet();
		for (Map.Entry<String, Integer> entry:entryseSet) {
			for(int i = 0;i<weight.length;i++){
				if(weight[i].equals(entry.getKey())){
					value = entry.getValue().intValue() * 0.2;
				}
			}
			value = entry.getValue();
			maps.put(entry.getKey(), value);
		}
		return maps;
	}
}

