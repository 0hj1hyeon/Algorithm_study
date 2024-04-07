import java.util.LinkedList;




public class A_LinkedList {
    public static void main(String[] args) {
        // LinkedList 객체 생성
        LinkedList<People> memberList = new LinkedList<>();

        // People 객체 생성
        People a = new People(173, 64);
        People b = new People(172, 65);

        // LinkedList에 객체 추가 (add 메서드 사용)
        memberList.add(a);
        memberList.add(b);

        // LinkedList의 크기 확인
        int listSize = memberList.size();
        System.out.println("LinkedList size: " + listSize);

        // LinkedList에서 객체 제거 (remove 메서드 사용)
        memberList.remove(a);

        // 다시 LinkedList의 크기 확인
        listSize = memberList.size();
        System.out.println("New LinkedList size: " + listSize);

        // LinkedList의 맨 앞에 있는 객체 확인 (getFirst 메서드 사용)
        People firstPerson = memberList.getFirst();
        System.out.println("First person in LinkedList: Height = " + firstPerson.height + ", Weight = " + firstPerson.weight);
    }
}


/*
add(E e): 리스트의 끝에 요소를 추가합니다.
addFirst(E e): 리스트의 맨 앞에 요소를 추가합니다.
addLast(E e): 리스트의 끝에 요소를 추가합니다. (add 메서드와 동일)
remove(): 리스트의 첫 번째 요소를 제거하고 반환합니다.
remove(int index): 지정된 인덱스에 있는 요소를 제거합니다.
remove(Object o): 지정된 요소를 제거합니다.
getFirst(): 리스트의 첫 번째 요소를 반환합니다.
getLast(): 리스트의 마지막 요소를 반환합니다.
peek(): 리스트의 첫 번째 요소를 반환합니다. (제거하지 않음)
poll(): 리스트의 첫 번째 요소를 제거하고 반환합니다.
size(): 리스트의 크기를 반환합니다.
isEmpty(): 리스트가 비어 있는지 확인합니다.
* */