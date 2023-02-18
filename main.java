// 1 . Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class main {
    public static void main (String[] args) {
        Map<String, String> s1 = new HashMap<>();
        s1.put("name","Ivanov");
        s1.put("country","Russia");
        s1.put("city","Moscow");
        s1.put("age",null);
        System.out.println(str_res(s1));
    }
    public static String str_res(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> mapstr : params.entrySet())
        { 
            if (mapstr.getValue() != null)
            {
                s.append(mapstr.getKey() +" = '" + mapstr.getValue()+ "'     ");
            }
        }
        return s.toString();
    }

}
