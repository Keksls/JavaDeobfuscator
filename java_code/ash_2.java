/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.hash.TLongHash
 */
import gnu.trove.impl.hash.TLongHash;

/*
 * Renamed from asH
 */
public abstract class ash_2<Hash extends TLongHash> {
    public final String a;
    protected final Hash b;

    protected ash_2(asc_2 asc_22) {
        this.a = asc_22.i().intern();
        int n = asc_22.f();
        this.b = this.a(n);
        for (int k = 0; k < n; ++k) {
            long l = asc_22.h();
            this.a(l, asc_22);
        }
    }

    public static ash_2 a(asc_2 asc_22) {
        boolean bl;
        boolean bl2 = bl = asc_22.b() != 0;
        if (bl) {
            return new asj_2(asc_22);
        }
        return new asi_2(asc_22);
    }

    protected abstract Hash a(int var1);

    protected abstract void a(long var1, asc_2 var3);

    public abstract int a(long var1);

    public abstract int a(long var1, int var3);
}

