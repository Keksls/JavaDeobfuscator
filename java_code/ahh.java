/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ahh
implements ahj {
    private final JCheckBox a;
    private final JCheckBox b;
    private final JPanel c = new JPanel();
    private acb_0 d;

    public ahh() {
        this.c.setLayout(new BoxLayout(this.c, 1));
        this.a = new JCheckBox("Cellule walkable", false);
        this.a.addItemListener(itemEvent -> {
            if (this.d != null) {
                this.d.e(itemEvent.getStateChange() == 1);
            }
        });
        this.a.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.b = new JCheckBox("Voir partitions", false);
        this.b.addItemListener(itemEvent -> {
            if (this.d != null) {
                this.d.f(itemEvent.getStateChange() == 1);
            }
        });
        this.b.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.c.add(this.a);
        this.c.add(this.b);
    }

    @Override
    public void a(YK yK) {
        this.d = yK.c();
        this.a.setSelected(this.d.q());
        this.b.setSelected(this.d.r());
    }

    @Override
    public void b(YK yK) {
    }

    @Override
    public JComponent a() {
        return this.c;
    }

    @Override
    public String b() {
        return "Afficher Walkabilit\u00e9";
    }
}

