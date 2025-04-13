/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYq
 */
class byq_0
extends akk_2 {
    byq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("elementId", null, akg_2.b, false)};
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return new akf_1[]{new akf_1("directionIndex", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 != null) {
            this.q(ahv2.aC().l);
        } else {
            this.a(byh_0.a, "l'element interactif d'id " + l + " n'existe pas...");
            this.l();
        }
    }

    @Override
    public String a() {
        return "getInteractiveElementDirection";
    }
}

