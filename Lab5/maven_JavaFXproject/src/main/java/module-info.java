module com.mycompany.mavenproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenproject to javafx.fxml;
    exports com.mycompany.mavenproject;
}
