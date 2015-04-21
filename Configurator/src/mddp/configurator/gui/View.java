package mddp.configurator.gui;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import ConfiguratorPackage.TypeEnum;
import mddp.configurator.model.ParameterImp;


public class View {
	
	public static final int PARAMETER_INPUT_FIELD_WIDTH = 15;
	
	private static List<ParameterImp> getParameters() {
		List<ParameterImp> list = new ArrayList<ParameterImp>();
		list.add(new ParameterImp(TypeEnum.INTEGER_TYPE, "x"));
		list.add(new ParameterImp(TypeEnum.BOOLEAN_TYPE, "y"));
		return list;
	}
	
	private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Configurator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add the top panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.PAGE_AXIS));
		frame.getContentPane().add(topPanel);
        
        // Add the container panel for the parameters
        JPanel parameterPanel = new JPanel();
        parameterPanel.setLayout(new BoxLayout(parameterPanel, BoxLayout.PAGE_AXIS));
        
        // Create the map for storing TextField references.
        Map<ParameterImp, JComponent> map = new HashMap<ParameterImp, JComponent>();
        
        // Get the parameters to display
        List<ParameterImp> parameters = getParameters();
        
        // Create the parameters components
        for(ParameterImp p : parameters) {
        	parameterPanel.add(addParameterPanel(p, map));
        }
        
		// Add the scroll pane
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(300, 100));
		scrollPane.getViewport().add(parameterPanel);
		topPanel.add(scrollPane);
		
        JButton validateButton = new JButton("Validate"); 
        topPanel.add(validateButton);
  
        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
	
	private static JPanel addParameterPanel(ParameterImp p, Map<ParameterImp, JComponent> map) {
		JPanel panel = new JPanel();
		JLabel typeLabel = new JLabel(typeEnumToGuiString(p.getType()));
		JLabel nameLabel = new JLabel(p.getName());
		JComponent selector;
		if(p.getType() == TypeEnum.BOOLEAN_TYPE) {
			JCheckBox checkBox = new JCheckBox();
			checkBox.setSelected(false);
			selector = checkBox;
		} else {
			selector = new JTextField(PARAMETER_INPUT_FIELD_WIDTH);
		}
		
		panel.add(typeLabel);
		panel.add(nameLabel);
        panel.add(selector);
        map.put(p, selector);
        return panel;
	}
	
	private static String typeEnumToGuiString(TypeEnum type) {
		switch(type) {
			case BOOLEAN_TYPE: return "true";
			case INTEGER_TYPE: return "Integer";
			case STRING_TYPE: return "text";
			default: return "";
		}
	}
}
