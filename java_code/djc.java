/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djc
extends akk_2 {
    djc(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "AddItemShortcut";
    }

    @Override
    public String b() {
        return "Ajoute un raccourci d'item donn\u00e9 aux barres de raccourci";
    }

    @Override
    public akf_1[] e() {
        return dir_0.al;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        Object object;
        exk_2 exk_22;
        boolean bl;
        bmr_1 bmr_12 = azu_0.j().k();
        String string = this.i(0);
        long l = this.g(1);
        boolean bl2 = bl = n > 2;
        if ("uid".equalsIgnoreCase(string)) {
            exk_22 = bmr_12.da().i(l);
        } else if ("refId".equalsIgnoreCase(string)) {
            object = bmr_12.da().i((int)l);
            exk_22 = object.toArray(new exk_2[0])[0];
        } else {
            dir_0.a.warn((Object)("Type de r\u00e9f\u00e9rence (uid, ref id) inconnu pour ajouter un item : " + string));
            return;
        }
        if (exk_22 == null) {
            return;
        }
        object = bmr_12.cg();
        fid fid2 = ((bOw)object).b();
        bjw_1 bjw_12 = (bjw_1)exk_22.T();
        if (!(exk_22.W() && fid2 == fid.a || fid2 == fid.b && (bjw_12.b().a() || exk_22.V()))) {
            if (!(exk_22.V() || exk_22.W() || bjw_12.b().a())) {
                return;
            }
            dhy dhy2 = new dhy();
            dhy2.b(exk_22);
            dhy2.b(true);
            dhy2.c(-1);
            dhy2.d(-1);
            dhy2.a(false);
            dhy2.a_(19194);
            add_2.b().a(dhy2);
            return;
        }
        bOv bOv2 = fid2 == fid.b ? ((bOw)object).g() : ((bOw)object).k();
        int n2 = -1;
        if (bl && !bOv2.a((short)(n2 = (int)((short)this.d(2))))) {
            bl = false;
        }
        dhy dhy3 = new dhy();
        dhy3.b(exk_22);
        dhy3.b(true);
        dhy3.c(((bOw)object).a(bOv2));
        dhy3.d(bl ? n2 : -1);
        dhy3.a(false);
        dhy3.a_(19194);
        add_2.b().a(dhy3);
    }
}

