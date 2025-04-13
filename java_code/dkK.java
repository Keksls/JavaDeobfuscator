/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkK
extends akk_2 {
    dkK(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setShortcutEnabled";
    }

    @Override
    public String b() {
        return "Permet d'activer/d?sactiver l'ensemble, un groupe ou un unique raccourci (voir le fichier shortcuts.xml). Si aucune id n'est pr?cis?e dans le raccourci, vous pouvez en rajouter une.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ay;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string;
        boolean bl = this.l(0);
        String string2 = n >= 2 ? this.i(1) : null;
        String string3 = string = n >= 3 ? this.i(2) : null;
        if (n == 1) {
            aZG.e().a(bl);
        } else if (n == 2) {
            aZG.e().a(string2, bl);
        } else if (n == 3) {
            aZG.e().b(string, bl);
        }
    }
}

