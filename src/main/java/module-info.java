module vnu.uet.simplejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens vnu.uet.simplejavafx to javafx.fxml;
    exports vnu.uet.simplejavafx;
}