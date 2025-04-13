/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class bZM
extends akk_2 {
    private static final Logger a = Logger.getLogger(bZM.class);
    private static final String b = "addActionToPendingGroup";
    private static final String c = "Permet d'ajouter une action au groupe d'actions du combat du joueur et qui va executer la fonction pass?e en param?tre sur une certaine dur?e";
    private static final akf_1[] d = new akf_1[]{new akf_1("fighterId", null, akg_2.b, false), new akf_1("actionDuration", null, akg_2.b, false), new akf_1("functionName", null, akg_2.c, false), new akf_1("functionParams", null, akg_2.h, true)};

    bZM(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        long l2 = this.g(1);
        String string = this.i(2);
        akr_2[] akr_2Array = this.a(3, n);
        akx_2 akx_22 = this.m();
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            a.warn((Object)("Impossible d'executer la fonction, Fighter inconnu : " + l));
            return;
        }
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 == null) {
            a.warn((Object)("Impossible d'executer la fonction, le fighter n'est pas en combat " + l));
            return;
        }
        bZN bZN2 = new bZN(this, alc_1.q(), emd_1.ae.a(), 0, akx_22, string, akr_2Array, l2);
        baa_0.a().a(bvx_22, (aku_1)bZN2);
        baa_0.a().a(bvx_22);
    }

    @Override
    public String b() {
        return c;
    }
}

