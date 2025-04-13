/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from cdR
 */
public class cdr_2
implements ahj {
    final JCheckBox a;
    final cbv_1 b = new cbc_1();
    cdf_2 c;

    public cdr_2() {
        this.a = new JCheckBox("M\u00e9t\u00e9o", false);
        this.a.addActionListener(new cds_2(this));
        this.a.addItemListener(new cdt_2(this));
    }

    @Override
    public void a(YK yK) {
    }

    @Override
    public void b(YK yK) {
        cbt_1.a.a((cbv_1)null);
    }

    @Override
    public JComponent a() {
        return this.a;
    }

    @Override
    public String b() {
        return "Switch M\u00e9t\u00e9o";
    }
}

