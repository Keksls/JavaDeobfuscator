/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from aAg
 */
class aag_2 {
    private JTable a;
    private JPanel b;
    private JLabel c;

    aag_2() {
        this.d();
    }

    private void d() {
        this.b = new JPanel();
        this.b.setLayout(new BorderLayout(0, 0));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout(0, 0));
        this.b.add((Component)jPanel, "North");
        JLabel jLabel = new JLabel();
        jLabel.setText("FPS");
        jPanel.add((Component)jLabel, "West");
        this.c = new JLabel();
        this.c.setText("");
        jPanel.add((Component)this.c, "Center");
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BorderLayout(0, 0));
        jPanel2.setMinimumSize(new Dimension(0, 20));
        jPanel.add((Component)jPanel2, "North");
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("  ");
        jPanel2.add((Component)jLabel2, "Center");
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new BorderLayout(0, 0));
        jPanel.add((Component)jPanel3, "South");
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("  ");
        jPanel3.add((Component)jLabel3, "Center");
        JScrollPane jScrollPane = new JScrollPane();
        this.b.add((Component)jScrollPane, "Center");
        this.a = new JTable();
        jScrollPane.setViewportView(this.a);
    }

    public JComponent a() {
        return this.b;
    }

    public JPanel b() {
        return this.b;
    }

    public void c() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        this.a.setModel(defaultTableModel);
    }

    private void a(THashMap<String, aae_2> tHashMap, int n) {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("function");
        defaultTableModel.addColumn("~calls / frame / s");
        defaultTableModel.addColumn("cumulated calls");
        float f2 = 1.0f / (float)n;
        if (!tHashMap.isEmpty()) {
            tHashMap.forEachValue((TObjectProcedure)new aah_2(this, defaultTableModel, f2));
        }
        this.a.setModel(defaultTableModel);
    }

    public void a(THashMap<String, aae_2> tHashMap, int n, float f2) {
        DefaultTableModel defaultTableModel = (DefaultTableModel)this.a.getModel();
        int n2 = defaultTableModel.getRowCount();
        if (n2 != tHashMap.size()) {
            this.a(tHashMap, n);
        } else {
            float f3 = 1.0f / (float)n;
            for (int k = 0; k < n2; ++k) {
                String string = (String)defaultTableModel.getValueAt(k, 0);
                aae_2 aae_22 = (aae_2)tHashMap.get((Object)string);
                defaultTableModel.setValueAt((int)((float)aae_22.b() * f3), k, 1);
                defaultTableModel.setValueAt(aae_22.c(), k, 2);
            }
        }
        this.c.setText("" + f2);
    }
}

