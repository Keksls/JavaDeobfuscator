/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkA
extends akk_2 {
    dkA(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeShortcut";
    }

    @Override
    public String b() {
        return "Enl?ve le raccourci sp?cifi? des barres de raccourcis";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ai;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        int n2 = this.d(0);
        fie fie2 = fie.a((byte)this.d(1));
        bmr_12.cg().a(n2, fie2, true);
    }
}

