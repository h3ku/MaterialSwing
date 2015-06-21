package swingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by H3kuFC on 29/05/2015.
 */
public class MaterialFrame extends JFrame{

    public JPanel thePanel;
    private int xMouse;
    private int yMouse;

    //Botonera
    private JLabel btnClose;
    private JLabel btnMinimize;
    private JLabel btnFullScreen;

    //imagenes Botonera
    private ImageIcon imgCloseDefault;
    private ImageIcon imgCloseHover;
    private ImageIcon imgCloseClick;

    private ImageIcon imgMinimizeDefault;
    private ImageIcon imgMinimizeHover;
    private ImageIcon imgMinimizeClick;

    private ImageIcon imgFullScreenDefault;
    private ImageIcon imgFullScreenHover;
    private ImageIcon imgFullScreenClick;

    /**
     * Constructor call initComponents method.
     */
    public MaterialFrame(){
        initComponents();
    }


    //DragBar Events
    private void dragBarMouseDragged(MouseEvent e) {
        int x = e.getXOnScreen();
        int y = e.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }

    private void dragBarMousePressed(MouseEvent e) {
        xMouse = e.getX();
        yMouse = e.getY();
    }

    //ButtonsBar Events

    //Close
    private void btnCloseMouseEntered() {
        btnClose.setIcon(imgCloseHover);
    }
    private void btnCloseMouseExited() {
        btnClose.setIcon(imgCloseDefault);
    }
    private void btnCloseMousePressed() {
        btnClose.setIcon(imgCloseClick);
    }
    private void btnCloseMouseReleased() {
        btnClose.setIcon(imgCloseDefault);
    }
    private void btnCloseMouseClicked() {
        System.exit(0);
    }

    //Minimize
    private void btnMinimizeMouseEntered() {
        btnMinimize.setIcon(imgMinimizeHover);
    }
    private void btnMinimizeMouseExited() {
        btnMinimize.setIcon(imgMinimizeDefault);
    }
    private void btnMinimizeMousePressed() {
        btnMinimize.setIcon(imgMinimizeClick);
    }
    private void btnMinimizeMouseReleased() {
        btnMinimize.setIcon(imgMinimizeDefault);
    }
    private void btnMinimizeMouseClicked() {
        this.setState(Frame.ICONIFIED);
    }

    //Full Screen
    private void btnFullScreenMouseEntered() {
        btnFullScreen.setIcon(imgFullScreenHover);
    }
    private void btnFullScreenMouseExited() {
        btnFullScreen.setIcon(imgFullScreenDefault);
    }
    private void btnFullScreenMousePressed() {
        btnFullScreen.setIcon(imgFullScreenClick);
    }
    private void btnFullScreenMouseReleased() {
        btnFullScreen.setIcon(imgFullScreenDefault);
    }
    private void btnFullScreenMouseClicked() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void initComponents(){
        /*

     */
        JLabel dragBar = new JLabel();
        JPanel menuPanel = new JPanel();
        thePanel = new JPanel();

        btnClose = new JLabel();
        btnMinimize = new JLabel();
        btnFullScreen = new JLabel();

        //---- THIS ----
        Container contentPane = getContentPane();
        this.setUndecorated(true);
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);


        //======== menuPanel ========
        {
            //---- btnClose ----

            //Estados
            imgCloseDefault = new ImageIcon(getClass().getResource("/resources/images/btnClose.png"));
            imgCloseHover = new ImageIcon(getClass().getResource("/resources/images/btnCloseHover.png"));
            imgCloseClick = new ImageIcon(getClass().getResource("/resources/images/btnCloseClick.png"));

            //asignamos la default
            btnClose.setIcon(imgCloseDefault);

            btnClose.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnCloseMouseClicked();
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnCloseMouseEntered();
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnCloseMouseExited();
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    btnCloseMousePressed();
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    btnCloseMouseReleased();
                }
            });

            //---- btnMinimize ----
            //Estados
            imgMinimizeDefault = new ImageIcon(getClass().getResource("/resources/images/btnMinimize.png"));
            imgMinimizeHover = new ImageIcon(getClass().getResource("/resources/images/btnMinimizeHover.png"));
            imgMinimizeClick = new ImageIcon(getClass().getResource("/resources/images/btnMinimizeClick.png"));

            //asignamos la default
            btnMinimize.setIcon(imgMinimizeDefault);

            btnMinimize.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnMinimizeMouseClicked();
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnMinimizeMouseEntered();
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnMinimizeMouseExited();
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    btnMinimizeMousePressed();
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    btnMinimizeMouseReleased();
                }
            });

            //---- btnFullScreen ----
            //Estados
            imgFullScreenDefault = new ImageIcon(getClass().getResource("/resources/images/btnFullScreen.png"));
            imgFullScreenHover = new ImageIcon(getClass().getResource("/resources/images/btnFullScreenHover.png"));
            imgFullScreenClick = new ImageIcon(getClass().getResource("/resources/images/btnFullScreenClick.png"));

            //asignamos la default
            btnFullScreen.setIcon(imgFullScreenDefault);

            btnFullScreen.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnFullScreenMouseClicked();
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btnFullScreenMouseEntered();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btnFullScreenMouseExited();
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    btnFullScreenMousePressed();
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    btnFullScreenMouseReleased();
                }
            });

            //---- dragBar ----
            dragBar.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    dragBarMouseDragged(e);
                }
            });
            dragBar.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    dragBarMousePressed(e);
                }
            });


            GroupLayout menuPanelLayout = new GroupLayout(menuPanel);
            menuPanel.setLayout(menuPanelLayout);
            menuPanelLayout.setHorizontalGroup(
                    menuPanelLayout.createParallelGroup()
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                    .addComponent(dragBar, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnFullScreen)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMinimize)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnClose)
                                    .addContainerGap())
            );
            menuPanelLayout.setVerticalGroup(
                    menuPanelLayout.createParallelGroup()
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                    .addGroup(menuPanelLayout.createParallelGroup()
                                            .addGroup(menuPanelLayout.createSequentialGroup()
                                                    .addGroup(menuPanelLayout.createParallelGroup()
                                                            .addComponent(btnFullScreen)
                                                            .addComponent(btnMinimize)
                                                            .addComponent(btnClose))
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(dragBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap())
            );
        }


        //======== thePanel ========
        {
            thePanel.setLayout(new CardLayout());
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addComponent(menuPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(thePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(menuPanel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

    }

    /**
     * @param objeto
     * @return
     */
    public Component add(Component objeto){
        thePanel.add(objeto);
        pack();
        return objeto;
    }
}
