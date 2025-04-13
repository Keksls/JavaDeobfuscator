/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYE
 */
public class bye_0
extends akr_1 {
    static final akf_1[] a = new akf_1[]{new akf_1("posX", null, akg_2.d, false), new akf_1("posY", null, akg_2.d, false), new akf_1("posZ", null, akg_2.d, false)};
    final bci_0 d;

    @Override
    public final String a() {
        return "ItemAction";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public bye_0(bci_0 bci_02) {
        this.d = bci_02;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bYG(this, luaState), new byf_0(luaState), new byj_0(luaState), new bYH(luaState), new byl_0(this, luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

