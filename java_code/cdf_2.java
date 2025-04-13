/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.intellij.uiDesigner.core.GridConstraints
 *  com.intellij.uiDesigner.core.GridLayoutManager
 *  com.intellij.uiDesigner.core.Spacer
 */
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import java.awt.Component;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.KeyStroke;

/*
 * Renamed from cdF
 */
public class cdf_2
extends JDialog {
    private JPanel o;
    public JSlider a;
    public JLabel b;
    public JSlider c;
    public JLabel d;
    public JCheckBox e;
    public JSlider f;
    public JLabel g;
    public JCheckBox h;
    public JSlider i;
    public JSlider j;
    public JSlider k;
    public JLabel l;
    public JLabel m;
    public JLabel n;
    cbv_1 p;
    private boolean q;

    private void c() {
        this.o = new JPanel();
        this.o.setLayout((LayoutManager)new GridLayoutManager(4, 1, new Insets(10, 10, 10, 10), -1, -1));
        JPanel jPanel = new JPanel();
        jPanel.setLayout((LayoutManager)new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        this.o.add((Component)jPanel, new GridConstraints(1, 0, 1, 1, 0, 3, 3, 3, null, null, null, 0, false));
        Spacer spacer = new Spacer();
        jPanel.add((Component)spacer, new GridConstraints(3, 0, 1, 1, 0, 2, 1, 4, null, null, null, 0, false));
        JLabel jLabel = new JLabel();
        jLabel.setText("Vent");
        jPanel.add((Component)jLabel, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.a = new JSlider();
        jPanel.add((Component)this.a, new GridConstraints(0, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.b = new JLabel();
        this.b.setText("0");
        jPanel.add((Component)this.b, new GridConstraints(0, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Pluie");
        jPanel.add((Component)jLabel2, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.c = new JSlider();
        jPanel.add((Component)this.c, new GridConstraints(1, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.d = new JLabel();
        this.d.setText("0");
        jPanel.add((Component)this.d, new GridConstraints(1, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.f = new JSlider();
        jPanel.add((Component)this.f, new GridConstraints(2, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.g = new JLabel();
        this.g.setText("0");
        jPanel.add((Component)this.g, new GridConstraints(2, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Neige");
        jPanel.add((Component)jLabel3, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.e = new JCheckBox();
        this.e.setText("D\u00e9sactiver la m\u00e9t\u00e9o");
        this.o.add((Component)this.e, new GridConstraints(0, 0, 1, 1, 8, 0, 3, 0, null, null, null, 0, false));
        this.h = new JCheckBox();
        this.h.setText("Param\u00e9trer les nuages");
        this.o.add((Component)this.h, new GridConstraints(2, 0, 1, 1, 8, 0, 3, 0, null, null, null, 0, false));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout((LayoutManager)new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        this.o.add((Component)jPanel2, new GridConstraints(3, 0, 1, 1, 0, 3, 3, 3, null, null, null, 0, false));
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Bias");
        jPanel2.add((Component)jLabel4, new GridConstraints(0, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        Spacer spacer2 = new Spacer();
        jPanel2.add((Component)spacer2, new GridConstraints(3, 0, 1, 1, 0, 2, 1, 4, null, null, null, 0, false));
        this.i = new JSlider();
        jPanel2.add((Component)this.i, new GridConstraints(0, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.l = new JLabel();
        this.l.setText("0");
        jPanel2.add((Component)this.l, new GridConstraints(0, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Scale");
        jPanel2.add((Component)jLabel5, new GridConstraints(1, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        JLabel jLabel6 = new JLabel();
        jLabel6.setText("Sharp");
        jPanel2.add((Component)jLabel6, new GridConstraints(2, 0, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.j = new JSlider();
        jPanel2.add((Component)this.j, new GridConstraints(1, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.k = new JSlider();
        jPanel2.add((Component)this.k, new GridConstraints(2, 1, 1, 1, 8, 1, 4, 0, null, null, null, 0, false));
        this.m = new JLabel();
        this.m.setText("0");
        jPanel2.add((Component)this.m, new GridConstraints(1, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
        this.n = new JLabel();
        this.n.setText("0");
        jPanel2.add((Component)this.n, new GridConstraints(2, 2, 1, 1, 8, 0, 0, 0, null, null, null, 0, false));
    }

    public JComponent a() {
        return this.o;
    }

    public cdf_2(cbv_1 cbv_12) {
        this.c();
        this.q = true;
        this.p = cbv_12;
        this.setContentPane(this.o);
        this.setDefaultCloseOperation(0);
        this.addWindowListener(new cdg_2(this));
        this.o.registerKeyboardAction(new cdi_2(this), KeyStroke.getKeyStroke(27, 0), 1);
        this.a.addChangeListener(new cdj_2(this));
        this.c.addChangeListener(new cdk_2(this));
        this.f.addChangeListener(new cdl_2(this));
        this.e.addItemListener(new cdm_2(this));
        this.h.addItemListener(new cdn_2(this));
        this.i.addChangeListener(new cdo_2(this));
        this.j.addChangeListener(new cdp_2(this));
        this.k.addChangeListener(new cdh_2(this));
    }

    void a(JLabel jLabel, float f2) {
        jLabel.setText(Float.toString(f2));
        jLabel.updateUI();
    }

    static float a(JSlider jSlider) {
        return (float)jSlider.getValue() / 100.0f;
    }

    void d() {
        if (this.q) {
            this.dispose();
        } else {
            this.setVisible(false);
        }
    }

    public void b() {
        this.d();
    }

    public void a(boolean bl) {
        this.q = bl;
    }

    public static cdf_2 a(cbv_1 cbv_12, boolean bl) {
        cdf_2 cdf_22 = new cdf_2(cbv_12);
        cdf_22.setTitle("Param\u00e8tre m\u00e9t\u00e9o");
        cdf_22.a(bl);
        cdf_22.setModal(bl);
        cdf_22.pack();
        cdf_22.setAlwaysOnTop(true);
        cdf_22.setVisible(true);
        return cdf_22;
    }

    public static void a(String[] stringArray) {
        cdf_2.a(new cbc_1(), true);
        System.exit(0);
    }
}

