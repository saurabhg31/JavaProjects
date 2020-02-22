import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DataConnectivity__Table_EMPL.java
 *
 * Created on Mar 24, 2011, 10:02:44 PM
 */

/**
 *
 * @author Saurabh
 */
public class DataConnectivity__Table_EMPL extends javax.swing.JFrame {

    /** Creates new form DataConnectivity__Table_EMPL */
    public DataConnectivity__Table_EMPL() {
        initComponents();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        SalRB = new javax.swing.JRadioButton();
        DepNoRB = new javax.swing.JRadioButton();
        HiredateRB = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        ascRB = new javax.swing.JRadioButton();
        descRB = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jobCBx = new javax.swing.JComboBox();
        depnoCBx = new javax.swing.JComboBox();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        fetchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outTbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel1.setText("Fields For Display");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 20));

        jScrollPane1.setFont(new java.awt.Font("Calibri", 0, 14));

        fieldList.setFont(new java.awt.Font("Calibri", 0, 14));
        fieldList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Empno", "Ename", "Job", "Mgr", "Hiredate", "Sal", "Comm", "Deptno" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(fieldList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 160));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 10));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel2.setText("Sort Criterion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, 10));

        buttonGroup1.add(SalRB);
        SalRB.setFont(new java.awt.Font("Calibri", 0, 14));
        SalRB.setText("Salary");
        getContentPane().add(SalRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        buttonGroup1.add(DepNoRB);
        DepNoRB.setFont(new java.awt.Font("Calibri", 0, 14));
        DepNoRB.setText("Deptno");
        getContentPane().add(DepNoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        buttonGroup1.add(HiredateRB);
        HiredateRB.setFont(new java.awt.Font("Calibri", 0, 14));
        HiredateRB.setText("Hire Date");
        getContentPane().add(HiredateRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, 10));

        buttonGroup2.add(ascRB);
        ascRB.setFont(new java.awt.Font("Calibri", 0, 14));
        ascRB.setText("In Ascending Order");
        getContentPane().add(ascRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        buttonGroup2.add(descRB);
        descRB.setFont(new java.awt.Font("Calibri", 0, 14));
        descRB.setText("In Descending Order");
        getContentPane().add(descRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel3.setText("Filters");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 110, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 210, 10));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel4.setText("Job :-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 20));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel5.setText("Deptno :-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 60, 20));

        jobCBx.setFont(new java.awt.Font("Calibri", 0, 14));
        jobCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Clerk", "Salesman" }));
        getContentPane().add(jobCBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 140, 20));

        depnoCBx.setFont(new java.awt.Font("Calibri", 0, 14));
        depnoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any", "20", "30", "40" }));
        getContentPane().add(depnoCBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 140, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 530, 10));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 10, 10, 220));

        fetchBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        fetchBtn.setMnemonic('d');
        fetchBtn.setText("Process Data");
        fetchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fetchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 530, 30));

        outTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(outTbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, 530, 150));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 530, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fetchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchBtnActionPerformed
//Assembling the query String
String field1 = null;
Object fld[]=fieldList.getSelectedValues();
int len=fld.length;
String qry="SELECT";
int i;
String field=(String)fld[0];
qry=qry+field;
for(i=1;i<len;++i){
    field1=(String)fld[i];
    qry=qry+" , "+field1;
}
qry=qry+" From EMPL ";
String filter1,filter2;
filter1=(String)jobCBx.getSelectedItem();
filter2=(String)depnoCBx.getSelectedItem();
if(filter1.compareTo("ANY")!=0 && filter2.compareTo("ANY")!=0){
    qry=qry+" where Job = '"+filter1+"'";
    qry=qry+" and Deptno = "+filter2;
}
else if(filter1.compareTo("ANY")!=0)
    qry=qry+" where Job = '"+filter1+"'";
else if(filter2.compareTo("ANY")!=0)
    qry=qry+" where Deptno = "+filter2;
if(SalRB.isSelected())
    qry=qry+" order by Salary";
else if(DepNoRB.isSelected())
    qry=qry+" order by Deptno";
else if(HiredateRB.isSelected())
    qry=qry+" order by Hiredate";
if(ascRB.isSelected())
    qry=qry+" in ascending order";
else if(descRB.isSelected())
    qry=qry+" in descending order";
qry=qry+";";
//final query String ready

//Data Connectivity code begins
DefaultTableModel dm=(DefaultTableModel)outTbl.getModel();
try{Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","xyz");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(qry);
    int empnoStr=0;
    String enameStr="";
    String jobStr="";
    int mgrStr=0;
    Date hiredateStr=null;
    float salStr=0;
    float commStr=0;
    int deptnoStr=0;
    //Remove existing rows from table if any
    while(dm.getRowCount()>0)
        dm.removeRow(0);

    while(rs.next()){
        for(i=0;i<len;++i)
    field1=(String)fld[i];
    if(field1.compareToIgnoreCase("Empno")==0)
        empnoStr=rs.getInt("empno");
    else if(field1.compareToIgnoreCase("Ename")==0)
        enameStr=rs.getString("ename");
    else if(field1.compareToIgnoreCase("Job")==0)
        jobStr=rs.getString("job");
    else if(field1.compareToIgnoreCase("mgr")==0)
        mgrStr=rs.getInt("mgr");
    else if(field1.compareToIgnoreCase("Hiredate")==0)
        hiredateStr=rs.getDate("hiredate");
    else if(field1.compareToIgnoreCase("Sal")==0)
        salStr=rs.getFloat("sal");
    else if(field1.compareToIgnoreCase("Comm")==0)
            commStr=rs.getFloat("Comm");
    else if(field1.compareToIgnoreCase("deptno")==0)
            deptnoStr=rs.getInt("deptno");
    }
    dm.addRow(new Object[]{empnoStr,enameStr,jobStr,mgrStr,hiredateStr,salStr,commStr,deptnoStr});
rs.close();
stmt.close();
con.close();
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, "Error in Connectivity");
}
    }//GEN-LAST:event_fetchBtnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataConnectivity__Table_EMPL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DepNoRB;
    private javax.swing.JRadioButton HiredateRB;
    private javax.swing.JRadioButton SalRB;
    private javax.swing.JRadioButton ascRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox depnoCBx;
    private javax.swing.JRadioButton descRB;
    private javax.swing.JButton fetchBtn;
    private javax.swing.JList fieldList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox jobCBx;
    private javax.swing.JTable outTbl;
    // End of variables declaration//GEN-END:variables

}