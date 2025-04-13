/*
 * Decompiled with CFR 0.152.
 */
class eDd
implements eDb {
    final int a;
    boolean b;
    final int c;

    eDd(int n) {
        this(n, 1);
    }

    eDd(int n, int n2) {
        this.c = n;
        this.a = n2;
    }

    @Override
    public boolean a(eCD eCD2) {
        eDe eDe2 = new eDe(this, eCD2);
        eCO.a.b(eDe2);
        return this.b;
    }
}

