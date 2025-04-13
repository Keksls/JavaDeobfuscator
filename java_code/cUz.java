/*
 * Decompiled with CFR 0.152.
 */
public abstract class cUz
extends cSX {
    protected short s;
    protected evt_1 t;

    @Override
    public boolean p() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!this.b(bmr_12)) {
            this.p.add(1);
        }
        return this.p.isEmpty() && super.p();
    }

    protected boolean b(bmr_1 bmr_12) {
        if (this.s <= 0) {
            b.error((Object)"Teleporter sans instance li\u00e9e");
            return false;
        }
        cua_0 cua_02 = new cua_0(this, bmr_12);
        return emj_0.b.a(new emh_0[]{cua_02});
    }

    public void a(short s2) {
        this.s = s2;
    }

    public evt_1 w() {
        return this.t;
    }

    public void a(evt_1 evt_12) {
        this.t = evt_12;
    }

    @Override
    public String q() {
        String string = this.f();
        ani_2 ani_22 = new ani_2();
        if (this.r != null && !this.r.isEmpty()) {
            ani_22.a((CharSequence)this.r);
        }
        if (ani_22.q() > 0) {
            ani_22.m();
        }
        ani_22.a((CharSequence)string);
        if (this.t.r()) {
            ani_22.a(' ').a().a((CharSequence)bae.h().a("downscale.mru.dungeonAuto", new Object[0])).b();
        }
        if (this.q != null && !this.q.isEmpty()) {
            ani_22.m().a((CharSequence)this.q);
        }
        if (this.p.contains(3)) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("error.otherInstanceOpenByGroup", new Object[0]));
        }
        if (this.p.contains(1)) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("booster.pack.required", new Object[0]));
        }
        return ani_22.r();
    }
}

