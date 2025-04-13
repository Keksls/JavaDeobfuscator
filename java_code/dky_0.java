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
 * Renamed from dkY
 */
class dky_0
extends akk_2 {
    dky_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "startInteractiveDialog";
    }

    @Override
    public String b() {
        return "Affiche une fen?tre de dialogue interactive";
    }

    @Override
    public akf_1[] e() {
        return dir_0.e;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        byte by = (byte)this.d(1);
        long l = this.g(2);
        cmw cmw2 = new cmw();
        cmw2.b(n2);
        cmw2.a(l);
        cmw2.a(by);
        azu_0.j().K().c(cmw2);
    }
}

