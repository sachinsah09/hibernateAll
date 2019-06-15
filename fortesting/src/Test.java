    import java.util.*;  
    import java.util.stream.Collectors;  
    
    interface Product{  
        
    	void add();
    
    }
    
    
    public class Test {  
        public static void main(String[] args) {  

     List<String>list=new ArrayList<String>();
     list.add("sachin");
     list.add("subh");
     list.add("parth");
     
     list.stream().filter(e -> (!e.startsWith("s"))).forEach((n)->System.out.println(n));
        
        }  
    }