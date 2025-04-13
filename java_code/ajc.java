/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.net.URL;
import javax.swing.JFrame;
import org.jetbrains.annotations.Nullable;

public class ajc
extends ajh_0 {
    private JFrame f;
    private final URL g;

    public ajc() {
        this(null);
    }

    public ajc(URL uRL) {
        this.g = uRL;
    }

    @Override
    protected JFrame a() {
        this.f = new JFrame();
        this.f.getContentPane().setLayout(new BorderLayout(0, 0));
        this.f.getContentPane().add((Component)((Object)this.f()), "Center");
        return this.f;
    }

    @Override
    protected URL q_() {
        return this.g;
    }

    @Override
    protected void a(int n, int n2, @Nullable String string, int n3, int n4) {
        if (!this.f.isDisplayable()) {
            this.f.setUndecorated(false);
        }
        super.a(n, n2, string, n3, n4);
        this.f.setResizable(true);
    }

    @Override
    protected void a(@Nullable String string) {
        if (!this.f.isDisplayable()) {
            this.f.setUndecorated(true);
        }
        super.a(string);
        this.f.setResizable(false);
    }

    @Override
    protected boolean a(int n, int n2, int n3, int n4, @Nullable String string) {
        boolean bl;
        if (!this.f.isDisplayable()) {
            this.f.setUndecorated(true);
        }
        if (bl = super.a(n, n2, n3, n4, string)) {
            this.f.setResizable(false);
        }
        return bl;
    }

    @Override
    public void a(ahi ahi2) {
        this.f.getContentPane().add((Component)ahi2, "South");
        this.f.invalidate();
        this.f.pack();
    }

    @Override
    public void p_() {
        BorderLayout borderLayout = (BorderLayout)this.f.getContentPane().getLayout();
        Component component = borderLayout.getLayoutComponent("South");
        if (component != null) {
            this.f.getContentPane().remove(component);
        }
    }
}

