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
 * Renamed from djI
 */
class dji_0
extends akk_2 {
    dji_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "enableDragNDrop";
    }

    @Override
    public String b() {
        return "Permet de d\u00e9sactiver/r\u00e9activer le dragNDrop sur une List ou un RenderableContainer";
    }

    @Override
    public akf_1[] e() {
        return dir_0.E;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        fyy_0 fyy_02 = fpm_0.b().h().d(this.i(0));
        if (fyy_02 == null) {
            return;
        }
        fyb_0 fyb_02 = fyy_02.a(this.i(1));
        if (fyb_02 != null) {
            if (fyb_02 instanceof fsQ) {
                ((fsQ)fyb_02).setEnableDND(this.l(2));
            } else if (fyb_02 instanceof ftj_0) {
                ((ftj_0)fyb_02).setEnableDND(this.l(2));
            } else {
                this.a(dir_0.a, this.i(0) + "." + this.i(1) + " n'est pas du bon type !");
            }
        } else {
            this.a(dir_0.a, this.i(0) + "." + this.i(1) + " est introuvable !");
        }
    }
}

