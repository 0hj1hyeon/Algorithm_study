import java.util.Stack;


public class A_Stack {
    public static void main(String[] args){

        Stack<People> member = new Stack<>();
        People a = new People(173,64);
        People b = new People(172,65);
        member.push(a);
        member.push(b);
        boolean isEmpty = member.empty();
        System.out.println("Is stack empty? " + isEmpty);

        // 스택의 맨 위에 있는 요소 확인 (제거하지 않음)
        People topPerson = member.peek();
        System.out.println("Top person in stack: Height = " + topPerson.height + ", Weight = " + topPerson.weight);

        // 스택에서 요소 제거하고 반환
        People poppedPerson = member.pop();
        System.out.println("Popped person: Height = " + poppedPerson.height + ", Weight = " + poppedPerson.weight);

        // 다시 스택의 맨 위에 있는 요소 확인 (제거하지 않음)
        People newTopPerson = member.peek();
        System.out.println("New top person in stack: Height = " + newTopPerson.height + ", Weight = " + newTopPerson.weight);
    }



}
