/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djM
extends akk_2 {
    djM(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getLOD";
    }

    @Override
    public String b() {
        return "Fourni le niveau de d?tails actuel du jeu";
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return dir_0.aV;
    }

    @Override
    protected void a(int n) {
        this.q(acs_0.b().k());
    }
}

