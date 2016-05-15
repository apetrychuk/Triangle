import java.util.Scanner;

/**
 * Created by Андрей on 15.05.2016.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setSideA(inputIntValueWithScanner(sc));
        model.setSideB(inputIntValueWithScanner(sc));
        model.setHypotenyse(model.findHypoteyse(model.getSideA(),model.getSideB()));
        if(model.checkExistTriangle(model.getSideA(),model.getSideB(),model.getHypotenyse())){
            view.printMessage(view.THIANGLE_EXIST);
            view.printMessageAndDouble(view.OUT_HYPOTENYSE,model.getHypotenyse());
            model.setHeight(model.findHeight(model.getSideA(),model.getSideB(),model.getHypotenyse()));
            view.printMessageAndDouble(view.OUT_HEIGHT,model.getHeight());
        }else {
            view.printMessage(view.TRIANGLE_NOT_EXIST);
        }


    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA,view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
