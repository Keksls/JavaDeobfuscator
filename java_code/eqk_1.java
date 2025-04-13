/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eqK
 */
public final class eqk_1
extends Xa {
    long c = -1L;
    public final WY<eqk_1> b = new eql_1(this, this, 8);

    public eqk_1(long l) {
        super(l);
    }

    public long e() {
        return this.c;
    }

    @Override
    public void b() {
        super.b();
        this.c = -1L;
    }

    public void b(long l) {
        this.c = l;
    }

    @Override
    public fo_1[] b_() {
        return new fo_1[]{this.b};
    }

    @Override
    public String toString() {
        return "WakfuPartyGlobalData{m_leaderId=" + this.c + ", LEADER=" + this.b + "}";
    }
}

