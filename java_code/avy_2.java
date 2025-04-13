/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from avy
 */
public final class avy_2 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    private GL2 f;
    private int g;

    public void a(GL2 gL2) {
        this.f = gL2;
    }

    public void a(int n) {
        if (n == this.g) {
            return;
        }
        if (n == 0) {
            if ((this.g & 1) != 0) {
                this.f.glDisableClientState(32884);
            }
            if ((this.g & 2) != 0) {
                this.f.glDisableClientState(32885);
            }
            if ((this.g & 4) != 0) {
                this.f.glDisableClientState(32886);
            }
            if ((this.g & 8) != 0) {
                this.f.glDisableClientState(32888);
            }
            this.g = n;
            return;
        }
        this.g = n;
        if ((this.g & 1) != 0) {
            this.f.glEnableClientState(32884);
        }
        if ((this.g & 2) != 0) {
            this.f.glEnableClientState(32885);
        }
        if ((this.g & 4) != 0) {
            this.f.glEnableClientState(32886);
        }
        if ((this.g & 8) != 0) {
            this.f.glEnableClientState(32888);
        }
    }
}

