/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import org.apache.log4j.Logger;

public class ahi
extends JPanel {
    private static final Logger a = Logger.getLogger(ahi.class);
    private final String b = "debugBar.properties";
    private static final int c = 38;
    private static final Border d = new EmptyBorder(0, 0, 0, 0);
    private final YK e;
    private final Vector<ahj> f = new Vector();
    private final JPanel g;
    private final Vector<Class<? extends ahj>> h = new Vector();

    public ahi(YK yK) {
        super(new BorderLayout(0, 0), true);
        this.e = yK;
        this.setIgnoreRepaint(true);
        Dimension dimension = new Dimension(-1, 38);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.setPreferredSize(dimension);
        this.g = new JPanel(new FlowLayout(0, 0, 0));
        this.g.setMaximumSize(dimension);
        this.g.setMinimumSize(dimension);
        this.g.setPreferredSize(dimension);
        this.add((Component)this.g, "Center");
    }

    public void a(Class<? extends ahj> clazz) {
        ahj ahj2;
        for (ahj object2 : this.f) {
            if (!object2.getClass().getCanonicalName().equals(clazz.getCanonicalName())) continue;
            a.debug((Object)(clazz.toString() + " component already present"));
            return;
        }
        try {
            ahj2 = clazz.newInstance();
        }
        catch (Exception exception) {
            a.info((Object)("Unable to instanciate a " + clazz + " DebugComponent"));
            return;
        }
        this.f.add(ahj2);
        ahj2.a(this.e);
        if (this.g.getComponentCount() > 0) {
            this.g.add(new ahk(8, 38));
        }
        JComponent jComponent = ahj2.a();
        jComponent.setBorder(d);
        this.g.add(jComponent);
        this.g.validate();
    }

    public void b(Class<? extends ahj> clazz) {
        this.h.add(clazz);
    }

    private void c(Class<? extends ahj> clazz) {
        for (ahj ahj2 : this.f) {
            if (ahj2.getClass() != clazz) continue;
            this.a(ahj2);
            break;
        }
    }

    private boolean a(ahj ahj2) {
        int n = this.g.getComponentZOrder(ahj2.a());
        if (n == -1) {
            return false;
        }
        this.f.remove(ahj2);
        this.g.remove(ahj2.a());
        if (this.g.getComponentCount() > 0) {
            if (n > 0) {
                this.g.remove(n - 1);
            } else {
                this.g.remove(n);
            }
        }
        ahj2.b(this.e);
        this.g.validate();
        return true;
    }

    @Override
    public void removeAll() {
        this.b();
    }

    private void b() {
        while (this.f.size() > 0) {
            ahj ahj2 = this.f.get(0);
            if (this.a(ahj2)) continue;
            a.error((Object)("Error while deleting DebugComponent " + ahj2));
            this.f.remove(0);
        }
        if (this.g.getComponentCount() != 0) {
            a.error((Object)"Encore des composants de pr\u00e9sent alors qu'on vient de tous les supprimer");
        }
        if (this.f.size() != 0) {
            a.error((Object)"Encore des debugcomposants de pr\u00e9sent alors qu'on vient de tous les supprimer");
        }
    }

    public void a() {
        this.b();
    }
}

