/*
 * Decompiled with CFR 0.152.
 */
public class eEI {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;

    public eEI(int n, int n2, int n3, int n4, boolean bl) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = bl;
    }

    public eEH a(eEK eEK2) {
        int n = eEK2.p() + eEK2.q();
        if (n >= this.a && (this.e || (float)eEK2.q() >= (float)n * 0.36f)) {
            return eEH.a;
        }
        if (n >= this.b && (this.e || (float)eEK2.q() >= (float)n * 0.24f)) {
            return eEH.b;
        }
        if (n >= this.c && (this.e || (float)eEK2.q() >= (float)n * 0.12f)) {
            return eEH.c;
        }
        if (n >= this.d) {
            return eEH.d;
        }
        return eEH.e;
    }
}

