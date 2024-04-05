package View;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ViewEditer {
	 private JFrame frame;
	    private JTextArea textArea;
	    private JButton saveButton;
	    private JButton loadButton;

	    public ViewEditer() {
	        frame = new JFrame("Text Editor");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);

	        textArea = new JTextArea();
	        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

	        JPanel buttonPanel = new JPanel();
	        saveButton = new JButton("Save");
	        loadButton = new JButton("Load");
	        buttonPanel.add(saveButton);
	        buttonPanel.add(loadButton);
	        frame.add(buttonPanel, BorderLayout.SOUTH);

	        frame.setVisible(true);
	    }

	    public String getText() {
	        return textArea.getText();
	    }

	    public void setText(String text) {
	        textArea.setText(text);
	    }

	    public void addSaveButtonListener(ActionListener listener) {
	        saveButton.addActionListener(listener);
	    }

	    public void addLoadButtonListener(ActionListener listener) {
	        loadButton.addActionListener(listener);
	    }
	}

