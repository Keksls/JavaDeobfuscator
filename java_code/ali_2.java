/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aLi
 */
public final class ali_2
extends akk_2 {
    private static final Logger b = Logger.getLogger(ali_2.class);
    public static final String a = "executeScript";
    private static final akf_1[] c = new akf_1[]{new akf_1("ScriptName", null, akg_2.d, false), new akf_1("Params", null, akg_2.g, false)};
    private static final akf_1[] d = new akf_1[]{new akf_1("executionTime", null, akg_2.b, false)};
    private static final String g = "execution_Time";

    public ali_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return d;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        if (n2 == 0 || n2 == -1) {
            this.q(0);
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        akr_2[] akr_2Array = this.j(1);
        if (akr_2Array.length % 2 != 0) {
            this.a(b, "La liste des parametres du script n'est pas paire, il faut (nom, valeur) pour chaque parametre");
            this.b(0L);
            return;
        }
        for (int k = 0; k < akr_2Array.length; k += 2) {
            hashMap.put((String)akr_2Array[k].b(), akr_2Array[k + 1].b());
        }
        hashMap.put("fightId", this.m().o());
        akr_1[] akr_1Array = this.m().p();
        try {
            akr_2[] akr_2Array2 = new akr_2[1];
            akx_2 akx_22 = aks_1.a().a(n2, akr_1Array, hashMap, ali_2.a(akr_2Array2), false);
            if (akx_22 == null) {
                this.a(b, n2 + " inconnu ");
                this.b(0L);
                return;
            }
            akr_2 akr_22 = akr_2Array2[0] != null ? akr_2Array2[0] : akx_22.c(g);
            if (akr_22 == null || akr_22.a() != akg_2.e) {
                this.b(0L);
                return;
            }
            this.b(((Double)akr_22.b()).longValue());
        }
        catch (AssertionError assertionError) {
            b.error((Object)"ERREUR CRITIQUE DANS UN SCRIPT", (Throwable)((Object)assertionError));
        }
    }

    private static ake_1 a(akr_2[] akr_2Array) {
        return new alj_2(akr_2Array);
    }
}

