/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import gnu.trove.map.hash.THashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from aaQ
 */
public abstract class aaq_0<T extends ZT> {
    protected static final aat_0[] b = new aat_0[0];
    private final int a;
    protected final aat_0[] c;
    protected final aat_0[] d;

    public aaq_0(int n, aat_0[] aat_0Array, aat_0[] aat_0Array2) {
        this.a = n;
        this.c = aat_0Array;
        this.d = aat_0Array2;
    }

    public aaq_0(int n) {
        this(n, b, b);
    }

    public final int e() {
        return this.a;
    }

    public abstract ZU d_();

    public abstract T b();

    public final int f() {
        return this.i().length;
    }

    public final ZZ[] g() {
        return aaq_0.a(this.d);
    }

    public final ZZ[] h() {
        return aaq_0.a(this.c);
    }

    private static ZZ[] a(aat_0[] aat_0Array) {
        if (aat_0Array == b) {
            return ZZ.a;
        }
        int n = aat_0Array.length;
        ZZ[] zZArray = new ZZ[n];
        for (int k = 0; k < n; ++k) {
            zZArray[k] = aat_0Array[k].b();
        }
        return zZArray;
    }

    public final void a(ZZ[] zZArray, ByteBuffer byteBuffer) {
        for (int k = 0; k < this.d.length; ++k) {
            this.d[k].a(zZArray[k], byteBuffer);
        }
    }

    public final void a(gk_0 gk_02, THashMap<String, String> tHashMap) {
        for (int k = 0; k < this.d.length; ++k) {
            this.d[k].a(gk_02, (String)tHashMap.get((Object)this.d[k].a()));
        }
    }

    public final aat_0[] i() {
        return this.c;
    }

    public final int a(String string) {
        aat_0[] aat_0Array = this.i();
        for (int k = 0; k < aat_0Array.length; ++k) {
            if (!aat_0Array[k].a().equals(string)) continue;
            return k;
        }
        return -1;
    }

    public void a(ZZ[] zZArray) {
        for (int k = 0; k < zZArray.length; ++k) {
            zZArray[k].c();
        }
    }
}

