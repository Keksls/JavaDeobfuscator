/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLQ
 */
public class blq_0
extends ahy
implements afk_0<afe_0> {
    private static final blq_0 b = new blq_0();

    private blq_0() {
        this.d();
    }

    public static blq_0 c() {
        return b;
    }

    private void d() {
        this.a(fsm_0.a);
    }

    @Override
    protected ahB a(int n, ahD ahD2, Object object, int n2, int n3, int n4, int n5, boolean bl) {
        ahB ahB2 = new ahB(ahD2, object, n2, n3, n4, n5, bl);
        ahB2.a(azs_0.a().a("compassTypePath", "defaultIconPath", n));
        return ahB2;
    }

    @Override
    public void a(int n, long l, int n2, int n3, int n4, Object object, ahC ahC2, boolean bl) {
        fsm_0.a.setTarget(azu_0.j().k().bv());
        super.a(n, l, n2, n3, n4, object, ahC2, bl);
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 != null) {
            this.a(0, blx_12.a_(), blx_12.bv());
        }
    }

    public void a(afe_0 afe_02) {
        if (afe_02 != null) {
            this.a(0, afe_02.a(), afe_02);
        }
    }

    public void b(afe_0 afe_02) {
        if (afe_02 != null) {
            this.a(0, afe_02.a(), null);
        }
    }

    public void a(afe_0 afe_02, int n, int n2, short s2) {
        this.a(0, afe_02.a(), n, n2, s2);
    }

    @Override
    public /* synthetic */ void cellPositionChanged(ahh_0 ahh_02, int n, int n2, short s2) {
        this.a((afe_0)ahh_02, n, n2, s2);
    }
}

