module none.soundboard {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens none.soundboard to javafx.fxml;
    exports none.soundboard;
}