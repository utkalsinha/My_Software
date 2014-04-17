/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchTrial.java
 *
 * Created on 25 Jun, 2010, 11:20:14 AM
 */
package SearchingUI;

import MyFinalSearchPackage.MainSearch;
import MyFinalSearchPackage.Mypopup;
import MyFinalSearchPackage.Paste;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALPHADESK
 */
public class Search extends javax.swing.JInternalFrame {

    /** Creates new form SearchTrial */
    public File CopiedFile;
    public JFileChooser fc;
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
    ClipboardOwner obj1;


    public Search() {
        initComponents();
        
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        model = (DefaultTableModel) jTable1.getModel();
        MouseListener popuplistener = new Mypopup(Jtable1Popup);
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

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Jtable1Popup = new javax.swing.JPopupMenu();
        View = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Copy = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Delete = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        Jtable1Popup.setBackground(new java.awt.Color(204, 153, 255));
        Jtable1Popup.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 51), new java.awt.Color(0, 153, 102)));

        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        Jtable1Popup.add(View);
        Jtable1Popup.add(jSeparator2);
        Jtable1Popup.add(jSeparator3);

        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        Jtable1Popup.add(Copy);
        Jtable1Popup.add(jSeparator4);
        Jtable1Popup.add(jSeparator5);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Jtable1Popup.add(jSeparator1);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        Jtable1Popup.add(Delete);
        Jtable1Popup.add(jSeparator6);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/SearchingUI/Quark.png"))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 153));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 14));

        jPanel2.setBackground(new java.awt.Color(111, 106, 125));

        jPanel3.setBackground(new java.awt.Color(176, 92, 92));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SearchingUI/MyFinalSearchLogo.png"))); // NOI18N
        jLabel1.setText("Search");
        jLabel1.setIconTextGap(40);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jTextField1.setBackground(new java.awt.Color(255, 153, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("File Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addContainerGap())
                    .addComponent(jLabel1)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Name", "File Path", "size"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jTable1.setSelectionBackground(new java.awt.Color(102, 255, 102));
        jTable1.setSelectionForeground(new java.awt.Color(255, 0, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Selected(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(135);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(135);
        jTable1.getColumnModel().getColumn(2).setMinWidth(125);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(125);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(500);

        jProgressBar1.setBackground(new java.awt.Color(102, 102, 255));
        jProgressBar1.setForeground(new java.awt.Color(133, 67, 50));
        jProgressBar1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setText("File Name :");

        jLabel6.setText("name");

        jLabel10.setText("File Size :");

        jLabel11.setText("File Size :");

        jLabel12.setText("File Path :");

        jLabel13.setText("File Path :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("PMingLiU", 1, 14));
        jLabel15.setForeground(new java.awt.Color(153, 255, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Preview");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Location to search");

        jComboBox1.setBackground(new java.awt.Color(51, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jComboBox1.setForeground(new java.awt.Color(51, 102, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<--Select-->", "Drive C" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("General search returns file containing the filename");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Average search returns file with filename starting with the text provided");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Precise search returns the exact file matching with the search text");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel7.setForeground(new java.awt.Color(51, 255, 255));
        jLabel7.setText("Searching Option");

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton1.setForeground(new java.awt.Color(153, 255, 0));
        jRadioButton1.setText("General Search");

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton2.setForeground(new java.awt.Color(153, 255, 0));
        jRadioButton2.setText("Average Search");

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton3.setForeground(new java.awt.Color(153, 255, 0));
        jRadioButton3.setText("Precise Search");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SearchingUI/Search.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton5.setText("Cancel");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton14.setText("Exit");
        jButton14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton14.setBorderPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton4.setForeground(new java.awt.Color(153, 255, 0));
        jRadioButton4.setText("Extension Search");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, 0, 382, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("All File Search", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1126, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if((jComboBox1.getSelectedIndex()!=0&&jRadioButton1.isSelected())||
               (jComboBox1.getSelectedIndex()!=0&&jRadioButton2.isSelected())||
               (jComboBox1.getSelectedIndex()!=0&&jRadioButton3.isSelected())||
               (jComboBox1.getSelectedIndex()!=0&&jRadioButton4.isSelected())
               )
       {

           Thread av = new Searchalgorithm();
        if (CurrentThread1 == null) {
            av.start();
        } else {
            JOptionPane.showMessageDialog(null, "Please wait   \nOne search is already running\n Please cancel the previous search");
        }

       }
       else
       {
           JOptionPane.showMessageDialog(null, "Before any search \nyou must select the location to search for \nand the type of" +
                   "search");
       }
        
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CheckingDrives chk = new CheckingDrives();
        
        chk.start();

}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        dispose();
}//GEN-LAST:event_jButton14ActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        Object obj = new Object();
        obj = model.getValueAt(jTable1.getSelectedRow(), 1);
        String FilePath = obj + "";
        try {
            File fff = new File(FilePath);

            Desktop.getDesktop().open(fff);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File Cannot be accessed ! \nOr You Can Change the Default media player/ software");
        }


    }//GEN-LAST:event_ViewActionPerformed

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

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
       Object obj = model.getValueAt(jTable1.getSelectedRow(), 1);
       File newFile = new File(obj+"");
       copyFiles12 ff = new copyFiles12();
       ff.FileCopy(newFile);

}//GEN-LAST:event_CopyActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            if (CurrentThread1.isAlive()) {
                CurrentThread1.suspend();
                CurrentThread1= null;
            }
        } catch (Exception e) {
        }
}//GEN-LAST:event_jButton5ActionPerformed

    private void Selected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Selected
        Object obj = model.getValueAt(jTable1.getSelectedRow(), 1);
        try
        {
        ImageIcon thumbnail = new prev().loadImage(new File(obj+""));
        jLabel14.setIcon(thumbnail);
        if(jLabel14.getIcon()==null)
            jLabel14.setText("No Preview");
       
        }catch(Exception e)
        {
            
        }
       
        jLabel6.setText(new File(obj + "").getName());
        jLabel11.setText(new File(obj + "").length() + " Bytes");
        jLabel13.setText(new File(obj + "").getAbsolutePath());
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);

    }//GEN-LAST:event_Selected

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
     
    }//GEN-LAST:event_jTable1PropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Delete;
    public javax.swing.JPopupMenu Jtable1Popup;
    private javax.swing.JMenuItem View;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    public javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

        public class copyFiles12 implements Transferable {

      DataFlavor[] dataFlavors = { DataFlavor.javaFileListFlavor};
   List         files       = new LinkedList();

    public DataFlavor[] getTransferDataFlavors() {
       return dataFlavors;
    }

    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return dataFlavors[0].equals(flavor);
    }

    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        return files;
    }
       public void addFile(File f) {
        files.add(f);
    }

     public void FileCopy(File file) {
        copyFiles12 ft = new copyFiles12();
        ft.addFile(file);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(ft, null);

    }

}


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

    public class Searchalgorithm extends Thread {

        int i = 0;
        int j = 0;

        public void AverageSearch(File directory, String name) {


            File[] files = directory.listFiles();

            if (files == null || files.length == 0) {
                jProgressBar1.setValue(j);
                j++;
            } else {

                for (File ff : files) {

                    if (ff.isDirectory()) {
                        jProgressBar1.setValue(j);
                        j++;
                        AverageSearch(ff, name);
                    } else {


                        if ((ff.getName().trim().toLowerCase().startsWith(name.trim().toLowerCase()))) {
                            model.setRowCount(i + 1);

                            model.setValueAt(ff.getName(), i, 0);
                            model.setValueAt(ff.getAbsolutePath(), i, 1);
                            model.setValueAt(ff.length(), i, 2);
                            i++;
                            jProgressBar1.setValue((j));
                            j++;


                        }
                    }
                }
            }

        }

        public void GeneralSearch(File directory, String name) {


            File[] files = directory.listFiles();

            if (files == null || files.length == 0) {
                jProgressBar1.setValue(j);
                j++;

            } else {

                for (File ff : files) {

                    if (ff.isDirectory()) {
                        jProgressBar1.setValue(j);
                        j++;
                        GeneralSearch(ff, name);
                    } else {
                        if ((ff.getName().trim().toLowerCase().contains(name.trim().toLowerCase()))) {
                            model.setRowCount(i + 1);

                            model.setValueAt(ff.getName(), i, 0);
                            model.setValueAt(ff.getAbsolutePath(), i, 1);
                           model.setValueAt(ff.length(), i, 2);

                            i++;
                            jProgressBar1.setValue(j);
                            j++;
                        }
                    }
                }
            }

        }

        public void PreciseSearch(File directory, String name) {


            File[] files = directory.listFiles();

            if (files == null || files.length == 0) {
                jProgressBar1.setValue(j);
                j++;

            } else {

                for (File ff : files) {

                    if (ff.isDirectory()) {
                        jProgressBar1.setValue(j);
                        j++;
                        PreciseSearch(ff, name);
                    } else {
                        if ((ff.getName().trim().toLowerCase().matches(name.trim().toLowerCase()))) {
                            model.setRowCount(i + 1);

                            model.setValueAt(ff.getName(), i, 0);
                            model.setValueAt(ff.getAbsolutePath(), i, 1);
                           model.setValueAt(ff.length(), i, 2);

                            i++;
                            jProgressBar1.setValue(j);
                            j++;
                        }
                    }
                }
            }

        }

        public void ExtensionSearch(File directory, String name) {


            File[] files = directory.listFiles();

            if (files == null || files.length == 0) {
                jProgressBar1.setValue(j);
                j++;

            } else {

                for (File ff : files) {

                    if (ff.isDirectory()) {
                        jProgressBar1.setValue(j);
                        j++;
                        ExtensionSearch(ff, name);
                    } else {
                        if (ff.getName().endsWith(name)) {
                            model.setRowCount(i + 1);

                            model.setValueAt(ff.getName(), i, 0);
                            model.setValueAt(ff.getAbsolutePath(), i, 1);
                           model.setValueAt(ff.length(), i, 2);

                            i++;
                            jProgressBar1.setValue(j);
                            j++;
                        }
                    }
                }
            }

        }

        @Override
        public void run() {

            int c = 0;
            String text = jTextField1.getText().trim();




            if ((jComboBox1.getSelectedItem() == "Drive C") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(170000);
                c = 4;
            }
            if ((jComboBox1.getSelectedItem() == "Drive C") && (jRadioButton1.isSelected())) {
                 jProgressBar1.setMaximum(170000);
                c = 5;
            }
            if ((jComboBox1.getSelectedItem() == "Drive C") && (jRadioButton3.isSelected())) {
                 jProgressBar1.setMaximum(170000);
                c = 6;
            }
            if ((jComboBox1.getSelectedItem() == "Drive C") && (jRadioButton4.isSelected())) {
                 jProgressBar1.setMaximum(170000);
                c = 7;
            }






            if ((jComboBox1.getSelectedItem() == "Drive D") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 8;
            }
            if ((jComboBox1.getSelectedItem() == "Drive D") && (jRadioButton1.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 9;
            }
            if ((jComboBox1.getSelectedItem() == "Drive D") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 10;
            }
             if ((jComboBox1.getSelectedItem() == "Drive D") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 11;
            }







            if ((jComboBox1.getSelectedItem() == "Drive E") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 12;
            }
            if ((jComboBox1.getSelectedItem() == "Drive E") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 13;
            }
            if ((jComboBox1.getSelectedItem() == "Drive E") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 14;
            }

             if ((jComboBox1.getSelectedItem() == "Drive E") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 15;
            }







            if ((jComboBox1.getSelectedItem() == "Drive F") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 16;
            }
            if ((jComboBox1.getSelectedItem() == "Drive F") && (jRadioButton1.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 17;
            }
            if ((jComboBox1.getSelectedItem() == "Drive F") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 18;
            }
             if ((jComboBox1.getSelectedItem() == "Drive F") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 19;
            }







            if ((jComboBox1.getSelectedItem() == "Drive G") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 20;
            }
            if ((jComboBox1.getSelectedItem() == "Drive G") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 21;
            }
            if ((jComboBox1.getSelectedItem() == "Drive G") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 22;
            }
             if ((jComboBox1.getSelectedItem() == "Drive G") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c =23;
            }







            if ((jComboBox1.getSelectedItem() == "Drive H") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 24;
            }
            if ((jComboBox1.getSelectedItem() == "Drive H") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 25;
            }
            if ((jComboBox1.getSelectedItem() == "Drive H") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 26;
            }
             if ((jComboBox1.getSelectedItem() == "Drive H") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 27;
            }







            if ((jComboBox1.getSelectedItem() == "Drive I") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 28;
            }
            if ((jComboBox1.getSelectedItem() == "Drive I") && (jRadioButton1.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 29;
            }
            if ((jComboBox1.getSelectedItem() == "Drive I") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 30;
            }
             if ((jComboBox1.getSelectedItem() == "Drive I") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 31;
            }








            if ((jComboBox1.getSelectedItem() == "Drive J") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 32;
            }
            if ((jComboBox1.getSelectedItem() == "Drive J") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 33;
            }
            if ((jComboBox1.getSelectedItem() == "Drive J") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 34;
            }
             if ((jComboBox1.getSelectedItem() == "Drive J") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 35;
            }







            if ((jComboBox1.getSelectedItem() == "Drive K") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 36;
            }
            if ((jComboBox1.getSelectedItem() == "Drive K") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 37;
            }
            if ((jComboBox1.getSelectedItem() == "Drive K") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 38;
            }
             if ((jComboBox1.getSelectedItem() == "Drive K") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 39;
            }







            if ((jComboBox1.getSelectedItem() == "Drive L") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 40;
            }
            if ((jComboBox1.getSelectedItem() == "Drive L") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 41;
            }
            if ((jComboBox1.getSelectedItem() == "Drive L") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 42;
            }
             if ((jComboBox1.getSelectedItem() == "Drive L") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 43;
            }







             if ((jComboBox1.getSelectedItem() == "Drive M") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 44;
            }
            if ((jComboBox1.getSelectedItem() == "Drive M") && (jRadioButton1.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 45;
            }
            if ((jComboBox1.getSelectedItem() == "Drive M") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 46;
            }
             if ((jComboBox1.getSelectedItem() == "Drive M") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 47;
            }






             if ((jComboBox1.getSelectedItem() == "Drive N") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 48;
            }
            if ((jComboBox1.getSelectedItem() == "Drive N") && (jRadioButton1.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 49;
            }
            if ((jComboBox1.getSelectedItem() == "Drive N") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 50;
            }
             if ((jComboBox1.getSelectedItem() == "Drive N") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 51;
            }







             if ((jComboBox1.getSelectedItem() == "Drive O") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 52;
            }
            if ((jComboBox1.getSelectedItem() == "Drive O") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 53;
            }
            if ((jComboBox1.getSelectedItem() == "Drive O") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 54;
            }
             if ((jComboBox1.getSelectedItem() == "Drive O") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 55;
            }






             if ((jComboBox1.getSelectedItem() == "Drive P") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 56;
            }
            if ((jComboBox1.getSelectedItem() == "Drive P") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 57;
            }
            if ((jComboBox1.getSelectedItem() == "Drive P") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 58;
            }
             if ((jComboBox1.getSelectedItem() == "Drive P") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 59;
            }







             if ((jComboBox1.getSelectedItem() == "Drive Q") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 60;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Q") && (jRadioButton1.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 61;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Q") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 62;
            }
             if ((jComboBox1.getSelectedItem() == "Drive Q") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 63;
            }








             if ((jComboBox1.getSelectedItem() == "Drive R") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 64;
            }
            if ((jComboBox1.getSelectedItem() == "Drive R") && (jRadioButton1.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 65;
            }
            if ((jComboBox1.getSelectedItem() == "Drive R") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 66;
            }
             if ((jComboBox1.getSelectedItem() == "Drive R") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 67;
            }






             if ((jComboBox1.getSelectedItem() == "Drive S") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 68;
            }
            if ((jComboBox1.getSelectedItem() == "Drive S") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 69;
            }
            if ((jComboBox1.getSelectedItem() == "Drive S") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 70;
            }
             if ((jComboBox1.getSelectedItem() == "Drive S") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 71;
            }







             if ((jComboBox1.getSelectedItem() == "Drive T") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 72;
            }
            if ((jComboBox1.getSelectedItem() == "Drive T") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 73;
            }
            if ((jComboBox1.getSelectedItem() == "Drive T") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 74;
            }
             if ((jComboBox1.getSelectedItem() == "Drive T") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 75;
            }






             if ((jComboBox1.getSelectedItem() == "Drive U") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 76;
            }
            if ((jComboBox1.getSelectedItem() == "Drive U") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 77;
            }
            if ((jComboBox1.getSelectedItem() == "Drive U") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 78;
            }
             if ((jComboBox1.getSelectedItem() == "Drive U") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c =79;
            }







             if ((jComboBox1.getSelectedItem() == "Drive V") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 80;
            }
            if ((jComboBox1.getSelectedItem() == "Drive V") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 81;
            }
            if ((jComboBox1.getSelectedItem() == "Drive V") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 82;
            }
             if ((jComboBox1.getSelectedItem() == "Drive V") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 83;
            }






             if ((jComboBox1.getSelectedItem() == "Drive W") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 84;
            }
            if ((jComboBox1.getSelectedItem() == "Drive W") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 85;
            }
            if ((jComboBox1.getSelectedItem() == "Drive W") && (jRadioButton3.isSelected())) {
              jProgressBar1.setMaximum(70000);
                c = 86;
            }
             if ((jComboBox1.getSelectedItem() == "Drive W") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 87;
            }







             if ((jComboBox1.getSelectedItem() == "Drive X") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 88;
            }
            if ((jComboBox1.getSelectedItem() == "Drive X") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 89;
            }
            if ((jComboBox1.getSelectedItem() == "Drive X") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 90;
            }
             if ((jComboBox1.getSelectedItem() == "Drive X") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 91;
            }








             if ((jComboBox1.getSelectedItem() == "Drive Y") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 92;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Y") && (jRadioButton1.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 93;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Y") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 94;
            }
             if ((jComboBox1.getSelectedItem() == "Drive Y") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 95;
            }






             if ((jComboBox1.getSelectedItem() == "Drive Z") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 96;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Z") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 97;
            }
            if ((jComboBox1.getSelectedItem() == "Drive Z") && (jRadioButton3.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 98;
            }
             if ((jComboBox1.getSelectedItem() == "Drive Z") && (jRadioButton4.isSelected())) {
               jProgressBar1.setMaximum(70000);
                 c = 99;
            }


            if ((jComboBox1.getSelectedItem() == "Drive A") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 100;
            }
            if ((jComboBox1.getSelectedItem() == "Drive A") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 101;
            }
            if ((jComboBox1.getSelectedItem() == "Drive A") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 102;
            }
             if ((jComboBox1.getSelectedItem() == "Drive A") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 103;
            }


            if ((jComboBox1.getSelectedItem() == "Drive B") && (jRadioButton2.isSelected())) {
                jProgressBar1.setMaximum(70000);
                c = 104;
            }
            if ((jComboBox1.getSelectedItem() == "Drive B") && (jRadioButton1.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 105;
            }
            if ((jComboBox1.getSelectedItem() == "Drive B") && (jRadioButton3.isSelected())) {
               jProgressBar1.setMaximum(70000);
                c = 106;
            }
             if ((jComboBox1.getSelectedItem() == "Drive B") && (jRadioButton4.isSelected())) {
                jProgressBar1.setMaximum(70000);
                 c = 107;
            }








            try {
                switch (c) {


                    case 4: {

                        if ((jComboBox1.getSelectedItem() == "Drive C") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().AverageSearch(new File("C:\\"), text);
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
                        if ((jComboBox1.getSelectedItem() == "Drive C") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("C:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 6: {
                        if ((jComboBox1.getSelectedItem() == "Drive C") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("C:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 7: {

                        if ((jComboBox1.getSelectedItem() == "Drive C") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("C:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }









                    case 8: {


                        if ((jComboBox1.getSelectedItem() == "Drive D") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("D:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                    case 9: {
                        if ((jComboBox1.getSelectedItem() == "Drive D") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("D:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                    case 10: {
                        if ((jComboBox1.getSelectedItem() == "Drive D") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("D:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 11: {

                        if ((jComboBox1.getSelectedItem() == "Drive D") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("D:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found!");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);

                            CurrentThread1 = null;

                        }
                        break;
                    }






                    case 12: {

                        if ((jComboBox1.getSelectedItem() == "Drive E") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("E:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                    case 13: {
                        if ((jComboBox1.getSelectedItem() == "Drive E") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("E:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 14: {
                        if ((jComboBox1.getSelectedItem() == "Drive E") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("E:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }


                    case 15: {

                        if ((jComboBox1.getSelectedItem() == "Drive E") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("E:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found!");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                    case 16: {
                        if ((jComboBox1.getSelectedItem() == "Drive F") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("F:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 17: {
                        if ((jComboBox1.getSelectedItem() == "Drive F") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("F:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 18: {
                        if ((jComboBox1.getSelectedItem() == "Drive F") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("F:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    case 19: {

                        if ((jComboBox1.getSelectedItem() == "Drive F") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("F:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }






                    case 20: {

                        if ((jComboBox1.getSelectedItem() == "Drive G") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("G:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 21: {
                        if ((jComboBox1.getSelectedItem() == "Drive G") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("G:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 22: {
                        if ((jComboBox1.getSelectedItem() == "Drive G") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("G:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 23: {

                        if ((jComboBox1.getSelectedItem() == "Drive G") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("G:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found!");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                    case 24: {

                        if ((jComboBox1.getSelectedItem() == "Drive H") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("H:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 25: {
                        if ((jComboBox1.getSelectedItem() == "Drive H") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("H:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 26: {
                        if ((jComboBox1.getSelectedItem() == "Drive H") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("H:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }


                    case 27: {

                        if ((jComboBox1.getSelectedItem() == "Drive H") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("H:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " NO Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                    case 28: {

                        if ((jComboBox1.getSelectedItem() == "Drive I") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("I:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 29: {
                        if ((jComboBox1.getSelectedItem() == "Drive I") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("I:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 30: {
                        if ((jComboBox1.getSelectedItem() == "Drive I") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("I:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }


                    case 31: {

                        if ((jComboBox1.getSelectedItem() == "Drive I") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("I:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                    case 32: {

                        if ((jComboBox1.getSelectedItem() == "Drive J") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("J:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 33: {
                        if ((jComboBox1.getSelectedItem() == "Drive J") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("J:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 34: {
                        if ((jComboBox1.getSelectedItem() == "Drive J") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("J:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 35: {

                        if ((jComboBox1.getSelectedItem() == "Drive J") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("J:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                    case 36: {

                        if ((jComboBox1.getSelectedItem() == "Drive K") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("K:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 37: {
                        if ((jComboBox1.getSelectedItem() == "Drive K") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("K:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 38: {
                        if ((jComboBox1.getSelectedItem() == "Drive K") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("K:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 39: {

                        if ((jComboBox1.getSelectedItem() == "Drive K") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("K:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                    case 40: {

                        if ((jComboBox1.getSelectedItem() == "Drive L") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("L:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 41: {
                        if ((jComboBox1.getSelectedItem() == "Drive L") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("L:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 42: {
                        if ((jComboBox1.getSelectedItem() == "Drive L") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("L:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                    
                    case 43: {

                        if ((jComboBox1.getSelectedItem() == "Drive L") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("L:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, "No Files Found!");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                     case 44: {

                        if ((jComboBox1.getSelectedItem() == "Drive M") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("M:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 45: {
                        if ((jComboBox1.getSelectedItem() == "Drive M") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("M:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 46: {
                        if ((jComboBox1.getSelectedItem() == "Drive M") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("M:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 47: {

                        if ((jComboBox1.getSelectedItem() == "Drive M") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("M:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, "No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }

                     case 48: {

                        if ((jComboBox1.getSelectedItem() == "Drive N") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("N:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 49: {
                        if ((jComboBox1.getSelectedItem() == "Drive N") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("N:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 50: {
                        if ((jComboBox1.getSelectedItem() == "Drive N") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("N:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 51: {

                        if ((jComboBox1.getSelectedItem() == "Drive N") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("N:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 52: {

                        if ((jComboBox1.getSelectedItem() == "Drive O") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("O:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 53: {
                        if ((jComboBox1.getSelectedItem() == "Drive O") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("O:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 54: {
                        if ((jComboBox1.getSelectedItem() == "Drive O") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("O:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 55: {

                        if ((jComboBox1.getSelectedItem() == "Drive O") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("O:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 56: {

                        if ((jComboBox1.getSelectedItem() == "Drive P") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("P:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 57: {
                        if ((jComboBox1.getSelectedItem() == "Drive P") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("P:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 58: {
                        if ((jComboBox1.getSelectedItem() == "Drive P") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("P:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 59: {

                        if ((jComboBox1.getSelectedItem() == "Drive P") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("P:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 60: {

                        if ((jComboBox1.getSelectedItem() == "Drive Q") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("Q:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 61: {
                        if ((jComboBox1.getSelectedItem() == "Drive Q") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("Q:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                     case 62: {
                        if ((jComboBox1.getSelectedItem() == "Drive Q") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("Q:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                      case 63: {
                        if ((jComboBox1.getSelectedItem() == "Drive Q") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("Q:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                      case 64: {
                        if ((jComboBox1.getSelectedItem() == "Drive R") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("R:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                      case 65: {
                        if ((jComboBox1.getSelectedItem() == "Drive R") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("R:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 66: {
                        if ((jComboBox1.getSelectedItem() == "Drive R") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("R:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 67: {

                        if ((jComboBox1.getSelectedItem() == "Drive R") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("R:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 68: {

                        if ((jComboBox1.getSelectedItem() == "Drive S") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("S:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 69: {
                        if ((jComboBox1.getSelectedItem() == "Drive S") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("S:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 70: {
                        if ((jComboBox1.getSelectedItem() == "Drive S") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("S:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 71: {

                        if ((jComboBox1.getSelectedItem() == "Drive S") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("S:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 72: {

                        if ((jComboBox1.getSelectedItem() == "Drive T") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("T:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 73: {
                        if ((jComboBox1.getSelectedItem() == "Drive T") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("T:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 74: {
                        if ((jComboBox1.getSelectedItem() == "Drive T") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("T:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 75: {

                        if ((jComboBox1.getSelectedItem() == "Drive T") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("T:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 76: {

                        if ((jComboBox1.getSelectedItem() == "Drive U") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("U:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 77: {
                        if ((jComboBox1.getSelectedItem() == "Drive U") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("U:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 78: {
                        if ((jComboBox1.getSelectedItem() == "Drive U") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("U:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 79: {

                        if ((jComboBox1.getSelectedItem() == "Drive U") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("U:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 80: {

                        if ((jComboBox1.getSelectedItem() == "Drive V") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("V:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 81: {
                        if ((jComboBox1.getSelectedItem() == "Drive V") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("V:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 82: {
                        if ((jComboBox1.getSelectedItem() == "Drive V") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("V:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }
                     case 83: {
                        if ((jComboBox1.getSelectedItem() == "Drive V") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("V:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 84: {

                        if ((jComboBox1.getSelectedItem() == "Drive W") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("W:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File Not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                    case 85: {

                        if ((jComboBox1.getSelectedItem() == "Drive W") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("W:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                    case 86: {

                        if ((jComboBox1.getSelectedItem() == "Drive W") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("W:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " No Files Found!");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;

                        }
                        break;
                    }
                    case 87: {

                        if ((jComboBox1.getSelectedItem() == "Drive W") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("W:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);

                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 88: {

                        if ((jComboBox1.getSelectedItem() == "Drive X") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("X:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 89: {
                        if ((jComboBox1.getSelectedItem() == "Drive X") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("X:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 90: {
                        if ((jComboBox1.getSelectedItem() == "Drive X") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("L:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 91: {

                        if ((jComboBox1.getSelectedItem() == "Drive X") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("X:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);

                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 92: {

                        if ((jComboBox1.getSelectedItem() == "Drive Y") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("Y:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 93: {
                        if ((jComboBox1.getSelectedItem() == "Drive Y") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("Y:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 94: {
                        if ((jComboBox1.getSelectedItem() == "Drive Y") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("Y:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 95: {

                        if ((jComboBox1.getSelectedItem() == "Drive Y") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("Y:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);

                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 96: {

                        if ((jComboBox1.getSelectedItem() == "Drive Z") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("Z:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 97: {
                        if ((jComboBox1.getSelectedItem() == "Drive Z") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("Z:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 98: {
                        if ((jComboBox1.getSelectedItem() == "Drive Z") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("Z:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 99: {

                        if ((jComboBox1.getSelectedItem() == "Drive Z") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("Z:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);

                            CurrentThread1 = null;

                        }
                        break;
                    }

                     case 100: {

                        if ((jComboBox1.getSelectedItem() == "Drive A") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("A:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 101: {
                        if ((jComboBox1.getSelectedItem() == "Drive A") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("A:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 102: {
                        if ((jComboBox1.getSelectedItem() == "Drive A") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("A:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 103: {

                        if ((jComboBox1.getSelectedItem() == "Drive A") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("A:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);

                            CurrentThread1 = null;

                        }
                        break;
                    }
                     case 104: {

                        if ((jComboBox1.getSelectedItem() == "Drive B") && (jRadioButton2.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().AverageSearch(new File("B:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 105: {
                        if ((jComboBox1.getSelectedItem() == "Drive B") && (jRadioButton1.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().GeneralSearch(new File("B:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 106: {
                        if ((jComboBox1.getSelectedItem() == "Drive B") && (jRadioButton3.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }
                            new Searchalgorithm().PreciseSearch(new File("B:\\"), text);
                            if (model.getRowCount() == 0) {
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);
                            jProgressBar1.setValue(0);
                            CurrentThread1 = null;
                        }
                        break;
                    }

                    case 107: {

                        if ((jComboBox1.getSelectedItem() == "Drive B") && (jRadioButton4.isSelected())) {
                            CurrentThread1 = Thread.currentThread();
                            if (model.getRowCount() != 0) {
                                model.setRowCount(0);
                            }

                            new Searchalgorithm().ExtensionSearch(new File("B:\\"), text);
                            if (model.getRowCount() == 0) {
                                jProgressBar1.setValue(0);
                                JOptionPane.showMessageDialog(null, " File not Found !");
                            }
                            jProgressBar1.setValue(Integer.MAX_VALUE);

                            CurrentThread1 = null;

                        }
                        break;
                    }



                    default: {
                        return;
                    }
                }
            } catch (Exception e) {
                
            }
        }
    }

    public class PreviewImg {
        
    }
}

