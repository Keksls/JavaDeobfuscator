/*
 * Decompiled with CFR 0.152.
 */
public class abr
extends aar_0<aaA> {
    public static final int a = 10;

    private static aat_0[] d() {
        aat_0[] aat_0Array = new aat_0[11];
        aat_0Array[0] = new aav_0("Time");
        for (int k = 0; k < 10; ++k) {
            aat_0Array[k + 1] = new aav_0("i" + k);
        }
        return aat_0Array;
    }

    public abr(int n) {
        super(n, abr.d());
    }

    public final aaA c() {
        return new aaA(this);
    }

    public final int b(String string) {
        return Integer.parseInt(string);
    }

    @Override
    public /* synthetic */ ZT b() {
        return this.c();
    }
}

