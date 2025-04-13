/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cmQ
 */
public final class cmq_0
extends Pw {
    private long a;
    private aff_1 b;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b.d());
        abx_22.a(this.b.e());
        abx_22.a(this.b.f());
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(aff_1 aff_12) {
        this.b = aff_12;
    }

    @Override
    public int a() {
        return 13467;
    }

    @Override
    public String toString() {
        return "FightCompanionPlacementRequestMessage{m_characterId=" + this.a + ", m_position=" + this.b + "}";
    }
}

