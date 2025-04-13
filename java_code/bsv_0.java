/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSv
 */
public abstract class bsv_0<Type, CategoryId>
implements aiy_1,
ajh_1 {
    public static final String a = "name";
    public static final String b = "description";
    public static final String d = "iconUrl";
    public static final String e = "article";
    public static final String f = "hasCategory";
    public static final String g = "hasLink";
    private final String h;
    private final String i;
    private final String j;
    private final Type k;
    private final ArrayList<bsg_2> l;
    private final bss_0<?, ?> m;
    private final CategoryId n;
    private static final int o = 50;
    private static final int p = 100;
    private aix_1 q;

    protected bsv_0(String string, String string2, String string3, Type Type2, ArrayList<bsg_2> arrayList, bss_0<?, ?> bss_02, CategoryId CategoryId) {
        this.h = string;
        this.i = string2;
        this.j = string3;
        this.k = Type2;
        this.l = arrayList;
        this.m = bss_02;
        this.n = CategoryId;
        this.i();
    }

    public String a() {
        return this.h;
    }

    public String b() {
        return this.j;
    }

    public CategoryId c() {
        return this.n;
    }

    public Type e() {
        return this.k;
    }

    protected aix_1 f() {
        return this.q;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            if (this.h == null) {
                return null;
            }
            if (this.h.length() > 50) {
                return this.h.substring(0, 47) + "...";
            }
            return this.h;
        }
        if (string.equals(b)) {
            if (this.i == null) {
                return null;
            }
            if (this.i.length() > 100) {
                return this.i.substring(0, 97) + "...";
            }
            return this.i;
        }
        if (string.equals(d)) {
            return this.q == null ? null : this.q.a();
        }
        if (string.equals(e)) {
            if (this.m != null) {
                return this.m;
            }
            return null;
        }
        if (string.equals(f)) {
            return this.g();
        }
        if (string.equals(g)) {
            return this.h();
        }
        return null;
    }

    public boolean g() {
        return this.n != null;
    }

    public boolean h() {
        return this.j != null;
    }

    private void i() {
        if (this.l == null) {
            return;
        }
        bsg_2 bsg_22 = bsi_2.a(this.l, 667, 240, bso_2.q);
        if (bsg_22 != null) {
            this.q = bsi_2.a(bsg_22, this, d);
        }
    }

    @Override
    public void a(String string, String string2) {
        fis_1.a().a((ajf_1)this, string);
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{, m_name='" + this.h + "', m_link='" + this.j + "', m_type='" + this.k + "', m_iconUrl=" + this.q + "}";
    }
}

