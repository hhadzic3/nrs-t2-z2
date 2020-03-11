package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.util.Optional;


public class ZnamenitostiController {
    public TextField fldNazivv;
    public ImageView imgView;

    public void clickOK(ActionEvent actionEvent) {

        boolean sveOk = true;

        if (fldNazivv.getText().trim().isEmpty()) {
            fldNazivv.getStyleClass().removeAll("poljeIspravno");
            fldNazivv.getStyleClass().add("poljeNijeIspravno");
            sveOk = false;
        } else {
            fldNazivv.getStyleClass().removeAll("poljeNijeIspravno");
            fldNazivv.getStyleClass().add("poljeIspravno");
        }


        if (!sveOk) return;

        Stage stage = (Stage) fldNazivv.getScene().getWindow();
        stage.close();
    }

    public void clickOdabir(ActionEvent actionEvent) {
        boolean sveOk = true;

        if (fldNazivv.getText().trim().isEmpty()) {
            fldNazivv.getStyleClass().removeAll("poljeIspravno");
            fldNazivv.getStyleClass().add("poljeNijeIspravno");
            sveOk = false;
        } else {
            fldNazivv.getStyleClass().removeAll("poljeNijeIspravno");
            fldNazivv.getStyleClass().add("poljeIspravno");
        }
        if (!sveOk) return;

        TextInputDialog dialog = new TextInputDialog("Tran");

        dialog.setTitle("Apsulutni put do slike");
        dialog.setHeaderText("Unesite apsulutni put do slike:");
        dialog.setContentText("Slika:");


        Optional<String> result = dialog.showAndWait();
        String res = result.get();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(res);
        /*alert.setContentText("You didn't select a file!");*/
        alert.showAndWait();

        Image im = new Image(res);

        imgView.setImage(im);

    }






    }