/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.io.IOException;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cas
 */
public class cas_1
extends akk_2 {
    private static final Logger a = Logger.getLogger(cas_1.class);
    private static final String b = "createAnimatedElement";
    private static final String c = "Create an AnimatedElementWithDirection at the specified position (client only)";
    private static final akf_1[] d = new akf_1[]{new akf_1("type", null, akg_2.c, false), new akf_1("spriteName", null, akg_2.c, false), new akf_1("worldX", null, akg_2.d, false), new akf_1("worldY", null, akg_2.d, false), new akf_1("altitude", null, akg_2.d, false), new akf_1("direction", null, akg_2.d, false), new akf_1("animName", null, akg_2.c, true)};
    private static final akf_1[] g = new akf_1[]{new akf_1("elementId", null, akg_2.b, false)};

    public cas_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public String b() {
        return c;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public final akf_1[] f() {
        return g;
    }

    @Override
    public void a(int n) {
        String string = this.i(0);
        String string2 = this.i(1);
        int n2 = this.d(2);
        int n3 = this.d(3);
        int n4 = this.d(4);
        int n5 = this.d(5);
        String string3 = n >= 7 ? this.i(6) : "AnimStatique_1";
        long l = cas_1.g();
        while (abe_0.d().b(l) != null) {
            a.warn((Object)("There is already an element with this id " + l));
            l = cas_1.g();
        }
        aby_0 aby_02 = new aby_0(l, n2, n3, n4);
        try {
            aby_02.a(cas_1.a(string, string2), true);
        }
        catch (IOException iOException) {
            a.error((Object)"", (Throwable)iOException);
            this.l();
            return;
        }
        aej_2 aej_22 = aej_2.a(n5);
        if (aej_22 == aej_2.k) {
            aej_22 = aej_2.b;
        }
        aby_02.a(aej_22);
        aby_02.a(string + "/" + string2);
        aby_02.g(ahi_0.j.a());
        aby_02.e(string3);
        abe_0.d().a(aby_02);
        this.b(l);
    }

    private static long g() {
        return abd_1.c();
    }

    private static String b(String string) {
        if (string.equals("interactives")) {
            return "ANMInteractiveElementPath";
        }
        if (string.equals("resources")) {
            return "ANMResourcePath";
        }
        if (string.equals("npcs")) {
            return "npcGfxPath";
        }
        if (string.equals("pets")) {
            return "petGfxPath";
        }
        if (string.equals("players")) {
            return "playerGfxPath";
        }
        if (string.equals("dynamics")) {
            return "ANMDynamicElementPath";
        }
        return null;
    }

    public static String a(String string, String string2) {
        String string3 = cas_1.b(string.toLowerCase());
        try {
            if (string3 != null) {
                String string4 = azs_0.a().a(string3);
                return String.format(string4, string2);
            }
        }
        catch (gm_0 gm_02) {
            a.error((Object)("Problem with type " + string), (Throwable)gm_02);
        }
        a.error((Object)("Unknown type : " + string));
        return string + "/" + string2;
    }
}

