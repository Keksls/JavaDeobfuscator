/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * Renamed from cdA
 */
public class cda_2
implements ahj {
    private final JPanel a = new JPanel();
    private final JCheckBox b;
    private final JCheckBox c;

    public cda_2() {
        this.a.setLayout(new BoxLayout(this.a, 1));
        this.c = new JCheckBox("Scene partic.", true);
        this.c.addItemListener(new cdb_2(this));
        this.c.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.b = new JCheckBox("Xulor partic.", true);
        this.b.addItemListener(new cdc_2(this));
        this.b.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.a.add(this.c);
        this.a.add(this.b);
    }

    @Override
    public void a(YK yK) {
        this.c.setSelected(aik_0.a().b());
        this.b.setSelected(fdq_2.a.a());
    }

    @Override
    public void b(YK yK) {
    }

    @Override
    public JComponent a() {
        return this.a;
    }

    @Override
    public String b() {
        return "Switch Particles";
    }
}

