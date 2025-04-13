/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkx
extends akk_2 {
    dkx(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeParticle";
    }

    @Override
    public String b() {
        return "Enl?ve un syst?me de particule sur un ?l?ment d'interface";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ab;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        fbx_1 fbx_12 = (fbx_1)dir_0.e().d.remove(n2);
        if (fbx_12 != null) {
            try {
                fbx_12.setTimeToLive(n == 2 ? this.d(1) : 100);
            }
            catch (Exception exception) {
                dir_0.a.error((Object)("Exception lev?e dans le removeParticle(" + n2 + ")"), (Throwable)exception);
            }
        } else {
            dir_0.a.warn((Object)("Impossible de trouver la particle " + n2 + " pour la supprimer"));
        }
    }
}

