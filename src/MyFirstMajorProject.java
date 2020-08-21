/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma
 *   Date: 21-08-2020
 *   Time: 10:52
 *   File: MyFirstMajorProject.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFirstMajorProject extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JTextArea funck = new JTextArea();
    JTextArea glist = new JTextArea();

    public static void main(String[] args) throws Exception {
        MyFirstMajorProject m = new MyFirstMajorProject();
        m.run();

    }

    public void run() {

        JLabel cong = new JLabel();
        JLabel thank = new JLabel();
        JLabel proceed = new JLabel();
        cong.setBounds(200, 480, 1000, 20);
        thank.setBounds(400, 530, 400, 20);
        proceed.setBounds(400, 570, 600, 30);
        cong.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 30));
        thank.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 30));
        proceed.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 30));
        cong.setForeground(Color.BLACK);
        thank.setForeground(Color.BLACK);
        proceed.setForeground(Color.BLACK);
        add(cong);
        add(thank);
        add(proceed);
        ImageIcon home = new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\saad-EeN8KSwYMjw-unsplash_resize_19.jpg");
        JLabel homelabel = new JLabel(home);
        homelabel.setBounds(0, 0, 1366, 768);
        JTextField brname = new JTextField(" ");
        JTextField grname = new JTextField(" ");
        brname.setBounds(630, 380, 200, 30);
        grname.setBounds(630, 300, 200, 30);
        add(brname);
        add(grname);
        setTitle("Home");
        JLabel welcomelabel = new JLabel("       WELCOME TO \n PIKACHU MERRIGE ARRANGER");
        welcomelabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 60));
        JButton homeedone = new JButton("DONE");
        homeedone.setBounds(550, 450, 100, 20);
        add(homeedone);

        JLabel bridename = new JLabel("BRIDE NAME");
        JLabel groomname = new JLabel("GROOM NAME");
        bridename.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 30));
        groomname.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 30));
        groomname.setBounds(400, 300, 200, 50);
        groomname.setForeground(Color.BLACK);
        add(groomname);
        bridename.setBounds(400, 380, 200, 50);
        bridename.setForeground(Color.BLACK);
        add(bridename);
        welcomelabel.setBounds(0, 0, 1366, 60);
        add(welcomelabel);
        JMenuBar menu = new JMenuBar();
        JMenuItem m = new JMenuItem("CHOOSE INVATATION CARD");
        JMenuItem m1 = new JMenuItem("ADD GUEST");
        JMenuItem m2 = new JMenuItem("REMOVE GUEST");
        JMenuItem m3 = new JMenuItem("CHOOSE CATERER");
        JMenuItem m4 = new JMenuItem("CHOOSE MENU");
        JMenu invite = new JMenu("GUEST");
        JMenu cater = new JMenu("CATRING");
        JMenu makeup = new JMenu("MAKE UP");
        JMenu arrange = new JMenu("ARRANGEMENTS");
        JMenu Final = new JMenu("FILL DETAILS");
        JMenu bill = new JMenu("BILL");
        JMenuItem billl = new JMenuItem("BILL DETAILS");
        JMenu term = new JMenu("FINAL CLICK");
        JMenuItem condition = new JMenuItem("TERM AND CONDITION");
        JMenuItem detail = new JMenuItem("DETAILS");
        JMenuItem ladkisaja = new JMenuItem("MAKE OVER");
        JMenuItem arrangement = new JMenuItem("FILL CHOICES");
        Final.add(detail);
        makeup.add(ladkisaja);
        arrange.add(arrangement);
        bill.add(billl);
        term.add(condition);
        invite.add(m);
        invite.add(m1);
        invite.add(m2);
        invite.setMnemonic(KeyEvent.VK_I);
        cater.add(m3);
        cater.add(m4);
        menu.add(invite);
        menu.add(cater);
        menu.add(makeup);


        homeedone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (brname.getText().trim().isEmpty() || grname.getText().trim().isEmpty()) {
                    JOptionPane op = new JOptionPane("please enter the value", JOptionPane.QUESTION_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
                    JDialog dialog = op.createDialog("Manual Creation");
                    dialog.setVisible(true);
                } else {
                    thank.setText("THANK YOU FOR CHOOSING US");
                    cong.setText(brname.getText() + " and " + grname.getText() + " WISHING YOU BOTH A VERY HAPPY MARRRIED LIFE");
                    proceed.setText("Now you can procced with further detail");

                    funck.setText(funck.getText() + " Bride Name: " + brname.getText() + "\n");
                    funck.setText(funck.getText() + "Groom Name : " + grname.getText() + "\n" + "\n");
                }


            }
        });
        m.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame inviteguest = new JFrame("Invatation card");
                inviteguest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                inviteguest.setVisible(true);
                inviteguest.setSize(1366, 768);
                inviteguest.setLayout(null);
                JLabel lblNewLabel = new JLabel("                     Invtation Card");
                lblNewLabel.setForeground(Color.RED);
                lblNewLabel.setFont(new Font("Old English Text MT", Font.BOLD | Font.ITALIC, 64));
                lblNewLabel.setBounds(0, 0, 1366, 101);
                inviteguest.add(lblNewLabel);

                JButton btnNewButton = new JButton("Done");
                btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
                btnNewButton.setBounds(606, 625, 105, 32);
                inviteguest.add(btnNewButton);

                JButton btnNewButton_1 = new JButton("1");
                btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_201641_resize_33.jpg"));
                btnNewButton_1.setBounds(10, 523, 125, 195);
                inviteguest.add(btnNewButton_1);

                JButton btnNewButton_1_1 = new JButton("2");
                btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_201627_resize_81.jpg"));
                btnNewButton_1_1.setBounds(1099, 523, 125, 183);
                inviteguest.add(btnNewButton_1_1);

                JButton btnNewButton_1_2 = new JButton("3");
                btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_201602_resize_38.jpg"));
                btnNewButton_1_2.setBounds(58, 327, 214, 185);
                inviteguest.add(btnNewButton_1_2);

                JButton btnNewButton_1_4 = new JButton("4");
                btnNewButton_1_4.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_201706_resize_71.jpg"));
                btnNewButton_1_4.setBounds(990, 327, 255, 185);
                inviteguest.add(btnNewButton_1_4);

                JButton btnNewButton_1_5 = new JButton("5");
                btnNewButton_1_5.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_201651_resize_2.jpg"));
                btnNewButton_1_5.setBounds(792, 380, 171, 185);
                inviteguest.add(btnNewButton_1_5);

                JButton btnNewButton_1_2_1 = new JButton("6");
                btnNewButton_1_2_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_201723_resize_92.jpg"));
                btnNewButton_1_2_1.setBounds(335, 375, 271, 198);
                inviteguest.add(btnNewButton_1_2_1);

                JLabel lblNewLabel_1 = new JLabel("");
                lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200614_100055_resize_20.jpg"));
                lblNewLabel_1.setForeground(Color.RED);
                lblNewLabel_1.setBounds(567, 191, 281, 51);
                inviteguest.add(lblNewLabel_1);
                btnNewButton_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Invatation card layout : " + btnNewButton_1.getText() + "\n");
                    }
                });
                btnNewButton_1_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Invatation card layout : " + btnNewButton_1_1.getText() + "\n");
                    }
                });
                btnNewButton_1_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Invatation card layout : " + btnNewButton_1_2.getText() + "\n");
                    }
                });
                btnNewButton_1_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Invatation card layout : " + btnNewButton_1_4.getText() + "\n");
                    }
                });
                btnNewButton_1_5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Invatation card layout : " + btnNewButton_1_5.getText() + "\n");
                    }
                });
                btnNewButton_1_2_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Invatation card layout : " + btnNewButton_1_2_1.getText() + "\n");
                    }
                });
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n");
                        inviteguest.setVisible(false);
                    }
                });
                JLabel lblNewLabel_2 = new JLabel("New label");
                lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\ganesh-3692779_1920_resize_42.jpg"));
                lblNewLabel_2.setBounds(0, 0, 1366, 768);
                inviteguest.add(lblNewLabel_2);
            }
        });
        m1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame Addguest = new JFrame("Add Guest");
                Addguest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                Addguest.setVisible(true);
                Addguest.setSize(1366, 768);
                Addguest.setLayout(null);
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setBounds(0, 96, 334, 268);
                Addguest.add(scrollPane);

                JTextArea textArea_1 = new JTextArea("NAME                           RELATION");
                scrollPane.setViewportView(textArea_1);

                JLabel lblNewLabel = new JLabel("                        Add Guests");
                lblNewLabel.setForeground(Color.ORANGE);
                lblNewLabel.setFont(new Font("Vladimir Script", Font.BOLD | Font.ITALIC, 64));
                lblNewLabel.setBounds(0, 0, 1366, 101);
                Addguest.add(lblNewLabel);

                JTextField textField = new JTextField();
                textField.setBounds(738, 132, 187, 36);
                Addguest.add(textField);
                textField.setColumns(10);

                JTextField textField_1 = new JTextField();
                textField_1.setColumns(10);
                textField_1.setBounds(738, 216, 187, 36);
                Addguest.add(textField_1);

                JLabel lblNewLabel_1 = new JLabel("Add Guest");
                lblNewLabel_1.setForeground(Color.WHITE);
                lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
                lblNewLabel_1.setBounds(400, 132, 206, 36);
                Addguest.add(lblNewLabel_1);

                JLabel lblNewLabel_1_1 = new JLabel("Relation With Guest");
                lblNewLabel_1_1.setForeground(Color.WHITE);
                lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
                lblNewLabel_1_1.setBounds(412, 216, 316, 36);
                Addguest.add(lblNewLabel_1_1);

                JButton btnNewButton = new JButton("OK");
                btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
                btnNewButton.setBounds(619, 316, 122, 48);
                Addguest.add(btnNewButton);
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textArea_1.setText(textArea_1.getText() + "\n" + textField.getText() + "                           " + textField_1.getText());
                        textField.setText("");
                        textField_1.setText("");

                    }
                });
                JButton btnNewButton_1 = new JButton("Done");
                btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
                btnNewButton_1.setBounds(619, 450, 122, 48);
                Addguest.add(btnNewButton_1);
                btnNewButton_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "Initial guest list \n" + textArea_1.getText() + "\n" + "\n");
                        glist.setText(textArea_1.getText());
                        Addguest.setVisible(false);

                    }
                });
                JLabel lblNewLabel_2 = new JLabel("New label");
                lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\wedding-feast-2841610_1920_resize_20.jpg"));
                lblNewLabel_2.setBounds(0, 0, 1366, 768);
                Addguest.add(lblNewLabel_2);
            }
        });
        m2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame removeguest = new JFrame("Remove Guest");
                removeguest.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                removeguest.setVisible(true);
                removeguest.setSize(1366, 768);
                removeguest.setLayout(null);
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setBounds(0, 96, 334, 268);
                removeguest.add(scrollPane);


                scrollPane.setViewportView(glist);

                JLabel lblNewLabel = new JLabel("                     Remove Guests");
                lblNewLabel.setForeground(Color.BLUE);
                lblNewLabel.setFont(new Font("Old English Text MT", Font.BOLD | Font.ITALIC, 64));
                lblNewLabel.setBounds(0, 0, 1366, 101);
                removeguest.add(lblNewLabel);

                JButton btnNewButton = new JButton("Done");
                btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
                btnNewButton.setBounds(536, 300, 122, 48);
                removeguest.add(btnNewButton);
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        funck.setText(funck.getText() + "Filan guest list \n");
                        funck.setText(funck.getText() + glist.getText() + "\n" + "\n");
                        removeguest.setVisible(false);

                    }
                });

                JLabel lblNewLabel_2 = new JLabel("New label");
                lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\wedding-19131_1920_resize_42.jpg"));
                lblNewLabel_2.setBounds(0, 0, 1366, 768);
                removeguest.add(lblNewLabel_2);
            }
        });
        ladkisaja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame makeupbeuty = new JFrame("Makeover");
                makeupbeuty.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                makeupbeuty.setVisible(true);
                makeupbeuty.setSize(1366, 768);
                makeupbeuty.setLayout(null);
                JLabel lblNewLabel = new JLabel("                          Bride Makeup");
                lblNewLabel.setForeground(Color.RED);
                lblNewLabel.setFont(new Font("Vivaldi", Font.PLAIN, 70));
                lblNewLabel.setBounds(10, 0, 1340, 87);
                makeupbeuty.add(lblNewLabel);

                JButton btnNewButton_8_1 = new JButton("1");
                btnNewButton_8_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_060949_resize_31.jpg"));
                btnNewButton_8_1.setBounds(10, 140, 178, 163);
                makeupbeuty.add(btnNewButton_8_1);

                JButton btnNewButton_8_1_1 = new JButton("2");
                btnNewButton_8_1_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061008_resize_93.jpg"));
                btnNewButton_8_1_1.setBounds(236, 140, 178, 163);
                makeupbeuty.add(btnNewButton_8_1_1);

                JButton btnNewButton_8_1_2 = new JButton("3");
                btnNewButton_8_1_2.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061021_resize_51.jpg"));
                btnNewButton_8_1_2.setBounds(10, 351, 178, 163);
                makeupbeuty.add(btnNewButton_8_1_2);

                JButton btnNewButton_8_1_3 = new JButton("4");
                btnNewButton_8_1_3.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061038_resize_12.jpg"));
                btnNewButton_8_1_3.setBounds(236, 351, 178, 163);
                makeupbeuty.add(btnNewButton_8_1_3);

                JButton btnNewButton_8_1_4 = new JButton("5");
                btnNewButton_8_1_4.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061223_resize_37.jpg"));
                btnNewButton_8_1_4.setBounds(1162, 140, 178, 163);
                makeupbeuty.add(btnNewButton_8_1_4);

                JButton btnNewButton_8_1_4_1 = new JButton("6");
                btnNewButton_8_1_4_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061143_resize_41.jpg"));
                btnNewButton_8_1_4_1.setBounds(897, 140, 178, 163);
                makeupbeuty.add(btnNewButton_8_1_4_1);

                JButton btnNewButton_8_1_4_1_1 = new JButton("7");
                btnNewButton_8_1_4_1_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061155_resize_53.jpg"));
                btnNewButton_8_1_4_1_1.setBounds(897, 376, 178, 163);
                makeupbeuty.add(btnNewButton_8_1_4_1_1);

                JButton btnNewButton_8_1_4_1_2 = new JButton("8");
                btnNewButton_8_1_4_1_2.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061206_resize_8.jpg"));
                btnNewButton_8_1_4_1_2.setBounds(1162, 376, 178, 163);
                makeupbeuty.add(btnNewButton_8_1_4_1_2);

                JButton btnNewButton_8_1_4_1_3 = new JButton("9");
                btnNewButton_8_1_4_1_3.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061055_resize_34.jpg"));
                btnNewButton_8_1_4_1_3.setBounds(459, 507, 178, 189);
                makeupbeuty.add(btnNewButton_8_1_4_1_3);

                JButton btnNewButton_8_1_4_1_4 = new JButton("10");
                btnNewButton_8_1_4_1_4.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_061111_resize_84.jpg"));
                btnNewButton_8_1_4_1_4.setBounds(695, 507, 178, 189);
                makeupbeuty.add(btnNewButton_8_1_4_1_4);

                JLabel lblNewLabel_1 = new JLabel("Choose Beauty Parlour");
                lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                lblNewLabel_1.setBounds(448, 420, 177, 25);
                makeupbeuty.add(lblNewLabel_1);
                String[] s1 = {"Select Beauty Parlour", "Shrut Beauty Parlour", "Richa Beauty Parlour", "Rahul Beauty Parlour", "Shash Beauty Parlour"};
                JComboBox<String> bridemakeover = new JComboBox<String>(s1);
                bridemakeover.setBounds(635, 420, 192, 25);
                makeupbeuty.add(bridemakeover);

                JButton btnNewButton = new JButton("Done");
                btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
                btnNewButton.setBounds(1149, 641, 123, 38);
                makeupbeuty.add(btnNewButton);

                JLabel lblNewLabel_2 = new JLabel("Bridal Makeup 1");
                lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2.setBounds(20, 314, 144, 26);
                makeupbeuty.add(lblNewLabel_2);

                JLabel lblNewLabel_2_1 = new JLabel("Bridal Makeup 2");
                lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_1.setBounds(236, 314, 144, 26);
                makeupbeuty.add(lblNewLabel_2_1);

                JLabel lblNewLabel_2_2 = new JLabel("Bridal Makeup 3");
                lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_2.setBounds(10, 542, 144, 26);
                makeupbeuty.add(lblNewLabel_2_2);

                JLabel lblNewLabel_2_3 = new JLabel("Bridal Makeup 4");
                lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_3.setBounds(236, 542, 144, 26);
                makeupbeuty.add(lblNewLabel_2_3);

                JLabel lblNewLabel_2_4 = new JLabel("Bridal Makeup 5");
                lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_4.setBounds(459, 703, 144, 26);
                makeupbeuty.add(lblNewLabel_2_4);

                JLabel lblNewLabel_2_5 = new JLabel("Bridal Makeup 6");
                lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_5.setBounds(694, 703, 144, 26);
                makeupbeuty.add(lblNewLabel_2_5);

                JLabel lblNewLabel_2_6 = new JLabel("Bridal Makeup 7");
                lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_6.setBounds(896, 314, 144, 26);
                makeupbeuty.add(lblNewLabel_2_6);

                JLabel lblNewLabel_2_7 = new JLabel("Bridal Makeup 8");
                lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_7.setBounds(1161, 314, 144, 26);
                makeupbeuty.add(lblNewLabel_2_7);

                JLabel lblNewLabel_2_8 = new JLabel("Bridal Makeup 9");
                lblNewLabel_2_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_8.setBounds(897, 550, 144, 26);
                makeupbeuty.add(lblNewLabel_2_8);

                JLabel lblNewLabel_2_9 = new JLabel("Bridal Makeup 10");
                lblNewLabel_2_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_2_9.setBounds(1162, 550, 144, 26);
                makeupbeuty.add(lblNewLabel_2_9);
                btnNewButton_8_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1.getText() + "\n");
                    }
                });
                btnNewButton_8_1_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_1.getText() + "\n");
                    }
                });
                btnNewButton_8_1_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_2.getText() + "\n");
                    }
                });
                btnNewButton_8_1_3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_3.getText() + "\n");
                    }
                });
                btnNewButton_8_1_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_4.getText() + "\n");
                    }
                });
                btnNewButton_8_1_4_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_4_1.getText() + "\n");
                    }
                });
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "Beauty parlour : " + (String) bridemakeover.getSelectedItem() + "\n" + "\n");
                        makeupbeuty.setVisible(false);
                    }
                });
                btnNewButton_8_1_4_1_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_4_1_1.getText() + "\n");
                    }
                });
                btnNewButton_8_1_4_1_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_4_1_2.getText() + "\n");
                    }
                });
                btnNewButton_8_1_4_1_3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_4_1_3.getText() + "\n");
                    }
                });
                btnNewButton_8_1_4_1_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "\n Bridal makeover : " + btnNewButton_8_1_4_1_4.getText() + "\n");
                    }
                });


                JLabel lblNewLabel_3 = new JLabel("New label");
                lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\jewelry-4165244_1920_resize_2.jpg"));
                lblNewLabel_3.setBounds(0, 0, 1366, 768);
                makeupbeuty.add(lblNewLabel_3);
            }
        });
        menu.add(arrange);
        arrangement.addActionListener(e -> {
            JFrame vyavastha = new JFrame("Arrangements");
            vyavastha.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
            vyavastha.setVisible(true);
            vyavastha.setSize(1366, 768);
            vyavastha.setLayout(null);
            JLabel lblNewLabel = new JLabel("                     Other Arrangements");
            lblNewLabel.setForeground(Color.RED);
            lblNewLabel.setFont(new Font("Harrington", Font.BOLD | Font.ITALIC, 60));
            lblNewLabel.setBounds(0, 0, 1350, 80);
            vyavastha.add(lblNewLabel);

            JLabel lblNewLabel_1 = new JLabel("Choose Pandit");
            lblNewLabel_1.setForeground(Color.WHITE);
            lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
            lblNewLabel_1.setBounds(461, 159, 235, 26);
            vyavastha.add(lblNewLabel_1);

            JLabel lblNewLabel_1_1 = new JLabel("Choose Band");
            lblNewLabel_1_1.setForeground(Color.WHITE);
            lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
            lblNewLabel_1_1.setBounds(461, 224, 235, 26);
            vyavastha.add(lblNewLabel_1_1);

            JLabel lblNewLabel_1_2 = new JLabel("Choose Band Timing");
            lblNewLabel_1_2.setForeground(Color.WHITE);
            lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
            lblNewLabel_1_2.setBounds(358, 293, 338, 50);
            vyavastha.add(lblNewLabel_1_2);

            JLabel lblNewLabel_1_3 = new JLabel("Choose DJ");
            lblNewLabel_1_3.setForeground(Color.WHITE);
            lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
            lblNewLabel_1_3.setBounds(461, 354, 235, 26);
            vyavastha.add(lblNewLabel_1_3);

            JLabel lblNewLabel_1_4 = new JLabel("Choose Decorator");
            lblNewLabel_1_4.setForeground(Color.WHITE);
            lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
            lblNewLabel_1_4.setBounds(417, 423, 235, 26);
            vyavastha.add(lblNewLabel_1_4);

            JLabel lblNewLabel_1_5 = new JLabel("Choose Marrige Date");
            lblNewLabel_1_5.setForeground(Color.WHITE);
            lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
            lblNewLabel_1_5.setBounds(358, 480, 294, 26);
            vyavastha.add(lblNewLabel_1_5);


            String[] s1 = {"Select Pandit ji", "Shruti Pandit ji", "Richa Pandit ji", "Rahul Pandit ji", "Shashi Pandit ji"};
            String[] s2 = {"Select Band", "Shruti Band", "Richa Band", "Rahul Band", "Shashi Band"};
            String[] s3 = {"Select DJ", "Shruti DJ", "Richa DJ", "Rahul DJ", "Shashi DJ"};
            String[] s4 = {"Select Decorator", "Shruti Decorator", "Richa Decorator", "Rahul Decorator", "Shashi Decorator"};
            JComboBox<Object> comboBox = new JComboBox<Object>(s1);
            comboBox.setBounds(659, 159, 269, 31);
            vyavastha.add(comboBox);

            JComboBox<Object> comboBox_1 = new JComboBox<Object>(s2);
            comboBox_1.setBounds(659, 224, 269, 31);
            vyavastha.add(comboBox_1);

            JComboBox<Object> comboBox_3 = new JComboBox<Object>(s3);
            comboBox_3.setBounds(659, 349, 269, 31);
            vyavastha.add(comboBox_3);

            JComboBox<Object> comboBox_4 = new JComboBox<Object>(s4);
            comboBox_4.setBounds(659, 418, 269, 31);
            vyavastha.add(comboBox_4);
            JTextField textField = new JTextField();

            textField.setBounds(678, 491, 235, 31);
            vyavastha.add(textField);
            textField.setColumns(10);

            JTextField textField_1 = new JTextField();
            textField_1.setBounds(706, 293, 207, 26);
            vyavastha.add(textField_1);
            textField_1.setColumns(10);
            JButton btnNewButton = new JButton("Done");
            btnNewButton.setFont(new Font("Wide Latin", Font.PLAIN, 21));
            btnNewButton.setBounds(553, 606, 143, 50);
            vyavastha.add(btnNewButton);
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    funck.setText(funck.getText() + "Pandit ji : " + (String) comboBox.getSelectedItem() + "\n");


                    funck.setText(funck.getText() + "Band : " + (String) comboBox_1.getSelectedItem() + "\n");


                    funck.setText(funck.getText() + "DJ : " + (String) comboBox_4.getSelectedItem() + "\n");


                    funck.setText(funck.getText() + "Decorator : " + (String) comboBox_3.getSelectedItem() + "\n");


                    funck.setText(funck.getText() + "Marrige date : " + textField.getText() + "\n");


                    funck.setText(funck.getText() + "Band Timing : " + textField_1.getText() + "\n" + "\n");
                    vyavastha.setVisible(false);

                }
            });
            JLabel lblNewLabel_2 = new JLabel("New label");
            lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\indian-4388167_1920_resize_6.jpg"));
            lblNewLabel_2.setBounds(0, 0, 1366, 768);
            vyavastha.add(lblNewLabel_2);

        });
        menu.add(Final);
        detail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame makeupframe = new JFrame();
                JTextField textField;
                JTextField textField_1;
                JTextField textField_2;
                JTextField textField_3;
                JTextField textField_4;
                JTextField textField_5;
                JTextField textField_6;
                JTextField textField_7;
                JTextField textField_9;
                JTextField textField_10;
                makeupframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                makeupframe.setVisible(true);
                makeupframe.setSize(1366, 768);
                makeupframe.setLayout(null);

                JLabel lblNewLabel = new JLabel("Bride's father name");
                lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel.setForeground(Color.RED);
                lblNewLabel.setBackground(Color.WHITE);
                lblNewLabel.setBounds(470, 78, 227, 24);
                makeupframe.add(lblNewLabel);

                JLabel lblNewLabel_1 = new JLabel("Bride's Mother name");
                lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel_1.setForeground(Color.RED);
                lblNewLabel_1.setBounds(470, 122, 240, 24);
                makeupframe.add(lblNewLabel_1);

                JLabel lblNewLabel_2 = new JLabel("Bride's Grandfather name");
                lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel_2.setForeground(Color.RED);
                lblNewLabel_2.setBounds(467, 168, 243, 22);
                makeupframe.add(lblNewLabel_2);

                JLabel lblNewLabel_3 = new JLabel("Bride's Grandmother name");
                lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel_3.setForeground(Color.RED);
                lblNewLabel_3.setBounds(457, 206, 253, 28);
                makeupframe.add(lblNewLabel_3);

                JLabel lblGroomsFatherName = new JLabel("Groom's Father name");
                lblGroomsFatherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblGroomsFatherName.setForeground(Color.RED);
                lblGroomsFatherName.setBounds(457, 262, 213, 24);
                makeupframe.add(lblGroomsFatherName);

                JLabel lblGroomsMotherName = new JLabel("Groom's Mother name");
                lblGroomsMotherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblGroomsMotherName.setForeground(Color.RED);
                lblGroomsMotherName.setBounds(457, 301, 226, 24);
                makeupframe.add(lblGroomsMotherName);

                JLabel lblGroomsGrandfatherName = new JLabel("Groom's Grandfather name");
                lblGroomsGrandfatherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblGroomsGrandfatherName.setForeground(Color.RED);
                lblGroomsGrandfatherName.setBounds(454, 336, 243, 24);
                makeupframe.add(lblGroomsGrandfatherName);

                JLabel lblGroomsGrandmotherName = new JLabel("Groom's Grandmother name");
                lblGroomsGrandmotherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblGroomsGrandmotherName.setForeground(Color.RED);
                lblGroomsGrandmotherName.setBounds(464, 371, 264, 24);
                makeupframe.add(lblGroomsGrandmotherName);
                String[] s1 = {"Select Paksha", "Ladke Wale", "Ladki Wale"};
                String[] s2 = {"Choose Marrige Home", "Shruti Marrige Home", "Richa Marrige Home", "Rahul Marrige Home", "Shashi Marrige Home"};
                JComboBox<Object> comboBox = new JComboBox<>(s2);
                comboBox.setBounds(707, 409, 264, 30);
                makeupframe.add(comboBox);

                JComboBox<Object> comboBox_1 = new JComboBox<>(s1);
                comboBox_1.setBounds(707, 482, 264, 30);
                makeupframe.add(comboBox_1);

                JLabel lblNewLabel_8 = new JLabel();
                lblNewLabel_8.setForeground(Color.RED);
                lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel_8.setBounds(570, 601, 140, 26);
                makeupframe.add(lblNewLabel_8);

                JButton btnNewButton = new JButton("Done");
                btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
                btnNewButton.setBounds(1137, 634, 151, 35);
                makeupframe.add(btnNewButton);

                textField = new JTextField();
                textField.setBounds(747, 83, 151, 22);
                makeupframe.add(textField);
                textField.setColumns(10);

                textField_1 = new JTextField();
                textField_1.setColumns(10);
                textField_1.setBounds(747, 127, 151, 22);
                makeupframe.add(textField_1);

                textField_2 = new JTextField();
                textField_2.setColumns(10);
                textField_2.setBounds(747, 172, 151, 22);
                makeupframe.add(textField_2);

                textField_3 = new JTextField();
                textField_3.setColumns(10);
                textField_3.setBounds(747, 213, 151, 22);
                makeupframe.add(textField_3);

                textField_4 = new JTextField();
                textField_4.setColumns(10);
                textField_4.setBounds(747, 262, 151, 22);
                makeupframe.add(textField_4);

                textField_5 = new JTextField();
                textField_5.setColumns(10);
                textField_5.setBounds(747, 297, 151, 22);
                makeupframe.add(textField_5);

                textField_6 = new JTextField();
                textField_6.setColumns(10);
                textField_6.setBounds(747, 336, 151, 22);
                makeupframe.add(textField_6);

                textField_7 = new JTextField();
                textField_7.setColumns(10);
                textField_7.setBounds(747, 376, 151, 22);
                makeupframe.add(textField_7);

                JLabel lblContactInfo = new JLabel("Contact info");
                lblContactInfo.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblContactInfo.setForeground(Color.RED);
                lblContactInfo.setBounds(612, 638, 140, 24);
                makeupframe.add(lblContactInfo);

                JLabel lblAddress = new JLabel("Address");
                lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblAddress.setForeground(Color.RED);
                lblAddress.setBounds(612, 674, 140, 24);
                makeupframe.add(lblAddress);

                textField_9 = new JTextField();
                textField_9.setColumns(10);
                textField_9.setBounds(801, 676, 151, 22);
                makeupframe.add(textField_9);

                JFormattedTextField formattedTextField = new JFormattedTextField();
                formattedTextField.setBounds(791, 636, 151, 24);
                makeupframe.add(formattedTextField);

                JLabel lblNewLabel_4 = new JLabel("               Enter the following details");
                lblNewLabel_4.setForeground(Color.BLUE);
                lblNewLabel_4.setBackground(new Color(240, 240, 240));
                lblNewLabel_4.setFont(new Font("Bradley Hand ITC", Font.BOLD | Font.ITALIC, 57));
                lblNewLabel_4.setBounds(0, 0, 1340, 70);
                makeupframe.add(lblNewLabel_4);

                JLabel lblNewLabel_6 = new JLabel("Choose Marrige Home");
                lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel_6.setForeground(Color.RED);
                lblNewLabel_6.setBounds(449, 406, 221, 30);
                makeupframe.add(lblNewLabel_6);

                JLabel lblNewLabel_6_1 = new JLabel("Choose Paksha");
                lblNewLabel_6_1.setForeground(Color.RED);
                lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel_6_1.setBounds(449, 478, 221, 30);
                makeupframe.add(lblNewLabel_6_1);

                JLabel lblNewLabel_6_2 = new JLabel("Choose Date");
                lblNewLabel_6_2.setForeground(Color.RED);
                lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel_6_2.setBounds(570, 542, 127, 30);
                makeupframe.add(lblNewLabel_6_2);

                JTextField textField_8 = new JTextField();
                textField_8.setColumns(10);
                textField_8.setBounds(762, 550, 151, 22);
                makeupframe.add(textField_8);
                lblNewLabel_8.setText("Family name");
                textField_10 = new JTextField();
                textField_10.setBounds(801, 601, 140, 26);
                makeupframe.add(textField_10);


                JLabel lblNewLabel_5 = new JLabel("New label");
                lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\indian-4160039_1920_resize_30.jpg"));
                lblNewLabel_5.setBounds(0, 0, 1366, 768);
                makeupframe.add(lblNewLabel_5);
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        funck.setText(funck.getText() + "Bride father name : " + textField.getText() + "\n");


                        funck.setText(funck.getText() + "Bride Mother name : " + textField_1.getText() + "\n");


                        funck.setText(funck.getText() + "Bride grandfather name : " + textField_2.getText() + "\n");


                        funck.setText(funck.getText() + "Bride grandmother name : " + textField_3.getText() + "\n");


                        funck.setText(funck.getText() + "Groom Father name : " + textField_4.getText() + "\n");


                        funck.setText(funck.getText() + "Groom Mother name : " + textField_5.getText() + "\n");


                        funck.setText(funck.getText() + "Groom grandfather name : " + textField_6.getText() + "\n");


                        funck.setText(funck.getText() + "Groom grandmother name : " + textField_7.getText() + "\n");


                        funck.setText(funck.getText() + "Date : " + textField_8.getText() + "\n");


                        funck.setText(funck.getText() + "Adress : " + textField_9.getText() + "\n");


                        funck.setText(funck.getText() + "paksha : " + (String) comboBox.getSelectedItem() + "\n");


                        funck.setText(funck.getText() + "Marrige home : " + (String) comboBox_1.getSelectedItem() + "\n");


                        funck.setText(funck.getText() + "family Name : " + textField_10.getText() + "\n");


                        funck.setText(funck.getText() + "Contact : " + formattedTextField.getText() + "\n" + "\n");
                        makeupframe.setVisible(false);

                    }
                });

            }
        });
        menu.add(bill);
        billl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame bill = new JFrame("Billing Details");
                bill.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                bill.setVisible(true);
                bill.setSize(1366, 768);
                bill.setLayout(null);
                JLabel lblNewLabel = new JLabel("                     Billing Details");
                lblNewLabel.setForeground(Color.BLUE);
                lblNewLabel.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 60));
                lblNewLabel.setBounds(0, 0, 1350, 78);
                bill.add(lblNewLabel);

                JLabel lblNewLabel_1 = new JLabel("Marrigr Home Charges    3,45,345");
                lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
                lblNewLabel_1.setForeground(Color.WHITE);
                lblNewLabel_1.setBounds(436, 153, 457, 54);
                bill.add(lblNewLabel_1);

                JLabel lblNewLabel_1_1 = new JLabel("Catering Charge  4,56,789");
                lblNewLabel_1_1.setForeground(Color.WHITE);
                lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
                lblNewLabel_1_1.setBounds(436, 266, 332, 54);
                bill.add(lblNewLabel_1_1);

                JLabel lblNewLabel_1_2 = new JLabel("Our Charge  3,00,000");
                lblNewLabel_1_2.setForeground(Color.WHITE);
                lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
                lblNewLabel_1_2.setBounds(436, 346, 332, 54);
                bill.add(lblNewLabel_1_2);

                JLabel lblNewLabel_1_3 = new JLabel("Other Charge    5,76,832");
                lblNewLabel_1_3.setForeground(Color.WHITE);
                lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
                lblNewLabel_1_3.setBounds(436, 425, 332, 54);
                bill.add(lblNewLabel_1_3);

                JLabel lblNewLabel_1_4 = new JLabel("Total Charge  16,78,966");
                lblNewLabel_1_4.setForeground(Color.WHITE);
                lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
                lblNewLabel_1_4.setBounds(436, 503, 332, 54);
                bill.add(lblNewLabel_1_4);

                JLabel lblNewLabel_1_5 = new JLabel("Full bill detail will be mailed you soon");
                lblNewLabel_1_5.setForeground(Color.WHITE);
                lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
                lblNewLabel_1_5.setBounds(0, 616, 1350, 54);
                bill.add(lblNewLabel_1_5);

                JButton btnNewButton = new JButton("OK");
                btnNewButton.setBounds(750, 625, 89, 23);
                bill.add(btnNewButton);
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        funck.setText(funck.getText() + "Marrigr Home Charges    3,45,345 \n" + "Catering Charge  4,56,789 \n" + "Our Charge  3,00,000 \n" + "Other Charge    5,76,832 \n" + "Total Charge  16,78,966");
                        bill.setVisible(false);
                    }
                });


                JLabel lblNewLabel_2 = new JLabel("New label");
                lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\IMG_20200613_062848_resize_92.jpg"));
                lblNewLabel_2.setBounds(0, 0, 1366, 768);
                bill.add(lblNewLabel_2);
            }
        });

        setJMenuBar(menu);
        m3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame caterframe = new JFrame();
                caterframe.setTitle("catring");
                JLabel label1 = new JLabel();
                JLabel label2 = new JLabel();
                JLabel label3 = new JLabel();
                JLabel label4 = new JLabel();
                label1.setBounds(350, 400, 850, 50);
                label2.setBounds(350, 470, 850, 30);
                label3.setBounds(350, 520, 850, 30);
                label4.setBounds(350, 570, 850, 30);
                JButton b1 = new JButton("Done");
                b1.setBounds(500, 620, 70, 30);
                caterframe.add(b1);

                label1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 40));

                label2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 20));
                label3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 20));
                label4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 20));
                label1.setBackground(Color.GRAY);
                label1.setForeground(Color.BLUE);
                label2.setForeground(Color.BLACK);
                label3.setForeground(Color.BLACK);
                label4.setForeground(Color.RED);
                ImageIcon catericon = new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\asiya-kiev-SiwrpBnxDww-unsplash_resize_8.jpg");
                JLabel caterlabel = new JLabel(catericon);
                caterframe.add(label1);
                caterframe.add(label2);
                caterframe.add(label3);
                caterframe.add(label4);
                String[] s1 = {"Select cater", "shruti cater", "richa cater", "rahul cater", "shashi cater"};
                String[] s2 = {" ", "9027214058", "7934589898", "8532066858", "9457655010"};
                String address = "Address : 137/A balaji puram albatiya road shahganj agra";
                JComboBox<Object> comboBox = new JComboBox<>(s1);
                comboBox.setBounds(500, 345, 300, 30);
                caterframe.add(comboBox);
                caterframe.setBounds(0, 0, 1366, 768);
                caterframe.add(caterlabel);
                comboBox.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        for (int i = 1; i <= 4; i++) {
                            if (comboBox.getSelectedItem() == s1[i]) {
                                label1.setText("Your request has been submitted to " + s1[i] + "\n");
                                label2.setText("You can also contact cater personally");
                                label3.setText("Contact : " + s2[i]);
                                label4.setText(address);
                            }
                        }
                    }
                });
                b1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        funck.setText(funck.getText() + "Caters : " + (String) comboBox.getSelectedItem() + "\n" + "\n");
                        caterframe.setVisible(false);

                    }
                });
                caterframe.setVisible(true);
                caterframe.setSize(1366, 768);
                caterframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                caterframe.setLayout(null);


            }


        });
        m4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f2 = new JFrame("CHOOSE MENU");
                String[] s2 = {"Select Snacks", "Gobhi k pakode", "French Fries", "Cold Drink", "Soup", "Pasta", "Cutlet", "Alo ke pakode", "Chat", "Golgappe", "Bhalla", "Fry paneer,Chowmine", "Dosa", "Cheela", "Potato Basket", "Momo", "Burger", "Patiz", "cake", "pizza", "maggie", "iceCream", "juice", "gudiya k baal", "fruit chat", "fruit icecream", "idli", "popcorn", "raj kachodi", "chole kulche", "paw bhaji", "paneer roll",};
                String[] s3 = {"Select Main corse", "Baby eggplant in poppy seed sauce", "Tomato toor dal", "Spinach raita", "Sweet mango chutney", "Parathas / Steamed rice", "Rajma masala", "Okra stir fry", "Brussels sprouts saut�ed in butter", "Bottle gourd raita", "Coriander chutney", "Steamed rice", "Gobi masala", "Potatoes in mustard sauce", "Crispy green eggplant slices", "Moong and onion raita", "Aamras", "Pooris", "Bhindi do pyaza", "Chana dal with raisins", "Pickled carrots", "Mint raita", "Chapatis / Jeera rice", "Ridge gourd moong dal", "Crispy plaintain fry", "Mixed vegetable raita", "Tomato ginger peanut chutney", "Chapatis / Steamed rice", "Paneer kasoori methi", "Aloo tamatar curry with nigella seeds", "Carrot onion raita", "Parathas", "Mint and cashew pulao", "Methi chhole", "Cheesy zucchini", "Pineapple raita", "Tamarind jaggery chutney", "Flatbread spiced Indian-style", "Jeera rice"};
                JLabel lblNewLabel = new JLabel("Snacks");
                lblNewLabel.setBounds(0, 0, 100, 20);
                f2.add(lblNewLabel);

                JLabel lblNewLabel_1 = new JLabel("Main corse");
                lblNewLabel_1.setBounds(800, 0, 100, 20);
                f2.add(lblNewLabel_1);

                JComboBox<Object> comboBox = new JComboBox<>(s2);
                comboBox.setBounds(0, 40, 300, 30);
                f2.add(comboBox);

                JComboBox<Object> comboBox_1 = new JComboBox<>(s3);
                comboBox_1.setBounds(800, 40, 300, 30);
                f2.add(comboBox_1);

                JButton btnNewButton = new JButton();
                btnNewButton.setBounds(766, 653, 89, 23);
                f2.add(btnNewButton);
                btnNewButton.setText("Done");
                JTextArea nashta = new JTextArea();
                JTextArea khana = new JTextArea();
                JScrollPane scroll = new JScrollPane();
                scroll.setViewportView(nashta);
                scroll.setBounds(0, 80, 683, 300);
                f2.add(scroll);
                JScrollPane scroll_2 = new JScrollPane();
                scroll_2.setViewportView(khana);
                scroll_2.setBounds(683, 80, 683, 300);
                ImageIcon kh = new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\buffet-315691_1280_resize_89.jpg");
                JLabel indkh = new JLabel(kh);
                indkh.setBounds(0, 300, 1366, 430);
                f2.add(scroll_2);
                f2.add(indkh);
                ImageIcon wine = new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\saad-EeN8KSwYMjw-unsplash_resize_19.jpg");
                JLabel indkha = new JLabel(wine);
                indkha.setBounds(0, 0, 1366, 300);
                f2.add(indkha);
                System.out.println(nashta.getText());
                comboBox.addItemListener(new ItemListener() {


                    public void itemStateChanged(ItemEvent e) {
                        nashta.setText(nashta.getText() + "\n" + (String) comboBox.getSelectedItem());
                        System.out.println(nashta.getText());


                    }

                });
                comboBox_1.addItemListener(new ItemListener() {


                    public void itemStateChanged(ItemEvent e) {
                        khana.setText(khana.getText() + "\n" + (String) comboBox_1.getSelectedItem());
                    }

                });
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        funck.setText(funck.getText() + "Snacks" + nashta.getText() + "\n" + "\n");


                        funck.setText(funck.getText() + "Main Corse" + khana.getText() + "\n");
                        f2.setVisible(false);

                    }
                });
                JComboBox<Object> comboBox_2 = new JComboBox<>();
                comboBox_2.setBounds(800, 40, 300, 30);
                f2.add(comboBox_2);
                f2.setVisible(true);
                f2.setSize(1366, 768);
                f2.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                f2.setLayout(null);
            }

        });
        menu.add(term);
        condition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame conditionframe = new JFrame("Terms and Conditions");

                conditionframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                conditionframe.setVisible(true);
                conditionframe.setSize(1366, 768);
                conditionframe.setLayout(null);
                JLabel lblNewLabel = new JLabel("                  Terms And Condition");
                lblNewLabel.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 60));
                lblNewLabel.setBounds(0, 0, 1350, 78);
                lblNewLabel.setForeground(Color.BLUE);
                conditionframe.add(lblNewLabel);

                JCheckBox chckbxNewCheckBox = new JCheckBox("I have read all terms and conditon briefly and I supposed to follow them strictly\r\n I don't blame author for any unconvinience caused by voilating these terms and condition");
                chckbxNewCheckBox.setForeground(Color.BLUE);
                chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
                chckbxNewCheckBox.setBounds(44, 620, 1300, 23);
                conditionframe.add(chckbxNewCheckBox);
                chckbxNewCheckBox.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        JButton btnNewButton = new JButton();
                        btnNewButton.setBounds(766, 653, 89, 23);
                        conditionframe.add(btnNewButton);
                        btnNewButton.setText("Done");
                        btnNewButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {

                                ImageIcon amo = new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\Screenshot_2020-06-17-12-49-08-28.jpg");
                                JLabel aam = new JLabel(amo);
                                while (true) {

                                    String s = JOptionPane.showInputDialog(conditionframe, aam, "captcha verification", JOptionPane.QUESTION_MESSAGE);
                                    System.out.println(s);
                                    String s1 = "V6T9JBCDS";
                                    if (s.equals(s1)) {
                                        break;
                                    }

                                }
                                JFrame alldetail = new JFrame("All Details");
                                alldetail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                alldetail.setVisible(true);
                                alldetail.setSize(1366, 768);
                                alldetail.setLayout(null);
                                JLabel lblNewLabel = new JLabel("               All Details");
                                lblNewLabel.setForeground(Color.WHITE);
                                lblNewLabel.setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 89));
                                lblNewLabel.setBounds(0, 0, 1366, 101);
                                alldetail.add(lblNewLabel);

                                JButton xyz = new JButton("Done");
                                xyz.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
                                xyz.setBounds(610, 663, 105, 32);
                                alldetail.add(xyz);
                                xyz.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        System.exit(0);
                                    }
                                });

                                JScrollPane scrollPane = new JScrollPane();
                                scrollPane.setBounds(0, 112, 1366, 551);
                                alldetail.add(scrollPane);


                                scrollPane.setViewportView(funck);

                                JLabel lblNewLabel_1 = new JLabel("New label");
                                lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\traditional-4367783_1920_resize_59.jpg"));
                                lblNewLabel_1.setBounds(0, 0, 1366, 740);
                                alldetail.add(lblNewLabel_1);
                            }
                        });
                    }
                });
                JTextArea txtrPricingIwpsPricing = new JTextArea();
                txtrPricingIwpsPricing.setText("Pricing\r\n\r\nIWP's pricing policy has been set up to ensure you have visibility of your event costs throughout the project .We will work within the budget you have defined.\r\nAny extra requirements will be catered to with the clients consent on paying the supplement cost\r\nSeveral of the services we outsource on your behalf, such as transportation, musicians, Videographer and photographers are contracted on a time basis. If these times are exceeded, IWP reserves the right to charge you for any excess billing.\r\nNo services from IWP or its suppliers will be guaranteed unless payment is received. IWP will only hold responsibility and will be concerned about the amount in INR paid to our account. Any other bank charges from clients end is payable the client.\r\nIf actual attendance is below the Guaranteed Number, the customer will, nonetheless, be charged for the Guaranteed Number. Once the number of pax mentioned in the SLA is signed and agreed is final and serves as the minimum guarantee, in case of any increment in the number of pax, the client has to pay extra.\r\nAs weather in Goa is unpredictable, there is always a possibility of rainfall, irrespective of the season.\r\nIf there is rainfall during the wedding in Goa, the company is not responsible for providing the shelter. If you require the shelter, you have to pay the cost to the concerned vendor.\r\nIf an indoor wedding venue is available at the hotel, the wedding set-up can be shifted indoors. But in this case, you have to pay the additional cost (If Applicable) to the hotel.\r\nFor Extra Guest then the minimum Guaranteed of the people committed in wedding plan & the SLA the following policy will be applicable.\r\nFood : On actual per person as mentioned in The SLA & the Event plan.\r\nLand arrangements (wedding package): 75 % of the amount from the total calculated on per person basis mentioned in SLA multiplied by the maximum number of extra guest in any event. For e.g. If the amount of land arrangement for Mr. X wedding is Rs. 10 , 00, 000 for 100 people for 2 Events discussed in the SLA. At the later stage if the number of people increases to 120 for 1st event & 150 for other. The supplement charges will be 10, 00,000 = 10000 per person X 75 % = Rs. 7500 X 50 pax (Maximum number of extra guest in any event.) = Rs. 3, 75,000\r\nLast Installment\r\n\r\nThe Final Installment against the wedding package / event package should be paid a day prior to the last event. In case, if it is mentioned in the SLA that it would be paid on the last day of the event, It should be paid at least six hours before the starting of the event, so that the payment to the vendors can be made on time for the smooth functioning of the final event. Payment is only accepted in Cash or Demand Draft. No cheques /credit cards will be accepted for the final Payment.\r\nBooking & payments\r\n\r\nYou will need to return a signed copy of the contract with a 25% deposit of the total fee. ( 1st installment)\r\nThe total payment structure has been divided in to 4 easy installments.\r\nThe last installment has to be paid before the last event.\r\nAll payments have to be made by 1) BANK TRANSFERS, 2) Demand draft .\r\nRefund & Cancellation:\r\n\r\nIn concern to refund of unused / unutilized services (which are paid for and cancelled in advance) the refund amount would be calculated on the basis of cancellation policy as explained above and the money would be accordingly refunded to the person who has made the payment to us. Please note that it may take 4 - 8 weeks for the refund process due to banking procedures. If the refund is made to the credit card account or to Bank account, the bank charges would be debited from the refund amount.\r\n\r\nCancellation policy\r\n\r\nNotice of cancellation must be made in writing to IWP.\r\nUp to 180 days prior to the event you will be entitled to 50% of the total paid less any supplier cancellation charges.\r\n180 days to 90 days you will be entitled to 25% of the total paid less any supplier cancellation charges.\r\nUp to 30 days prior to the event you will be entitled to 10% of the total paid less any supplier cancellation charges.\r\nA strict cancellation policy will apply for all other services.\r\nPlease note that irrespective of above mentioned cancellations slabs, there would be a service charge of 10% which would be applicable incase of cancellation of services after the booking is made with us.\r\nHotels Refund & Cancellation Policy.\r\n\r\nIf you cancel the package after commencement, refund would be restricted to a limited amount, depending on the amount that we would be able to recover from the hoteliers and vendors we deal with. For any unused hotel accommodation, Venue Charges, chartered transportation and missed meals etc. we, at IWP is not responsible to refund any amount.\r\nCheck in time and check out time is strictly to be followed as per the hotel policy.\r\nDue to licensing requirements and quality control issues, all food and beverage to be served on Hotel property must be supplied and prepared by Hotel and may not be removed from Hotel property.\r\nOnce the food tasting session is held with the client IWP ensures the same quality of the food however changes at the last moment by the hotels related to health issues IWP is not responsible. No food is permitted to be taken into the hotel for consumption. No Food or Beverage is permitted to leave the hotel with the exception of the wedding cake so as to comply with Health & Safety Regulations.\r\nIf the cancellation or modification is after this time, the first night or 50% of the total reservation amount is taken, whichever is higher. For reservations with multiple rooms this applies to each room. Please also note all cancellations or modifications must be made in writing, either by fax or email. Cancellations over the phone will not be accepted.\r\nAny changes in the menu at the last moment will be charged extra.\r\nGuests are welcome to arrive at the Hotel at any time. We will do our very best to have your room available as soon as possible, but we cannot guarantee that it will be ready before 2pm. You may, of course, use any of the Hotels facilities prior to check-in. On your day of departure we respectfully request that you vacate your room by 11.00am. On some occasions it may be possible to extend this, however extra charges will be applied. Departing guests are welcome to use the facilities on their day of departure.\r\nIf you fail to cancel a booking and proceed in accordance with the booking made, you will be charged for up to the full amount of the booking made.\r\nAirport Transfers\r\n\r\nAirport Transfers, if included in the accommodation package are through AC Coaches of different sizes (12/ 18 / 27 / 36 / 45). Guest will be transferred to booked hotels by coaches in the batch size of 10 & above. The guest coming by different flights should be informed in advance about the waiting time at Airport. The individual guests coming from different flights can be transferred by Cars on a supplement cost.\r\n");
                JScrollPane scroll = new JScrollPane(txtrPricingIwpsPricing);
                scroll.setBounds(0, 80, 1344, 524);
                conditionframe.add(scroll);


                JLabel lblNewLabel_1 = new JLabel("New label");
                lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\This PC\\Desktop\\java\\MySwing\\photos\\Image-Source-PlusPNG.com_resize_88.jpg"));
                lblNewLabel_1.setBounds(0, 0, 1366, 768);
                lblNewLabel_1.setBackground(Color.BLUE);
                conditionframe.add(lblNewLabel_1);

            }
        });


        add(homelabel);
        setSize(1366, 768);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}

