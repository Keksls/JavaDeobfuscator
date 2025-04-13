/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Dimension;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from fBR
 */
public abstract class fbr_2
extends fbs_1 {
    private static Logger b = Logger.getLogger(fbr_2.class);
    protected final Insets a = new Insets(0, 0, 0, 0);

    public Insets a() {
        return this.a;
    }

    public void a(Insets insets) {
        this.a.top = insets.top;
        this.a.bottom = insets.bottom;
        this.a.left = insets.left;
        this.a.right = insets.right;
    }

    @Override
    public abstract void a(Dimension var1, Insets var2, Insets var3, Insets var4);
}

