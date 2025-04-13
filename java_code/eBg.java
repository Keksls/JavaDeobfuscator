/*
 * Decompiled with CFR 0.152.
 */
public class eBg
extends eBf {
    public eBg(euw_1 euw_12) {
        super(euw_12);
    }

    @Override
    public boolean a(eyu_1 eyu_12, long l) {
        int n = this.b.g();
        return n != 0 && eyu_12.a() < (long)n;
    }

    @Override
    public boolean b(eyu_1 eyu_12, long l) {
        throw new UnsupportedOperationException("Impossible de retirer d'argent sur ce type d'inventaire");
    }

    public boolean a(eBh eBh2, int n, int n2) {
        int n3 = this.b.a(n);
        int n4 = eBh2.a(n);
        return n3 != 0 && n2 <= n3 - n4;
    }

    public int b(eBh eBh2, int n, int n2) {
        throw new UnsupportedOperationException("Impossible de retirer d'objet sur ce type d'inventaire");
    }
}

