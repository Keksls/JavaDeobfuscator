/*
 * Decompiled with CFR 0.152.
 */
public abstract class cST
extends cSU {
    @Override
    public boolean c() {
        return this.l instanceof bat_2;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public String q() {
        if (!(this.l instanceof bat_2)) {
            return this.r();
        }
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)super.q());
        return ani_22.r();
    }

    @Override
    public String r() {
        return "manageBookcase";
    }

    @Override
    protected void a() {
        cwp_0.a().a((bat_2)this.l);
    }

    @Override
    protected int t() {
        return cUL.d.aH;
    }
}

