import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cell extends JButton {

    private boolean _beenAlive = false;

    private int _maxSize = 10000;
    
    public Cell() {
<<<<<<< HEAD
    	super(" ");
    	setFont(new Font("Courier", Font.PLAIN, 12));
    	addActionListener(new CellButtonListener());
    }

    public Cell(boolean alive) {
    	super(" ");
    	setFont(new Font("Courier", Font.PLAIN, 12));
    	addActionListener(new CellButtonListener());
    	setAlive(alive);
    }

    public void resetBeenAlive() {
    	_beenAlive = false;
    }

    public void reset() {
    	resetBeenAlive();
    	setAlive(false);
    }
    
    public boolean getAlive() {
    	String text = getText();
    	return (text.equals("X"));
    }

    public String toString() {
    	 String toReturn = new String("");
    	// StringBuilder toReturn = new StringBuilder();
    	String currentState = getText();
//    	for (int j = 0; j < _maxSize; j++) {
//    		toReturn.append(currentState);
    		toReturn+=currentState;
//    	}
    	// if (currentState.substring(0,1).equals("X")) {
        if (currentState.equals("X")){
    		//return toReturn.substring(0,1);
    		return "X";
    	} else {
    		return ".";
    	}
=======
	super(" ");
	setFont(new Font("Courier", Font.PLAIN, 12));
	addActionListener(new CellButtonListener());
    }

    public Cell(boolean alive) {
	super(" ");
	setFont(new Font("Courier", Font.PLAIN, 12));
	addActionListener(new CellButtonListener());
	setAlive(alive);
    }

    public void resetBeenAlive() {
	_beenAlive = false;
    }

    public void reset() {
	resetBeenAlive();
	setAlive(false);
    }
    
    public boolean getAlive() {
	String text = getText();
	return (text.equals("X"));
    }

    public String toString() {
	String toReturn = new String("");
	String currentState = getText();
	for (int j = 0; j < _maxSize; j++) {
	    toReturn += currentState;
	}
	if (toReturn.substring(0,1).equals("X")) {
	    return toReturn.substring(0,1);
	} else {
	    return ".";
	}

>>>>>>> 9df5ac18df27a3f0358d9ad171e935101f736b00
    }
    
    public void setAlive(boolean a) {
	// note that "if (a)" and "if (a == true)"
	// really say the same thing!
	if (a) {
	    _beenAlive = true;
	    setText("X");
	    setBackground(Color.RED);
	} else {
	    setText(" ");
	    if (_beenAlive) {
		setBackground(Color.GREEN);
	    } else {
		setBackground(Color.GRAY);
	    }
	}
	setContentAreaFilled(true);
        setOpaque(true);
    }

    class CellButtonListener implements ActionListener {

	// Every time we click the button, it will perform
	// the following action.

	public void actionPerformed(ActionEvent e) {
	    Cell source = (Cell) e.getSource();
	    String currentText = source.getText();
	    resetBeenAlive();
	    if (currentText.equals(" ")) {
<<<<<<< HEAD
	    	setAlive(true);
	    } else if (currentText.equals("X")) {
	    	setAlive(false);
	    } else {
		// This shouldn't happen
	    	setAlive(false);
=======
		setAlive(true);
	    } else if (currentText.equals("X")) {
		setAlive(false);
	    } else {
		// This shouldn't happen
		setAlive(false);
>>>>>>> 9df5ac18df27a3f0358d9ad171e935101f736b00
	    }
	}
    
    }

}
