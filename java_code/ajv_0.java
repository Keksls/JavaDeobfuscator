/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;

/*
 * Renamed from ajv
 */
public class ajv_0
extends JPanel
implements ajc_0 {
    private final aja_0 a;
    private final ajx_0 b;
    private final aju_0 c;
    private final aju_0 d;
    private final aju_0 e;
    private final aju_0 f;
    private final aju_0 g;
    private Component h;
    private ajb i;

    public ajv_0(aja_0 aja_02, ajb ajb2) {
        super(new GridBagLayout());
        this.i = ajb2;
        this.a = aja_02;
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);
        Insets insets = this.a.F();
        Dimension dimension = new Dimension(-1, Math.max(1, insets.top));
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        this.b = new ajx_0(this);
        this.b.a(this.a);
        ajv_0.a(this.b, dimension);
        this.add((Component)this.b, gridBagConstraints);
        gridBagConstraints.gridwidth = 1;
        this.c = new aju_0();
        this.d = new aju_0();
        this.e = new aju_0();
        this.f = new aju_0();
        this.g = new aju_0();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridx = 0;
        ajv_0.a(this.c, new Dimension(insets.left, -1));
        this.add((Component)this.c, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        ajv_0.a(this.e, new Dimension(insets.right, -1));
        this.add((Component)this.e, gridBagConstraints);
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridx = 0;
        ajv_0.a(this.d, new Dimension(insets.left, insets.bottom));
        this.add((Component)this.d, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        ajv_0.a(this.f, new Dimension(-1, insets.bottom));
        this.add((Component)this.f, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        ajv_0.a(this.g, new Dimension(insets.right, insets.bottom));
        this.add((Component)this.g, gridBagConstraints);
        this.f.a(aja_02.s());
        this.d.a(aja_02.q());
        this.g.a(aja_02.u());
        this.c.a(aja_02.o());
        this.e.a(aja_02.w());
        this.b.b().setVisible(false);
        this.b.a().setVisible(false);
        this.setOpaque(true);
    }

    public void a(Component component) {
        this.h = component;
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.weightx = 1.0;
        this.add(this.h, gridBagConstraints);
    }

    private static void a(Component component, Dimension dimension) {
        component.setMinimumSize(dimension);
        component.setSize(dimension);
        component.setPreferredSize(dimension);
        component.setMaximumSize(dimension);
    }

    public void a(boolean bl) {
        for (Component component : this.getComponents()) {
            if (component == this.h) continue;
            component.setVisible(bl);
        }
    }

    @Override
    public void o_() {
        if (this.i != null) {
            this.i.a();
        }
    }

    public void a(ajb ajb2) {
        this.i = ajb2;
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
    }
}

