/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFY
 */
public enum bfy_0 implements pi_0
{
    a(0, new bft_0()),
    b(1, null),
    c(2, new bcv_2()),
    d(3, new bbk_1()),
    e(4, new bfd_0());

    private final short f;
    private final abn_1<ph_0> g;

    private bfy_0(short s2, abn_1<ph_0> abn_12) {
        this.f = s2;
        this.g = abn_12;
    }

    @Override
    public short a() {
        return this.f;
    }

    @Override
    public abn_1<ph_0> b() {
        return this.g;
    }

    @Override
    public String d() {
        return Short.toString(this.f);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }
}

