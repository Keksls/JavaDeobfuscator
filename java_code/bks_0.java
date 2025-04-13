/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKS
 */
public class bks_0
extends bKH {
    public static final int a = 0;
    public static final int b = 1;
    private final bLj d;
    private final boolean e;

    public bks_0(bLj bLj2, boolean bl, bkk_0 bkk_02) {
        super(() -> {
            if (bl) {
                bkk_02.l().b((String)null);
            } else {
                bkk_02.l().a((String)null);
            }
            bkk_02.i();
        });
        this.d = bLj2;
        this.e = bl;
    }

    @Override
    public bKG aV_() {
        return bKG.j;
    }

    @Override
    public void a(faC faC2) {
        if (this.e) {
            faC2.h(this.d.b());
        } else {
            faC2.g(this.d.b());
        }
    }

    @Override
    protected void b(faC faC2) {
        if (this.e) {
            faC2.h(-1);
        } else {
            faC2.g(-1);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public String b() {
        return this.d.a();
    }

    @Override
    public int aW_() {
        return this.e ? 1 : 0;
    }

    public bLj g() {
        return this.d;
    }
}

