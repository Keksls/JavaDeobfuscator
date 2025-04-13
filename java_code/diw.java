/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class diw
extends akk_2 {
    private static final Logger a = Logger.getLogger(diw.class);

    diw(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "closeBubbleAttachedTo";
    }

    @Override
    public String b() {
        return "Hide all WakfuBubbles linked to a mobile";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("characterId", null, akg_2.b, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        abz_0 abz_02 = afz_0.d().b(l);
        if (abz_02 == null) {
            abz_02 = ahs.d().b(l);
        }
        if (abz_02 == null) {
            this.a(a, "mobile ou IE " + l + " inexistant");
            return;
        }
        Collection<fvy> collection = dip.a().a(abz_02);
        for (fvy fvy2 : collection) {
            div.b(fvy2.getAdviserId());
        }
        aun_0.a(l);
    }
}

