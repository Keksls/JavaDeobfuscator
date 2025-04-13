/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkm
 */
@Deprecated
public class bkm_1
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "remainingPoints";
    public static final String d = "nextLevelGain";
    public static final String e = "bonusList";
    public static final String f = "buttonStyle";
    private final ezw_2 g;
    private final ezz_2 h;
    private final ArrayList<bko_2> i = new ArrayList();
    private static final Comparator<bko_2> j = new bkn_1();

    public bkm_1(ezw_2 ezw_22, ezz_2 ezz_22) {
        this.g = ezw_22;
        this.h = ezz_22;
        for (bkt_2 bkt_22 : this.g.b()) {
            this.i.add(new bko_2(ezz_22, bkt_22));
        }
        this.i.sort(j);
    }

    public int a() {
        return this.g.a();
    }

    public int b() {
        return this.g.c();
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a(147, (long)this.g.a(), new Object[0]);
        }
        if (string.equals(b)) {
            return this.c();
        }
        if (string.equals(d)) {
            short s2 = azu_0.j().k().dr();
            int n = this.g.c(s2);
            if (n == -1) {
                return null;
            }
            return bae.h().a("aptitude.nextLevelActivation", n);
        }
        if (string.equals(f)) {
            return "Aptitude" + this.g.a();
        }
        if (string.equals(e)) {
            return this.i;
        }
        return null;
    }

    public int c() {
        return this.h.c(this.g.a(), cZI.H());
    }

    public void e() {
        fis_1.a().a((ajf_1)this, b);
        for (bko_2 bko_22 : this.i) {
            bko_22.e();
        }
    }

    public void f() {
        fis_1.a().a((ajf_1)this, b);
        for (bko_2 bko_22 : this.i) {
            bko_22.c();
        }
    }

    public ArrayList<bko_2> g() {
        return this.i;
    }
}

