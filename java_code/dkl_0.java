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
 * Renamed from dkl
 */
class dkl_0
extends akk_2 {
    dkl_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "pushPetMessage";
    }

    @Override
    public String b() {
        return "[Obsol?te] Ouvre une bulle de dialogue G?lutin au dessus du joueur";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aO;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        try {
            boolean bl;
            akr_2[] akr_2Array;
            int n2;
            String string;
            if (n < 1) {
                dir_0.a.warn((Object)"On utilise PushPetMessage sans argument !");
                return;
            }
            int n3 = this.d(0);
            if (n3 == 0) {
                string = bae.h().a(this.i(1), new Object[0]);
            } else {
                String[] stringArray = new String[n3 - 1];
                for (n2 = 1; n2 < stringArray.length; ++n2) {
                    akr_2Array = this.k(n2);
                    stringArray[n2 - 1] = akr_2Array;
                }
                string = bae.h().a(this.i(1), stringArray);
            }
            boolean bl2 = bl = n == 2 || this.l(2);
            if (n < 4) {
                ddB.a().a(string, bl, 0L, bly_0.a);
                return;
            }
            n2 = 3;
            akr_2Array = this.a(n2, n);
            if (akr_2Array[0].a() == akg_2.e) {
                ddB.a().a(string, bl, this.d(n2), bly_0.a);
                ++n2;
            } else {
                ddB.a().a(string, bl, 0L, bly_0.a);
            }
            String string2 = this.i(n2);
            akr_2[] akr_2Array2 = this.a(n2 + 1, n);
            akx_2 akx_22 = this.m();
            String string3 = "petBubbleDialog";
            fzu fzu2 = (fzu)anl_0.a().a(akx_22, "petBubbleDialog", null, null, string2);
            if (fzu2 == null) {
                fzu2 = new dkm_0(this, akx_22, string2, akr_2Array2);
                anl_0.a().a(akx_22, "petBubbleDialog", null, null, string2, fzu2);
                ddB.a().a(fzu2);
            } else {
                ((did_0)fzu2).a(akr_2Array2);
                fzu fzu3 = ddB.a().d();
                if (fzu3 == null || fzu3 != fzu2) {
                    ddB.a().a(fzu2);
                }
            }
        }
        catch (Exception exception) {
            dir_0.a.error((Object)"Exception lev?e lors de l'ajout d'un message de familier", (Throwable)exception);
        }
    }
}

