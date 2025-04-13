/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ajw
 */
public abstract class ajw_0
extends ajh_0
implements aeh_1,
ajc_0,
WindowListener,
WindowStateListener {
    private aja_0 i;
    private aja_0 j;
    protected JFrame f;
    protected JComponent g;
    protected JPanel h;
    private aju_0 k;
    private aju_0 l;
    private aju_0 m;
    private aju_0 n;
    private aju_0 o;
    private ajx_0 p;
    private ajf q;
    private boolean r = false;

    protected ajw_0() {
    }

    public void a(aja_0 aja_02, aja_0 aja_03) {
        this.i = aja_02;
        this.j = aja_03;
    }

    @Override
    protected JFrame a() {
        JFrame.setDefaultLookAndFeelDecorated(false);
        this.f = new JFrame();
        this.f.setUndecorated(true);
        this.f.setFocusable(false);
        Container container = this.f.getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);
        Insets insets = this.i.F();
        Dimension dimension = new Dimension(-1, Math.max(1, insets.top));
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        this.p = new ajx_0(this);
        this.p.a(this.i);
        ajw_0.a(this.p, dimension);
        container.add((Component)this.p, gridBagConstraints);
        gridBagConstraints.gridwidth = 1;
        this.o = new aju_0();
        this.n = new aju_0();
        this.m = new aju_0();
        this.k = new aju_0();
        this.l = new aju_0();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridx = 0;
        ajw_0.a(this.o, new Dimension(insets.left, -1));
        container.add((Component)this.o, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        ajw_0.a(this.m, new Dimension(insets.right, -1));
        container.add((Component)this.m, gridBagConstraints);
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridx = 0;
        ajw_0.a(this.n, new Dimension(insets.left, insets.bottom));
        container.add((Component)this.n, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        ajw_0.a(this.k, new Dimension(-1, insets.bottom));
        container.add((Component)this.k, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        ajw_0.a(this.l, new Dimension(insets.right, insets.bottom));
        container.add((Component)this.l, gridBagConstraints);
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.weightx = 1.0;
        this.g = new JPanel(new BorderLayout(), true);
        container.add((Component)this.g, gridBagConstraints);
        this.h = new JPanel(new aje_0(), true);
        ajf_0 ajf_02 = new ajf_0(1.0f, 1.0f, 1);
        ajf_02.a(true);
        this.h.add((Component)((Object)this.f()), ajf_02);
        this.g.add((Component)this.h, "Center");
        ajd ajd2 = new ajd(this.f, this.p);
        this.q = new ajf(this.f, this.k, this.l, this.m);
        this.q.a(this.t());
        this.q.a(this.p, this.l, this.k, this.m, this.o, this.n);
        this.f.addWindowStateListener(this);
        this.f.addWindowListener(this);
        this.i().a(this, false);
        this.c(true);
        this.r = true;
        return this.f;
    }

    private void a(aja_0 aja_02) {
        this.k.a(aja_02.s());
        this.n.a(aja_02.q());
        this.l.a(aja_02.u());
        this.o.a(aja_02.o());
        this.m.a(aja_02.w());
        this.p.a(aja_02);
        this.f.repaint();
    }

    private static void a(Component component, Dimension dimension) {
        component.setMinimumSize(dimension);
        component.setSize(dimension);
        component.setPreferredSize(dimension);
        component.setMaximumSize(dimension);
    }

    private void c(boolean bl) {
        if (this.q == null) {
            return;
        }
        this.q.a(bl);
        if (bl) {
            this.k.setCursor(Cursor.getPredefinedCursor(9));
            this.m.setCursor(Cursor.getPredefinedCursor(11));
            this.l.setCursor(Cursor.getPredefinedCursor(5));
        } else {
            this.k.setCursor(Cursor.getPredefinedCursor(0));
            this.m.setCursor(Cursor.getPredefinedCursor(0));
            this.l.setCursor(Cursor.getPredefinedCursor(0));
        }
    }

    private void d(boolean bl) {
        for (Component component : this.f.getContentPane().getComponents()) {
            if (component == this.g) continue;
            component.setVisible(bl);
        }
    }

    @Override
    protected boolean a(int n, int n2, int n3, int n4, @Nullable String string) {
        boolean bl = super.a(n, n2, n3, n4, string);
        if (bl) {
            this.d(false);
        }
        return bl;
    }

    @Override
    protected void a(@Nullable String string) {
        this.d(false);
        super.a(string);
    }

    @Override
    protected void a(int n, int n2, @Nullable String string, int n3, int n4) {
        this.d(true);
        super.a(n, n2, string, n3, n4);
    }

    @Override
    public boolean a(FocusEvent focusEvent) {
        return false;
    }

    @Override
    public boolean b(FocusEvent focusEvent) {
        Component component;
        if (ahu_2.b() && !focusEvent.isTemporary() && (component = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner()) != this.f()) {
            this.f().requestFocus();
        }
        return false;
    }

    @Override
    public void o_() {
        this.e();
    }

    @Override
    public void b() {
        this.f.setExtendedState(this.f.getExtendedState() == 6 ? 0 : 6);
    }

    @Override
    public void c() {
        int n = this.f.getExtendedState() & 6;
        this.f.setExtendedState(1 | n);
    }

    @Override
    public void a(ahi ahi2) {
        Rectangle rectangle = new Rectangle(this.f.getBounds());
        this.g.add((Component)ahi2, "South");
        ahi2.setVisible(true);
        this.f.pack();
        this.f.setBounds(rectangle);
    }

    @Override
    public void p_() {
        Rectangle rectangle = new Rectangle(this.f.getBounds());
        for (Component component : this.g.getComponents()) {
            if (!(component instanceof ahi)) continue;
            this.g.remove(component);
        }
        this.f.pack();
        this.f.setBounds(rectangle);
    }

    @Override
    public void windowStateChanged(WindowEvent windowEvent) {
        int n = windowEvent.getNewState();
        boolean bl = (n & 6) != 0;
        this.p.a(bl);
        this.c(!bl);
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        if (this.i != null) {
            this.a(this.i);
        }
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        if (this.j != null) {
            this.a(this.j);
        }
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
    }

    public JPanel w() {
        return this.h;
    }

    public boolean x() {
        return this.r;
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (!EventQueue.isDispatchThread()) {
            return;
        }
        this.h.validate();
    }
}

