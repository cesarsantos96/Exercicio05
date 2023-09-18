module com.example.exercicio05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio05 to javafx.fxml;
    exports com.example.exercicio05;
}