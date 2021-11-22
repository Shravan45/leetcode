import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
  public int romanToInt(String s) {
    char[] ch = s.toCharArray();
    List<String> list = new ArrayList<>();
    for(char c : ch){
      list.add(String.valueOf(c));
    }

    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int result = 0;
    for(int i = 0; i < s.length() -1 ; i++){
      int current = map.get(s.charAt(i));
      int next = map.get(s.charAt(i+1));
      if(current < next){
        result += current * -1;
      } else {
        result += current;
      }
    }
    result += map.get(s.charAt(s.length() - 1));
    return result;
  }
}

