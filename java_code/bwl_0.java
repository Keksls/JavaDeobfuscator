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
 * Renamed from bWL
 */
class bwl_0
extends akk_2 {
    bwl_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addSpellToSpellDeck";
    }

    @Override
    public String b() {
        return "Add a spell on the current player's deck.";
    }

    @Override
    public akf_1[] e() {
        return bwk_0.s;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = bmr_12.C();
        fiL fiL2 = new fiL();
        boolean bl = fiL2.a(bmr_12.a_(), n2, n4, n3);
        if (bl) {
            cqF cqF2 = new cqF(bmr_12.a_(), n2, n4, n3);
            azu_0.j().K().c(cqF2);
        } else {
            this.a(bwk_0.t(), "Le sort " + n2 + " ne peut pas \u00eatre ajout\u00e9 au deck (mauvais sort ou slot non d\u00e9bloqu\u00e9)");
        }
    }
}

