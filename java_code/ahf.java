/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class ahf
implements ahj,
azx_2 {
    private final JCheckBox b = new JCheckBox("VSync", false);
    YK a;

    public ahf() {
        this.b.addItemListener(new ahg(this));
    }

    @Override
    public void a(YK yK) {
        this.a = yK;
        yK.e().a(this);
        this.b.setSelected(yK.e().b());
    }

    @Override
    public void b(YK yK) {
        this.a = null;
        yK.e().b(this);
    }

    @Override
    public JComponent a() {
        return this.b;
    }

    @Override
    public String b() {
        return "Switch VSync";
    }

    @Override
    public void a(boolean bl) {
        this.b.setSelected(bl);
    }
}

