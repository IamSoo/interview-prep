package generics;

public class GenericTypes<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t){
        this.t = t;
    }

}
