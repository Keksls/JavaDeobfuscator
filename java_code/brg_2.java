/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bRg
 */
public class brg_2
implements ajh_1,
ddd_0 {
    public static final String a = "name";
    public static final String b = "isNew";
    public static final String d = "isLaunched";
    private final buh_1 e;
    private boolean f;

    public brg_2(buh_1 buh_12) {
        this.e = buh_12;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.f;
        }
        if (string.equals(d)) {
            return this.c();
        }
        return null;
    }

    public String a() {
        return this.e.d();
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void b() {
        ddB.a().a(this);
        this.e.a();
    }

    public boolean c() {
        brk_2 brk_22 = (brk_2)fis_1.a().e("tutorialMessageView");
        return this.c(brk_22);
    }

    private boolean c(brk_2 brk_22) {
        return brk_22 != null && brk_22.a().equals(this.a());
    }

    @Override
    public void a(brk_2 brk_22) {
        if (!this.c(brk_22)) {
            return;
        }
        fis_1.a().a((ajf_1)this, d);
        ddB.a().b(this);
    }

    @Override
    public void b(brk_2 brk_22) {
        if (!this.c(brk_22)) {
            return;
        }
        fis_1.a().a((ajf_1)this, d);
    }
}

