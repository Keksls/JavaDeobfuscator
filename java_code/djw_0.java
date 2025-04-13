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
 * Renamed from djw
 */
class djw_0
extends akk_2 {
    private final djx a = new djx(this);
    private int b;
    private int c = 1;

    djw_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayCountdown";
    }

    @Override
    public String b() {
        return "Affiche un d?compte";
    }

    @Override
    public akf_1[] e() {
        return dir_0.p;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    void g() {
        dlx.a().a(new dlw(dly.f, String.valueOf(this.b), this.b * 1000));
        this.b -= this.c;
    }

    @Override
    public void a(int n) {
        this.b = this.d(0);
        this.c = n == 2 ? this.d(1) : 1;
        this.g();
        adi_2.a().a(this.a, (long)this.c * 1000L, -1, this.b / this.c + 1);
    }
}

