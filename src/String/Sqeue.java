package String;

import java.util.LinkedList;

public class Sqeue {
   private LinkedList link;
   Sqeue()
   {
	   link=new LinkedList();
   }
   public void add(Object obj)
   {
	   link.addFirst(obj);
   }
   public Object get()
   {
	   return link.removeLast();
   }
   public boolean isEmpty()
   {
	   return link.isEmpty();
   }
}
