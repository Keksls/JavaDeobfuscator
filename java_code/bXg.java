/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

final class bXg
extends akk_2 {
    private static final Logger a = Logger.getLogger(bXg.class);
    private static final String b = "applyMount";
    private static final akf_1[] c = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("mountGfxId", null, akg_2.e, false), new akf_1("mountBreed", null, akg_2.e, false)};

    bXg(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        int n2 = this.d(1);
        int n3 = this.d(2);
        fas_0 fas_02 = fas_0.a((byte)n3);
        afe_0 afe_02 = (afe_0)afz_0.d().b(l);
        if (afe_02 != null) {
            try {
                bXg.a(afe_02, Integer.toString(n2), fas_02);
            }
            catch (gm_0 gm_02) {
                a.error((Object)"Exception levee", (Throwable)gm_02);
            }
            aOv aOv2 = new aOv(new aOu(UL.f, fas_02.a()));
            afe_02.a(aOv2);
        } else {
            this.a(a, "le mobile " + l + " n'existe pas ");
        }
    }

    private static void a(abu abu2, String string, fas_0 fas_02) {
        String string2 = "petGfxPath";
        String string3 = azs_0.a().a("petGfxPath");
        String string4 = String.format(string3, string);
        Anm anm = abu2.d(string4);
        abu2.a(anm, () -> abu2.e(aOt.a(fas_02.a())));
    }
}

