/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eEL
 */
public class eel_0 {
    private final eem_0 a;
    private final int b;
    private final int c;
    private final eEH d;

    eel_0(eem_0 eem_02, int n, int n2, eEH eEH2) {
        this.a = eem_02;
        this.b = n;
        this.c = n2;
        this.d = eEH2;
    }

    public static eel_0 a(int n, int n2, int n3, byte by) {
        eEH eEH2 = eEH.a(by);
        if (n == 0) {
            return new eel_0(eem_0.b, n2, n3, eEH2);
        }
        return new eel_0(eem_0.a, n, n3, eEH2);
    }

    public eem_0 a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    int c() {
        return this.c;
    }

    public boolean a(int n, eEH eEH2) {
        if (n < this.c) {
            return false;
        }
        return eEH2.a(this.d);
    }
}

