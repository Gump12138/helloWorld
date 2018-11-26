package com.AWTSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BlackBordListenner {
    JFrame frame=new JFrame("测试-😄 ");
    JTextArea ta=new JTextArea( 8,20 );
    Icon icon=new ImageIcon("C:\\Users\\G\\Pictures\\Camera Roll\\button1.png" );
    JButton jb=new JButton( "开始/结束",icon);
    JPopupMenu pop=new JPopupMenu(  );
    ButtonGroup flavorGroup=new ButtonGroup();
    JRadioButtonMenuItem metalItem=new JRadioButtonMenuItem( "Metal风格" );
    JRadioButtonMenuItem nimbusItem=new JRadioButtonMenuItem( "Nimbus风格" ,true);
    JRadioButtonMenuItem windowsItem=new JRadioButtonMenuItem( "Windows风格");
    JRadioButtonMenuItem classicItem=new JRadioButtonMenuItem( "Classic风格" );
    JRadioButtonMenuItem motifItem=new JRadioButtonMenuItem( "Motif风格");

    public void show(){
        JPanel jp=new JPanel();
        jp.add( ta );
        jp.add( jb );
        frame.add(jp, BorderLayout.SOUTH );
        flavorGroup.add( metalItem );
        flavorGroup.add( nimbusItem );
        flavorGroup.add( windowsItem );
        flavorGroup.add( classicItem );
        flavorGroup.add( motifItem );
        pop.add( metalItem );
        pop.add( nimbusItem );
        pop.add( windowsItem );
        pop.add( classicItem );
        pop.add( motifItem );
        ActionListener flavorListener = e ->{
            try {
                switch (e.getActionCommand()){
                    case "Metal风格":
                        changeFlavor(1);
                        break;
                    case "Nimbus风格":
                        changeFlavor( 2 );
                        break;
                    case  "Windows风格":
                        changeFlavor( 3 );
                        break;
                    case   "Classic风格":
                        changeFlavor( 4 );
                        break;
                    case   "Motif风格":
                        changeFlavor( 5 );
                        break;
                }
            }catch (Exception f){
                f.printStackTrace();
            }
        };
        metalItem.addActionListener( flavorListener );
        nimbusItem.addActionListener( flavorListener );
        windowsItem.addActionListener( flavorListener );
        classicItem.addActionListener( flavorListener );
        motifItem.addActionListener( flavorListener );
        ta.setComponentPopupMenu( pop );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );


    }

    private void changeFlavor(int flavor)throws Exception {
        switch (flavor){
            case 1:
                UIManager.setLookAndFeel( "javax.swing.plaf.metal.MetalLookAndFeel" );
                break;
            case 2:
                UIManager.setLookAndFeel( "javax.swing.plaf.nimbus.NimbusLookAndFeel" );
                break;
            case 3:
                UIManager.setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsLookAndFeel" );
                break;
            case 4:
                UIManager.setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel" );
                break;
            case 5:
                UIManager.setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel" );
                break;
        }
        SwingUtilities.updateComponentTreeUI( frame.getContentPane() );
        SwingUtilities.updateComponentTreeUI( pop );

    }

    public static void main(String[] args) {
        new BlackBordListenner().show();
    }

}
