package CodeTest;

public class _GenericPrac_StringbufferBuilder {
	public static void main(String[] ar) {
        Generic<Integer, Integer> gs = new Generic<Integer, Integer>();
        // 이번에 새로 추가한 부분 1
        Generic<String, String> gs2 = new Generic<String, String>();
        
        gs.setParam1(10);
        gs.setParam2(20);
        // 이번에 새로 추가한 부분 2
        gs2.setParam1("고구마");
        gs2.setParam2("감자");
        
        System.out.println(gs.printParamNum(gs.getParam1(), gs.getParam2()));
        // 이번에 새로 추가한 부분 3
        System.out.println("gs2"+gs2.printParamNum(gs2.getParam1(), gs2.getParam2()));
    }
}
class Generic<T, K> {
    private T param1;
    private K param2;
    

 
    public T getParam1() {
		return param1;
	}
	public void setParam1(T param1) {
		this.param1 = param1;
	}
	public K getParam2() {
		return param2;
	}
	public void setParam2(K param2) {
		this.param2 = param2;
	}
	public <T> StringBuffer printParamNum(T param1, T param2) {
		//stringbuffer, Stringbuilder
        StringBuffer str = new StringBuffer();
        StringBuilder str3 = new StringBuilder();
        String [] str2 = new String[4];
        for(int i=0; i<4; i++) {
        	str2[i] = "2";
        	System.out.print("array" + str2[i]);
        }
        System.out.println();
        
        str.append("첫 번째 매개변수 : ");
        str.append(param1);
        str.append(", 두 번째 매개변수 : ");
        str.append(param2);
        str3.append("a");
        str3.append("c");
        str3.append("n");
        str3.append("v");
        str3.append("b");
        System.out.println("stringbuilder = "+str3);
        return str;
    }
    public <T> StringBuffer printParamNum2(K param1, K param2) {
        StringBuffer str = new StringBuffer();
        str.append("첫 번째 매개변수 : ");
        str.append(param1);
        str.append(", 두 번째 매개변수 : ");
        str.append(param2);
        return str;
    }
}
