/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bLd
implements ajh_1,
bHp {
    public static final Comparator<bLd> a = Comparator.comparingInt(bLd::k);
    private static final int h = -1;
    private static final int i = 2;
    public static final String b = "name";
    public static final String d = "icon";
    public static final String e = "collapsed";
    public static final String f = "items";
    public static final String g = "hasItems";
    private static final String[] j = new String[]{"name", "icon", "collapsed", "items", "hasItems"};
    @Nullable
    private final bhg_0 k;
    private boolean l = false;
    private final List<exk_2> m = new ArrayList<exk_2>();
    private final List<exk_2> n = new ArrayList<exk_2>();
    private Comparator<exk_2> o = bhu_1.a;

    public bLd(@Nullable bhg_0 bhg_02) {
        this.k = bhg_02;
    }

    @Override
    public void a(boolean bl) {
        this.l = bl;
        fis_1.a().a((ajf_1)this, e);
    }

    public void b() {
        this.m.clear();
        this.n.clear();
    }

    public void a(exk_2 exk_22) {
        this.m.add(exk_22);
    }

    public void a(@NotNull String string) {
        this.n.clear();
        if (string.isBlank()) {
            this.n.addAll(this.m);
        } else {
            for (exk_2 exk_22 : this.m) {
                if (!Cz.e(exk_22.N()).contains(string)) continue;
                this.n.add(exk_22);
            }
        }
        this.n.sort(this.o);
    }

    public void a(Comparator<exk_2> comparator) {
        this.o = this.o == comparator ? comparator.reversed() : comparator;
        this.n.sort(this.o);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.e();
            }
            case "icon": {
                return this.j();
            }
            case "collapsed": {
                return this.l;
            }
            case "items": {
                return this.n;
            }
            case "hasItems": {
                return !this.n.isEmpty();
            }
        }
        return null;
    }

    public String e() {
        if (this.k == null) {
            return bae.h().a("others", new Object[0]);
        }
        return this.k.a(true);
    }

    private String j() {
        return azs_0.a().a(this.k == null ? (short)-1 : this.k.d());
    }

    private int k() {
        if (this.k == null) {
            return Integer.MAX_VALUE;
        }
        return this.k.o();
    }

    @Override
    public String[] d() {
        return j;
    }

    public String toString() {
        return "type=" + this.e();
    }

    @Nullable
    public bhg_0 f() {
        return this.k;
    }

    @Override
    public boolean a() {
        return this.l;
    }

    public List<exk_2> g() {
        return this.m;
    }

    public List<exk_2> h() {
        return this.n;
    }

    public Comparator<exk_2> i() {
        return this.o;
    }
}

