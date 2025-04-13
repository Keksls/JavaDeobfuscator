/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from cdV
 */
public class cdv_2
implements ahj,
ftc {
    final JCheckBox a = new JCheckBox("Xulor", true);

    public cdv_2() {
        this.a.addItemListener(new cdw_2(this));
    }

    @Override
    public void a(YK yK) {
        fta_0.getInstance().a(this);
        this.a.setSelected(fta_0.getInstance().isVisible());
    }

    @Override
    public void b(YK yK) {
        fta_0.getInstance().b(this);
    }

    @Override
    public JComponent a() {
        return this.a;
    }

    @Override
    public String b() {
        return "Display Xulor Scene";
    }

    @Override
    public void a(fta_0 fta_02) {
        if (!this.a.isSelected()) {
            this.a.setSelected(true);
        }
    }

    @Override
    public void b(fta_0 fta_02) {
        if (this.a.isSelected()) {
            this.a.setSelected(false);
        }
    }
}

