public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        p.push(10);
        p.push(20);
        p.push(30);
        System.out.println(p.pop()); // 30
        System.out.println(p.pop()); // 20
        System.out.println(p.isEmpty()); // false
        System.out.println(p.pop()); // 10
        System.out.println(p.isEmpty()); // true
    }
}
