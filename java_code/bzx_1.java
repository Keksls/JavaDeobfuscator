/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzx
 */
public class bzx_1
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "characterLevel";
    public static final String d = "characterBreedIcon";
    public static final String e = "naturalState";
    public static final String f = "isCompanion";
    public static final String g = "canEditBuild";
    public static final String h = "cantEditMessage";
    public static final String i = "buildSheetSetView";
    public static final String j = "hasUnsavedChanges";
    public static final String k = "isCurrentBuildNew";
    public static final String l = "equipments";
    public static final String m = "spells";
    public static final String n = "aptitudes";
    public static final String o = "hideBuilds";
    public static final String p = "isReduced";
    private static final String[] q = new String[]{"name", "characterLevel", "characterBreedIcon", "naturalState", "isCompanion", "canEditBuild", "cantEditMessage", "buildSheetSetView", "hasUnsavedChanges", "isCurrentBuildNew", "equipments", "spells", "hideBuilds", "isReduced"};
    private bzo_1 r;
    private bld_0 s;
    private bzt_2 t;
    private bzv_2 u;
    private bkv_2 v;
    private boolean w = false;

    private void a(String ... stringArray) {
        fis_1.a().a((ajf_1)this, stringArray);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.r.g();
            }
            case "characterLevel": {
                return bae.h().a("levelShort.custom", this.r.h());
            }
            case "naturalState": {
                return this.r.a() ? this.r.c().ad() : null;
            }
            case "isCompanion": {
                return this.r.b();
            }
            case "characterBreedIcon": {
                bmr_1 bmr_12 = this.r.c();
                return bmr_12 == null ? null : bmr_12.bb().h();
            }
            case "canEditBuild": {
                return !this.e();
            }
            case "cantEditMessage": {
                if (ezp_1.a(this.r.f())) {
                    return bae.h().a("build.cannot.edit.during.occupation", new Object[0]);
                }
                if (this.o()) {
                    return bae.h().a("build.cannot.edit.in.fight", new Object[0]);
                }
                if (!this.r.b()) {
                    return bae.h().a("build.cannot.edit.during.dungeon", new Object[0]);
                }
                return bae.h().a("build.companions.cant.update.spells", new Object[0]);
            }
            case "buildSheetSetView": {
                return this.s;
            }
            case "hasUnsavedChanges": {
                return cZI.a().t();
            }
            case "isCurrentBuildNew": {
                return cZI.a().B();
            }
            case "equipments": {
                return this.t;
            }
            case "spells": {
                return this.u;
            }
            case "aptitudes": {
                return this.v;
            }
            case "hideBuilds": {
                return this.r.b() || fis_1.a().c("hideDownscaling");
            }
            case "isReduced": {
                return this.w;
            }
        }
        return null;
    }

    public void a(bzo_1 bzo_12) {
        this.r = bzo_12;
        this.a(a, b, d, e, f, o);
        if (this.r.a()) {
            this.m();
        }
        this.p();
        this.q();
        if (this.r.a()) {
            this.r();
        }
    }

    private void m() {
        this.s = new bld_0(this.r.c());
        this.s.a(true);
        this.a(i);
    }

    public void a() {
        this.a(this.s.f());
    }

    public void a(int n) {
        this.s.a(n);
        this.n();
    }

    public void b(int n) {
        this.s.a((Integer)n);
        this.n();
    }

    private void n() {
        this.s.a();
        this.f();
        this.a(true);
        this.s();
        fis_1.a().a((ajf_1)this.s, this.s.d());
        this.a(g, h);
    }

    public int b() {
        return this.s.f();
    }

    public ble_0 c() {
        return this.s.e(this.b());
    }

    public boolean e() {
        return this.r == null || this.r.i() || this.s.g() || this.o() || ezp_1.a(this.r.f());
    }

    private boolean o() {
        @Nullable els_0 els_02 = euu_2.h(this.r.f()).ck();
        return els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e;
    }

    private void p() {
        this.t = this.r.a() ? new bzt_2(this.r, this.s.k(), this.t) : new bzt_2(this.r, new bjg_1(this.r.d()), this.t);
        this.a(l);
    }

    public void f() {
        this.t.a(this.s.k());
    }

    public void g() {
        for (bja_1 bja_12 : this.s.k().b().values()) {
            fis_1.a().a((ajf_1)bja_12, "additionalBorder");
        }
    }

    private void q() {
        if (this.r.a()) {
            this.u = new bzv_2(this.r.c(), this.s.l());
        } else {
            bPI bPI2 = new bPI();
            bPI2.a((bmv_1)this.r.j());
            this.u = new bzv_2(bPI2);
        }
        this.a(m);
    }

    public void a(boolean bl) {
        this.u.a(this.s.l());
        this.a(m);
        fis_1.a().a((ajf_1)this.u, "currentSpellDeck");
        if (bl) {
            bPJ.a(this.r.c().dz(), this.r.c().aZ(), this.r.c().cg());
        }
    }

    private void r() {
        this.v = new bkv_2(this.s.m());
        this.a(n);
    }

    private void s() {
        this.v.a(this.s.m());
        this.a(n);
    }

    public void h() {
        this.w = !this.w;
        this.a(p);
    }

    @Override
    public String[] d() {
        return q;
    }

    public bld_0 i() {
        return this.s;
    }

    public bzt_2 j() {
        return this.t;
    }

    public bzv_2 k() {
        return this.u;
    }

    public bkv_2 l() {
        return this.v;
    }
}

