package nl.hanze.t12.mvc.controller;

import nl.hanze.t12.mvc.model.*;
import javax.swing.*;

public abstract class AbstractController extends JPanel {

	protected Simulator simulator;
	
	public AbstractController(Simulator simulator) {
		this.simulator=simulator;
	}
}
