
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyFunc 
{
    public ImageIcon resizePic(String picPath, byte[] BLOBpic, int wdth, int hgt)
    {
        ImageIcon myImg;
        if (picPath != null)
        {
            /**
             * ImageIcon(byte[] myImg) - creates an icon from an array of bytes
             * ImageIcon(Image myImg) - creates an icon from an image object
             * 
             * 
             * 
             */
            myImg =  new ImageIcon(picPath); 
        }
        else
        {
            myImg =  new ImageIcon(BLOBpic);
        }
        Image img = myImg.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(img);
        return  myPicture;
    }
    public String browseImage(JLabel lbl)
    {
        String path = null;
        JFileChooser fChooser = new JFileChooser();
        fChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        // file extension
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.images", "jpg", "png", "gif");
        fChooser.addChoosableFileFilter(fileFilter);

        int fileState = fChooser.showSaveDialog(null);

        // if user user selects a file
        if (fileState == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fChooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
//            imagePth = path;

            // Display the image in the jLabel using resize image
            lbl.setIcon(resizePic(path,null, lbl.getWidth(), lbl.getHeight()));
            //           jLabelPicture.setIcon(new ImageIcon(path));
        }
        // if the user cancels
        else if(fileState == JFileChooser.CANCEL_OPTION)
        {
            System.out.println("No image selected");
        }
        return path;
    }
}


