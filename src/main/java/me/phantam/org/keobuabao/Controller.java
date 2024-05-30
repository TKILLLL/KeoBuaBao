package me.phantam.org.keobuabao;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    public Label point;
    @FXML
    public Label res;
    @FXML
    public Label choice;

    @FXML
    private Button keo;
    @FXML
    private Button bua;
    @FXML
    private Button bao;

    private TinhToan game = new TinhToan();

    @FXML
    protected void onKeoButtonClick() {
        updateGameResult(0);
    }

    @FXML
    protected void onBuaButtonClick() {
        updateGameResult(1);
    }

    @FXML
    protected void onBaoButtonClick() {
        updateGameResult(2);
    }

    private void updateGameResult(int playerChoice) {
        String playerChoiceStr = getChoice(playerChoice);
        String computerChoiceStr = game.getMay();  // Ensure computer's choice is consistent
        choice.setText("Bạn chọn: " + playerChoiceStr + " - Máy chọn: " + computerChoiceStr);
        String gameResult = game.ketQua(playerChoiceStr, computerChoiceStr);
        res.setText("Kết quả: " + gameResult);
        point.setText("Điểm: " + game.diem);
    }

    private String getChoice(int luaChon) {
        String[] mauLuaChon = {"Kéo", "Búa", "Bao"};
        if (luaChon >= 0 && luaChon < mauLuaChon.length) {
            return mauLuaChon[luaChon];
        }
        throw new IllegalArgumentException("Invalid choice: " + luaChon);
    }
}
