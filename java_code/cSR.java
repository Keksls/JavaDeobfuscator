/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public abstract class cSR
extends cSS {
    public ArrayList<fbx_1> g() {
        boolean bl;
        ArrayList<fbx_1> arrayList = new ArrayList<fbx_1>();
        bMn bMn2 = bwy_2.h().j();
        if (bMn2 == null) {
            return arrayList;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        fbl_0 fbl_02 = cSR.j();
        if (fbl_02 == fbl_0.a && bmr_12.fE().t()) {
            return arrayList;
        }
        boolean bl2 = !this.y().isEmpty();
        boolean bl3 = !this.A().isEmpty();
        boolean bl4 = !this.x().isEmpty();
        boolean bl5 = bl = !this.z().isEmpty();
        if (fbl_02 == fbl_0.a) {
            if (this.i()) {
                arrayList.add(new cug_0("6001020.xps"));
            }
        } else if (bl2 && bl3 || bl4 && bl || bl2 && bl || bl3 && bl4) {
            arrayList.add(new cug_0("800224.xps"));
        } else if (bl4) {
            arrayList.add(new cug_0("800193.xps"));
        } else if (bl) {
            arrayList.add(new cug_0("800194.xps"));
        } else if (bl2) {
            arrayList.add(new cug_0("800222.xps"));
        } else if (bl3) {
            arrayList.add(new cug_0("800223.xps"));
        }
        return arrayList;
    }

    @Override
    @Nullable
    public String h() {
        List<fde> list;
        List<fde> list2;
        List<fde> list3;
        List<fde> list4;
        bMn bMn2 = bwy_2.h().j();
        if (bMn2 == null) {
            return null;
        }
        fbl_0 fbl_02 = cSR.j();
        if (fbl_02 == fbl_0.a && azu_0.j().k().fE().t()) {
            return null;
        }
        ani_2 ani_22 = new ani_2();
        boolean bl = this.i();
        if (bl) {
            ani_22.i().a(h);
            ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("desc.mru.illegalAction", new Object[0]));
            ani_22.j();
        }
        if (!(list4 = this.x()).isEmpty()) {
            ani_22.m().i().a(g);
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.good", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list4, g, bl);
        }
        if (!(list3 = this.z()).isEmpty()) {
            ani_22.m().i().a(h);
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.bad", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list3, h, bl);
        }
        if (!(list2 = this.y()).isEmpty()) {
            ani_22.m().i().a("9ed34b");
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.probablyGood", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list2, "9ed34b", bl);
        }
        if (!(list = this.A()).isEmpty()) {
            ani_22.m().i().a("f48140");
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.probablyBad", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list, "f48140", bl);
        }
        return ani_22.q() > 0 ? ani_22.r() : null;
    }

    public static void a(ani_2 ani_22, Iterable<fde> iterable, String string, boolean bl) {
        for (fde fde2 : iterable) {
            boolean bl2 = fde2.b() > 0;
            ani_22.m().i();
            ani_22.a(string);
            ani_22.a((CharSequence)("    " + bae.h().a(97, (long)((int)fde2.a()), new Object[0])));
            if (bl) {
                ani_22.j();
                return;
            }
            ani_22.a().a((CharSequence)(" (" + (bl2 ? "+" : "") + fde2.e() + "%/" + (bl2 ? "+" : "") + fde2.b()));
            try {
                ani_22.a((CharSequence)(fkq_1.a(bac.a(9), -1, -1, "north", "citizenScore") + ")"));
            }
            catch (gm_0 gm_02) {
                b.error((Object)"erreur au chargement de l'icon de citizen");
            }
            ani_22.b().j();
        }
    }

    protected boolean i() {
        if (cSR.j() != fbl_0.a) {
            return false;
        }
        List<fde> list = this.z();
        List<fde> list2 = this.A();
        return !list.isEmpty() || !list2.isEmpty();
    }

    @Nullable
    public static fbl_0 j() {
        bMn bMn2 = bwy_2.h().j();
        if (bMn2 == null) {
            return null;
        }
        faX faX2 = bMn2.D();
        if (faX2 == faX.i) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        faV faV2 = bmr_12.fE();
        return faV2.m().F().c(faX2.c());
    }

    private static boolean w() {
        bMn bMn2 = bwy_2.h().j();
        if (bMn2 == null) {
            return false;
        }
        return bMn2.H();
    }

    private List<fde> x() {
        if (!cSR.w()) {
            return Collections.emptyList();
        }
        return fde.b(this.k());
    }

    private List<fde> y() {
        return fde.b(this.l());
    }

    private List<fde> z() {
        if (!cSR.w()) {
            return Collections.emptyList();
        }
        return fde.c(this.k());
    }

    private List<fde> A() {
        return fde.c(this.l());
    }

    @Nullable
    public abstract List<fde> k();

    @Nullable
    public abstract List<fde> l();

    public /* synthetic */ Iterable m() {
        return this.g();
    }
}

