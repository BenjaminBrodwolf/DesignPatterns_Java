package command;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CommandMain {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light(false);
        LightOnCommand lightOn = new LightOnCommand(light);
        System.out.println("Light initialised with status: " + light.getStatus());

        GarageGate garageGate = new GarageGate(false, light);
        GarageGateOpenCommand gateOpen = new GarageGateOpenCommand(garageGate);
        System.out.println("Garage gate initialised with status: " + garageGate.getState());

        remote.setCommand(lightOn);
        remote.buttonPressed();
        System.out.println("Light status is: " + light.getStatusAsString());
        remote.setCommand(gateOpen);
        remote.buttonPressed();
        System.out.println(garageGate.getState());
        //launch(args);
    }

//    @Override
//    public void start(Stage stage) throws Exception {
//        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent e)
//            {
//                l.setText("button selected    ");
//            }
//        };
//
//        Label label = new Label("Hello World");
//        Button on1 = new Button("Licht an");
//        on1.setOnAction();
//        label.setAlignment(Pos.CENTER);
//        stage.setScene(new Scene(label, 300, 250));
//        stage.setTitle("Hello World Application");
//        stage.show();
//    }
}
