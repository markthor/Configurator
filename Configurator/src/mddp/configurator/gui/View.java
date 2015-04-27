package mddp.configurator.gui;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import mddp.configurator.logic.ParameterHolder;
import mddp.configurator.logic.Validator;
import mddp.configurator.model.AssignmentI;
import mddp.configurator.model.BooleanValueI;
import mddp.configurator.model.IntegerValueI;
import mddp.configurator.model.StringValueI;

import org.apache.commons.lang3.math.NumberUtils;

import ConfiguratorPackage.Assignment;
import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.Value;


public class View {
	// Data structures
	private Map<Parameter, JComponent> map = new HashMap<Parameter, JComponent>();;
	
	// Components and setup variables
	private JLabel validatedLabel;
	private final int PARAMETER_INPUT_FIELD_WIDTH = 12;
	private final int PARAMETER_HEIGHT = 35;
	private final int PARAMETERS_MAX_HEIGTH = 500;
	private final int APPLICATION_WIDTH = 320;
	
	// Validation states
	private String wrongInput = "Wrong input";
	private String validated = "Validated";
	private String failedValidation = "Validation failed";
	
	private void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Configurator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add the top panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.PAGE_AXIS));
		frame.getContentPane().add(topPanel);
        
		// Add the scroll pane
		topPanel.add(getParameterView());
		
		// Add the validate panel
		topPanel.add(getValidateView());
        
        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	
	private JScrollPane getParameterView() {
		 // Add the container panel for the parameters
        JPanel parameterPanel = new JPanel();
        parameterPanel.setLayout(new BoxLayout(parameterPanel, BoxLayout.PAGE_AXIS));
        
        // Get the parameters to display
        List<Parameter> parameters = ParameterHolder.getParameters();
        
        // Create the parameters components
        for(Parameter p : parameters) {
        	parameterPanel.add(addParameterPanel(p, map));
        }
        
		// Add the scroll pane
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(310, getPreferredHeight(parameters.size())));
		scrollPane.getViewport().add(parameterPanel);
		
		return scrollPane;
	}
	
	private int getPreferredHeight(int numberOfParameters) {
		int result = numberOfParameters * PARAMETER_HEIGHT;
		if(result > PARAMETERS_MAX_HEIGTH) {
			result = PARAMETERS_MAX_HEIGTH;
		}
		return result;
	}
	
	private JPanel getValidateView() {
		JPanel lowerPanel = new JPanel();
		lowerPanel.setMaximumSize(new Dimension(APPLICATION_WIDTH, 40));
		lowerPanel.setPreferredSize(new Dimension(APPLICATION_WIDTH, 40));
        lowerPanel.setLayout(new BoxLayout(lowerPanel, BoxLayout.LINE_AXIS));
        
        JPanel rightPanel = new JPanel();
        rightPanel.setMaximumSize(new Dimension(APPLICATION_WIDTH/2,40));
        rightPanel.setPreferredSize(new Dimension(APPLICATION_WIDTH/2,40));
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.LINE_AXIS));
        JPanel leftPanel = new JPanel();
        leftPanel.setMaximumSize(new Dimension(150,40));
        leftPanel.setPreferredSize(new Dimension(150,40));
        lowerPanel.add(leftPanel);
        lowerPanel.add(rightPanel);
        
		// Add the validate button
		JButton validateButton = new JButton("Validate"); 
		validateButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        validateButton.addActionListener(getValidateButtonActionListener());   
        leftPanel.add(validateButton);
        
        lowerPanel.add(Box.createRigidArea(new Dimension(5,0)));
        
        // Add the validate output label
        validatedLabel = new JLabel();
        validatedLabel.setOpaque(true);
        rightPanel.add(validatedLabel);
        
        return lowerPanel;
	}
	
	private ActionListener getValidateButtonActionListener() {
		return new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e)
            {
            	try {
            		if(Validator.validate(getAssignments())) {
            			validatedLabel.setText(validated);
                		validatedLabel.setBackground(Color.green);
            		} else {
            			validatedLabel.setText(failedValidation);
                		validatedLabel.setBackground(Color.red);
            		}
            	} catch(IllegalArgumentException exn) {
            		validatedLabel.setText(wrongInput);
            		validatedLabel.setBackground(Color.yellow);
            	}
                
            }
        };    
	}
	
	private JPanel addParameterPanel(Parameter p, Map<Parameter, JComponent> map) {
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
        panel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.setMaximumSize(new Dimension(APPLICATION_WIDTH, 30));
        return panel;
	}
	
	private String typeEnumToGuiString(TypeEnum type) {
		switch(type) {
			case BOOLEAN_TYPE: return "true";
			case INTEGER_TYPE: return "Integer";
			case STRING_TYPE: return "text";
			default: return "";
		}
	}
	
	private List<Assignment> getAssignments() {
		List<Assignment> result = new ArrayList<Assignment>();
		for(Map.Entry<Parameter, JComponent> entry : map.entrySet()) {
			// Boolean type
			if(entry.getKey().getType() == TypeEnum.BOOLEAN_TYPE) {
				 JCheckBox checkBox = (JCheckBox) entry.getValue();
				 result.add(new AssignmentI(entry.getKey(), new BooleanValueI(checkBox.isSelected())));
			}
			
			// Integer type
			if(entry.getKey().getType() == TypeEnum.INTEGER_TYPE) {
				 JTextField textField = (JTextField) entry.getValue();
				 result.add(new AssignmentI(entry.getKey(), getIntegerValue(textField.getText())));
			}
			
			// String type
			if(entry.getKey().getType() == TypeEnum.STRING_TYPE) {
				 JTextField textField = (JTextField) entry.getValue();
				 result.add(new AssignmentI(entry.getKey(), getStringValue(textField.getText())));
			}
		}
		
		return result;
	}
	
	private Value getIntegerValue(String text) {
		if(NumberUtils.isNumber(text)) {
			return new IntegerValueI(Integer.parseInt(text));
		}
		throw new IllegalArgumentException();
	}
	
	private Value getStringValue(String text) {
		if(text != null) {
			return new StringValueI(text);
		} else {
			return new StringValueI("");
		}
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				View view = new View();
				view.createAndShowGUI();
			}
		});
	}
}
