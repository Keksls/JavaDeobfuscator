/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from bob
 */
public class bob_2
implements rv_0,
bmn_2,
bnx_2 {
    public static final int a = 10022;
    public static final int b = 10022;
    public static final int c = 1045;
    public static final int d = 1045;
    private static final String[] g = new String[]{"worldAndFightBarDialog"};
    public static final String e = "pandaBarrelLabel";
    private static final String h = "-";
    public static final eps_0 f = eps_0.b;
    private final bnh_1 i;
    private bmv_1 j;
    private rv_0 k;
    private final List<fsM> l = new ArrayList<fsM>();

    public bob_2(bnh_1 bnh_12) {
        this.i = bnh_12;
        for (String string : g) {
            fsM fsM2;
            fyy_0 fyy_02 = fpm_0.b().h().d(string);
            if (fyy_02 == null || (fsM2 = (fsM)fyy_02.a(e)) == null) continue;
            this.l.add(fsM2);
        }
    }

    @Override
    public void a(blx_1 blx_12) {
        if (!(blx_12 instanceof bmv_1)) {
            return;
        }
        if (blx_12.gO() != 3794) {
            return;
        }
        if (blx_12.hf() == null || !blx_12.hf().equals(this.i)) {
            return;
        }
        if (blx_12.aq().a_() != this.i.a_()) {
            this.a(0);
            return;
        }
        this.j = (bmv_1)blx_12;
        epa_1 epa_12 = this.j.a_(f);
        epa_12.a(this);
        this.k = new bgm_2(this.j);
        epa_12.a(this.k);
        this.a(this.b(epa_12));
    }

    @Override
    public void b(blx_1 blx_12) {
        if (blx_12 != this.j) {
            return;
        }
        if (this.j == null) {
            return;
        }
        epa_1 epa_12 = this.j.a_(ekd_0.au());
        epa_12.b(this);
        epa_12.b(this.k);
        this.j = null;
        this.a(0);
    }

    @Override
    public void a(rs_0 rs_02) {
        if (rs_02.p() != ekd_0.au()) {
            return;
        }
        if (this.j.aq().a_() != this.i.a_()) {
            return;
        }
        bvx_2 bvx_22 = this.i.bz();
        if (bvx_22 == null) {
            return;
        }
        Optional<blx_1> optional = bvx_22.ae_();
        if (optional.map(blx_12 -> blx_12.a_() == this.i.a_()).orElse(false).booleanValue()) {
            this.a(this.b(rs_02));
        }
    }

    private int b(rs_0 rs_02) {
        return Hw.c((float)rs_02.a() / (float)rs_02.c() * 100.0f);
    }

    private void a(int n) {
        for (int k = this.l.size() - 1; k >= 0; --k) {
            this.l.get(k).c(n == 0 ? h : String.valueOf(n));
        }
    }

    @Override
    public void a() {
        boc_2.a.a((abu_1)this.i);
    }

    public String toString() {
        return "PandawaFightListener{m_character=" + this.i + "}";
    }

    @Override
    public void a(int n, Object object) {
    }

    @Override
    public void a(rx_0 rx_02) {
    }

    @Override
    public void b(rx_0 rx_02) {
    }

    @Override
    public void a(tk_0 tk_02) {
        if (tk_02.a() != 101) {
            return;
        }
        if (this.i == null || this.j == null || !this.i.hg()) {
            this.a(0);
            return;
        }
        if (this.j.hf() != null && ((blx_1)this.j.hf()).a_() == this.i.a_()) {
            epa_1 epa_12 = this.j.a_(f);
            this.a(this.b(epa_12));
        }
    }
}

