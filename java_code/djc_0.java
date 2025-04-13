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
 * Renamed from djC
 */
class djc_0
extends akk_2 {
    djc_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "displaySmiley";
    }

    @Override
    public String b() {
        return "Affiche le smiley sp?cifi? au-dessus d'un mobile";
    }

    @Override
    public final akf_1[] e() {
        return dir_0.aF;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public final void a(int n) {
        if (n < 2) {
            dir_0.a.warn((Object)"On utilise displaySmiley sans argument !");
            return;
        }
        int n2 = n > 2 ? this.d(2) : -1;
        cww_0.b(this.d(0), this.g(1), n2);
    }
}

