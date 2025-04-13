/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * Renamed from cdy
 */
public class cdy_2
implements aen,
ahj {
    private final JPanel a = new JPanel(new FlowLayout());
    private final JCheckBox b = new JCheckBox("Heure:", false);
    private final JSlider c = new JSlider(0, 100);

    public cdy_2() {
        this.c.setPaintTicks(true);
        this.c.setMajorTickSpacing(25);
        this.a.add((Component)this.b, 0);
        this.a.add((Component)this.c, 1);
        this.b.addActionListener(new cdz_2(this));
    }

    @Override
    public void a(YK yK) {
        ael_0.a.a(this);
    }

    @Override
    public void b(YK yK) {
        ael_0.a.a((aen)null);
    }

    @Override
    public JComponent a() {
        return this.a;
    }

    @Override
    public String b() {
        return "Switch Heure du jour";
    }

    @Override
    public float a(wq_0 wq_02) {
        if (!this.b.isSelected()) {
            float f2 = wq_02.b();
            this.c.setValue((int)f2);
            return f2;
        }
        return this.c.getValue();
    }
}

