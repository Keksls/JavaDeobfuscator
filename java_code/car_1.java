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
 * Renamed from car
 */
public class car_1
extends akk_2 {
    public static final String a = "getPartInSight";
    public static final String b = "Retourne la partie du corps du mobile orient\u00e9 vers la position donn\u00e9e";
    private static final akf_1[] c = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("x", null, akg_2.d, false), new akf_1("y", null, akg_2.d, false)};
    private static final akf_1[] d = new akf_1[]{new akf_1("partId", null, akg_2.d, false)};

    public car_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return c;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return d;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        int n2 = this.d(1);
        int n3 = this.d(2);
        afv afv2 = afz_0.d().b(l);
        if (!(afv2 instanceof biI)) {
            this.l();
            return;
        }
        biI biI2 = (biI)afv2;
        blx_1 blx_12 = biI2.bI();
        if (blx_12 == null) {
            this.l();
            return;
        }
        un_0 un_02 = blx_12.k().a(n2, n3, (short)0);
        this.q(un_02.a());
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return b;
    }
}

