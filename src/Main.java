import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args); 
    }

    @Override
    public void start(Stage stage) throws Exception { 

        //text labels for each planet's name
        Text name1 = new Text();
        Text name2 = new Text();
        Text name3 = new Text();
        Text name4 = new Text();
        Text name5 = new Text();
        Text name6 = new Text();
        Text name7 = new Text();
        Text name8 = new Text();
        Text name9 = new Text();
        
        //root group to hold all elements in the scene
        Group root = new Group();
        
        //a scene with a black background (it's night mode)
        Scene scene = new Scene(root, 1000, 1000, Color.BLACK);
        
        
        stage.setResizable(false); // Disable resizing of the window
        stage.setTitle("SOLAR SYSTEM"); 
        Image icon = new Image("icon.png"); // (ensure 'icon.png' is in your resources otherwise add the path)
        stage.getIcons().add(icon); 

        // Generate random stars in the background and add them to the root
 
        for (int i = 0; i < 100; i++) {
        Circle star = new Circle(Math.random() * 1000, Math.random() * 1000, 1.5);
        star.setFill(Color.WHITE);
        root.getChildren().add(0, star);
        }

    
        //Sun
        Circle sun = new Circle();
        name1.setText("SUN");
        name1.setX(488);
        name1.setY(435);
        name1.setFont(Font.font("VERDANA", 10)); 
        name1.setFill(Color.WHITE); 
        sun.setCenterX(500); 
        sun.setCenterY(500); 
        sun.setRadius(55); 
        sun.setFill(Color.YELLOW); 
        sun.setStroke(Color.BLACK); 
        sun.setStrokeWidth(0.1); 

        // Create orbits for the planets
        for (int i = 1; i <= 9; i++) {
            Circle orbit = new Circle();
            orbit.setCenterX(500); 
            orbit.setCenterY(500); 
            orbit.setRadius(sun.getRadius() * i); // Set the radius of each orbit
            orbit.setFill(Color.TRANSPARENT); 
            orbit.setStrokeWidth(0.7); 
            orbit.setStroke(Color.WHITE); 
            root.getChildren().add(orbit); 
        }

        //Mercury (planet in the 1 orbit)
        Circle mercury = new Circle();
        name2.setText("MERCURY");
        name2.setX(380);
        name2.setY(570);
        name2.setFont(Font.font("VERDANA", 10));
        name2.setFill(Color.WHITE); 
        mercury.setCenterX(400); 
        mercury.setCenterY(530); 
        mercury.setRadius(13); 
        mercury.setFill(Color.DARKGRAY); 

        // Venus (planet in the 2th orbit) 
        Circle venus = new Circle();
        name3.setText("VENUS");
        name3.setX(610);
        name3.setY(430);
        name3.setFont(Font.font("VERDANA", 10));
        name3.setFill(Color.WHITE);
        venus.setCenterX(625);
        venus.setCenterY(400);
        venus.setRadius(17);
        venus.setFill(Color.LIGHTYELLOW); 

        //Earth (planet in the 3th orbit) 
        Circle earth = new Circle();
        name4.setText("EARTH");
        name4.setX(380);
        name4.setY(330);
        name4.setFont(Font.font("VERDANA", 10));
        name4.setFill(Color.WHITE);
        earth.setCenterX(400);
        earth.setCenterY(300);
        earth.setRadius(18.5); 
        earth.setFill(Color.GREEN); 


        //Mars (planet in the 4th orbit) 
        Circle mars = new Circle();
        name5.setText("MARS");
        name5.setX(685);
        name5.setY(720);
        name5.setFont(Font.font("VERDANA", 10));
        name5.setFill(Color.WHITE);
        mars.setCenterX(700);
        mars.setCenterY(690);
        mars.setRadius(14.5);
        mars.setFill(Color.ORANGERED); 

        //Jupiter (planet in the 5th orbit)
        Circle jupiter = new Circle();
        name6.setText("JUPITER");
        name6.setX(150);
        name6.setY(550);
        name6.setFont(Font.font("VERDANA", 10));
        name6.setFill(Color.WHITE);
        jupiter.setCenterX(170);
        jupiter.setCenterY(500);
        jupiter.setRadius(37.5); 
        jupiter.setFill(Color.BROWN); 

        //Saturn (planet in the 6th orbit) 
        Circle saturn = new Circle();
        name7.setText("SATURN");
        name7.setX(615);
        name7.setY(110);
        name7.setFont(Font.font("VERDANA", 10));
        name7.setFill(Color.WHITE);
        saturn.setCenterX(580);
        saturn.setCenterY(130);
        saturn.setRadius(35);
        saturn.setFill(Color.ORANGE); 
        
    
        //SaturnRings
        Ellipse saturnRings = new Ellipse();
        saturnRings.setCenterX(580);
        saturnRings.setCenterY(130);
        saturnRings.setRadiusX(50);
        saturnRings.setRadiusY(20); 
        saturnRings.setFill(Color.TRANSPARENT);
        saturnRings.setStroke(Color.LIGHTGRAY);
        saturnRings.setStrokeWidth(1.5);



        //Uranus (planet in the 7th orbit) 
        Circle uranus = new Circle();
        name8.setText("URANUS");
        name8.setX(480);
        name8.setY(975);
        name8.setFont(Font.font("VERDANA", 10));
        name8.setFill(Color.WHITE);
        uranus.setCenterX(500);
        uranus.setCenterY(935);
        uranus.setRadius(28);
        uranus.setFill(Color.TURQUOISE); 

        //Neptune (planet in the 8th orbit)
        Circle neptune = new Circle();
        name9.setText("NEPTUNE");
        name9.setX(60);
        name9.setY(820);
        name9.setFont(Font.font("VERDANA", 10));
        name9.setFill(Color.WHITE);
        neptune.setCenterX(90);
        neptune.setCenterY(780);
        neptune.setRadius(26);
        neptune.setFill(Color.BLUE); 

        // Add all planets to the scene
        root.getChildren().addAll(sun, venus, mars, mercury, earth, jupiter, saturn,saturnRings, uranus, neptune);

        // Add planet names to the scene
        root.getChildren().addAll(name1, name2, name3, name4, name5, name6, name7, name8, name9);

        
        stage.setScene(scene);
        stage.show();
    }
}
