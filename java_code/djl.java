/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class djl
extends akk_2 {
    djl(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "changeCursor";
    }

    @Override
    public String b() {
        return "Change le curseur de la souris.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ad;
    }

    @Override
    public akf_1[] f() {
        return dir_0.ae;
    }

    @Override
    protected void a(int n) {
        frb_0 frb_02;
        String string = this.i(0);
        try {
            frb_02 = frb_0.valueOf(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            if ("SPELL".equals(string)) {
                frb_02 = frb_0.l;
            }
            this.a(dir_0.a, "Unknown cursor type: " + string);
            frb_02 = frb_0.a;
        }
        fyt_0.a().c();
        fyt_0.a().a(frb_02, true);
        String string2 = "DEFAULT";
        this.a("DEFAULT");
    }
}

