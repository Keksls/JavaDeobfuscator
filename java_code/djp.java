/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djp
extends akk_2 {
    djp(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "clearParticles";
    }

    @Override
    public String b() {
        return "Enl?ve tous les syst?mes de particule sur un ?l?ment d'interface";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ac;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        String string2 = this.i(1);
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            dir_0.a.error((Object)("[ClearParticles] Impossible de retrouver l'interface d'id=" + string));
            return;
        }
        fvE fvE2 = (fvE)fyy_02.a(string2);
        if (fvE2 == null) {
            dir_0.a.error((Object)("[ClearParticles] Impossible de retrouver le widget d'id=" + string2 + " dans l'interface d'id=" + string));
            return;
        }
        ArrayList<fbx_1> arrayList = new ArrayList<fbx_1>();
        for (fyb_0 fyb_02 : fvE2.getAppearance().getChildren()) {
            if (!(fyb_02 instanceof fbx_1)) continue;
            arrayList.add((fbx_1)fyb_02);
        }
        for (fbx_1 fbx_12 : arrayList) {
            fbx_12.setTimeToLive(100);
        }
    }
}

