/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public enum Tx implements aqk_2
{
    a(0, 0),
    b(1, 0),
    c(2, 4),
    d(4, 6),
    e(8, 2),
    f(16, 1),
    g(32, 7),
    h(64, 3),
    i(128, 5),
    j(15, 0),
    k(240, 0),
    l(256, 0);

    private final short m;
    private final byte n;

    private Tx(short s2, byte by) {
        this.m = s2;
        this.n = by;
    }

    public static Tx a(short s2) {
        for (Tx tx : Tx.values()) {
            if (tx.a() != s2) continue;
            return tx;
        }
        return null;
    }

    public short a() {
        return this.m;
    }

    public byte b() {
        return this.n;
    }

    @Override
    public String d() {
        return Short.toString(this.m);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }

    public static ArrayList<Tx> b(short s2) {
        ArrayList<Tx> arrayList = new ArrayList<Tx>();
        for (Tx tx : Tx.values()) {
            if (tx == j || tx == k || tx == a || (tx.a() & s2) != tx.a()) continue;
            arrayList.add(tx);
        }
        return arrayList;
    }
}

