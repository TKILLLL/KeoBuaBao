module me.phantam.org.keobuabao {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.phantam.org.keobuabao to javafx.fxml;
    exports me.phantam.org.keobuabao;
}