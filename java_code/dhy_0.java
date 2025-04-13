/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dhY
 */
class dhy_0
extends akk_2 {
    dhy_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("dialog", "Name of the dialog to grip to (position will be relative to the dialog anchor point)", akg_2.c, false)};
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n != 1) {
            throw new LuaException("Invalid parameter count");
        }
        String string = this.i(0);
        fyb_0 fyb_02 = fpm_0.b().k(string);
        fbb_2 fbb_22 = fyb_02 instanceof fbb_2 ? (fbb_2)((Object)fyb_02) : fbb_2.aj;
        cZb.a.a(fbb_22);
    }

    @Override
    public String a() {
        return "setDialogGrip";
    }
}

