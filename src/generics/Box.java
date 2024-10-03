package generics;

class Box<T> {
    T obj;
    public void setObject(T obj){
         this.obj = obj;
    }
    public T getObject() {
        return this.obj;
    }
}

class Main {
    public static void main(String[] args)
    {
        // instance of Integer type
        Box<Integer> iObj = new Box<Integer>();
        iObj.setObject(3);
        System.out.println(iObj.getObject());

        // instance of String type
        Box<String> sObj
                = new Box<String>();
        sObj.setObject("HI");
        System.out.println(sObj.getObject());
    }
}