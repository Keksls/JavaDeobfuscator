/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from ahd
 */
public class ahd_0
implements ahj,
azx_2 {
    private final JCheckBox a = new JCheckBox("Lights", false);

    public ahd_0() {
        this.a.addItemListener(new ahe(this));
    }

    @Override
    public void a(YK yK) {
        this.a.setSelected(aed.a.b());
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
        return "Switch Lights";
    }

    @Override
    public void a(boolean bl) {
        this.a.setSelected(bl);
    }
}

