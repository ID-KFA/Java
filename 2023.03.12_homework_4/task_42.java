
// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;
public class task_42 {

    public static Object enqueue (LinkedList<Object> list, Object element) {
      
            list.add(list.size(), element);
            return list;
        }
    
        
    public static void dequeue (LinkedList<Object> list) {
        System.out.println(list.get(0));
        list.remove(list.get(0));
      
        } 
    public static void first (LinkedList<Object> list) {
            System.out.println(list.get(0));
    }

    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<Object>();
       
        enqueue(list,345);
        enqueue(list,732);
        enqueue(list,"Hi");
        enqueue(list,"people");
        System.out.println(list);
        dequeue(list);
        System.out.println(list);   
        first(list);
        System.out.println(list);
      
   

    }

}
    

