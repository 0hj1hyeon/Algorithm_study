import java.util.LinkedList;
import java.util.Queue;
public class A_queue {
    public static void main(String[] args){
        Queue<People> memberQueue = new LinkedList<>();

        // People 객체 생성
        People a = new People(173, 64);
        People b = new People(172, 65);

        // Queue에 객체 추가 (offer 메서드 사용)
        memberQueue.offer(a);
        memberQueue.offer(b);

        // Queue의 크기 확인
        int queueSize = memberQueue.size();
        System.out.println("Queue size: " + queueSize);

        // Queue에서 객체 제거하고 반환 (poll 메서드 사용)
        People removedPerson = memberQueue.poll();
        System.out.println("Removed person: Height = " + removedPerson.height + ", Weight = " + removedPerson.weight);

        // 다시 Queue의 크기 확인
        queueSize = memberQueue.size();
        System.out.println("New queue size: " + queueSize);

        // Queue의 맨 앞에 있는 객체 확인 (peek 메서드 사용, 제거하지 않음)
        People frontPerson = memberQueue.peek();
        System.out.println("Front person in queue: Height = " + frontPerson.height + ", Weight = " + frontPerson.weight);

    }
}
/*
*
offer(E e): 큐에 요소를 추가합니다. 성공적으로 추가되면 true를 반환하고, 큐가 용량 제한이 있는 경우에 요소를 추가할 수 없으면 false를 반환합니다.
poll(): 큐의 맨 앞에 있는 요소를 제거하고 반환합니다. 큐가 비어있으면 null을 반환합니다.
peek(): 큐의 맨 앞에 있는 요소를 반환합니다. 큐가 비어있으면 null을 반환합니다. (제거하지 않음)
remove(): 큐의 맨 앞에 있는 요소를 제거하고 반환합니다. 큐가 비어있으면 NoSuchElementException이 발생합니다.
element(): 큐의 맨 앞에 있는 요소를 반환합니다. 큐가 비어있으면 NoSuchElementException이 발생합니다. (제거하지 않음)
size(): 큐의 크기를 반환합니다.
isEmpty(): 큐가 비어 있는지 확인합니다
* */