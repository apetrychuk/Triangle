/**
 * Created by Андрей on 15.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model(4,5,6);
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
