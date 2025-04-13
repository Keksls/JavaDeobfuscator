/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aUm
implements Comparable<aUm> {
    private int a = -1;
    private aup_0 b;
    private long c = -1L;
    private boolean d = true;
    private String e;
    private List<Ow> f = new ArrayList<Ow>();
    @Nullable
    private xz_0 g = null;
    private String h;
    private final wu_0 i;
    private final long j;
    private boolean k;
    private static long l = Long.MIN_VALUE;
    private boolean m = false;

    public aUm(String string, String string2) {
        this.e = string;
        this.h = aUi.b(string2);
        this.i = wn_0.a.a();
        if (l == Long.MAX_VALUE) {
            l = Long.MIN_VALUE;
        }
        this.j = l++;
    }

    public aUm(String string) {
        this(null, string);
    }

    public aUm(long l, String string) {
        this(string);
        this.c = l;
    }

    public aUm(String string, long l, String string2) {
        this(string, string2);
        this.c = l;
    }

    public aUm(PO pO) {
        this(pO.e(), pO.h());
        this.c = pO.c();
        this.d = pO.d();
        this.f = pO.f();
        this.g = pO.g();
    }

    public aUm(QN qN) {
        this(qN.c(), qN.f());
        this.c = qN.b();
        this.d = true;
        this.f = qN.d();
        this.g = qN.e();
    }

    public aup_0 a() {
        return this.b;
    }

    public void a(aup_0 aup_02) {
        this.b = aup_02;
    }

    public void a(int n) {
        this.a = n;
    }

    public int b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public String a(bvs_0 bvs_02) {
        return bvs_0.a(bvs_02, this.e, this.g, this.f);
    }

    public void a(String string) {
        this.e = string;
    }

    public String e() {
        return this.h;
    }

    public String f() {
        if (!this.m) {
            return this.h;
        }
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 != null && emp_0.b(bai_02.v(), emq_0.bp)) {
            return "[" + bae.h().a("chat.deletedMessage", new Object[0]) + "] " + this.h;
        }
        return "[" + bae.h().a("chat.deletedMessage", new Object[0]) + "]";
    }

    public void b(String string) {
        this.h = string;
    }

    public wu_0 g() {
        return this.i;
    }

    public boolean h() {
        return this.k;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    public boolean i() {
        return this.m;
    }

    public void j() {
        this.m = true;
    }

    public boolean k() {
        return this.d;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public void a(List<Ow> list) {
        this.f = list;
    }

    public void a(xz_0 xz_02) {
        this.g = xz_02;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        aUm aUm2 = (aUm)object;
        return this.j == aUm2.j;
    }

    public int hashCode() {
        return Objects.hash(this.j);
    }

    public int a(@NotNull aUm aUm2) {
        int n = this.i.f(aUm2.i);
        if (n == 0) {
            return Long.compare(this.j, aUm2.j);
        }
        return n;
    }

    public boolean a(bnh_1 bnh_12) {
        if (this.d) {
            return bnh_12.a_() == this.c;
        }
        return bnh_12.R() == this.c;
    }

    public String l() {
        if (this.b.h()) {
            return this.b.f();
        }
        return "";
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((aUm)object);
    }
}

