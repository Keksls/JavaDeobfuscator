/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkJ
extends akk_2 {
    dkJ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setShortcutBarType";
    }

    @Override
    public String b() {
        return "Permet de changer le type de la barre de raccourci (Combat ou objet)";
    }

    @Override
    public akf_1[] e() {
        return dir_0.bh;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        if (n < 1) {
            dir_0.a.warn((Object)"setShortcutBarType: le type de barre \u00e0 afficher est obligatoire");
            return;
        }
        int n2 = this.d(0);
        bOw bOw2 = azu_0.j().k().cg();
        switch (n2) {
            case 0: {
                fid fid2 = bOw2.b() == fid.a ? fid.b : fid.a;
                bOw2.a(fid2, true);
                break;
            }
            case 1: {
                if (bOw2.b() == fid.a) break;
                bOw2.a(fid.a, true);
                break;
            }
            case 2: {
                if (bOw2.b() == fid.b) break;
                bOw2.a(fid.b, true);
                break;
            }
            default: {
                dir_0.a.error((Object)"setShortcutBarType: Param\u00e8tre invalide");
            }
        }
    }
}

