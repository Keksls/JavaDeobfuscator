/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bLE
 */
public class ble_1
extends blo_0
implements ahC {
    private static final Logger y = Logger.getLogger(ble_1.class);
    private static final ble_1 z = new ble_1();
    public static final String m = "currentMapName";
    public static final String n = "currentTerritoryName";
    public static final String o = "currentTerritoryIconUrl";
    public static final String p = "currentProtectorDescription";
    public static final String q = "availableMapsCoords";
    public static final String r = "displayedPosition";
    public static final String s = "displayTerritories";
    public static final String t = "recommendedLevel";
    public static final String u = "protectorAnimatedElem";
    public static final String v = "protectorAnimName";
    public static final String[] w = new String[]{"displayedPosition", "availableMapsCoords", "displayTerritories"};
    public static final String[] x = new String[w.length + blo_0.j.length];
    private static final int A = 1000;
    private int B = -1;
    private abu C;
    private float D = 1.0f;
    private int E;
    private int F;
    private boolean G;
    private amj_1 H;

    private ble_1() {
        blf_1.a();
    }

    public String D() {
        long l = this.u();
        if (l != -1L) {
            return bae.h().a(77, l, new Object[0]);
        }
        return null;
    }

    public static ble_1 E() {
        return z;
    }

    public void a(boolean bl) {
        if (this.G == bl) {
            return;
        }
        this.G = bl;
        this.y();
    }

    @Override
    public void b() {
        super.b();
        fis_1.a().a("map", this);
    }

    public fsY F() {
        return (fsY)this.k;
    }

    public void a(fsY fsY2) {
        super.a(fsY2);
        this.w();
        if (fsY2 == null) {
            this.R();
        }
    }

    public void a(float f2, float f3, float f4, long l, Object object, boolean bl) {
        this.a(2, f2, f3, f4, l, object, null, bl);
    }

    public void G() {
        this.B();
        blq_0.c().b();
    }

    public void a(int n, float f2, float f3, float f4, long l, Object object, String string, boolean bl) {
        if (string == null) {
            string = bae.h().a("compass", new Object[0]);
        }
        this.a(0L, n, f2, f3, f4, l, string, object, bLs.g, anr_0.G, bl);
    }

    public void a(long l, int n, float f2, float f3, float f4, long l2, String string, Object object, fjh_1 fjh_12, float[] fArray, boolean bl) {
        blq_0.c().a(n, l, (int)f2, (int)f3, (int)f4, object, this, bl);
        this.a(f2, f3, f4, l2, string, object, fjh_12, fArray);
        this.A().b(true);
    }

    public void c(int n, long l) {
        this.B();
        blq_0.c().b(n, l);
    }

    public boolean a(int n) {
        return blq_0.c().a(n);
    }

    @Override
    public Object b(String string) {
        if (string.equals(q)) {
            return afg.a().d().toArray();
        }
        if (string.equals(r)) {
            return new StringBuilder("x=").append(this.E).append(" y=").append(this.F);
        }
        if (string.equals(s)) {
            return this.G;
        }
        if (string.equals(n)) {
            if (this.s()) {
                return bae.h().a("desc.havenWorld", new Object[0]);
            }
            Optional<fww> optional = this.N();
            if (optional.isPresent()) {
                return optional.get().w().bc_();
            }
            return this.l != null ? this.l.bc_() : null;
        }
        if (string.equals(m)) {
            if (this.s()) {
                return bae.h().a("desc.havenWorld", new Object[0]);
            }
            return this.D();
        }
        if (string.equals(o)) {
            Optional<fgy_0> optional = this.O();
            if (optional.isEmpty()) {
                return null;
            }
            int n = optional.get().B();
            int n2 = bMs.a.c(n);
            if (n2 == -1) {
                return null;
            }
            return azs_0.a().a("nationFlagIconsPath", null, n2);
        }
        if (string.equals(u)) {
            Optional<fgy_0> optional = this.O();
            if (optional.isPresent()) {
                return bwu_2.a(optional.get().B());
            }
            return this.C;
        }
        if (string.equals(v)) {
            return bnm_0.a.b();
        }
        if (string.equals(p)) {
            Optional<fgy_0> optional = this.O();
            fgy_0 fgy_02 = optional.orElse(this.P());
            if (fgy_02 == null) {
                return null;
            }
            ani_2 ani_22 = new ani_2();
            bmp_0.a(ani_22, (bMn)fgy_02);
            return ani_22.r();
        }
        if (string.equals(t)) {
            if (this.s()) {
                return null;
            }
            Optional<fww> optional = this.N();
            if (optional.isPresent()) {
                fws fws2 = (fws)optional.get().w();
                return fws2.d();
            }
            return this.l != null ? this.l.d() : null;
        }
        return super.b(string);
    }

    private Optional<fww> N() {
        if (this.k == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(((fsY)this.k).getSelectedMapZone());
    }

    private Optional<fgy_0> O() {
        Optional<fww> optional = this.N();
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        fwB fwB2 = optional.get().w();
        if (!(fwB2 instanceof bmg_0)) {
            return Optional.empty();
        }
        bmg_0 bmg_02 = (bmg_0)fwB2;
        return Optional.ofNullable(bmg_02.h().h());
    }

    private fgy_0 P() {
        bmf_0 bmf_02 = (bmf_0)fgT.a.a(this.I());
        if (bmf_02 == null) {
            return null;
        }
        fgy_0 fgy_02 = bmf_02.h();
        if (fgy_02 == null) {
            return null;
        }
        return fgy_02;
    }

    public void H() {
        fis_1.a().a((ajf_1)this, t, n, o, u, p);
    }

    public int I() {
        if (this.l instanceof bLN) {
            return ((bLN)this.l).h();
        }
        return -1;
    }

    @Override
    public String[] d() {
        return x;
    }

    public void a(int n, int n2) {
        this.E = n;
        this.F = n2;
        fis_1.a().a((ajf_1)this, r);
    }

    @Override
    public float g() {
        return this.D;
    }

    @Override
    public void a(float f2) {
        this.D = f2;
        super.a(f2);
    }

    @Override
    protected void q() {
        super.q();
        this.a(this.P());
        this.Q();
        fis_1.a().a((ajf_1)this, n, p, n, m, o, t);
    }

    private void Q() {
        long l;
        if (!azu_0.j().c(das_0.a())) {
            return;
        }
        if (this.l instanceof bLq) {
            bLq bLq2 = (bLq)this.l;
            l = bLq2.c();
        } else {
            l = 600197L;
        }
        if (this.H == null || this.H.L() != l) {
            this.R();
            if (l != -1L) {
                this.H = cdw_0.n().a(l, true);
                if (this.H != null) {
                    this.H.c(0.0f);
                    this.H.a(1.0f, 1000.0f);
                }
            }
        }
    }

    private void R() {
        if (this.H != null) {
            this.H.f(true);
            this.H.a(0.0f, 1000.0f);
            this.H = null;
        }
    }

    @Override
    protected void y() {
        fsY fsY2 = this.F();
        if (fsY2 == null) {
            return;
        }
        fsY2.setAllMapZonesVisible(this.G && this.l != null && this.l.e());
        boolean bl = this.m();
        if (bl) {
            fsY2.setDragEnabled(false);
            fsY2.setDropEnabled(false);
            fsY2.setLandMarkZoom(0.75f);
            fsY2.setUseAlternateTexture(true);
        } else {
            fsY2.setDragEnabled(true);
            fsY2.setDropEnabled(true);
            fsY2.setLandMarkZoom(1.0f);
            fsY2.setUseAlternateTexture(false);
        }
    }

    public void J() {
        fww fww2 = this.F().getSelectedMapZone();
        if (fww2 == null) {
            return;
        }
        bLO bLO2 = (bLO)fww2.w();
        if (!bLO2.c()) {
            return;
        }
        bLO2.a(this);
    }

    @Override
    public boolean r() {
        if (azu_0.j().c(cXX.a())) {
            return false;
        }
        return super.r();
    }

    @Override
    public void a(bLP bLP2) {
        if (this.s()) {
            this.t();
        } else {
            super.a(bLP2);
        }
        if (!this.r() && azu_0.j().c(das_0.a())) {
            azu_0.j().b(das_0.a());
        }
        this.a(this.P());
        fis_1.a().a((ajf_1)this, "isMapAvailable", m, p, o, n, u, t);
    }

    @Override
    public fjh_1 l() {
        return bLs.k;
    }

    @Override
    public void w() {
        super.w();
        fsY fsY2 = this.F();
        if (fsY2 == null) {
            return;
        }
        aff_1 aff_12 = azu_0.j().k().P_();
        fsY2.setPlayerMapZone(aff_12.d(), aff_12.e());
        this.y();
    }

    public void K() {
        fis_1.a().a((ajf_1)this, "isMapAvailable");
    }

    @Override
    public void a() {
        this.G();
    }

    private void a(fgy_0 fgy_02) {
        int n;
        int n2 = n = fgy_02 == null ? -1 : fgy_02.B();
        if (this.B == n) {
            return;
        }
        this.B = n;
        if (this.C != null) {
            this.C.R();
            this.C = null;
        }
        if (n != -1) {
            this.C = bwu_2.a(n);
        }
        fis_1.a().a((ajf_1)this, u, v);
    }

    public void L() {
        this.z().b(buq_0.i);
        if (this.l instanceof bLN || this.l instanceof blb_1) {
            this.w();
        }
    }

    public void M() {
        blg_1.a().d();
        blf_1.a();
    }

    @Override
    public /* synthetic */ fsS c() {
        return this.F();
    }

    static {
        System.arraycopy(w, 0, x, 0, w.length);
        System.arraycopy(blo_0.j, 0, x, w.length, blo_0.j.length);
    }
}

