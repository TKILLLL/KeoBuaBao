package me.phantam.org.keobuabao;

import java.util.Random;

public class TinhToan {

    private Random random = new Random();
    public int diem = 0;
    private String[] computerChoice = {"Kéo", "Búa", "Bao"};

    public String getMay() {
        int dem = random.nextInt(3);
        return computerChoice[dem];
    }

    public String ketQua(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            diem += 500;
            return "Hòa";
        }

        if ((playerChoice.equals("Bao") && computerChoice.equals("Búa")) ||
                (playerChoice.equals("Búa") && computerChoice.equals("Kéo")) ||
                (playerChoice.equals("Kéo") && computerChoice.equals("Bao"))) {
            diem += 1000;
            return "Thắng";
        } else {
            if (diem <= 1000) {
                diem = 0;
            } else {
                diem -= 1000;
            }
            return "Thua";
        }
    }
}
