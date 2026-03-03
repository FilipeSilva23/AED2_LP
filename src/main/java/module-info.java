module edu.ufp.inf.aed2_lp2_2324_students {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.desktop;
    requires edu.princeton.cs.algs4;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens edu.ufp.inf.lp2.p06_gui_javafx.helloword to javafx.fxml;
    exports edu.ufp.inf.lp2.p06_gui_javafx.helloword;
}
