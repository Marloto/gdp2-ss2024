package chapter09.lecture20240605;

import javafx.scene.control.Button;

public class TicTacToeButton extends Button {
	public void setZeichen(char zeichen) {
		this.setText(zeichen + "");
	}
}
