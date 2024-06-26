/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finallogica.Interfaz;

import javax.swing.JOptionPane;
import AppPackage.AnimationClass;
import finallogica.Modelo.InicioSesion;

public class Login extends javax.swing.JFrame {
    private int IdSesion;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        JpIniciarSesion = new javax.swing.JPanel();
        LbIniciarSesion = new javax.swing.JLabel();
        LbImagen = new javax.swing.JLabel();
        LbNombre = new javax.swing.JLabel();
        TfNombre = new javax.swing.JTextField();
        LbImgNombre = new javax.swing.JLabel();
        SpNombre = new javax.swing.JSeparator();
        LbCódigo = new javax.swing.JLabel();
        TfCodigo = new javax.swing.JTextField();
        SpCodigo = new javax.swing.JSeparator();
        LbImgCodigo = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        LbRegistrarse = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LbCubierta = new javax.swing.JLabel();
        JpRegistro = new javax.swing.JPanel();
        LbRegistro = new javax.swing.JLabel();
        LbImgRegistro = new javax.swing.JLabel();
        LbNombres = new javax.swing.JLabel();
        TfNombres = new javax.swing.JTextField();
        LbFacultad = new javax.swing.JLabel();
        TfFacultad = new javax.swing.JTextField();
        LbApellidos = new javax.swing.JLabel();
        TfApellidos = new javax.swing.JTextField();
        LbCarrera = new javax.swing.JLabel();
        TfCarrera = new javax.swing.JTextField();
        LbCodigo = new javax.swing.JLabel();
        TfCodigos = new javax.swing.JTextField();
        BtnRegistrado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LbMinimizar = new javax.swing.JLabel();
        LbCerrar = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel7.setText("Bienvenido a Ulises V2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(ClasePrincipal.favicon);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        JpIniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        JpIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));

        LbIniciarSesion.setBackground(new java.awt.Color(0, 39, 229));
        LbIniciarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        LbIniciarSesion.setForeground(new java.awt.Color(0, 39, 229));
        LbIniciarSesion.setText("Iniciar Sesión");

        LbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finallogica/Interfaz/img/usuario.png"))); // NOI18N

        LbNombre.setBackground(new java.awt.Color(0, 39, 229));
        LbNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        LbNombre.setForeground(new java.awt.Color(0, 39, 229));
        LbNombre.setText("Nombre:");

        TfNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        TfNombre.setForeground(new java.awt.Color(153, 153, 153));
        TfNombre.setText("Ingrese Nombre");
        TfNombre.setBorder(null);
        TfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TfNombreMouseClicked(evt);
            }
        });
        TfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNombreActionPerformed(evt);
            }
        });

        LbImgNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finallogica/Interfaz/img/nombre.png"))); // NOI18N

        SpNombre.setBackground(new java.awt.Color(0, 0, 0));
        SpNombre.setForeground(new java.awt.Color(0, 0, 0));

        LbCódigo.setBackground(new java.awt.Color(0, 39, 229));
        LbCódigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        LbCódigo.setForeground(new java.awt.Color(0, 39, 229));
        LbCódigo.setText("Código:");

        TfCodigo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        TfCodigo.setForeground(new java.awt.Color(153, 153, 153));
        TfCodigo.setText("Ingrese Código");
        TfCodigo.setBorder(null);
        TfCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TfCodigoMouseClicked(evt);
            }
        });
        TfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfCodigoActionPerformed(evt);
            }
        });

        SpCodigo.setBackground(new java.awt.Color(0, 0, 0));
        SpCodigo.setForeground(new java.awt.Color(0, 0, 0));

        LbImgCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finallogica/Interfaz/img/contraseña.png"))); // NOI18N

        BtnIngresar.setBackground(new java.awt.Color(0, 39, 229));
        BtnIngresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setText("Ingresar");
        BtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnIngresar.setBorder(null);
        BtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });

        LbRegistrarse.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        LbRegistrarse.setForeground(new java.awt.Color(0, 39, 229));
        LbRegistrarse.setText("¿No te has Registrado?");

        BtnRegistrar.setBackground(new java.awt.Color(0, 39, 229));
        BtnRegistrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        BtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.setBorder(null);
        BtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JpIniciarSesionLayout = new javax.swing.GroupLayout(JpIniciarSesion);
        JpIniciarSesion.setLayout(JpIniciarSesionLayout);
        JpIniciarSesionLayout.setHorizontalGroup(
            JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                .addGroup(JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LbImgNombre)
                                .addGap(6, 6, 6)
                                .addComponent(TfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SpCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                                        .addComponent(LbImgCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                            .addGroup(JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(LbIniciarSesion))
                                .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(LbImagen)))
                            .addGap(14, 14, 14)))
                    .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(LbRegistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        JpIniciarSesionLayout.setVerticalGroup(
            JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpIniciarSesionLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(LbIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbImgNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LbCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbImgCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(JpIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbRegistrarse)
                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        getContentPane().add(JpIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(0, 106, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbCubierta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finallogica/Interfaz/img/FondoLogin.png"))); // NOI18N
        LbCubierta.setOpaque(true);
        jPanel1.add(LbCubierta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JpRegistro.setBackground(new java.awt.Color(255, 255, 255));
        JpRegistro.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        LbRegistro.setBackground(new java.awt.Color(0, 39, 229));
        LbRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        LbRegistro.setForeground(new java.awt.Color(0, 39, 229));
        LbRegistro.setText("Registro");

        LbImgRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finallogica/Interfaz/img/usuario (5).png"))); // NOI18N

        LbNombres.setBackground(new java.awt.Color(0, 39, 229));
        LbNombres.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        LbNombres.setForeground(new java.awt.Color(0, 39, 229));
        LbNombres.setText("Nombres: ");

        TfNombres.setForeground(new java.awt.Color(0, 39, 229));
        TfNombres.setCaretColor(new java.awt.Color(0, 39, 229));

        LbFacultad.setBackground(new java.awt.Color(0, 39, 229));
        LbFacultad.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        LbFacultad.setForeground(new java.awt.Color(0, 39, 229));
        LbFacultad.setText("Facultad:");

        TfFacultad.setForeground(new java.awt.Color(0, 39, 229));
        TfFacultad.setCaretColor(new java.awt.Color(0, 39, 229));

        LbApellidos.setBackground(new java.awt.Color(0, 39, 229));
        LbApellidos.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        LbApellidos.setForeground(new java.awt.Color(0, 39, 229));
        LbApellidos.setText("Apellidos:");

        TfApellidos.setForeground(new java.awt.Color(0, 39, 229));
        TfApellidos.setCaretColor(new java.awt.Color(0, 39, 229));

        LbCarrera.setBackground(new java.awt.Color(0, 39, 229));
        LbCarrera.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        LbCarrera.setForeground(new java.awt.Color(0, 39, 229));
        LbCarrera.setText("Carrera:");

        TfCarrera.setForeground(new java.awt.Color(0, 39, 229));
        TfCarrera.setCaretColor(new java.awt.Color(0, 39, 229));

        LbCodigo.setBackground(new java.awt.Color(0, 39, 229));
        LbCodigo.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        LbCodigo.setForeground(new java.awt.Color(0, 39, 229));
        LbCodigo.setText("Código:");

        TfCodigos.setForeground(new java.awt.Color(0, 39, 229));
        TfCodigos.setCaretColor(new java.awt.Color(0, 39, 229));

        BtnRegistrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finallogica/Interfaz/img/registrar.png"))); // NOI18N
        BtnRegistrado.setBorder(null);
        BtnRegistrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistradoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JpRegistroLayout = new javax.swing.GroupLayout(JpRegistro);
        JpRegistro.setLayout(JpRegistroLayout);
        JpRegistroLayout.setHorizontalGroup(
            JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpRegistroLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbApellidos)
                    .addComponent(TfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCodigo)
                    .addComponent(TfCodigos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbCarrera)
                            .addComponent(TfCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegistrado)
                        .addGap(163, 163, 163))))
            .addGroup(JpRegistroLayout.createSequentialGroup()
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(LbImgRegistro))
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(LbFacultad))
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(LbRegistro))
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(LbNombres)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JpRegistroLayout.setVerticalGroup(
            JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpRegistroLayout.createSequentialGroup()
                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnRegistrado)
                    .addGroup(JpRegistroLayout.createSequentialGroup()
                        .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(LbImgRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(TfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(LbRegistro))
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(LbNombres))
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(LbFacultad))
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(TfFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbApellidos)
                            .addComponent(LbCarrera)
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TfCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(JpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbCodigo)
                            .addGroup(JpRegistroLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(TfCodigos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel1.add(JpRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        LbMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finallogica/Interfaz/img/minimizar.png"))); // NOI18N
        LbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMinimizarMouseClicked(evt);
            }
        });

        LbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finallogica/Interfaz/img/salir.png"))); // NOI18N
        LbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(667, Short.MAX_VALUE)
                .addComponent(LbMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LbCerrar)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCerrar))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfCodigoActionPerformed

    private void LbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMinimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_LbMinimizarMouseClicked

    private void LbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del sistema?","Exit", dialog);
        if(result ==0){
            System.exit(0);
        }
    }//GEN-LAST:event_LbCerrarMouseClicked

    private void BtnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseClicked
        //Animación para panel registrar
        AnimationClass registro = new AnimationClass();
        //--->
        registro.jLabelXRight(0, 800, 10, 20, LbCubierta);
        
    }//GEN-LAST:event_BtnRegistrarMouseClicked

    private void BtnRegistradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistradoMouseClicked
        // Animación usuaruo ya registrado
        AnimationClass registro = new AnimationClass();
        //<--- 
        registro.jLabelXLeft(800, 0, 10, 20, LbCubierta);
    }//GEN-LAST:event_BtnRegistradoMouseClicked

    private void TfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNombreActionPerformed

    private void TfNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TfNombreMouseClicked
        TfNombre.setText("");
    }//GEN-LAST:event_TfNombreMouseClicked

    private void TfCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TfCodigoMouseClicked
        TfCodigo.setText("");
    }//GEN-LAST:event_TfCodigoMouseClicked

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        IdSesion = InicioSesion.iniciarUsuario(TfNombre.getText(), TfCodigo.getText());
        if (IdSesion == 0) {
            MainDirectivo instanciaDirectivo = new MainDirectivo();
            instanciaDirectivo.setVisible(true);
            this.dispose();
        } else if (IdSesion > 0) {
            MainEstudiante instanciaEstudiante = new MainEstudiante(IdSesion);
            instanciaEstudiante.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BtnIngresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnRegistrado;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JPanel JpIniciarSesion;
    private javax.swing.JPanel JpRegistro;
    private javax.swing.JLabel LbApellidos;
    private javax.swing.JLabel LbCarrera;
    private javax.swing.JLabel LbCerrar;
    private javax.swing.JLabel LbCodigo;
    private javax.swing.JLabel LbCubierta;
    private javax.swing.JLabel LbCódigo;
    private javax.swing.JLabel LbFacultad;
    private javax.swing.JLabel LbImagen;
    private javax.swing.JLabel LbImgCodigo;
    private javax.swing.JLabel LbImgNombre;
    private javax.swing.JLabel LbImgRegistro;
    private javax.swing.JLabel LbIniciarSesion;
    private javax.swing.JLabel LbMinimizar;
    private javax.swing.JLabel LbNombre;
    private javax.swing.JLabel LbNombres;
    private javax.swing.JLabel LbRegistrarse;
    private javax.swing.JLabel LbRegistro;
    private javax.swing.JSeparator SpCodigo;
    private javax.swing.JSeparator SpNombre;
    private javax.swing.JTextField TfApellidos;
    private javax.swing.JTextField TfCarrera;
    private javax.swing.JTextField TfCodigo;
    private javax.swing.JTextField TfCodigos;
    private javax.swing.JTextField TfFacultad;
    private javax.swing.JTextField TfNombre;
    private javax.swing.JTextField TfNombres;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
