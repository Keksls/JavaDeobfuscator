/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public abstract class bSt<Id>
implements aiy_1,
ajh_1 {
    public static final String a = "name";
    public static final String b = "description";
    public static final String d = "iconUrl";
    public static final String e = "depthMargin";
    public static final String f = "displayMode";
    public static final String g = "children";
    private final Id h;
    private final String i;
    private final String j;
    private final String k;
    private final bSu l;
    private final String m;
    private int n;
    private aix_1 o;
    private bSt<?> p;
    private final List<bSt<?>> q = new ArrayList();

    protected bSt(Id Id, String string, String string2, String string3, bSu bSu2, String string4) {
        this.h = Id;
        this.i = string;
        this.j = string2;
        this.k = string3;
        this.l = bSu2;
        this.m = string4;
        this.g();
    }

    public Id a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }

    public String c() {
        return this.j;
    }

    public void a(bSt<?> bSt2) {
        this.q.add(bSt2);
        bSt2.b(this);
    }

    public void b(bSt<?> bSt2) {
        this.p = bSt2;
        this.n = bSt2.n + 1;
    }

    public bSt<?> e() {
        return this.p;
    }

    public String f() {
        return this.m;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i;
        }
        if (string.equals(b)) {
            return this.j;
        }
        if (string.equals(d)) {
            return this.o == null ? null : this.o.a();
        }
        if (string.equals(e)) {
            int n = this.n * 10;
            return "0,0," + n + ", 0";
        }
        if (string.equals(f)) {
            return this.l.a();
        }
        if (string.equals(g)) {
            return this.q;
        }
        return null;
    }

    private void g() {
        if (this.k != null) {
            File file = bSM.a(this.k);
            String string = bSM.a(file);
            this.o = new aix_1(null, string, d, this);
            bSL.a.a(this.k, this.o);
        }
    }

    @Override
    public void a(String string, String string2) {
        fis_1.a().a((ajf_1)this, string);
    }

    public boolean a(TObjectProcedure<bSt<?>> tObjectProcedure) {
        if (!tObjectProcedure.execute((Object)this)) {
            return false;
        }
        int n = this.q.size();
        for (int k = 0; k < n; ++k) {
            bSt<?> bSt2 = this.q.get(k);
            if (bSt2.a(tObjectProcedure)) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "Category{m_depth=" + this.n + ", m_imageUrl='" + this.k + "', m_description='" + this.j + "', m_name='" + this.i + "', m_id=" + this.h + "}";
    }
}

