/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Renamed from cdv
 */
public class cdv_1
implements ahj {
    private final JCheckBox a = new JCheckBox("Shader", false);

    public cdv_1() {
        this.a.addActionListener(new cdw_1(this));
        this.a.addItemListener(new cdx_2(this));
    }

    @Override
    public void a(YK yK) {
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
        return "Switch M\u00e9t\u00e9o";
    }
}

