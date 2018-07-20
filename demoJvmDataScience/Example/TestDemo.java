// TestDemo.java
public class TestDemo {
    public static void main(String[] args) {
        QuestScale q = new QuestScale(1,1,1,1);
        WeightScale weight = new WeightScale(0.5, 0.8, 1, 0.2, 500);

        //Analytics analy = new Analytics();
        Double result = Analytics$.MODULE$.fScale(weight, q);
        System.out.println( result );
    }
}