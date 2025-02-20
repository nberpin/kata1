
public class TotalPoints {

    public static int points(String[] games) {
        int total=0;
        for (String game: games){
            String[] parts = game.split(":"); // Divide el string en dos partes
            int x = Integer.parseInt(parts[0]); // Convierte la primera parte a entero
            int y = Integer.parseInt(parts[1]); // Convierte la segunda parte a entero
            if (x>y) {
                total+=3;
            } else if (x==y){
                total+=1;
            }

        }
        return total;
    }


}
