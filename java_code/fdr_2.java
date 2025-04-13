/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from fDR
 */
public class fdr_2
extends axt_2 {
    private boolean a;
    private final boolean c;

    public fdr_2() {
        this.c = true;
    }

    @Override
    public void a(GL2 gL2) {
        if (!this.a) {
            axr_2.a().e(!this.c);
        }
    }

    public final void a(boolean bl) {
        this.a = bl;
    }
}

