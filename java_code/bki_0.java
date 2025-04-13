/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKI
 */
public class bki_0
extends bKH {
    private final bLe a;

    public bki_0(bLe bLe2, Runnable runnable) {
        super(runnable);
        this.a = bLe2;
    }

    @Override
    public bKG aV_() {
        return bKG.l;
    }

    @Override
    public void a(faC faC2) {
        if (this.a.j()) {
            faC2.e().add(this.a.g().d());
        } else {
            this.b(faC2);
        }
    }

    @Override
    protected void b(faC faC2) {
        this.a.b((bLe bLe2) -> faC2.e().remove(bLe2.g().d()));
    }

    @Override
    public boolean a() {
        return this.a.b() && !this.a.e();
    }

    @Override
    public String b() {
        return this.a.f();
    }

    @Override
    public int aW_() {
        return this.a.g().o();
    }

    public bhg_0 g() {
        return this.a.g();
    }
}

