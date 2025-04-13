/*
 * Decompiled with CFR 0.152.
 */
public abstract class cVb
implements ahr_1 {
    protected boolean a;

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        if (this.c()) {
            this.a = cyt_0.a().e();
            cyt_0.a().d(this.a());
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        if (cyt_0.a().e() && !this.a) {
            azu_0.j().b(cyt_0.a());
        }
    }

    protected void a(fvk_0 fvk_02) {
        if (this.a) {
            return;
        }
        cyt_0.a().a(fvk_02);
    }

    protected boolean a() {
        return false;
    }

    protected boolean c() {
        return true;
    }
}

