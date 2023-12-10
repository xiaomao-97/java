package chapter18.grammar;


// 预览功能，先在暂时了解一下
public class SwitchPatternTest {
    public static void main(String[] args) {
        System.out.println(formatter(12));
        System.out.println(formatterSwitchPattern(12));
    };



    static  String formatter(Object o){
        String formatted = "unknown";
        if (o instanceof  Integer i){
            formatted = "int" + i;

        } else if (o instanceof  Long l) {
            formatted = "long" +l;

        }else if(o instanceof  Double d){
            formatted = "double" + d;
        }else if(o instanceof  String s){
            formatted = "String" + s;
        }
        return formatted;
        };
//
        //JDK17中switch的模式匹配
        static String formatterSwitchPattern(Object o){
            String formatted = switch(o){
                case Integer i:
                    yield "int" + i;
                case Long l:
                    yield "long" +l;
                case Double d:
                    yield "double" +d;
                case String s:
                    yield "String" + s;
                default:
                    yield o.toString();

            };
            return  formatted;
        };
//

}
