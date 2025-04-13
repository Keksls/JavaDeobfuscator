/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bbx
 */
public class bbx_0
extends ban {
    private static final int f = 3;
    private static final int g = 1200;
    apl_1 h;
    private final aej_2 i;
    private final boolean m;
    private final emu_2 n;

    public bbx_0(int n, int n2, int n3, int n4, long l, emu_2 emu_22, apl_1 apl_12, aej_2 aej_22, boolean bl) {
        super(n, n2, n3, n4);
        this.c(l);
        this.n = emu_22;
        this.h = apl_12;
        this.i = aej_22;
        this.m = bl;
    }

    @Override
    public long o() {
        int n;
        if (this.h == null) {
            return 0L;
        }
        blx_1 blx_12 = this.d(this.h());
        if (blx_12 == null) {
            return 0L;
        }
        biI biI2 = blx_12.bv();
        biI2.bZ();
        erb_2 erb_22 = this.b(blx_12, biI2);
        if (erb_22 instanceof blx_1) {
            biI biI3 = ((blx_1)erb_22).bv();
            biI3.a(new bby_0(this, blx_12, biI2));
            n = biI3.j("Anim04Porte");
            if (n == Integer.MAX_VALUE || n < 500) {
                n = 500;
            }
            this.h = this.h.a(1, this.h.a());
        } else {
            this.a(blx_12, biI2);
            n = 0;
        }
        int n2 = biI2.aZ().a(biI2, this.h.a()).a(biI2);
        if (blx_12.hd() != null && ((blx_1)blx_12.hd()).bv().bb() == null) {
            return 0L;
        }
        int n3 = this.a(blx_12, n, n2);
        if (this.n == emu_2.f) {
            n3 -= n2 + 75;
        }
        return n3;
    }

    private int a(blx_1 blx_12, int n, int n2) {
        if (this.a(blx_12)) {
            biI biI2 = blx_12.bv();
            int n3 = biI2.j("AnimCourseTp02") + biI2.j("AnimCourseTp02-Fin");
            if (n3 == 0 || n3 == Integer.MAX_VALUE) {
                return 1200;
            }
            return n3;
        }
        return n + this.h.a() * n2;
    }

    void a(blx_1 blx_12, biI biI2) {
        if (this.h.a() == 0) {
            return;
        }
        if (this.n == emu_2.e) {
            biI2.a(agh_0.a(true, biI2, aOy.f(), aOy.f()));
        }
        if (this.n == emu_2.f) {
            biI2.a(agh_0.a(true, biI2, aOz.g(), aOz.g()));
        }
        if (this.a(blx_12)) {
            biI2.e("AnimCourseTp02");
            biI2.a(new bba_0(this, biI2, blx_12));
            return;
        }
        biI2.a(this.h, true, blx_12.bz() == null);
        if (blx_12.ak()) {
            this.c(blx_12, biI2);
        }
        if (this.m) {
            cYH.a().b(blx_12);
        }
        this.u();
    }

    private void u() {
        cYZ cYZ2 = cYZ.o();
        boolean bl = azu_0.j().c(cYZ2);
        if (!bl) {
            return;
        }
        cYZ2.e();
        cYZ2.l();
    }

    private boolean a(blx_1 blx_12) {
        return blx_12.Z_() == epn_2.t && this.n == emu_2.a && this.h.a() > 3;
    }

    private erb_2 b(blx_1 blx_12, biI biI2) {
        boolean bl;
        erb_2 erb_22 = blx_12.hf();
        if (erb_22 == null) {
            return null;
        }
        int[] nArray = this.h.c();
        aff_1 aff_12 = new aff_1(nArray[0], nArray[1], (short)nArray[2]);
        if (aff_12.equals(blx_12.P_()) && this.h.a() > 1) {
            nArray = this.h.a(1);
            aff_12.b(nArray);
        }
        if (!(bl = erb_22.c(aff_12))) {
            a.error((Object)("[FIGHT] " + erb_22 + " failed to uncarry " + blx_12 + " to " + aff_12));
        }
        cYT.a().f();
        return erb_22;
    }

    private void c(blx_1 blx_12, biI biI2) {
        bbz_0 bbz_02 = new bbz_0(this, blx_12);
        biI2.b(bbz_02);
    }

    void a(afe_0 afe_02, blx_1 blx_12) {
        this.b(afe_02, blx_12);
        this.c(blx_12);
        this.b(blx_12);
    }

    private void b(blx_1 blx_12) {
        if (azu_0.j().k() == blx_12) {
            bua_0.a.a(new bup_1());
        }
    }

    private void b(afe_0 afe_02, blx_1 blx_12) {
        aej_2 aej_22 = blx_12.F();
        if (aej_22.c()) {
            afe_02.a(aej_22);
        } else {
            a.error((Object)"LE MOBILE SE TROUVE DANS UNE DIRECTION 8 A LA FIN D'UN MOUVEMENT");
            afe_02.a(aej_22.c(0));
        }
    }

    private void c(blx_1 blx_12) {
        if (blx_12.bp() && !blx_12.gk()) {
            cYT.a().f();
        }
    }

    @Override
    protected void l() {
        blx_1 blx_12;
        if (this.n() instanceof bvx_2) {
            ((bvx_2)this.n()).a(this.d(this.h()), (List<int[]>)null, emu_2.a);
        }
        if ((blx_12 = this.d(this.h())) != null) {
            blx_12.c(this.i);
        }
        super.l();
    }
}

