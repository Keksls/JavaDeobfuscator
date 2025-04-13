/*
 * Decompiled with CFR 0.152.
 */
class eDc
implements eDb {
    final int a;

    eDc(int n) {
        this.a = n;
    }

    @Override
    public boolean a(eCD eCD2) {
        return eCD2.a() >= this.a;
    }
}

