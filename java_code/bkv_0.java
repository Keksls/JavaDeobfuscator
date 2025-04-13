/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKv
 */
public class bkv_0
implements ajh_1 {
    public static final String a = "similarEntriesSearch";
    public static final String b = "similarOffersSearch";
    private final bLf d = new bLf(5);
    private final faC e = new fax_0();
    private final bLf f = new bLf(5);
    private final faA g = new faA();
    private final bKm h = new bKm();

    public void a(int n) {
        this.e.b(n);
        if (this.e.k() == faM.i) {
            this.e.a(faM.d).a(true);
        }
        this.g.a(List.of(Integer.valueOf(n)));
        if (this.g.k() == faM.i) {
            this.g.a(faM.d).a(false);
        }
        this.b(0);
        this.c(0);
    }

    public void a() {
        this.b(0);
        this.c(0);
    }

    public void a(faM faM2) {
        daw.a(this.e, faM2);
        this.b(this.e.j());
    }

    public void b(faM faM2) {
        daw.a(this.g, faM2);
        this.c(this.g.j());
    }

    public void b() {
        this.b(this.d.a());
    }

    public void c() {
        this.c(this.f.a());
    }

    public void e() {
        this.b(this.d.b());
    }

    public void f() {
        this.c(this.f.b());
    }

    public void g() {
        this.b(this.d.a(1));
    }

    public void h() {
        this.c(this.f.a(1));
    }

    private void b(int n) {
        this.e.c(n);
        if (!this.h.a(this.e)) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coD coD2 = new coD(faK.c);
        coD2.a(this.e);
        azu_0.j().K().c(coD2);
    }

    private void c(int n) {
        this.g.c(n);
        if (!this.h.a(this.g)) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coC coC2 = new coC(faK.e);
        coC2.a(this.g);
        azu_0.j().K().c(coC2);
    }

    public void a(mq_0 mq_02) {
        this.d.a(mq_02.c(), mq_02.e().stream().map(mm_02 -> new bKT((mm_0)mm_02, mq_02.i())).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, a);
    }

    public void a(mu_0 mu_02) {
        this.f.a(mu_02.c(), mu_02.e().stream().map(mq_12 -> new bKY((mq_1)mq_12, mu_02.i())).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, b);
    }

    public void i() {
        this.e.a();
        this.f.f();
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.d;
        }
        if (b.equals(string)) {
            return this.f;
        }
        return null;
    }

    @Override
    public String[] d() {
        return new String[]{a, b};
    }
}

