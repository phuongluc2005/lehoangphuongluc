package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

import Model.ModelEditer;
import View.ViewEditer;

public class ControllerEditer {
private ModelEditer modelEditer;
private ViewEditer viewEditer;
public ControllerEditer(ModelEditer model, ViewEditer view) {
    this.modelEditer = model;
    this.viewEditer = view;

    view.addSaveButtonListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveToFile();
        }
    });

    view.addLoadButtonListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            loadFromFile();
        }
    });
}

private void saveToFile() {
	JFileChooser fileChooser = new JFileChooser();
    int result = fileChooser.showSaveDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(viewEditer.getText());
            writer.newLine(); 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

private void loadFromFile() {
    JFileChooser fileChooser = new JFileChooser();
    int result = fileChooser.showOpenDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            modelEditer.getList().clear();
            String line;
            while ((line = reader.readLine()) != null) {
                modelEditer.add(line);
            }
            viewEditer.setText(String.join("\n", modelEditer.getList()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
}

