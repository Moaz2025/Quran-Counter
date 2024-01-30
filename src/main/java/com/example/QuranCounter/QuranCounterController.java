package com.example.QuranCounter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


public class QuranCounterController {

    @FXML
    private TextField chapterOut;

    @FXML
    private TextField percentOut;

    @FXML
    private CheckBox surah1;

    @FXML
    private CheckBox surah10;

    @FXML
    private CheckBox surah100;

    @FXML
    private CheckBox surah101;

    @FXML
    private CheckBox surah102;

    @FXML
    private CheckBox surah103;

    @FXML
    private CheckBox surah104;

    @FXML
    private CheckBox surah105;

    @FXML
    private CheckBox surah106;

    @FXML
    private CheckBox surah107;

    @FXML
    private CheckBox surah108;

    @FXML
    private CheckBox surah109;

    @FXML
    private CheckBox surah11;

    @FXML
    private CheckBox surah110;

    @FXML
    private CheckBox surah111;

    @FXML
    private CheckBox surah112;

    @FXML
    private CheckBox surah113;

    @FXML
    private CheckBox surah114;

    @FXML
    private CheckBox surah12;

    @FXML
    private CheckBox surah13;

    @FXML
    private CheckBox surah14;

    @FXML
    private CheckBox surah15;

    @FXML
    private CheckBox surah16;

    @FXML
    private CheckBox surah17;

    @FXML
    private CheckBox surah18;

    @FXML
    private CheckBox surah19;

    @FXML
    private CheckBox surah2;

    @FXML
    private CheckBox surah20;

    @FXML
    private CheckBox surah21;

    @FXML
    private CheckBox surah22;

    @FXML
    private CheckBox surah23;

    @FXML
    private CheckBox surah24;

    @FXML
    private CheckBox surah25;

    @FXML
    private CheckBox surah26;

    @FXML
    private CheckBox surah27;

    @FXML
    private CheckBox surah28;

    @FXML
    private CheckBox surah29;

    @FXML
    private CheckBox surah3;

    @FXML
    private CheckBox surah30;

    @FXML
    private CheckBox surah31;

    @FXML
    private CheckBox surah32;

    @FXML
    private CheckBox surah33;

    @FXML
    private CheckBox surah34;

    @FXML
    private CheckBox surah35;

    @FXML
    private CheckBox surah36;

    @FXML
    private CheckBox surah37;

    @FXML
    private CheckBox surah38;

    @FXML
    private CheckBox surah39;

    @FXML
    private CheckBox surah4;

    @FXML
    private CheckBox surah40;

    @FXML
    private CheckBox surah41;

    @FXML
    private CheckBox surah42;

    @FXML
    private CheckBox surah43;

    @FXML
    private CheckBox surah44;

    @FXML
    private CheckBox surah45;

    @FXML
    private CheckBox surah46;

    @FXML
    private CheckBox surah47;

    @FXML
    private CheckBox surah48;

    @FXML
    private CheckBox surah49;

    @FXML
    private CheckBox surah5;

    @FXML
    private CheckBox surah50;

    @FXML
    private CheckBox surah51;

    @FXML
    private CheckBox surah52;

    @FXML
    private CheckBox surah53;

    @FXML
    private CheckBox surah54;

    @FXML
    private CheckBox surah55;

    @FXML
    private CheckBox surah56;

    @FXML
    private CheckBox surah57;

    @FXML
    private CheckBox surah58;

    @FXML
    private CheckBox surah59;

    @FXML
    private CheckBox surah6;

    @FXML
    private CheckBox surah60;

    @FXML
    private CheckBox surah61;

    @FXML
    private CheckBox surah62;

    @FXML
    private CheckBox surah63;

    @FXML
    private CheckBox surah64;

    @FXML
    private CheckBox surah65;

    @FXML
    private CheckBox surah66;

    @FXML
    private CheckBox surah67;

    @FXML
    private CheckBox surah68;

    @FXML
    private CheckBox surah69;

    @FXML
    private CheckBox surah7;

    @FXML
    private CheckBox surah70;

    @FXML
    private CheckBox surah71;

    @FXML
    private CheckBox surah72;

    @FXML
    private CheckBox surah73;

    @FXML
    private CheckBox surah74;

    @FXML
    private CheckBox surah75;

    @FXML
    private CheckBox surah76;

    @FXML
    private CheckBox surah77;

    @FXML
    private CheckBox surah78;

    @FXML
    private CheckBox surah79;

    @FXML
    private CheckBox surah8;

    @FXML
    private CheckBox surah80;

    @FXML
    private CheckBox surah81;

    @FXML
    private CheckBox surah82;

    @FXML
    private CheckBox surah83;

    @FXML
    private CheckBox surah84;

    @FXML
    private CheckBox surah85;

    @FXML
    private CheckBox surah86;

    @FXML
    private CheckBox surah87;

    @FXML
    private CheckBox surah88;

    @FXML
    private CheckBox surah89;

    @FXML
    private CheckBox surah9;

    @FXML
    private CheckBox surah90;

    @FXML
    private CheckBox surah91;

    @FXML
    private CheckBox surah92;

    @FXML
    private CheckBox surah93;

    @FXML
    private CheckBox surah94;

    @FXML
    private CheckBox surah95;

    @FXML
    private CheckBox surah96;

    @FXML
    private CheckBox surah97;

    @FXML
    private CheckBox surah98;

    @FXML
    private CheckBox surah99;

    @FXML
    void calculate(ActionEvent event) {
        double pages = 0;
        double percentage;
        double chapter;
        if (surah1.isSelected())
            pages += 1;
        if (surah2.isSelected())
            pages += 48;
        if (surah3.isSelected())
            pages += 27;
        if (surah4.isSelected())
            pages += 29.4;
        if (surah5.isSelected())
            pages += 21.6;
        if (surah6.isSelected())
            pages += 23;
        if (surah7.isSelected())
            pages += 26;
        if (surah8.isSelected())
            pages += 10;
        if (surah9.isSelected())
            pages += 21;
        if (surah10.isSelected())
            pages += 13.5;
        if (surah11.isSelected())
            pages += 14.1;
        if (surah12.isSelected())
            pages += 13.4;
        if (surah13.isSelected())
            pages += 6.15;
        if (surah14.isSelected())
            pages += 6.85;
        if (surah15.isSelected())
            pages += 5.5;
        if (surah16.isSelected())
            pages += 14.5;
        if (surah17.isSelected())
            pages += 11.7;
        if (surah18.isSelected())
            pages += 11.3;
        if (surah19.isSelected())
            pages += 7.3;
        if (surah20.isSelected())
            pages += 9.7;
        if (surah21.isSelected())
            pages += 10;
        if (surah22.isSelected())
            pages += 10;
        if (surah23.isSelected())
            pages += 8;
        if (surah24.isSelected())
            pages += 9.75;
        if (surah25.isSelected())
            pages += 7.25;
        if (surah26.isSelected())
            pages += 10;
        if (surah27.isSelected())
            pages += 8.5;
        if (surah28.isSelected())
            pages += 11;
        if (surah29.isSelected())
            pages += 8.2;
        if (surah30.isSelected())
            pages += 6.3;
        if (surah31.isSelected())
            pages += 4;
        if (surah32.isSelected())
            pages += 3;
        if (surah33.isSelected())
            pages += 10;
        if (surah34.isSelected())
            pages += 6.5;
        if (surah35.isSelected())
            pages += 5.75;
        if (surah36.isSelected())
            pages += 5.75;
        if (surah37.isSelected())
            pages += 7;
        if (surah38.isSelected())
            pages += 5.25;
        if (surah39.isSelected())
            pages += 8.9;
        if (surah40.isSelected())
            pages += 9.85;
        if (surah41.isSelected())
            pages += 6;
        if (surah42.isSelected())
            pages += 6.3;
        if (surah43.isSelected())
            pages += 6.7;
        if (surah44.isSelected())
            pages += 3;
        if (surah45.isSelected())
            pages += 3.5;
        if (surah46.isSelected())
            pages += 4.5;
        if (surah47.isSelected())
            pages += 4;
        if (surah48.isSelected())
            pages += 4.5;
        if (surah49.isSelected())
            pages += 2.5;
        if (surah50.isSelected())
            pages += 2.85;
        if (surah51.isSelected())
            pages += 2.65;
        if (surah52.isSelected())
            pages += 2.5;
        if (surah53.isSelected())
            pages += 2.6;
        if (surah54.isSelected())
            pages += 2.7;
        if (surah55.isSelected())
            pages += 3.2;
        if (surah56.isSelected())
            pages += 3.25;
        if (surah57.isSelected())
            pages += 4.25;
        if (surah58.isSelected())
            pages += 3.5;
        if (surah59.isSelected())
            pages += 3.5;
        if (surah60.isSelected())
            pages += 2.5;
        if (surah61.isSelected())
            pages += 1.5;
        if (surah62.isSelected())
            pages += 1.5;
        if (surah63.isSelected())
            pages += 1.5;
        if (surah64.isSelected())
            pages += 2;
        if (surah65.isSelected())
            pages += 2;
        if (surah66.isSelected())
            pages += 2;
        if (surah67.isSelected())
            pages += 2.4;
        if (surah68.isSelected())
            pages += 2.2;
        if (surah69.isSelected())
            pages += 2;
        if (surah70.isSelected())
            pages += 1.7;
        if (surah71.isSelected())
            pages += 1.7;
        if (surah72.isSelected())
            pages += 2;
        if (surah73.isSelected())
            pages += 1.5;
        if (surah74.isSelected())
            pages += 1.9;
        if (surah75.isSelected())
            pages += 1.2;
        if (surah76.isSelected())
            pages += 1.9;
        if (surah77.isSelected())
            pages += 1.5;
        if (surah78.isSelected())
            pages += 1.5;
        if (surah79.isSelected())
            pages += 1.5;
        if (surah80.isSelected())
            pages += 1;
        if (surah81.isSelected())
            pages += 1;
        if (surah82.isSelected())
            pages += 0.75;
        if (surah83.isSelected())
            pages += 1.3;
        if (surah84.isSelected())
            pages += 0.95;
        if (surah85.isSelected())
            pages += 1;
        if (surah86.isSelected())
            pages += 0.5;
        if (surah87.isSelected())
            pages += 0.65;
        if (surah88.isSelected())
            pages += 0.85;
        if (surah89.isSelected())
            pages += 1.25;
        if (surah90.isSelected())
            pages += 0.75;
        if (surah91.isSelected())
            pages += 0.6;
        if (surah92.isSelected())
            pages += 0.7;
        if (surah93.isSelected())
            pages += 0.45;
        if (surah94.isSelected())
            pages += 0.25;
        if (surah95.isSelected())
            pages += 0.35;
        if (surah96.isSelected())
            pages += 0.65;
        if (surah97.isSelected())
            pages += 0.25;
        if (surah98.isSelected())
            pages += 0.9;
        if (surah99.isSelected())
            pages += 0.45;
        if (surah100.isSelected())
            pages += 0.45;
        if (surah101.isSelected())
            pages += 0.55;
        if (surah102.isSelected())
            pages += 0.4;
        if (surah103.isSelected())
            pages += 0.2;
        if (surah104.isSelected())
            pages += 0.45;
        if (surah105.isSelected())
            pages += 0.35;
        if (surah106.isSelected())
            pages += 0.35;
        if (surah107.isSelected())
            pages += 0.45;
        if (surah108.isSelected())
            pages += 0.2;
        if (surah109.isSelected())
            pages += 0.34;
        if (surah110.isSelected())
            pages += 0.33;
        if (surah111.isSelected())
            pages += 0.33;
        if (surah112.isSelected())
            pages += 0.2;
        if (surah113.isSelected())
            pages += 0.35;
        if (surah114.isSelected())
            pages += 0.45;
        percentage = pages / 604 * 100;
        double ans = Math.round(percentage * 1000) / 1000.0;
        chapter = pages / 604 * 30;
        double ans2 = Math.round(chapter * 1000) / 1000.0;
        percentOut.setText(String.valueOf(ans) + "%");
        chapterOut.setText(String.valueOf(ans2) + " جزء");
    }

    @FXML
    void deselectAll(ActionEvent event) {
        surah1.setSelected(false);
        surah2.setSelected(false);
        surah3.setSelected(false);
        surah4.setSelected(false);
        surah5.setSelected(false);
        surah6.setSelected(false);
        surah7.setSelected(false);
        surah8.setSelected(false);
        surah9.setSelected(false);
        surah10.setSelected(false);
        surah11.setSelected(false);
        surah12.setSelected(false);
        surah13.setSelected(false);
        surah14.setSelected(false);
        surah15.setSelected(false);
        surah16.setSelected(false);
        surah17.setSelected(false);
        surah18.setSelected(false);
        surah19.setSelected(false);
        surah20.setSelected(false);
        surah21.setSelected(false);
        surah22.setSelected(false);
        surah23.setSelected(false);
        surah24.setSelected(false);
        surah25.setSelected(false);
        surah26.setSelected(false);
        surah27.setSelected(false);
        surah28.setSelected(false);
        surah29.setSelected(false);
        surah30.setSelected(false);
        surah31.setSelected(false);
        surah32.setSelected(false);
        surah33.setSelected(false);
        surah34.setSelected(false);
        surah35.setSelected(false);
        surah36.setSelected(false);
        surah37.setSelected(false);
        surah38.setSelected(false);
        surah39.setSelected(false);
        surah40.setSelected(false);
        surah41.setSelected(false);
        surah42.setSelected(false);
        surah43.setSelected(false);
        surah44.setSelected(false);
        surah45.setSelected(false);
        surah46.setSelected(false);
        surah47.setSelected(false);
        surah48.setSelected(false);
        surah49.setSelected(false);
        surah50.setSelected(false);
        surah51.setSelected(false);
        surah52.setSelected(false);
        surah53.setSelected(false);
        surah54.setSelected(false);
        surah55.setSelected(false);
        surah56.setSelected(false);
        surah57.setSelected(false);
        surah58.setSelected(false);
        surah59.setSelected(false);
        surah60.setSelected(false);
        surah61.setSelected(false);
        surah62.setSelected(false);
        surah63.setSelected(false);
        surah64.setSelected(false);
        surah65.setSelected(false);
        surah66.setSelected(false);
        surah67.setSelected(false);
        surah68.setSelected(false);
        surah69.setSelected(false);
        surah70.setSelected(false);
        surah71.setSelected(false);
        surah72.setSelected(false);
        surah73.setSelected(false);
        surah74.setSelected(false);
        surah75.setSelected(false);
        surah76.setSelected(false);
        surah77.setSelected(false);
        surah78.setSelected(false);
        surah79.setSelected(false);
        surah80.setSelected(false);
        surah81.setSelected(false);
        surah82.setSelected(false);
        surah83.setSelected(false);
        surah84.setSelected(false);
        surah85.setSelected(false);
        surah86.setSelected(false);
        surah87.setSelected(false);
        surah88.setSelected(false);
        surah89.setSelected(false);
        surah90.setSelected(false);
        surah91.setSelected(false);
        surah92.setSelected(false);
        surah93.setSelected(false);
        surah94.setSelected(false);
        surah95.setSelected(false);
        surah96.setSelected(false);
        surah97.setSelected(false);
        surah98.setSelected(false);
        surah99.setSelected(false);
        surah100.setSelected(false);
        surah101.setSelected(false);
        surah102.setSelected(false);
        surah103.setSelected(false);
        surah104.setSelected(false);
        surah105.setSelected(false);
        surah106.setSelected(false);
        surah107.setSelected(false);
        surah108.setSelected(false);
        surah109.setSelected(false);
        surah110.setSelected(false);
        surah111.setSelected(false);
        surah112.setSelected(false);
        surah113.setSelected(false);
        surah114.setSelected(false);
    }

    @FXML
    void selectAll(ActionEvent event) {
        surah1.setSelected(true);
        surah2.setSelected(true);
        surah3.setSelected(true);
        surah4.setSelected(true);
        surah5.setSelected(true);
        surah6.setSelected(true);
        surah7.setSelected(true);
        surah8.setSelected(true);
        surah9.setSelected(true);
        surah10.setSelected(true);
        surah11.setSelected(true);
        surah12.setSelected(true);
        surah13.setSelected(true);
        surah14.setSelected(true);
        surah15.setSelected(true);
        surah16.setSelected(true);
        surah17.setSelected(true);
        surah18.setSelected(true);
        surah19.setSelected(true);
        surah20.setSelected(true);
        surah21.setSelected(true);
        surah22.setSelected(true);
        surah23.setSelected(true);
        surah24.setSelected(true);
        surah25.setSelected(true);
        surah26.setSelected(true);
        surah27.setSelected(true);
        surah28.setSelected(true);
        surah29.setSelected(true);
        surah30.setSelected(true);
        surah31.setSelected(true);
        surah32.setSelected(true);
        surah33.setSelected(true);
        surah34.setSelected(true);
        surah35.setSelected(true);
        surah36.setSelected(true);
        surah37.setSelected(true);
        surah38.setSelected(true);
        surah39.setSelected(true);
        surah40.setSelected(true);
        surah41.setSelected(true);
        surah42.setSelected(true);
        surah43.setSelected(true);
        surah44.setSelected(true);
        surah45.setSelected(true);
        surah46.setSelected(true);
        surah47.setSelected(true);
        surah48.setSelected(true);
        surah49.setSelected(true);
        surah50.setSelected(true);
        surah51.setSelected(true);
        surah52.setSelected(true);
        surah53.setSelected(true);
        surah54.setSelected(true);
        surah55.setSelected(true);
        surah56.setSelected(true);
        surah57.setSelected(true);
        surah58.setSelected(true);
        surah59.setSelected(true);
        surah60.setSelected(true);
        surah61.setSelected(true);
        surah62.setSelected(true);
        surah63.setSelected(true);
        surah64.setSelected(true);
        surah65.setSelected(true);
        surah66.setSelected(true);
        surah67.setSelected(true);
        surah68.setSelected(true);
        surah69.setSelected(true);
        surah70.setSelected(true);
        surah71.setSelected(true);
        surah72.setSelected(true);
        surah73.setSelected(true);
        surah74.setSelected(true);
        surah75.setSelected(true);
        surah76.setSelected(true);
        surah77.setSelected(true);
        surah78.setSelected(true);
        surah79.setSelected(true);
        surah80.setSelected(true);
        surah81.setSelected(true);
        surah82.setSelected(true);
        surah83.setSelected(true);
        surah84.setSelected(true);
        surah85.setSelected(true);
        surah86.setSelected(true);
        surah87.setSelected(true);
        surah88.setSelected(true);
        surah89.setSelected(true);
        surah90.setSelected(true);
        surah91.setSelected(true);
        surah92.setSelected(true);
        surah93.setSelected(true);
        surah94.setSelected(true);
        surah95.setSelected(true);
        surah96.setSelected(true);
        surah97.setSelected(true);
        surah98.setSelected(true);
        surah99.setSelected(true);
        surah100.setSelected(true);
        surah101.setSelected(true);
        surah102.setSelected(true);
        surah103.setSelected(true);
        surah104.setSelected(true);
        surah105.setSelected(true);
        surah106.setSelected(true);
        surah107.setSelected(true);
        surah108.setSelected(true);
        surah109.setSelected(true);
        surah110.setSelected(true);
        surah111.setSelected(true);
        surah112.setSelected(true);
        surah113.setSelected(true);
        surah114.setSelected(true);
    }
}

