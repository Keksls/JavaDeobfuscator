/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from bRi
 */
public class bri_2 {
    private final int a;
    private final int[] b;
    private static int c;
    private final int d;

    public bri_2(int n, int ... nArray) {
        this.a = n;
        this.b = nArray;
        this.d = c++;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public boolean a(TIntProcedure tIntProcedure) {
        for (int n : this.b) {
            tIntProcedure.execute(n);
        }
        return true;
    }

    public String c() {
        return bae.h().a(139, (long)this.a, new Object[0]);
    }
}

