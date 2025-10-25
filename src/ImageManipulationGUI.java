import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ImageManipulationGUI {

    private BufferedImage originalImage;
    private JLabel imageLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        ImageManipulationGUI imageManipulation = new ImageManipulationGUI();
        imageManipulation.initGUI();
    }

    private void initGUI() {
        JFrame frame = new JFrame("Image Manipulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create components
        createComponents(frame.getContentPane());

        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());

        // Create image label
        imageLabel = new JLabel();
        container.add(imageLabel, BorderLayout.CENTER);

        // Create control panel
        JPanel controlPanel = new JPanel(new GridLayout(1, 4));

        // Load image button
        JButton loadImageButton = new JButton("Load Image");
        loadImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadImage();
            }
        });

        // Black and white filter button
        JButton blackAndWhiteButton = new JButton("Black and White");
        blackAndWhiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyBlackAndWhiteFilter();
            }
        });

        // Sepia filter button
        JButton sepiaButton = new JButton("Sepia");
        sepiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applySepiaFilter();
            }
        });

        // Invert filter button
        JButton invertButton = new JButton("Invert");
        invertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyInvertFilter();
            }
        });

        // Add buttons to control panel
        controlPanel.add(loadImageButton);
        controlPanel.add(blackAndWhiteButton);
        controlPanel.add(sepiaButton);
        controlPanel.add(invertButton);

        container.add(controlPanel, BorderLayout.SOUTH);
    }

    private void loadImage() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                originalImage = ImageIO.read(fileChooser.getSelectedFile());
                updateImageLabel(originalImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void applyBlackAndWhiteFilter() {
        if (originalImage != null) {
            BufferedImage filteredImage = applyFilter(originalImage, this::getBlackAndWhiteColor);
            updateImageLabel(filteredImage);
        }
    }

    private void applySepiaFilter() {
        if (originalImage != null) {
            BufferedImage filteredImage = applyFilter(originalImage, this::getSepiaColor);
            updateImageLabel(filteredImage);
        }
    }

    private void applyInvertFilter() {
        if (originalImage != null) {
            BufferedImage filteredImage = applyFilter(originalImage, this::invertColor);
            updateImageLabel(filteredImage);
        }
    }

    private int getBlackAndWhiteColor(int color) {
        // TODO YOUR CODE HERE

        /*
         * 1. Create 3 ints to represent R, B, and G values.
         * You will need to bit shift so that the bits
         * corresponding to the desired color are on the right side.
         * 
         * ex. int red = color >> 16;
         */

        /*
         * 2. Mask using & to get rid of any unwanted bits on the
         * left side.
         * 
         * ex. red = red & 255;
         */

        /*
         * 3. Find the average of all three colors and store
         * in an int variable called average.
         */

        /*
         * 4. Replace each R, G, and B value using the average,
         * shifted to the correct place.
         * 
         * ex. red = average << 16;
         */

        /*
         * 5. Combine your R, G, and B values back into one
         * color.
         * 
         * ex. int newColor = red | green | blue;
         */

        /*
         * 6. Replace "return 0;" with a line of code that returns
         * your new color.
         */
        return 0;
    }

    private int getSepiaColor(int color) {
        // TODO YOUR CODE HERE

        /*
         * 1. Create 3 ints to represent R, B, and G values.
         * You will need to bit shift so that the bits
         * corresponding to the desired color are on the right side.
         * 
         */

        /*
         * 2. Mask using & to get rid of any unwanted bits on the
         * left side.
         * 
         */

        /*
         * 3. Calculate new R, G, and B, values using these formulas.
         * 
         * red - (int)(Math.min(255,0.393 * red + 0.769 * green + 0.189 * blue))
         * green - (int)(Math.min(255,0.349 * red + 0.686 * green + 0.131 * blue))
         * blue - (int)(Math.min(255,0.272 * red + 0.534 * green + 0.131 * blue))
         * 
         * ex. int newRed = (int)(Math.min(255,0.393 * red + 0.769 * green + 0.189 *
         * blue));
         */

        /*
         * 4. Replace each R, G, and B value using the new version
         * of that color, shifted to the correct place.
         * 
         * ex. red = newRed << 16;
         */

        /*
         * 5. Combine your R, G, and B values back into one
         * color.
         * 
         */

        /*
         * 6. Replace "return 0;" with a line of code that returns
         * your new color.
         */
        return 0;
    }

    private int invertColor(int color) {
        // TODO YOUR CODE HERE

        /*
         * 1. Create 3 ints to represent R, B, and G values.
         * You will need to bit shift so that the bits
         * corresponding to the desired color are on the right side.
         * 
         */

        /*
         * 2. Mask using & to get rid of any unwanted bits on the
         * left side.
         * 
         */

        /*
         * 3. Calculate new R, G, and B, values by subtracting each
         * value from 255.
         * 
         * ex. int newRed = 255 - red;
         */

        /*
         * 4. Replace each R, G, and B value using the new version
         * of that color, shifted to the correct place.
         * 
         * ex. red = newRed << 16;
         */

        /*
         * 5. Combine your R, G, and B values back into one
         * color.
         * 
         */

        /*
         * 6. Replace "return 0;" with a line of code that returns
         * your new color.
         */
        return 0;
    }

    private BufferedImage applyFilter(BufferedImage inputImage, ColorFilter filter) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = inputImage.getRGB(x, y);
                int filteredColor = filter.applyFilter(rgb);
                outputImage.setRGB(x, y, filteredColor);
            }
        }

        return outputImage;
    }

    private void updateImageLabel(BufferedImage image) {
        ImageIcon icon = new ImageIcon(image);
        imageLabel.setIcon(icon);
    }

    // Functional interface for color filters
    private interface ColorFilter {
        int applyFilter(int color);
    }
}
