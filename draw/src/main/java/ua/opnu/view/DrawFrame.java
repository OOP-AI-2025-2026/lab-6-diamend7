package ua.opnu.view;

import ua.opnu.model.Ellipse;
import ua.opnu.model.Rectangle;
import ua.opnu.model.RoundedRectangle;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class DrawFrame extends JFrame {

    private PaintSurface surface;

    public DrawFrame(String title) {
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

       
        surface = new PaintSurface(); 

        this.add(setButtonPanel(), BorderLayout.NORTH);
        this.add(surface, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }

    private JPanel setButtonPanel() {

        JPanel buttonPanel = new JPanel(true);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.CYAN);
        buttonPanel.setBorder(new LineBorder(Color.BLACK, 2));

        
        BigTextButton rect = new BigTextButton("Rectangle");
        rect.addActionListener(e -> {
            // Передаємо клас Rectangle
            surface.setShapeType(Rectangle.class);
        });
        buttonPanel.add(rect);

  
        BigTextButton rounded_rect = new BigTextButton("Rounded rect.");
        rounded_rect.addActionListener(e -> {
            // Передаємо клас RoundedRectangle
            surface.setShapeType(RoundedRectangle.class);
        });
        buttonPanel.add(rounded_rect);

   
        BigTextButton ellipseButton = new BigTextButton("Ellipse");
        ellipseButton.addActionListener(e -> {
            // Передаємо клас Ellipse
            surface.setShapeType(Ellipse.class); 
        });
        buttonPanel.add(ellipseButton); 

      
        BigTextButton clearButton = new BigTextButton("Clear");
        clearButton.addActionListener(e -> {
            surface.clearShapes();
        });
        buttonPanel.add(clearButton);
        
        return buttonPanel;
    }
}