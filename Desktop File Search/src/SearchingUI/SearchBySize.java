package SearchingUI;

import MyFinalSearchPackage.Mypopup;
import SearchingUI.Search;
import SearchingUI.Search.copyFiles12;
import java.awt.Desktop;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALPHADESK
 */
public class SearchBySize extends javax.swing.JInternalFrame {

    private long FileSearchSize = 0;
    public File CopiedFile;
    private Thread CurrentThread1 = null;
    public JMenuItem Ddrive = new JMenuItem("Drive D");
    public JMenuItem Cdrive = new JMenuItem("Drive C");
    public JMenuItem Edrive = new JMenuItem("Drive E");
    public JMenuItem Fdrive = new JMenuItem("Drive F");
    public JMenuItem Gdrive = new JMenuItem("Drive G");
    public JMenuItem Hdrive = new JMenuItem("Drive H");
    public JMenuItem Idrive = new JMenuItem("Drive I");
    public JMenuItem Jdrive = new JMenuItem("Drive J");
    public JMenuItem Kdrive = new JMenuItem("Drive K");
    public JMenuItem Ldrive = new JMenuItem("Drive L");
    public JMenuItem Mdrive = new JMenuItem("Drive L");
    public JMenuItem Ndrive = new JMenuItem("Drive L");
    public JMenuItem Odrive = new JMenuItem("Drive L");
    public JMenuItem Pdrive = new JMenuItem("Drive L");
    public JMenuItem Qdrive = new JMenuItem("Drive L");
    public JMenuItem Rdrive = new JMenuItem("Drive L");
    public JMenuItem Sdrive = new JMenuItem("Drive L");
    public JMenuItem Tdrive = new JMenuItem("Drive L");
    public JMenuItem Udrive = new JMenuItem("Drive L");
    public JMenuItem Vdrive = new JMenuItem("Drive L");
    public JMenuItem Wdrive = new JMenuItem("Drive L");
    public JMenuItem Xdrive = new JMenuItem("Drive L");
    public JMenuItem Ydrive = new JMenuItem("Drive L");
    public JMenuItem Zdrive = new JMenuItem("Drive L");
    public JMenuItem Bdrive = new JMenuItem("Drive L");
    public JMenuItem Adrive = new JMenuItem("Drive L");
    public DefaultTableModel model;

    /** Creates new form NewJInternalFrame */
    public SearchBySize() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);


        model = (DefaultTableModel) jTable1.getModel();
        MouseListener popuplistener = new Mypopup(jPopupMenu1);
        jTable1.addMouseListener(popuplistener);

        if (new File("D:\\").isDirectory() && (jComboBox1.getItemAt(3) == null)
                && (jComboBox1.getItemAt(3) != "Drive D")) {
            jComboBox1.addItem("Drive D");

        }

        if (new File("E:\\").isDirectory() && (jComboBox1.getItemAt(4) == null)
                && (jComboBox1.getItemAt(3) != "Drive E")
                && (jComboBox1.getItemAt(4) != "Drive E")) {
            jComboBox1.addItem("Drive E");

        }


        if (new File("F:\\").isDirectory() && (jComboBox1.getItemAt(5) == null)
                && (jComboBox1.getItemAt(3) != "Drive F")
                && (jComboBox1.getItemAt(4) != "Drive F")
                && (jComboBox1.getItemAt(5) != "Drive F")) {
            jComboBox1.addItem("Drive F");

        }

        if (new File("G:\\").isDirectory() && (jComboBox1.getItemAt(6) == null)
                && (jComboBox1.getItemAt(3) != "Drive G")
                && (jComboBox1.getItemAt(4) != "Drive G")
                && (jComboBox1.getItemAt(5) != "Drive G")
                && (jComboBox1.getItemAt(6) != "Drive G")) {
            jComboBox1.addItem("Drive G");

        }

        if (new File("H:\\").isDirectory()
                && (jComboBox1.getItemAt(7) == null)
                && (jComboBox1.getItemAt(3) != "Drive H")
                && (jComboBox1.getItemAt(4) != "Drive H")
                && (jComboBox1.getItemAt(5) != "Drive H")
                && (jComboBox1.getItemAt(6) != "Drive H")
                && (jComboBox1.getItemAt(7) != "Drive H")) {
            jComboBox1.addItem("Drive H");

        }

        if (new File("I:\\").isDirectory() && (jComboBox1.getItemAt(8) == null)
                && (jComboBox1.getItemAt(3) != "Drive I")
                && (jComboBox1.getItemAt(4) != "Drive I")
                && (jComboBox1.getItemAt(5) != "Drive I")
                && (jComboBox1.getItemAt(6) != "Drive I")
                && (jComboBox1.getItemAt(7) != "Drive I")
                && (jComboBox1.getItemAt(8) != "Drive I")) {
            jComboBox1.addItem("Drive I");

        }

        if (new File("J:\\").isDirectory()
                && (jComboBox1.getItemAt(9) == null)
                && (jComboBox1.getItemAt(3) != "Drive J")
                && (jComboBox1.getItemAt(4) != "Drive J")
                && (jComboBox1.getItemAt(5) != "Drive J")
                && (jComboBox1.getItemAt(6) != "Drive J")
                && (jComboBox1.getItemAt(7) != "Drive J")
                && (jComboBox1.getItemAt(8) != "Drive J")
                && (jComboBox1.getItemAt(9) != "Drive J")) {
            jComboBox1.addItem("Drive J");

        }

        if (new File("K:\\").isDirectory()
                && (jComboBox1.getItemAt(10) == null)
                && (jComboBox1.getItemAt(3) != "Drive K")
                && (jComboBox1.getItemAt(4) != "Drive K")
                && (jComboBox1.getItemAt(5) != "Drive K")
                && (jComboBox1.getItemAt(6) != "Drive K")
                && (jComboBox1.getItemAt(7) != "Drive K")
                && (jComboBox1.getItemAt(8) != "Drive K")
                && (jComboBox1.getItemAt(9) != "Drive K")
                && (jComboBox1.getItemAt(10) != "Drive K")) {
            jComboBox1.addItem("Drive K");

        }

        if (new File("L:\\").isDirectory()
                && (jComboBox1.getItemAt(11) == null)
                && (jComboBox1.getItemAt(3) != "Drive L")
                && (jComboBox1.getItemAt(4) != "Drive L")
                && (jComboBox1.getItemAt(5) != "Drive L")
                && (jComboBox1.getItemAt(6) != "Drive L")
                && (jComboBox1.getItemAt(7) != "Drive L")
                && (jComboBox1.getItemAt(8) != "Drive L")
                && (jComboBox1.getItemAt(9) != "Drive L")
                && (jComboBox1.getItemAt(10) != "Drive L")
                && (jComboBox1.getItemAt(11) != "Drive L")) {
            jComboBox1.addItem("Drive L");
        }

        if (new File("M:\\").isDirectory()
                && (jComboBox1.getItemAt(12) == null)
                && (jComboBox1.getItemAt(3) != "Drive M")
                && (jComboBox1.getItemAt(4) != "Drive M")
                && (jComboBox1.getItemAt(5) != "Drive M")
                && (jComboBox1.getItemAt(6) != "Drive M")
                && (jComboBox1.getItemAt(7) != "Drive M")
                && (jComboBox1.getItemAt(8) != "Drive M")
                && (jComboBox1.getItemAt(9) != "Drive M")
                && (jComboBox1.getItemAt(10) != "Drive M")
                && (jComboBox1.getItemAt(11) != "Drive M")
                && (jComboBox1.getItemAt(12) != "Drive M")) {
            jComboBox1.addItem("Drive M");

        }

        if (new File("N:\\").isDirectory()
                && (jComboBox1.getItemAt(13) == null)
                && (jComboBox1.getItemAt(3) != "Drive N")
                && (jComboBox1.getItemAt(4) != "Drive N")
                && (jComboBox1.getItemAt(5) != "Drive N")
                && (jComboBox1.getItemAt(6) != "Drive N")
                && (jComboBox1.getItemAt(7) != "Drive N")
                && (jComboBox1.getItemAt(8) != "Drive N")
                && (jComboBox1.getItemAt(9) != "Drive N")
                && (jComboBox1.getItemAt(10) != "Drive N")
                && (jComboBox1.getItemAt(11) != "Drive N")
                && (jComboBox1.getItemAt(12) != "Drive N")
                && (jComboBox1.getItemAt(13) != "Drive N")) {
            jComboBox1.addItem("Drive N");

        }

        if (new File("O:\\").isDirectory()
                && (jComboBox1.getItemAt(14) == null)
                && (jComboBox1.getItemAt(3) != "Drive O")
                && (jComboBox1.getItemAt(4) != "Drive O")
                && (jComboBox1.getItemAt(5) != "Drive O")
                && (jComboBox1.getItemAt(6) != "Drive O")
                && (jComboBox1.getItemAt(7) != "Drive O")
                && (jComboBox1.getItemAt(8) != "Drive O")
                && (jComboBox1.getItemAt(9) != "Drive O")
                && (jComboBox1.getItemAt(10) != "Drive O")
                && (jComboBox1.getItemAt(11) != "Drive O")
                && (jComboBox1.getItemAt(12) != "Drive O")
                && (jComboBox1.getItemAt(13) != "Drive O")
                && (jComboBox1.getItemAt(14) != "Drive O")) {
            jComboBox1.addItem("Drive O");

        }

        if (new File("P:\\").isDirectory()
                && (jComboBox1.getItemAt(15) == null)
                && (jComboBox1.getItemAt(3) != "Drive P")
                && (jComboBox1.getItemAt(4) != "Drive P")
                && (jComboBox1.getItemAt(5) != "Drive P")
                && (jComboBox1.getItemAt(6) != "Drive P")
                && (jComboBox1.getItemAt(7) != "Drive P")
                && (jComboBox1.getItemAt(8) != "Drive P")
                && (jComboBox1.getItemAt(9) != "Drive P")
                && (jComboBox1.getItemAt(10) != "Drive P")
                && (jComboBox1.getItemAt(11) != "Drive P")
                && (jComboBox1.getItemAt(12) != "Drive P")
                && (jComboBox1.getItemAt(13) != "Drive P")
                && (jComboBox1.getItemAt(14) != "Drive P")
                && (jComboBox1.getItemAt(15) != "Drive P")) {
            jComboBox1.addItem("Drive P");

        }

        if (new File("Q:\\").isDirectory()
                && (jComboBox1.getItemAt(16) == null)
                && (jComboBox1.getItemAt(3) != "Drive Q")
                && (jComboBox1.getItemAt(4) != "Drive Q")
                && (jComboBox1.getItemAt(5) != "Drive Q")
                && (jComboBox1.getItemAt(6) != "Drive Q")
                && (jComboBox1.getItemAt(7) != "Drive Q")
                && (jComboBox1.getItemAt(8) != "Drive Q")
                && (jComboBox1.getItemAt(9) != "Drive Q")
                && (jComboBox1.getItemAt(10) != "Drive Q")
                && (jComboBox1.getItemAt(11) != "Drive Q")
                && (jComboBox1.getItemAt(12) != "Drive Q")
                && (jComboBox1.getItemAt(13) != "Drive Q")
                && (jComboBox1.getItemAt(14) != "Drive Q")
                && (jComboBox1.getItemAt(15) != "Drive Q")
                && (jComboBox1.getItemAt(16) != "Drive Q")) {
            jComboBox1.addItem("Drive Q");

        }

        if (new File("R:\\").isDirectory()
                && (jComboBox1.getItemAt(17) == null)
                && (jComboBox1.getItemAt(3) != "Drive R")
                && (jComboBox1.getItemAt(4) != "Drive R")
                && (jComboBox1.getItemAt(5) != "Drive R")
                && (jComboBox1.getItemAt(6) != "Drive R")
                && (jComboBox1.getItemAt(7) != "Drive R")
                && (jComboBox1.getItemAt(8) != "Drive R")
                && (jComboBox1.getItemAt(9) != "Drive R")
                && (jComboBox1.getItemAt(10) != "Drive R")
                && (jComboBox1.getItemAt(11) != "Drive R")
                && (jComboBox1.getItemAt(12) != "Drive R")
                && (jComboBox1.getItemAt(13) != "Drive R")
                && (jComboBox1.getItemAt(14) != "Drive R")
                && (jComboBox1.getItemAt(15) != "Drive R")
                && (jComboBox1.getItemAt(16) != "Drive R")
                && (jComboBox1.getItemAt(17) != "Drive R")) {
            jComboBox1.addItem("Drive R");

        }

        if (new File("S:\\").isDirectory()
                && (jComboBox1.getItemAt(18) == null)
                && (jComboBox1.getItemAt(3) != "Drive S")
                && (jComboBox1.getItemAt(4) != "Drive S")
                && (jComboBox1.getItemAt(5) != "Drive S")
                && (jComboBox1.getItemAt(6) != "Drive S")
                && (jComboBox1.getItemAt(7) != "Drive S")
                && (jComboBox1.getItemAt(8) != "Drive S")
                && (jComboBox1.getItemAt(9) != "Drive S")
                && (jComboBox1.getItemAt(10) != "Drive S")
                && (jComboBox1.getItemAt(11) != "Drive S")
                && (jComboBox1.getItemAt(12) != "Drive S")
                && (jComboBox1.getItemAt(13) != "Drive S")
                && (jComboBox1.getItemAt(14) != "Drive S")
                && (jComboBox1.getItemAt(15) != "Drive S")
                && (jComboBox1.getItemAt(16) != "Drive S")
                && (jComboBox1.getItemAt(17) != "Drive S")
                && (jComboBox1.getItemAt(18) != "Drive S")) {
            jComboBox1.addItem("Drive S");

        }

        if (new File("T:\\").isDirectory()
                && (jComboBox1.getItemAt(19) == null)
                && (jComboBox1.getItemAt(3) != "Drive T")
                && (jComboBox1.getItemAt(4) != "Drive T")
                && (jComboBox1.getItemAt(5) != "Drive T")
                && (jComboBox1.getItemAt(6) != "Drive T")
                && (jComboBox1.getItemAt(7) != "Drive T")
                && (jComboBox1.getItemAt(8) != "Drive T")
                && (jComboBox1.getItemAt(9) != "Drive T")
                && (jComboBox1.getItemAt(10) != "Drive T")
                && (jComboBox1.getItemAt(11) != "Drive T")
                && (jComboBox1.getItemAt(12) != "Drive T")
                && (jComboBox1.getItemAt(13) != "Drive T")
                && (jComboBox1.getItemAt(14) != "Drive T")
                && (jComboBox1.getItemAt(15) != "Drive T")
                && (jComboBox1.getItemAt(16) != "Drive T")
                && (jComboBox1.getItemAt(17) != "Drive T")
                && (jComboBox1.getItemAt(18) != "Drive T")
                && (jComboBox1.getItemAt(19) != "Drive T")) {
            jComboBox1.addItem("Drive T");

        }

        if (new File("U:\\").isDirectory()
                && (jComboBox1.getItemAt(20) == null)
                && (jComboBox1.getItemAt(3) != "Drive U")
                && (jComboBox1.getItemAt(4) != "Drive U")
                && (jComboBox1.getItemAt(5) != "Drive U")
                && (jComboBox1.getItemAt(6) != "Drive U")
                && (jComboBox1.getItemAt(7) != "Drive U")
                && (jComboBox1.getItemAt(8) != "Drive U")
                && (jComboBox1.getItemAt(9) != "Drive U")
                && (jComboBox1.getItemAt(10) != "Drive U")
                && (jComboBox1.getItemAt(11) != "Drive U")
                && (jComboBox1.getItemAt(12) != "Drive U")
                && (jComboBox1.getItemAt(13) != "Drive U")
                && (jComboBox1.getItemAt(14) != "Drive U")
                && (jComboBox1.getItemAt(15) != "Drive U")
                && (jComboBox1.getItemAt(16) != "Drive U")
                && (jComboBox1.getItemAt(17) != "Drive U")
                && (jComboBox1.getItemAt(18) != "Drive U")
                && (jComboBox1.getItemAt(19) != "Drive U")
                && (jComboBox1.getItemAt(20) != "Drive U")) {
            jComboBox1.addItem("Drive U");

        }

        if (new File("V:\\").isDirectory()
                && (jComboBox1.getItemAt(21) == null)
                && (jComboBox1.getItemAt(3) != "Drive V")
                && (jComboBox1.getItemAt(4) != "Drive V")
                && (jComboBox1.getItemAt(5) != "Drive V")
                && (jComboBox1.getItemAt(6) != "Drive V")
                && (jComboBox1.getItemAt(7) != "Drive V")
                && (jComboBox1.getItemAt(8) != "Drive V")
                && (jComboBox1.getItemAt(9) != "Drive V")
                && (jComboBox1.getItemAt(10) != "Drive V")
                && (jComboBox1.getItemAt(11) != "Drive V")
                && (jComboBox1.getItemAt(12) != "Drive V")
                && (jComboBox1.getItemAt(13) != "Drive V")
                && (jComboBox1.getItemAt(14) != "Drive V")
                && (jComboBox1.getItemAt(15) != "Drive V")
                && (jComboBox1.getItemAt(16) != "Drive V")
                && (jComboBox1.getItemAt(17) != "Drive V")
                && (jComboBox1.getItemAt(18) != "Drive V")
                && (jComboBox1.getItemAt(19) != "Drive V")
                && (jComboBox1.getItemAt(20) != "Drive V")
                && (jComboBox1.getItemAt(21) != "Drive V")) {
            jComboBox1.addItem("Drive V");

        }

        if (new File("W:\\").isDirectory()
                && (jComboBox1.getItemAt(22) == null)
                && (jComboBox1.getItemAt(3) != "Drive W")
                && (jComboBox1.getItemAt(4) != "Drive W")
                && (jComboBox1.getItemAt(5) != "Drive W")
                && (jComboBox1.getItemAt(6) != "Drive W")
                && (jComboBox1.getItemAt(7) != "Drive W")
                && (jComboBox1.getItemAt(8) != "Drive W")
                && (jComboBox1.getItemAt(9) != "Drive W")
                && (jComboBox1.getItemAt(10) != "Drive W")
                && (jComboBox1.getItemAt(11) != "Drive W")
                && (jComboBox1.getItemAt(12) != "Drive W")
                && (jComboBox1.getItemAt(13) != "Drive W")
                && (jComboBox1.getItemAt(14) != "Drive W")
                && (jComboBox1.getItemAt(15) != "Drive W")
                && (jComboBox1.getItemAt(16) != "Drive W")
                && (jComboBox1.getItemAt(17) != "Drive W")
                && (jComboBox1.getItemAt(18) != "Drive W")
                && (jComboBox1.getItemAt(19) != "Drive W")
                && (jComboBox1.getItemAt(20) != "Drive W")
                && (jComboBox1.getItemAt(21) != "Drive W")
                && (jComboBox1.getItemAt(22) != "Drive W")) {
            jComboBox1.addItem("Drive W");

        }

        if (new File("X:\\").isDirectory()
                && (jComboBox1.getItemAt(23) == null)
                && (jComboBox1.getItemAt(3) != "Drive X")
                && (jComboBox1.getItemAt(4) != "Drive X")
                && (jComboBox1.getItemAt(5) != "Drive X")
                && (jComboBox1.getItemAt(6) != "Drive X")
                && (jComboBox1.getItemAt(7) != "Drive X")
                && (jComboBox1.getItemAt(8) != "Drive X")
                && (jComboBox1.getItemAt(9) != "Drive X")
                && (jComboBox1.getItemAt(10) != "Drive X")
                && (jComboBox1.getItemAt(11) != "Drive X")
                && (jComboBox1.getItemAt(12) != "Drive X")
                && (jComboBox1.getItemAt(13) != "Drive X")
                && (jComboBox1.getItemAt(14) != "Drive X")
                && (jComboBox1.getItemAt(15) != "Drive X")
                && (jComboBox1.getItemAt(16) != "Drive X")
                && (jComboBox1.getItemAt(17) != "Drive X")
                && (jComboBox1.getItemAt(18) != "Drive X")
                && (jComboBox1.getItemAt(19) != "Drive X")
                && (jComboBox1.getItemAt(20) != "Drive X")
                && (jComboBox1.getItemAt(21) != "Drive X")
                && (jComboBox1.getItemAt(22) != "Drive X")
                && (jComboBox1.getItemAt(23) != "Drive X")) {
            jComboBox1.addItem("Drive X");

        }

        if (new File("Y:\\").isDirectory()
                && (jComboBox1.getItemAt(24) == null)
                && (jComboBox1.getItemAt(3) != "Drive Y")
                && (jComboBox1.getItemAt(4) != "Drive Y")
                && (jComboBox1.getItemAt(5) != "Drive Y")
                && (jComboBox1.getItemAt(6) != "Drive Y")
                && (jComboBox1.getItemAt(7) != "Drive Y")
                && (jComboBox1.getItemAt(8) != "Drive Y")
                && (jComboBox1.getItemAt(9) != "Drive Y")
                && (jComboBox1.getItemAt(10) != "Drive Y")
                && (jComboBox1.getItemAt(11) != "Drive Y")
                && (jComboBox1.getItemAt(12) != "Drive Y")
                && (jComboBox1.getItemAt(13) != "Drive Y")
                && (jComboBox1.getItemAt(14) != "Drive Y")
                && (jComboBox1.getItemAt(15) != "Drive Y")
                && (jComboBox1.getItemAt(16) != "Drive Y")
                && (jComboBox1.getItemAt(17) != "Drive Y")
                && (jComboBox1.getItemAt(18) != "Drive Y")
                && (jComboBox1.getItemAt(19) != "Drive Y")
                && (jComboBox1.getItemAt(20) != "Drive Y")
                && (jComboBox1.getItemAt(21) != "Drive Y")
                && (jComboBox1.getItemAt(22) != "Drive Y")
                && (jComboBox1.getItemAt(23) != "Drive Y")
                && (jComboBox1.getItemAt(24) != "Drive Y")) {
            jComboBox1.addItem("Drive Y");

        }

        if (new File("Z:\\").isDirectory()
                && (jComboBox1.getItemAt(25) == null)
                && (jComboBox1.getItemAt(3) != "Drive Z")
                && (jComboBox1.getItemAt(4) != "Drive Z")
                && (jComboBox1.getItemAt(5) != "Drive Z")
                && (jComboBox1.getItemAt(6) != "Drive Z")
                && (jComboBox1.getItemAt(7) != "Drive Z")
                && (jComboBox1.getItemAt(8) != "Drive Z")
                && (jComboBox1.getItemAt(9) != "Drive Z")
                && (jComboBox1.getItemAt(10) != "Drive Z")
                && (jComboBox1.getItemAt(11) != "Drive Z")
                && (jComboBox1.getItemAt(12) != "Drive Z")
                && (jComboBox1.getItemAt(13) != "Drive Z")
                && (jComboBox1.getItemAt(14) != "Drive Z")
                && (jComboBox1.getItemAt(15) != "Drive Z")
                && (jComboBox1.getItemAt(16) != "Drive Z")
                && (jComboBox1.getItemAt(17) != "Drive Z")
                && (jComboBox1.getItemAt(18) != "Drive Z")
                && (jComboBox1.getItemAt(19) != "Drive Z")
                && (jComboBox1.getItemAt(20) != "Drive Z")
                && (jComboBox1.getItemAt(21) != "Drive Z")
                && (jComboBox1.getItemAt(22) != "Drive Z")
                && (jComboBox1.getItemAt(23) != "Drive Z")
                && (jComboBox1.getItemAt(24) != "Drive Z")
                && (jComboBox1.getItemAt(25) != "Drive Z")) {
            jComboBox1.addItem("Drive Z");

        }

        if (new File("A:\\").isDirectory()
                && (jComboBox1.getItemAt(26) == null)
                && (jComboBox1.getItemAt(3) != "Drive A")
                && (jComboBox1.getItemAt(4) != "Drive A")
                && (jComboBox1.getItemAt(5) != "Drive A")
                && (jComboBox1.getItemAt(6) != "Drive A")
                && (jComboBox1.getItemAt(7) != "Drive A")
                && (jComboBox1.getItemAt(8) != "Drive A")
                && (jComboBox1.getItemAt(9) != "Drive A")
                && (jComboBox1.getItemAt(10) != "Drive A")
                && (jComboBox1.getItemAt(11) != "Drive A")
                && (jComboBox1.getItemAt(12) != "Drive A")
                && (jComboBox1.getItemAt(13) != "Drive A")
                && (jComboBox1.getItemAt(14) != "Drive A")
                && (jComboBox1.getItemAt(15) != "Drive A")
                && (jComboBox1.getItemAt(16) != "Drive A")
                && (jComboBox1.getItemAt(17) != "Drive A")
                && (jComboBox1.getItemAt(18) != "Drive A")
                && (jComboBox1.getItemAt(19) != "Drive A")
                && (jComboBox1.getItemAt(20) != "Drive A")
                && (jComboBox1.getItemAt(21) != "Drive A")
                && (jComboBox1.getItemAt(22) != "Drive A")
                && (jComboBox1.getItemAt(23) != "Drive A")
                && (jComboBox1.getItemAt(24) != "Drive A")
                && (jComboBox1.getItemAt(25) != "Drive A")
                && (jComboBox1.getItemAt(26) != "Drive A")) {
            jComboBox1.addItem("Drive A");
        }

        if (new File("B:\\").isDirectory()
                && (jComboBox1.getItemAt(27) == null)
                && (jComboBox1.getItemAt(3) != "Drive B")
                && (jComboBox1.getItemAt(4) != "Drive B")
                && (jComboBox1.getItemAt(5) != "Drive B")
                && (jComboBox1.getItemAt(6) != "Drive B")
                && (jComboBox1.getItemAt(7) != "Drive B")
                && (jComboBox1.getItemAt(8) != "Drive B")
                && (jComboBox1.getItemAt(9) != "Drive B")
                && (jComboBox1.getItemAt(10) != "Drive B")
                && (jComboBox1.getItemAt(11) != "Drive B")
                && (jComboBox1.getItemAt(12) != "Drive B")
                && (jComboBox1.getItemAt(13) != "Drive B")
                && (jComboBox1.getItemAt(14) != "Drive B")
                && (jComboBox1.getItemAt(15) != "Drive B")
                && (jComboBox1.getItemAt(16) != "Drive B")
                && (jComboBox1.getItemAt(17) != "Drive B")
                && (jComboBox1.getItemAt(18) != "Drive B")
                && (jComboBox1.getItemAt(19) != "Drive B")
                && (jComboBox1.getItemAt(20) != "Drive B")
                && (jComboBox1.getItemAt(21) != "Drive B")
                && (jComboBox1.getItemAt(22) != "Drive B")
                && (jComboBox1.getItemAt(23) != "Drive B")
                && (jComboBox1.getItemAt(24) != "Drive B")
                && (jComboBox1.getItemAt(25) != "Drive B")
                && (jComboBox1.getItemAt(26) != "Drive B")
                && (jComboBox1.getItemAt(27) != "Drive B")) {
            jComboBox1.addItem("Drive B");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        open = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        copy = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        Delete = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        jSeparator1.setBackground(new java.awt.Color(255, 51, 204));
        jPopupMenu1.add(jSeparator1);

        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jPopupMenu1.add(open);

        jSeparator6.setBackground(new java.awt.Color(255, 51, 204));
        jPopupMenu1.add(jSeparator6);

        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(copy);

        jSeparator7.setBackground(new java.awt.Color(255, 51, 204));
        jPopupMenu1.add(jSeparator7);

        jSeparator9.setBackground(new java.awt.Color(255, 51, 204));
        jPopupMenu1.add(jSeparator9);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Delete);

        jSeparator2.setBackground(new java.awt.Color(255, 51, 204));
        jPopupMenu1.add(jSeparator2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/SearchingUI/MyFinalSearchLogo.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SearchingUI/MyFinalSearchLogo (2).png"))); // NOI18N
        jLabel1.setText("Enter the minimun size of file");

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(204, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Size>", "Bytes", "KB", "MB", "GB" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Name", "File Path", "File Size"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setText("Cancel Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton3)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 102, 204));

        jComboBox1.setBackground(new java.awt.Color(51, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 102, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<--Select-->", "Drive C" }));

        jButton2.setBackground(new java.awt.Color(255, 102, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(63, 63, 63))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CheckingDrives chk = new CheckingDrives();

        chk.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((jTextField1.getText()!=null&&jComboBox1.getSelectedIndex()!=0&&jComboBox2.getSelectedIndex()!=0))
        {
          Thread av1 = new SearchBySize1();
        long FileSize = Integer.parseInt(jTextField1.getText());

        if (jComboBox2.getSelectedItem() == "Bytes") {
            FileSearchSize = FileSize;
        } else if (jComboBox2.getSelectedItem() == "KB") {
            FileSearchSize = (FileSize*1024);
        } else if (jComboBox2.getSelectedItem() == "MB") {
            FileSearchSize = FileSize *(1024*1024);
        } else if (jComboBox2.getSelectedItem() == "GB") {
            FileSearchSize = FileSize*(1024*1024*1024);
        } else {
            JOptionPane.showMessageDialog(null, "Select the size from the Drop down Menu");
        }
        if (CurrentThread1 == null) {
            av1.start();
        } else {
            JOptionPane.showMessageDialog(null, "Please wait   \nOne search is already running\n Please cancel the previous search");
        }  
        }
        else{
            JOptionPane.showMessageDialog(null, "You must Enter the minimum size\n and the location to search for");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (CurrentThread1.isAlive()) {
                CurrentThread1.suspend();
                CurrentThread1=null;
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
      

    }//GEN-LAST:event_jTable1PropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       Object obj = model.getValueAt(jTable1.getSelectedRow(), 1);
        try
        {
        ImageIcon thumbnail = new prev().loadImage(new File(obj+""));
        jLabel2.setIcon(thumbnail);
        if(jLabel2.getIcon()==null)
            jLabel2.setText("No Preview");

        }catch(Exception e)
        {

        }

        jLabel3.setText(new File(obj + "").getName());
        jLabel5.setText(new File(obj + "").length() + " Bytes");
        jLabel4.setText(new File(obj + "").getAbsolutePath());
        jLabel5.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel2.setVisible(true);
        jLabel1.setVisible(true);

    }//GEN-LAST:event_jTable1MouseClicked

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
         Object obj = new Object();
        obj = model.getValueAt(jTable1.getSelectedRow(), 1);
        String FilePath = obj + "";
        try {
            File fff = new File(FilePath);

            Desktop.getDesktop().open(fff);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File Cannot be accessed ! \nOr You Can Change the Default media player/ software");
        }
    }//GEN-LAST:event_openActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       Object obj = new Object();
        obj = model.getValueAt(jTable1.getSelectedRow(), 1);
        if (new EditingFunctions().delete(obj + "")) {
            int i = jTable1.getSelectedRow();
            model.removeRow(i);
            JOptionPane.showMessageDialog(null, "File Deleted");
        } else {
            JOptionPane.showMessageDialog(null, "File not Deleted");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
       Object obj = model.getValueAt(jTable1.getSelectedRow(), 1);
       File newFile = new File(obj+"");
       Search.copyFiles12 ff = new Search().new copyFiles12();

       ff.FileCopy(newFile);
    }//GEN-LAST:event_copyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Delete;
    private javax.swing.JMenuItem copy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem open;
    // End of variables declaration//GEN-END:variables

    public class CheckingDrives extends Thread {

        Search sc = new Search();

        @Override
        public void run() {

            if (new File("D:\\").isDirectory() && (jComboBox1.getItemAt(3) == null)
                    && (jComboBox1.getItemAt(3) != "Drive D")) {
                jComboBox1.addItem("Drive D");


            }

            if (new File("E:\\").isDirectory() && (jComboBox1.getItemAt(4) == null)
                    && (jComboBox1.getItemAt(3) != "Drive E")
                    && (jComboBox1.getItemAt(4) != "Drive E")) {
                jComboBox1.addItem("Drive E");
            }


            if (new File("F:\\").isDirectory() && (jComboBox1.getItemAt(5) == null)
                    && (jComboBox1.getItemAt(3) != "Drive F")
                    && (jComboBox1.getItemAt(4) != "Drive F")
                    && (jComboBox1.getItemAt(5) != "Drive F")) {
                jComboBox1.addItem("Drive F");
            }

            if (new File("G:\\").isDirectory() && (jComboBox1.getItemAt(6) == null)
                    && (jComboBox1.getItemAt(3) != "Drive G")
                    && (jComboBox1.getItemAt(4) != "Drive G")
                    && (jComboBox1.getItemAt(5) != "Drive G")
                    && (jComboBox1.getItemAt(6) != "Drive G")) {
                jComboBox1.addItem("Drive G");
            }

            if (new File("H:\\").isDirectory()
                    && (jComboBox1.getItemAt(7) == null)
                    && (jComboBox1.getItemAt(3) != "Drive H")
                    && (jComboBox1.getItemAt(4) != "Drive H")
                    && (jComboBox1.getItemAt(5) != "Drive H")
                    && (jComboBox1.getItemAt(6) != "Drive H")
                    && (jComboBox1.getItemAt(7) != "Drive H")) {
                jComboBox1.addItem("Drive H");
            }

            if (new File("I:\\").isDirectory() && (jComboBox1.getItemAt(8) == null)
                    && (jComboBox1.getItemAt(3) != "Drive I")
                    && (jComboBox1.getItemAt(4) != "Drive I")
                    && (jComboBox1.getItemAt(5) != "Drive I")
                    && (jComboBox1.getItemAt(6) != "Drive I")
                    && (jComboBox1.getItemAt(7) != "Drive I")
                    && (jComboBox1.getItemAt(8) != "Drive I")) {
                jComboBox1.addItem("Drive I");
            }

            if (new File("J:\\").isDirectory()
                    && (jComboBox1.getItemAt(9) == null)
                    && (jComboBox1.getItemAt(3) != "Drive J")
                    && (jComboBox1.getItemAt(4) != "Drive J")
                    && (jComboBox1.getItemAt(5) != "Drive J")
                    && (jComboBox1.getItemAt(6) != "Drive J")
                    && (jComboBox1.getItemAt(7) != "Drive J")
                    && (jComboBox1.getItemAt(8) != "Drive J")
                    && (jComboBox1.getItemAt(9) != "Drive J")) {
                jComboBox1.addItem("Drive J");
            }

            if (new File("K:\\").isDirectory()
                    && (jComboBox1.getItemAt(10) == null)
                    && (jComboBox1.getItemAt(3) != "Drive K")
                    && (jComboBox1.getItemAt(4) != "Drive K")
                    && (jComboBox1.getItemAt(5) != "Drive K")
                    && (jComboBox1.getItemAt(6) != "Drive K")
                    && (jComboBox1.getItemAt(7) != "Drive K")
                    && (jComboBox1.getItemAt(8) != "Drive K")
                    && (jComboBox1.getItemAt(9) != "Drive K")
                    && (jComboBox1.getItemAt(10) != "Drive K")) {
                jComboBox1.addItem("Drive K");
            }

            if (new File("L:\\").isDirectory()
                    && (jComboBox1.getItemAt(11) == null)
                    && (jComboBox1.getItemAt(3) != "Drive L")
                    && (jComboBox1.getItemAt(4) != "Drive L")
                    && (jComboBox1.getItemAt(5) != "Drive L")
                    && (jComboBox1.getItemAt(6) != "Drive L")
                    && (jComboBox1.getItemAt(7) != "Drive L")
                    && (jComboBox1.getItemAt(8) != "Drive L")
                    && (jComboBox1.getItemAt(9) != "Drive L")
                    && (jComboBox1.getItemAt(10) != "Drive L")
                    && (jComboBox1.getItemAt(11) != "Drive L")) {
                jComboBox1.addItem("Drive L");

            }

            if (new File("M:\\").isDirectory()
                    && (jComboBox1.getItemAt(12) == null)
                    && (jComboBox1.getItemAt(3) != "Drive M")
                    && (jComboBox1.getItemAt(4) != "Drive M")
                    && (jComboBox1.getItemAt(5) != "Drive M")
                    && (jComboBox1.getItemAt(6) != "Drive M")
                    && (jComboBox1.getItemAt(7) != "Drive M")
                    && (jComboBox1.getItemAt(8) != "Drive M")
                    && (jComboBox1.getItemAt(9) != "Drive M")
                    && (jComboBox1.getItemAt(10) != "Drive M")
                    && (jComboBox1.getItemAt(11) != "Drive M")
                    && (jComboBox1.getItemAt(12) != "Drive M")) {
                jComboBox1.addItem("Drive M");

            }

            if (new File("N:\\").isDirectory()
                    && (jComboBox1.getItemAt(13) == null)
                    && (jComboBox1.getItemAt(3) != "Drive N")
                    && (jComboBox1.getItemAt(4) != "Drive N")
                    && (jComboBox1.getItemAt(5) != "Drive N")
                    && (jComboBox1.getItemAt(6) != "Drive N")
                    && (jComboBox1.getItemAt(7) != "Drive N")
                    && (jComboBox1.getItemAt(8) != "Drive N")
                    && (jComboBox1.getItemAt(9) != "Drive N")
                    && (jComboBox1.getItemAt(10) != "Drive N")
                    && (jComboBox1.getItemAt(11) != "Drive N")
                    && (jComboBox1.getItemAt(12) != "Drive N")
                    && (jComboBox1.getItemAt(13) != "Drive N")) {
                jComboBox1.addItem("Drive N");

            }

            if (new File("O:\\").isDirectory()
                    && (jComboBox1.getItemAt(14) == null)
                    && (jComboBox1.getItemAt(3) != "Drive O")
                    && (jComboBox1.getItemAt(4) != "Drive O")
                    && (jComboBox1.getItemAt(5) != "Drive O")
                    && (jComboBox1.getItemAt(6) != "Drive O")
                    && (jComboBox1.getItemAt(7) != "Drive O")
                    && (jComboBox1.getItemAt(8) != "Drive O")
                    && (jComboBox1.getItemAt(9) != "Drive O")
                    && (jComboBox1.getItemAt(10) != "Drive O")
                    && (jComboBox1.getItemAt(11) != "Drive O")
                    && (jComboBox1.getItemAt(12) != "Drive O")
                    && (jComboBox1.getItemAt(13) != "Drive O")
                    && (jComboBox1.getItemAt(14) != "Drive O")) {
                jComboBox1.addItem("Drive O");

            }

            if (new File("P:\\").isDirectory()
                    && (jComboBox1.getItemAt(15) == null)
                    && (jComboBox1.getItemAt(3) != "Drive P")
                    && (jComboBox1.getItemAt(4) != "Drive P")
                    && (jComboBox1.getItemAt(5) != "Drive P")
                    && (jComboBox1.getItemAt(6) != "Drive P")
                    && (jComboBox1.getItemAt(7) != "Drive P")
                    && (jComboBox1.getItemAt(8) != "Drive P")
                    && (jComboBox1.getItemAt(9) != "Drive P")
                    && (jComboBox1.getItemAt(10) != "Drive P")
                    && (jComboBox1.getItemAt(11) != "Drive P")
                    && (jComboBox1.getItemAt(12) != "Drive P")
                    && (jComboBox1.getItemAt(13) != "Drive P")
                    && (jComboBox1.getItemAt(14) != "Drive P")
                    && (jComboBox1.getItemAt(15) != "Drive P")) {
                jComboBox1.addItem("Drive P");

            }

            if (new File("Q:\\").isDirectory()
                    && (jComboBox1.getItemAt(16) == null)
                    && (jComboBox1.getItemAt(3) != "Drive Q")
                    && (jComboBox1.getItemAt(4) != "Drive Q")
                    && (jComboBox1.getItemAt(5) != "Drive Q")
                    && (jComboBox1.getItemAt(6) != "Drive Q")
                    && (jComboBox1.getItemAt(7) != "Drive Q")
                    && (jComboBox1.getItemAt(8) != "Drive Q")
                    && (jComboBox1.getItemAt(9) != "Drive Q")
                    && (jComboBox1.getItemAt(10) != "Drive Q")
                    && (jComboBox1.getItemAt(11) != "Drive Q")
                    && (jComboBox1.getItemAt(12) != "Drive Q")
                    && (jComboBox1.getItemAt(13) != "Drive Q")
                    && (jComboBox1.getItemAt(14) != "Drive Q")
                    && (jComboBox1.getItemAt(15) != "Drive Q")
                    && (jComboBox1.getItemAt(16) != "Drive Q")) {
                jComboBox1.addItem("Drive Q");

            }

            if (new File("R:\\").isDirectory()
                    && (jComboBox1.getItemAt(17) == null)
                    && (jComboBox1.getItemAt(3) != "Drive R")
                    && (jComboBox1.getItemAt(4) != "Drive R")
                    && (jComboBox1.getItemAt(5) != "Drive R")
                    && (jComboBox1.getItemAt(6) != "Drive R")
                    && (jComboBox1.getItemAt(7) != "Drive R")
                    && (jComboBox1.getItemAt(8) != "Drive R")
                    && (jComboBox1.getItemAt(9) != "Drive R")
                    && (jComboBox1.getItemAt(10) != "Drive R")
                    && (jComboBox1.getItemAt(11) != "Drive R")
                    && (jComboBox1.getItemAt(12) != "Drive R")
                    && (jComboBox1.getItemAt(13) != "Drive R")
                    && (jComboBox1.getItemAt(14) != "Drive R")
                    && (jComboBox1.getItemAt(15) != "Drive R")
                    && (jComboBox1.getItemAt(16) != "Drive R")
                    && (jComboBox1.getItemAt(17) != "Drive R")) {
                jComboBox1.addItem("Drive R");

            }

            if (new File("S:\\").isDirectory()
                    && (jComboBox1.getItemAt(18) == null)
                    && (jComboBox1.getItemAt(3) != "Drive S")
                    && (jComboBox1.getItemAt(4) != "Drive S")
                    && (jComboBox1.getItemAt(5) != "Drive S")
                    && (jComboBox1.getItemAt(6) != "Drive S")
                    && (jComboBox1.getItemAt(7) != "Drive S")
                    && (jComboBox1.getItemAt(8) != "Drive S")
                    && (jComboBox1.getItemAt(9) != "Drive S")
                    && (jComboBox1.getItemAt(10) != "Drive S")
                    && (jComboBox1.getItemAt(11) != "Drive S")
                    && (jComboBox1.getItemAt(12) != "Drive S")
                    && (jComboBox1.getItemAt(13) != "Drive S")
                    && (jComboBox1.getItemAt(14) != "Drive S")
                    && (jComboBox1.getItemAt(15) != "Drive S")
                    && (jComboBox1.getItemAt(16) != "Drive S")
                    && (jComboBox1.getItemAt(17) != "Drive S")
                    && (jComboBox1.getItemAt(18) != "Drive S")) {
                jComboBox1.addItem("Drive S");

            }

            if (new File("T:\\").isDirectory()
                    && (jComboBox1.getItemAt(19) == null)
                    && (jComboBox1.getItemAt(3) != "Drive T")
                    && (jComboBox1.getItemAt(4) != "Drive T")
                    && (jComboBox1.getItemAt(5) != "Drive T")
                    && (jComboBox1.getItemAt(6) != "Drive T")
                    && (jComboBox1.getItemAt(7) != "Drive T")
                    && (jComboBox1.getItemAt(8) != "Drive T")
                    && (jComboBox1.getItemAt(9) != "Drive T")
                    && (jComboBox1.getItemAt(10) != "Drive T")
                    && (jComboBox1.getItemAt(11) != "Drive T")
                    && (jComboBox1.getItemAt(12) != "Drive T")
                    && (jComboBox1.getItemAt(13) != "Drive T")
                    && (jComboBox1.getItemAt(14) != "Drive T")
                    && (jComboBox1.getItemAt(15) != "Drive T")
                    && (jComboBox1.getItemAt(16) != "Drive T")
                    && (jComboBox1.getItemAt(17) != "Drive T")
                    && (jComboBox1.getItemAt(18) != "Drive T")
                    && (jComboBox1.getItemAt(19) != "Drive T")) {
                jComboBox1.addItem("Drive T");

            }

            if (new File("U:\\").isDirectory()
                    && (jComboBox1.getItemAt(20) == null)
                    && (jComboBox1.getItemAt(3) != "Drive U")
                    && (jComboBox1.getItemAt(4) != "Drive U")
                    && (jComboBox1.getItemAt(5) != "Drive U")
                    && (jComboBox1.getItemAt(6) != "Drive U")
                    && (jComboBox1.getItemAt(7) != "Drive U")
                    && (jComboBox1.getItemAt(8) != "Drive U")
                    && (jComboBox1.getItemAt(9) != "Drive U")
                    && (jComboBox1.getItemAt(10) != "Drive U")
                    && (jComboBox1.getItemAt(11) != "Drive U")
                    && (jComboBox1.getItemAt(12) != "Drive U")
                    && (jComboBox1.getItemAt(13) != "Drive U")
                    && (jComboBox1.getItemAt(14) != "Drive U")
                    && (jComboBox1.getItemAt(15) != "Drive U")
                    && (jComboBox1.getItemAt(16) != "Drive U")
                    && (jComboBox1.getItemAt(17) != "Drive U")
                    && (jComboBox1.getItemAt(18) != "Drive U")
                    && (jComboBox1.getItemAt(19) != "Drive U")
                    && (jComboBox1.getItemAt(20) != "Drive U")) {
                jComboBox1.addItem("Drive U");

            }

            if (new File("V:\\").isDirectory()
                    && (jComboBox1.getItemAt(21) == null)
                    && (jComboBox1.getItemAt(3) != "Drive V")
                    && (jComboBox1.getItemAt(4) != "Drive V")
                    && (jComboBox1.getItemAt(5) != "Drive V")
                    && (jComboBox1.getItemAt(6) != "Drive V")
                    && (jComboBox1.getItemAt(7) != "Drive V")
                    && (jComboBox1.getItemAt(8) != "Drive V")
                    && (jComboBox1.getItemAt(9) != "Drive V")
                    && (jComboBox1.getItemAt(10) != "Drive V")
                    && (jComboBox1.getItemAt(11) != "Drive V")
                    && (jComboBox1.getItemAt(12) != "Drive V")
                    && (jComboBox1.getItemAt(13) != "Drive V")
                    && (jComboBox1.getItemAt(14) != "Drive V")
                    && (jComboBox1.getItemAt(15) != "Drive V")
                    && (jComboBox1.getItemAt(16) != "Drive V")
                    && (jComboBox1.getItemAt(17) != "Drive V")
                    && (jComboBox1.getItemAt(18) != "Drive V")
                    && (jComboBox1.getItemAt(19) != "Drive V")
                    && (jComboBox1.getItemAt(20) != "Drive V")
                    && (jComboBox1.getItemAt(21) != "Drive V")) {
                jComboBox1.addItem("Drive V");

            }

            if (new File("W:\\").isDirectory()
                    && (jComboBox1.getItemAt(22) == null)
                    && (jComboBox1.getItemAt(3) != "Drive W")
                    && (jComboBox1.getItemAt(4) != "Drive W")
                    && (jComboBox1.getItemAt(5) != "Drive W")
                    && (jComboBox1.getItemAt(6) != "Drive W")
                    && (jComboBox1.getItemAt(7) != "Drive W")
                    && (jComboBox1.getItemAt(8) != "Drive W")
                    && (jComboBox1.getItemAt(9) != "Drive W")
                    && (jComboBox1.getItemAt(10) != "Drive W")
                    && (jComboBox1.getItemAt(11) != "Drive W")
                    && (jComboBox1.getItemAt(12) != "Drive W")
                    && (jComboBox1.getItemAt(13) != "Drive W")
                    && (jComboBox1.getItemAt(14) != "Drive W")
                    && (jComboBox1.getItemAt(15) != "Drive W")
                    && (jComboBox1.getItemAt(16) != "Drive W")
                    && (jComboBox1.getItemAt(17) != "Drive W")
                    && (jComboBox1.getItemAt(18) != "Drive W")
                    && (jComboBox1.getItemAt(19) != "Drive W")
                    && (jComboBox1.getItemAt(20) != "Drive W")
                    && (jComboBox1.getItemAt(21) != "Drive W")
                    && (jComboBox1.getItemAt(22) != "Drive W")) {
                jComboBox1.addItem("Drive W");

            }

            if (new File("X:\\").isDirectory()
                    && (jComboBox1.getItemAt(23) == null)
                    && (jComboBox1.getItemAt(3) != "Drive X")
                    && (jComboBox1.getItemAt(4) != "Drive X")
                    && (jComboBox1.getItemAt(5) != "Drive X")
                    && (jComboBox1.getItemAt(6) != "Drive X")
                    && (jComboBox1.getItemAt(7) != "Drive X")
                    && (jComboBox1.getItemAt(8) != "Drive X")
                    && (jComboBox1.getItemAt(9) != "Drive X")
                    && (jComboBox1.getItemAt(10) != "Drive X")
                    && (jComboBox1.getItemAt(11) != "Drive X")
                    && (jComboBox1.getItemAt(12) != "Drive X")
                    && (jComboBox1.getItemAt(13) != "Drive X")
                    && (jComboBox1.getItemAt(14) != "Drive X")
                    && (jComboBox1.getItemAt(15) != "Drive X")
                    && (jComboBox1.getItemAt(16) != "Drive X")
                    && (jComboBox1.getItemAt(17) != "Drive X")
                    && (jComboBox1.getItemAt(18) != "Drive X")
                    && (jComboBox1.getItemAt(19) != "Drive X")
                    && (jComboBox1.getItemAt(20) != "Drive X")
                    && (jComboBox1.getItemAt(21) != "Drive X")
                    && (jComboBox1.getItemAt(22) != "Drive X")
                    && (jComboBox1.getItemAt(23) != "Drive X")) {
                jComboBox1.addItem("Drive X");

            }

            if (new File("Y:\\").isDirectory()
                    && (jComboBox1.getItemAt(24) == null)
                    && (jComboBox1.getItemAt(3) != "Drive Y")
                    && (jComboBox1.getItemAt(4) != "Drive Y")
                    && (jComboBox1.getItemAt(5) != "Drive Y")
                    && (jComboBox1.getItemAt(6) != "Drive Y")
                    && (jComboBox1.getItemAt(7) != "Drive Y")
                    && (jComboBox1.getItemAt(8) != "Drive Y")
                    && (jComboBox1.getItemAt(9) != "Drive Y")
                    && (jComboBox1.getItemAt(10) != "Drive Y")
                    && (jComboBox1.getItemAt(11) != "Drive Y")
                    && (jComboBox1.getItemAt(12) != "Drive Y")
                    && (jComboBox1.getItemAt(13) != "Drive Y")
                    && (jComboBox1.getItemAt(14) != "Drive Y")
                    && (jComboBox1.getItemAt(15) != "Drive Y")
                    && (jComboBox1.getItemAt(16) != "Drive Y")
                    && (jComboBox1.getItemAt(17) != "Drive Y")
                    && (jComboBox1.getItemAt(18) != "Drive Y")
                    && (jComboBox1.getItemAt(19) != "Drive Y")
                    && (jComboBox1.getItemAt(20) != "Drive Y")
                    && (jComboBox1.getItemAt(21) != "Drive Y")
                    && (jComboBox1.getItemAt(22) != "Drive Y")
                    && (jComboBox1.getItemAt(23) != "Drive Y")
                    && (jComboBox1.getItemAt(24) != "Drive Y")) {
                jComboBox1.addItem("Drive Y");

            }

            if (new File("Z:\\").isDirectory()
                    && (jComboBox1.getItemAt(25) == null)
                    && (jComboBox1.getItemAt(3) != "Drive Z")
                    && (jComboBox1.getItemAt(4) != "Drive Z")
                    && (jComboBox1.getItemAt(5) != "Drive Z")
                    && (jComboBox1.getItemAt(6) != "Drive Z")
                    && (jComboBox1.getItemAt(7) != "Drive Z")
                    && (jComboBox1.getItemAt(8) != "Drive Z")
                    && (jComboBox1.getItemAt(9) != "Drive Z")
                    && (jComboBox1.getItemAt(10) != "Drive Z")
                    && (jComboBox1.getItemAt(11) != "Drive Z")
                    && (jComboBox1.getItemAt(12) != "Drive Z")
                    && (jComboBox1.getItemAt(13) != "Drive Z")
                    && (jComboBox1.getItemAt(14) != "Drive Z")
                    && (jComboBox1.getItemAt(15) != "Drive Z")
                    && (jComboBox1.getItemAt(16) != "Drive Z")
                    && (jComboBox1.getItemAt(17) != "Drive Z")
                    && (jComboBox1.getItemAt(18) != "Drive Z")
                    && (jComboBox1.getItemAt(19) != "Drive Z")
                    && (jComboBox1.getItemAt(20) != "Drive Z")
                    && (jComboBox1.getItemAt(21) != "Drive Z")
                    && (jComboBox1.getItemAt(22) != "Drive Z")
                    && (jComboBox1.getItemAt(23) != "Drive Z")
                    && (jComboBox1.getItemAt(24) != "Drive Z")
                    && (jComboBox1.getItemAt(25) != "Drive Z")) {
                jComboBox1.addItem("Drive Z");

            }

            if (new File("A:\\").isDirectory()
                    && (jComboBox1.getItemAt(26) == null)
                    && (jComboBox1.getItemAt(3) != "Drive A")
                    && (jComboBox1.getItemAt(4) != "Drive A")
                    && (jComboBox1.getItemAt(5) != "Drive A")
                    && (jComboBox1.getItemAt(6) != "Drive A")
                    && (jComboBox1.getItemAt(7) != "Drive A")
                    && (jComboBox1.getItemAt(8) != "Drive A")
                    && (jComboBox1.getItemAt(9) != "Drive A")
                    && (jComboBox1.getItemAt(10) != "Drive A")
                    && (jComboBox1.getItemAt(11) != "Drive A")
                    && (jComboBox1.getItemAt(12) != "Drive A")
                    && (jComboBox1.getItemAt(13) != "Drive A")
                    && (jComboBox1.getItemAt(14) != "Drive A")
                    && (jComboBox1.getItemAt(15) != "Drive A")
                    && (jComboBox1.getItemAt(16) != "Drive A")
                    && (jComboBox1.getItemAt(17) != "Drive A")
                    && (jComboBox1.getItemAt(18) != "Drive A")
                    && (jComboBox1.getItemAt(19) != "Drive A")
                    && (jComboBox1.getItemAt(20) != "Drive A")
                    && (jComboBox1.getItemAt(21) != "Drive A")
                    && (jComboBox1.getItemAt(22) != "Drive A")
                    && (jComboBox1.getItemAt(23) != "Drive A")
                    && (jComboBox1.getItemAt(24) != "Drive A")
                    && (jComboBox1.getItemAt(25) != "Drive A")
                    && (jComboBox1.getItemAt(26) != "Drive A")) {
                jComboBox1.addItem("Drive A");
            }

            if (new File("B:\\").isDirectory()
                    && (jComboBox1.getItemAt(27) == null)
                    && (jComboBox1.getItemAt(3) != "Drive B")
                    && (jComboBox1.getItemAt(4) != "Drive B")
                    && (jComboBox1.getItemAt(5) != "Drive B")
                    && (jComboBox1.getItemAt(6) != "Drive B")
                    && (jComboBox1.getItemAt(7) != "Drive B")
                    && (jComboBox1.getItemAt(8) != "Drive B")
                    && (jComboBox1.getItemAt(9) != "Drive B")
                    && (jComboBox1.getItemAt(10) != "Drive B")
                    && (jComboBox1.getItemAt(11) != "Drive B")
                    && (jComboBox1.getItemAt(12) != "Drive B")
                    && (jComboBox1.getItemAt(13) != "Drive B")
                    && (jComboBox1.getItemAt(14) != "Drive B")
                    && (jComboBox1.getItemAt(15) != "Drive B")
                    && (jComboBox1.getItemAt(16) != "Drive B")
                    && (jComboBox1.getItemAt(17) != "Drive B")
                    && (jComboBox1.getItemAt(18) != "Drive B")
                    && (jComboBox1.getItemAt(19) != "Drive B")
                    && (jComboBox1.getItemAt(20) != "Drive B")
                    && (jComboBox1.getItemAt(21) != "Drive B")
                    && (jComboBox1.getItemAt(22) != "Drive B")
                    && (jComboBox1.getItemAt(23) != "Drive B")
                    && (jComboBox1.getItemAt(24) != "Drive B")
                    && (jComboBox1.getItemAt(25) != "Drive B")
                    && (jComboBox1.getItemAt(26) != "Drive B")
                    && (jComboBox1.getItemAt(27) != "Drive B")) {
                jComboBox1.addItem("Drive B");
            }



        }
    }

    public class SearchBySize1 extends Thread {

        int i = 0;
        int j = 0;

        @Override
        public void run() {


            int c = 0;

            if ((jComboBox1.getSelectedItem() == "Drive C")) {
                jProgressBar1.setMaximum(170000);
                c = 4;
            }

            if ((jComboBox1.getSelectedItem() == "Drive D")) {
                jProgressBar1.setMaximum(70000);
                c = 5;
            }

            if ((jComboBox1.getSelectedItem() == "Drive E")) {
                jProgressBar1.setMaximum(70000);
                c = 6;
            }

            if ((jComboBox1.getSelectedItem() == "Drive F")) {
                jProgressBar1.setMaximum(70000);
                c = 7;
            }

            if ((jComboBox1.getSelectedItem() == "Drive G")) {
                jProgressBar1.setMaximum(70000);
                c = 8;
            }

            if ((jComboBox1.getSelectedItem() == "Drive H")) {
                jProgressBar1.setMaximum(70000);
                c = 9;
            }

            if ((jComboBox1.getSelectedItem() == "DriveI")) {
                jProgressBar1.setMaximum(70000);
                c = 10;
            }

            if ((jComboBox1.getSelectedItem() == "Drive J")) {
                jProgressBar1.setMaximum(70000);
                c = 11;
            }
            if ((jComboBox1.getSelectedItem() == "Drive K")) {
                jProgressBar1.setMaximum(70000);
                c = 12;
            }
            if ((jComboBox1.getSelectedItem() == "Drive L")) {
                jProgressBar1.setMaximum(70000);
                c = 13;
            }
            if ((jComboBox1.getSelectedItem() == "Drive M")) {
                jProgressBar1.setMaximum(70000);
                c = 14;
            }
            if ((jComboBox1.getSelectedItem() == "Drive N")) {
                jProgressBar1.setMaximum(70000);
                c = 15;
            }
            if ((jComboBox1.getSelectedItem() == "Drive O")) {
                jProgressBar1.setMaximum(70000);
                c = 16;
            }
            if ((jComboBox1.getSelectedItem() == "Drive P")) {
                jProgressBar1.setMaximum(70000);
                c = 17;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Q")) {
                jProgressBar1.setMaximum(70000);
                c = 18;
            }
            if ((jComboBox1.getSelectedItem() == "Drive R")) {
                jProgressBar1.setMaximum(70000);
                c = 19;
            }
            if ((jComboBox1.getSelectedItem() == "Drive S")) {
                jProgressBar1.setMaximum(70000);
                c = 20;
            }
            if ((jComboBox1.getSelectedItem() == "Drive T")) {
                jProgressBar1.setMaximum(70000);
                c = 21;
            }
            if ((jComboBox1.getSelectedItem() == "Drive U")) {
                jProgressBar1.setMaximum(70000);
                c = 22;
            }
            if ((jComboBox1.getSelectedItem() == "Drive V")) {
                jProgressBar1.setMaximum(70000);
                c = 23;
            }
            if ((jComboBox1.getSelectedItem() == "Drive W")) {
                jProgressBar1.setMaximum(70000);
                c = 24;
            }
            if ((jComboBox1.getSelectedItem() == "Drive X")) {
                jProgressBar1.setMaximum(70000);
                c = 25;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Y")) {
                jProgressBar1.setMaximum(70000);
                c = 26;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Z")) {
                jProgressBar1.setMaximum(70000);
                c = 27;
            }
            if ((jComboBox1.getSelectedItem() == "Drive A")) {
                jProgressBar1.setMaximum(70000);
                c = 28;
            }
            if ((jComboBox1.getSelectedItem() == "Drive B")) {
                jProgressBar1.setMaximum(70000);
                c = 29;
            }

            try {
                switch (c) {
                    case 4: {
                        if ((jComboBox1.getSelectedItem() == "Drive C")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            long FileSize = Integer.parseInt(jTextField1.getText());
                            try {
                                if (jComboBox2.getSelectedItem() == "Bytes") {
                                    FileSearchSize = FileSize;
                                } else if (jComboBox2.getSelectedItem() == "KB") {
                                    FileSearchSize = (FileSize / 1024);
                                } else if (jComboBox2.getSelectedItem() == "MB") {
                                    FileSearchSize = FileSize / (1024 * 1024);
                                } else if (jComboBox2.getSelectedItem() == "GB") {
                                    FileSearchSize = FileSize / (1024 * 1024 * 1024);
                                }

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Please select the Size of the file \n From the adjoint drop down menu !");
                            }
                            new SearchBySize1().SearchBYSIZE(new File("C:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 5: {
                        if ((jComboBox1.getSelectedItem() == "Drive D")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }


                            new SearchBySize1().SearchBYSIZE(new File("D:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 6: {
                        if ((jComboBox1.getSelectedItem() == "Drive E")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("E:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 7: {
                        if ((jComboBox1.getSelectedItem() == "Drive F")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("F:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 8: {
                        if ((jComboBox1.getSelectedItem() == "Drive G")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("G:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 9: {
                        if ((jComboBox1.getSelectedItem() == "Drive H")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("H:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 10: {
                        if ((jComboBox1.getSelectedItem() == "Drive I")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("I:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 11: {
                        if ((jComboBox1.getSelectedItem() == "Drive J")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("J:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 12: {
                        if ((jComboBox1.getSelectedItem() == "Drive K")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("K:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 13: {
                        if ((jComboBox1.getSelectedItem() == "Drive L")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("L:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 14: {
                        if ((jComboBox1.getSelectedItem() == "Drive M")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("M:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 15: {
                        if ((jComboBox1.getSelectedItem() == "Drive N")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("N:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 16: {
                        if ((jComboBox1.getSelectedItem() == "Drive O")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("O:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 17: {
                        if ((jComboBox1.getSelectedItem() == "Drive P")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("P:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 18: {
                        if ((jComboBox1.getSelectedItem() == "Drive Q")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("Q:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 19: {
                        if ((jComboBox1.getSelectedItem() == "Drive R")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("R:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 20: {
                        if ((jComboBox1.getSelectedItem() == "Drive S")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("S:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 21: {
                        if ((jComboBox1.getSelectedItem() == "Drive T")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("T:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 22: {
                        if ((jComboBox1.getSelectedItem() == "Drive U")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("U:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 23: {
                        if ((jComboBox1.getSelectedItem() == "Drive V")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("V:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 24: {
                        if ((jComboBox1.getSelectedItem() == "Drive W")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("W:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 25: {
                        if ((jComboBox1.getSelectedItem() == "Drive X")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("X:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 26: {
                        if ((jComboBox1.getSelectedItem() == "Drive Y")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("Y:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 27: {
                        if ((jComboBox1.getSelectedItem() == "Drive Z")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("Z:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 28: {
                        if ((jComboBox1.getSelectedItem() == "Drive A")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("A:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 29: {
                        if ((jComboBox1.getSelectedItem() == "Drive B")) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new SearchBySize1().SearchBYSIZE(new File("B:\\"), FileSearchSize);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");

                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    default:
                        return;

                }

            } catch (Exception e) {
            }
        }

        public void SearchBYSIZE(File directory, long SizeOfFile) {


            File[] files = directory.listFiles();

            if (files == null || files.length == 0) {
                jProgressBar1.setValue(j);
                j++;
            } else {

                for (File ff : files) {

                    if (ff.isDirectory()) {
                        jProgressBar1.setValue(j);
                        j++;
                        SearchBYSIZE(ff, SizeOfFile);
                    } else {


                        if (ff.length() >= SizeOfFile) {
                            model.setRowCount(i + 1);

                            model.setValueAt(ff.getName(), i, 0);
                            model.setValueAt(ff.getAbsolutePath(), i, 1);
                            model.setValueAt(ff.length() + "" + "Bytes", i, 2);
                            i++;
                            jProgressBar1.setValue((j));
                            j++;


                        }
                    }
                }
            }

        }
    }
}
