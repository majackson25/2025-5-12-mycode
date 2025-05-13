public class Activities {

    static String sports() {
        return "basketball";
    }

    public String movies() {
        return "spiderman";
    }

    public static void main(String[] args) {
        System.out.println("Favorite sport: " + sports());

        Activities activities = new Activities();
        System.out.println("Favorite movie: " + activities.movies());
        
    }
}
