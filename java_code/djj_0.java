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
 * Renamed from djj
 */
class djj_0
extends akk_2 {
    djj_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addSpellShortcut";
    }

    @Override
    public String b() {
        return "Ajoute un lien vers un sort dans la barre de raccourcis active.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ak;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        Object c2;
        bmr_1 bmr_12 = azu_0.j().k();
        String string = this.i(0);
        long l = this.g(1);
        short s2 = -1;
        boolean bl = n > 2;
        bOv bOv2 = bmr_12.cg().d((byte)0);
        if (bl && !bOv2.a(s2 = (short)((short)this.d(2)))) {
            bl = false;
        }
        if (!bl) {
            s2 = bOv2.b();
        }
        if (s2 == -1) {
            return;
        }
        fiz<bpl_0> fiz2 = bmr_12.aZ();
        if (fiz2 == null) {
            dir_0.a.warn((Object)("No spell inventory when trying to add spell : " + string + " for player " + bmr_12.a_() + "/" + bmr_12.R()));
            return;
        }
        if ("uid".equalsIgnoreCase(string)) {
            c2 = fiz2.e(l);
            if (c2 == null) {
                return;
            }
        } else if ("refId".equalsIgnoreCase(string)) {
            c2 = fiz2.c((int)l);
            if (c2 == null) {
                return;
            }
        } else {
            dir_0.a.warn((Object)("Reference type (uid, ref id) unknown when trying to add a spell : " + string));
            return;
        }
        dhy dhy2 = new dhy();
        dhy2.b(c2);
        dhy2.b(true);
        dhy2.c(bmr_12.cg().a(bOv2));
        dhy2.d(s2);
        dhy2.a(false);
        dhy2.a_(19194);
        add_2.b().a(dhy2);
    }
}

