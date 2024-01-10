module com.example.cpechecklist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cpechecklist to javafx.fxml;
    exports com.example.cpechecklist;
}