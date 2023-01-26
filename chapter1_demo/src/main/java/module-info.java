module com.study.chapter1_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.study.chapter1_demo to javafx.fxml;
    exports com.study.chapter1_demo;
}