package Model;

import java.util.ArrayList;
import java.util.List;

public class ModelEditer {
private List<String> list;
public ModelEditer() {
	list=new ArrayList<String>();
}
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public void add(String text) {
	list.add(text);
}
public void remove(int index) {
	list.remove(index);
}
}
