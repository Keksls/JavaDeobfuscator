/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public final class ago {
    public static final ago a = new ago();
    private boolean b;
    JFrame c;
    agr d;
    RenderTreeStencil e;

    private ago() {
    }

    public void a() {
        if (this.b) {
            return;
        }
        SwingUtilities.invokeLater(new agp(this));
        this.b = true;
    }

    public void a(RenderTreeStencil renderTreeStencil) {
        this.e = renderTreeStencil;
    }
}

