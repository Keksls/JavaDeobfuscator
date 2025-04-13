/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEv
 */
public abstract class cev_1
implements ceo_1 {
    private boolean a = false;

    @Override
    public boolean h() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    @Override
    public void b(arf_1 arf_12) {
        this.a = arf_12.l();
        this.a(arf_12);
    }

    @Override
    public void b(gk_0 gk_02) {
        gk_02.a(this.a);
        this.a(gk_02);
    }

    @Override
    public boolean g() {
        if (this.a) {
            return !this.c();
        }
        return this.c();
    }

    public String toString() {
        Object object = this.e();
        if (this.a) {
            object = "[NON] " + (String)object;
        }
        return object;
    }

    @Override
    public abstract ceo_1 f();

    protected abstract boolean c();

    protected abstract void a(arf_1 var1);

    protected abstract void a(gk_0 var1);

    protected abstract String e();

    public /* synthetic */ Object clone() {
        return this.f();
    }
}

