package jpl.ch01.ex14;

public class Walkman {
	private int terminal;
	private int sirial;
	private String model;

	Walkman(int _sirial, String _model){
		this.sirial = _sirial;
		this.model = _model;
		this.iniTerminal();

	}
	public void iniTerminal(){
		this.setTerminal(1);;
	}
	public void setTerminal(int i){
		this.terminal = i;
	}

	public int getSirial(){
		return this.sirial;
	}
	public int getTerminal(){
		return this.terminal;
	}
	public String getModel(){
		return this.model;
	}

}
