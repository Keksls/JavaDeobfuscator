/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aKT
 */
public final class akt_1 {
    private static Logger b = Logger.getLogger((String)"ParticleScripts");
    private static final akt_1 c = new akt_1();
    private static final String d = "particles/";

    private akt_1() {
    }

    public static akt_1 a() {
        return c;
    }

    public String a(int n) {
        assert (aks_1.a().e() != null);
        return String.format("%s%d%s", d, n, aks_1.a().c());
    }

    @Nullable
    private akx_2 b(int n) {
        return aks_1.a().a(this.a(n), (akr_1[])null, true);
    }

    public boolean a(int n, int[] nArray) {
        akr_2[] akr_2Array = this.a(n, nArray, "playAps");
        if (akr_2Array == null) {
            return false;
        }
        if (akr_2Array.length == 0) {
            return false;
        }
        akr_2 akr_22 = akr_2Array[0];
        if (akr_22.a() != akg_2.f) {
            return false;
        }
        return (Boolean)akr_2Array[0].b();
    }

    private akr_2[] a(int n, int[] nArray, String string) {
        akx_2 akx_22 = this.b(n);
        if (akx_22 == null) {
            return null;
        }
        akr_2[] akr_2Array = new akr_2[nArray.length];
        for (int k = 0; k < akr_2Array.length; ++k) {
            akr_2Array[k] = new akr_2(nArray[k]);
        }
        akr_2[] akr_2Array2 = akx_22.a(string, akr_2Array, new akq_1[0]);
        akx_22.a();
        return akr_2Array2;
    }

    public void b() {
    }
}

