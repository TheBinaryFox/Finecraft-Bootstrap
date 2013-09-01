package com.thebinaryfox.finecraft.ui;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

public class UIBootstrapGlassConfirm extends UIBootstrapGlass {

	private static final long serialVersionUID = 3982435305435474652L;

	private JEditorPane jep = new JEditorPane();
	private JButton first;
	private JButton second;
	private Runnable[] actions;

	public UIBootstrapGlassConfirm(BSUIWindow window) {
		super(window);
	}

	@Override
	protected void init() {
		jep = new JEditorPane();
		jep.setDisabledTextColor(getForeground());
		jep.setEnabled(false);
		JScrollPane jesp = new JScrollPane(jep);
		// TODO disable horizontal on scroll pane
		
		SpringLayout layout = getLayout();
		JPanel content = getPanel();
		
		layout.putConstraint("North", jesp, 0, "North", content);
		layout.putConstraint("West", jesp, 0, "West", content);
		layout.putConstraint("East", jesp, 0, "East", content);
		
		add(jesp);
	}

	@Override
	protected void update() {
		jep.setDisabledTextColor(getForeground());
	}

	public void setText(String text) {

	}

	public void setButtons(String left, String right) {

	}

	public void setActions(Runnable accept, Runnable deny) {
		actions = new Runnable[] { accept, deny };
	}

}
