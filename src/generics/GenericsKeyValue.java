package generics;

public class GenericsKeyValue<T,V> {
    T key;
    V value;
    public GenericsKeyValue(T key,V value){
            this.key=key;
            this.value=value;
        }
        @Override
        public String toString() {
            return "key:"+key+" value:"+value+"\n";
    }

    public static void main(String[] args) {
        GenericsKeyValue<String,Integer> genericsKeyValue=new GenericsKeyValue<>("Mario",600);
        System.out.println(genericsKeyValue);
        GenericsKeyValue<Integer,String> genericsKeyValue1=new GenericsKeyValue<>(2,"One piece");
        System.out.println(genericsKeyValue1);
    }
}
