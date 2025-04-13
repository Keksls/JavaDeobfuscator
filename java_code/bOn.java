/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class bOn
implements ajh_1 {
    public static final int a = 6;
    public static final String b = "pageDescription";
    public static final String d = "hasPreviousPage";
    public static final String e = "hasNextPage";
    public static final String f = "secrets";
    private byte g;
    private final byte h;
    final ArrayList<bOm> i = new ArrayList();
    private final ArrayList<bOm> j = new ArrayList();

    public bOn() {
        bOl.a.a(new bOo(this));
        this.i.sort(new bOp(this));
        this.g = 0;
        this.h = (byte)Math.ceil((float)this.i.size() / 6.0f);
        this.c();
    }

    private void c() {
        int n = Hw.a(this.g * 6, 0, this.i.size() - 1);
        int n2 = Hw.a(n + 6, 0, this.i.size());
        this.j.clear();
        for (int k = n; k < n2; ++k) {
            this.j.add(this.i.get(k));
        }
        fis_1.a().a((ajf_1)this, f);
    }

    @Override
    public String[] d() {
        return b_;
    }

    public void a() {
        if (this.f()) {
            this.g = (byte)(this.g - 1);
            this.c();
            this.e();
        }
    }

    public void b() {
        if (this.g()) {
            this.g = (byte)(this.g + 1);
            this.c();
            this.e();
        }
    }

    private void e() {
        fis_1.a().a((ajf_1)this, d, e, b);
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.h();
        }
        if (string.equals(e)) {
            return this.g();
        }
        if (string.equals(d)) {
            return this.f();
        }
        if (string.equals(f)) {
            return this.j;
        }
        return null;
    }

    private boolean f() {
        return this.g > 0;
    }

    private boolean g() {
        return this.g + 1 < this.h;
    }

    private String h() {
        return bae.h().a("pageNumber", this.g + 1, this.h);
    }
}

