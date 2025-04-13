/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from akn
 */
public class akn_0
implements akq_0 {
    private final all_1 b;
    static final /* synthetic */ boolean a;

    public akn_0(all_1 all_12) {
        if (all_12 == null) {
            throw new IllegalArgumentException("le groupe d?fini est null !");
        }
        this.b = all_12;
    }

    @Override
    public final amk_1 a(long l, float f2, int n, long l2, long l3, int n2) {
        return this.a(l, f2, 1.0f, n, l2, l3, n2);
    }

    @Override
    public amk_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2) {
        amx_1 amx_12;
        if (!a && this.b == null) {
            throw new AssertionError((Object)"Le groupe est null ! Comment est-ce possible ?");
        }
        if (!this.b.g().b()) {
            aki_0.a.warn((Object)"On essaie de jouer un son alors que le son n'est pas initialis?");
            return null;
        }
        try {
            amx_12 = this.b.h().a(l);
        }
        catch (IOException iOException) {
            return null;
        }
        if (amx_12 == null) {
            return null;
        }
        amj_1 amj_12 = this.b.a(amx_12, -1L);
        if (amj_12 == null) {
            return null;
        }
        amj_12.c(f2);
        amj_12.g(f3);
        if (n == 0) {
            amj_12.b(true);
        } else if (n > 1) {
            amj_12.e(n);
        }
        if (l2 != -1L) {
            amj_12.e(l2);
        }
        if (l3 != -1L) {
            amj_12.f(l3);
        }
        this.b.a(amj_12);
        return amj_12;
    }

    @Override
    public amk_1 a(long l, float f2, int n, long l2, long l3, int n2, alo_1 alo_12, int n3, boolean bl) {
        return this.a(l, f2, n, l2, l3, n2);
    }

    @Override
    public amk_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, alo_1 alo_12, int n3, boolean bl) {
        return this.a(l, f2, f3, n, l2, l3, n2);
    }

    @Override
    public void a(long l, amj_1 amj_12) {
        this.b.g();
        ams_1.a(amj_12);
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(long l, float f2) {
    }

    @Override
    public void b(long l) {
    }

    @Override
    public void b(long l, float f2) {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void a(float f2, float f3) {
    }

    @Override
    public void c() {
    }

    static {
        a = !aki_0.class.desiredAssertionStatus();
    }
}

