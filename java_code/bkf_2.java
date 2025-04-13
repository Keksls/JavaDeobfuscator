/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkF
 */
public class bkf_2
implements ajh_1 {
    public static final String a = "typesFilter";
    public static final String b = "currentType";
    public static final String d = "battlegroundList";
    public static final String e = "selectedBattleground";
    public static final String f = "maxNumPages";
    public static final String g = "currentPage";
    public static final String h = "currentPageText";
    public static final String i = "isFinishedFilter";
    public static final String j = "winnerId";
    public static final String k = "winnerIcon";
    private static final int n = 7;
    private final ArrayList<bkh_2> o = new ArrayList();
    private bkh_2 p;
    private final bki_2 q;
    private final ArrayList<bkn_2> r = new ArrayList();
    private List<bkn_2> s;
    private bkn_2 t;
    private short u;
    private short v;
    private boolean w;
    private int x;
    private String y;
    public static fho[] l = new fho[]{fho.a, fho.b, fho.e};
    public static final String[] m = new String[]{"typesFilter", "currentType", "battlegroundList", "selectedBattleground", "maxNumPages", "currentPage", "currentPageText", "isFinishedFilter", "winnerId", "winnerIcon"};

    public bkf_2() {
        this.q = new bki_2(this, 7);
    }

    @Override
    public String[] d() {
        return m;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.o;
        }
        if (string.equals(b)) {
            return this.p;
        }
        if (string.equals(d)) {
            return this.q.d();
        }
        if (string.equals(e)) {
            return this.t;
        }
        if (string.equals(f)) {
            return this.q.c();
        }
        if (string.equals(g)) {
            return this.q.a();
        }
        if (string.equals(h)) {
            return this.q.b();
        }
        if (string.equals(i)) {
            return this.w;
        }
        if (string.equals(j)) {
            return this.x;
        }
        if (string.equals(k)) {
            return this.y;
        }
        return null;
    }

    @NotNull
    List<bkn_2> a() {
        if (this.s != null) {
            return this.s;
        }
        this.s = this.r.stream().filter(bkn_22 -> {
            if (this.p.b != null && this.p.b.a() != bkn_22.f().d()) {
                return false;
            }
            if (bkn_22.f().e().b() > this.v) {
                return false;
            }
            if (bkn_22.f().e().c() < this.u) {
                return false;
            }
            return !bkn_22.e() || this.w;
        }).collect(Collectors.toList());
        return this.s;
    }

    public short b() {
        return this.u;
    }

    public short c() {
        return this.v;
    }

    public void a(short s2) {
        this.u = s2;
        this.j();
    }

    public void b(short s2) {
        this.v = s2;
        this.j();
    }

    private void j() {
        this.s = null;
        this.a();
        this.q.a(Hw.a(this.q.a(), 1, this.q.c()));
        fis_1.a().a((ajf_1)this, d, f, h, g);
    }

    public void e() {
        this.w = !this.w;
        this.j();
        fis_1.a().a((ajf_1)this, i);
    }

    public void f() {
        this.q.a(1);
        this.u = 0;
        this.v = (short)enp_2.a.b(ens_2.v);
        this.w = false;
        bkh_2 bkh_22 = new bkh_2();
        this.o.add(bkh_22);
        this.p = bkh_22;
        for (fho fho2 : l) {
            this.o.add(new bkh_2(new bkm_2(fho2)));
        }
    }

    public void a(bkn_2 bkn_22) {
        this.t = bkn_22;
        fis_1.a().a((ajf_1)this, e);
        if (this.t != null) {
            this.x = this.t.f().q();
            this.y = this.t.c();
        } else {
            this.x = 0;
            this.y = null;
        }
        fis_1.a().a((ajf_1)this, j);
        fis_1.a().a((ajf_1)this, k);
    }

    public bkn_2 g() {
        return this.t;
    }

    public void a(int n) {
        this.q.a(n);
        this.s = null;
        fis_1.a().a((ajf_1)this, d, h, f, g);
    }

    public int h() {
        return this.q.a();
    }

    public void a(bkh_2 bkh_22) {
        this.p = bkh_22;
        this.j();
    }

    public int i() {
        return this.q.c();
    }

    public void a(List<fhe_0> list) {
        this.r.clear();
        for (fhe_0 fhe_02 : list) {
            fhc_0 fhc_02;
            fgv_0 fgv_02;
            bkn_2 bkn_22 = new bkn_2(fhe_02);
            Optional<fhc_0> optional = fhd_0.a.a(fhe_02.f());
            if (optional.isPresent() && (fgv_02 = fgT.a.a((fhc_02 = optional.get()).b())) != null) {
                bkn_22.a(new brm_1(fgv_02));
            }
            this.r.add(bkn_22);
        }
        this.r.sort(new bkg_2(this));
        this.s = null;
        fis_1.a().a((ajf_1)this, d, g, h, f);
    }
}

