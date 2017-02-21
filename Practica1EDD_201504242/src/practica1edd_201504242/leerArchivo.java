/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd_201504242;

import java.io.File;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; // |
/**
 *
 * @author p_ab1
 */
public class leerArchivo extends javax.swing.JFrame {

    /**
     * Creates new form leerArchivo
     */
    public leerArchivo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leer = new javax.swing.JButton();
        jugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leer.setText("Leer Archivo");
        leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerActionPerformed(evt);
            }
        });

        jugar.setText("Jugar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(leer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerActionPerformed
        // TODO add your handling code here:
       String archivo="";
        try {
            archivo = abrirArchivo();
            XML(archivo);
        } catch (Exception ex) {
            Logger.getLogger(leerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leerActionPerformed

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
            java.util.logging.Logger.getLogger(leerArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leerArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leerArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leerArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leerArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jugar;
    private javax.swing.JButton leer;
    // End of variables declaration//GEN-END:variables
    private String abrirArchivo() throws JDOMException, FileNotFoundException, IOException {
//        String aux="";   
//        String texto="";
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        File abre=file.getSelectedFile();
        String ruta = abre.getPath();
        
//           if(abre!=null)
//           {     
//              FileReader archivos=new FileReader(abre);
//              BufferedReader lee=new BufferedReader(archivos);
//              while((aux=lee.readLine())!=null)
//              {
//                 texto+= aux+ "\n";
//              }
//                 lee.close();
//            }
          return ruta;
        }

    private void XML(String archivo) {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(archivo);
        try
        {
            //Se crea el documento a traves del archivo
            Document document = (Document) builder.build( xmlFile );
            //Se obtiene la raiz 'scrabble'
            Element rootNode = document.getRootElement();
            //Se obtiene la lista de hijos de la raiz 'scrabble'
            List diccionario = rootNode.getChildren( "diccionario" );
            List triples = rootNode.getChildren( "triples" );
            List dobles = rootNode.getChildren( "dobles" );
            List dimension = rootNode.getChildren( "dimension" );
            //SE LEEN LA DIMENSION DE LA MATRIZ
            for(int q=0 ; q<dimension.size();q++){
                Element dime= (Element) dimension.get(q);
                System.out.println(dime.getValue());
            }
            //SE LEEN atributos DICCIONARIO
            for ( int i = 0;i< diccionario.size(); i++ ){
                Element elementoDiccionario = (Element) diccionario.get(i);
                List listaDiccionario = elementoDiccionario.getChildren();
                //LISTA DE DICCIONARIO
                for ( int j = 0; j < listaDiccionario.size(); j++ )
                {
                    Element campo = (Element)listaDiccionario.get( j );
                    String palabra = campo.getValue();
                    System.out.println(palabra);
                }
            }
           //SE LEEN LOS TRIPLES
            for ( int i = 0;i< triples.size(); i++ ){
                Element elementoTriple = (Element) triples.get(i);
                List listaTriples = elementoTriple.getChildren();

                for ( int j = 0; j < listaTriples.size(); j++ )
                {
                    Element campo = (Element)listaTriples.get( j );
                    String x = campo.getChildTextTrim("x");
                    String y = campo.getChildTextTrim("y");
                    System.out.println("X: "+x+" Y: "+y );
                }
            }
            //SE LEEN LOS DOBLES
             for ( int i = 0;i< dobles.size(); i++ ){
                Element elementoDoble = (Element) dobles.get(i);
                List listaDoble = elementoDoble.getChildren();

                for ( int j = 0; j < listaDoble.size(); j++ )
                {
                    Element campo = (Element)listaDoble.get( j );
                    String x = campo.getChildTextTrim("x");
                    String y = campo.getChildTextTrim("y");
                    System.out.println("X: "+x+" Y: "+y );
                }
            }

        }catch ( IOException io ) {
            System.out.println( io.getMessage() );
        }catch ( JDOMException jdomex ) {
            System.out.println( jdomex.getMessage() );
        }      
        }   
    }
