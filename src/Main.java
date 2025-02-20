public class Main {
    public static void main(String[] args) {
        String[] games={"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};

        int total= TotalPoints.points(games);
        System.out.println(total);

    }
}