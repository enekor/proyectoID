import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private JPanel mainPanel;
    //componentes de la barra de menú
    private JMenuBar menu;
    private JMenu menuFile;
    private JMenuItem menuFileNew;
    private JMenuItem menuFileOpen;
    private JMenuItem menuFileSave;
    private JMenuItem menuFileSaveAs;
    private JMenuItem menuFileClose;
    private JMenu menuEdit;
    private JMenuItem menuEditCopy;
    private JMenuItem menuEditPaste;
    private JMenuItem menuEditCut;
    private JMenuItem menuEditDelete;
    private JMenu menuHelp;
    private JMenuItem menuHelpInfo;
    private JMenuItem menuHelpHelp;
    private JMenu menuTools;
    private JMenuItem menuToolsRun;
    private JMenuItem menuToolsCompile;

    private JPanel panel1;
    private JPanel toolbar;
    private JButton button1;
    private JButton button2;
    private JTree tree1;
    private JPanel center_area;
    private JPanel terminal;
    private JTextArea inputTerminal;
    private JPanel output;
    private JTextArea outputTerminal;

    public Ventana(){
        initComponents();
    }

    public void initComponents(){
        //instanciación de componentes
        menu = new JMenuBar();
            menuFile = new JMenu("File");
                menuFileNew = new JMenuItem("New");
                menuFileOpen = new JMenuItem("Open");
                menuFileSave = new JMenuItem("Save");
                menuFileSaveAs = new JMenuItem("Save As");
                menuFileClose = new JMenuItem("Close");
            menuEdit = new JMenu("Edit");
                menuEditCopy = new JMenuItem("Copy");
                menuEditPaste = new JMenuItem("Paste");
                menuEditCut = new JMenuItem("Cut");
                menuEditDelete = new JMenuItem("Delete");
            menuTools = new JMenu("Tools");
                menuToolsRun = new JMenuItem("Run");
                menuToolsCompile = new JMenuItem("Compile");
            menuHelp = new JMenu("Help");
                menuHelpInfo = new JMenuItem("Information");
                menuHelpHelp = new JMenuItem("Help");



        //creación del menú
        menu.add(menuFile);
            menuFile.add(menuFileNew);
            menuFile.add(menuFileOpen);
            menuFile.add(menuFileSave);
            menuFile.add(menuFileSaveAs);
            menuFile.add(menuFileClose);
        menu.add(menuEdit);
            menuEdit.add(menuEditCopy);
            menuEdit.add(menuEditPaste);
            menuEdit.add(menuEditCut);
            menuEdit.add(menuEditDelete);
        menu.add(menuTools);
            menuTools.add(menuToolsRun);
            menuTools.add(menuToolsCompile);
        menu.add(menuHelp);
            menuHelp.add(menuHelpInfo);
            menuHelp.add(menuHelpHelp);

        //añadir componentes a la ventana
        this.setJMenuBar(menu);
        this.add(panel1);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(500,500));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

    }

}

