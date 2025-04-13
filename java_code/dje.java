/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class dje
extends akk_2 {
    dje(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addLandMarkNote";
    }

    @Override
    public String b() {
        return "Ajoute une note personnelle";
    }

    @Override
    public akf_1[] e() {
        return dir_0.i;
    }

    @Override
    public final akf_1[] f() {
        return dir_0.f;
    }

    @Override
    public void a(int n) {
        String string = bae.h().a(this.i(0), new Object[0]);
        int n2 = this.d(1);
        int n3 = this.d(2);
        int n4 = this.d(3);
        int n5 = 0;
        if (n >= 5) {
            n5 = this.d(4);
        }
        boolean bl = false;
        if (n >= 6) {
            bl = this.l(5);
        }
        buo_0 buo_02 = ble_1.E().z().a(n3, n4, n5, n2, string, bl);
        this.q(buo_02.a());
    }
}

