package Main;

import java.io.File;
import java.util.Scanner;

import Controller.ControllerEditer;
import Model.ModelEditer;
import View.ViewEditer;

public class run {
public static void main(String[] args) {
	ModelEditer model = new ModelEditer();
    ViewEditer view = new ViewEditer();
    ControllerEditer control=new ControllerEditer(model, view);
}
}
