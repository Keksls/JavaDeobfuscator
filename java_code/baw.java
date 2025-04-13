/*
 * Decompiled with CFR 0.152.
 */
public class baw
extends bam_0 {
    private final boolean m;

    public baw(int n, int n2, int n3, int n4, boolean bl, long l) {
        super(n, n2, n3, n4);
        ekk_0 ekk_02;
        this.m = bl;
        this.a(new bzi_0(this));
        elg_0.a().i(l);
        if (this.E() != null && (ekk_02 = elg_0.a().i(l)) instanceof bhs_2) {
            this.e(((bhs_2)((Object)ekk_02)).ao());
        }
    }

    @Override
    public long o() {
        sr_0 sr_02;
        blx_1 blx_12 = this.d(this.h());
        if (this.E() != null && (sr_02 = this.E().b(this.f())) != null) {
            if (this.m) {
                long l;
                bhr_2 bhr_22;
                sr_02.a((sd_0)null, (apq_2)blx_12);
                long l2 = 0L;
                if (sr_02 instanceof bhr_2 && (bhr_22 = (bhr_2)((Object)sr_02)).a("AnimAttaque")) {
                    l2 = bhr_22.aq().b("AnimAttaque");
                }
                return (l = super.o()) > l2 ? l : l2;
            }
            sr_02.g(blx_12);
        }
        this.j();
        return -1L;
    }

    @Override
    protected void l() {
    }
}

