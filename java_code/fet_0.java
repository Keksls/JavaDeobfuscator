/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteIntProcedure
 */
import gnu.trove.procedure.TByteIntProcedure;

/*
 * Renamed from feT
 */
public class fet_0
implements TByteIntProcedure {
    private int a = 0;
    private int b = 0;

    public boolean execute(byte by, int n) {
        this.a += by * n;
        this.b += n;
        return true;
    }

    public void a() {
        this.a = 0;
        this.b = 0;
    }

    public float b() {
        return this.b == 0 ? 0.0f : (float)this.a / (float)this.b;
    }

    public int c() {
        return this.b;
    }
}

