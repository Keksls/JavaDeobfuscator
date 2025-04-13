/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dke
extends akk_2 {
    dke(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "manageSkillMRU";
    }

    @Override
    public String b() {
        return "Active/Desactive une action MRU";
    }

    @Override
    public akf_1[] e() {
        return dir_0.t;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        fii fii2 = fij.a().a(n2);
        if (fii2 == null) {
            dir_0.a.error((Object)("[GD] Mauvais param?tre, le visuel " + n2 + " n'existe pas"));
            return;
        }
        fii2.a(this.l(1));
    }
}

