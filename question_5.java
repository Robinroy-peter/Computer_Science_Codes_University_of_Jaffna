import java.util.*;
public class question_5{
	public static void main(String args[]){

		Stack s = new Stack(10);
		s.Push("happy");
		s.Push("sad");
		String st = s.peek();
		s.Push("numb");
		s.Push(st+"dle");
		s.Pop();
		st =s.Pop();
		s.Push(st);
		System.out.println(s.peek());
	}
}
