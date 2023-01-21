package ch0121;

public class MyListNode1 {
    private String data;       // 자료
    public MyListNode1 next;    // 다음 노드를 가리키는 링크

    public MyListNode1() {
        data = null;
        next = null;
    }

    public MyListNode1(String data) {
        this.data = data;
        this.next = null;
    }

    public MyListNode1(String data, MyListNode1 link) {
        this.data = data;
        this.next = link;
    }

    public String getData() {
        return data;
    }
}
