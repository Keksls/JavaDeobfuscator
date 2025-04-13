/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkL
extends akk_2 {
    dkL(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setShortcutUsable";
    }

    @Override
    public akf_1[] e() {
        return dir_0.as;
    }

    @Override
    public String b() {
        return "Active/d?sactive le ou les raccourcis de la ou des barres de raccourcis sp?cifi?es";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n < 1) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bOw bOw2 = bmr_12.cg();
        boolean bl = this.l(0);
        if (n == 1) {
            for (bOv bOv2 : bOw2.c(false)) {
                bOv2.c(bl);
            }
            for (bOv bOv2 : bOw2.d(false)) {
                bOv2.c(bl);
            }
        } else {
            dkM dkM2;
            String string = this.i(1);
            try {
                dkM2 = dkM.valueOf(string);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                dir_0.a.error((Object)("Impossible de retrouver le type de barre de raccourci suivant : " + string));
                return;
            }
            if (n == 2) {
                if (dkM2.b()) {
                    for (bOv bOv3 : bOw2.c(false)) {
                        bOv3.c(bl);
                    }
                }
                if (dkM2.c()) {
                    for (bOv bOv3 : bOw2.d(false)) {
                        bOv3.c(bl);
                    }
                }
                if (dkM2.a()) {
                    bOw2.A().a(bl);
                    bOw2.B().a(bl);
                }
            } else {
                byte by = (byte)this.d(2);
                bOv bOv4 = bOw2.c(by);
                bOv bOv5 = bOw2.d(by);
                if (n == 3) {
                    if (bOv5 != null && dkM2.b()) {
                        bOv5.c(bl);
                    }
                    if (bOv4 != null && dkM2.c()) {
                        bOv4.c(bl);
                    }
                } else if (n == 4) {
                    short s2 = (short)this.d(3);
                    if (bOv5 != null && dkM2.b()) {
                        bOv5.b(s2).a(bl);
                    }
                    if (bOv4 != null && dkM2.c()) {
                        bOv4.b(s2).a(bl);
                    }
                }
            }
        }
    }
}

