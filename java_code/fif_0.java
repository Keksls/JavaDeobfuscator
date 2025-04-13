/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from fiF
 */
public class fif_0<S extends fie_0> {
    private static final Logger b = Logger.getLogger(fif_0.class);
    protected final S a;

    public fif_0(S s2) {
        this.a = s2;
    }

    public void a(short s2) {
        ((fie_0)this.a).x = s2;
    }

    public void b(short s2) {
        ((fie_0)this.a).y = s2;
    }

    public void c(short s2) {
        ((fie_0)this.a).z = s2;
    }

    public void a(int n) {
        ((fie_0)this.a).A = n;
    }

    public void c(boolean bl) {
        ((fie_0)this.a).B = bl;
    }

    public void b(int n) {
        ((fie_0)this.a).C = n;
    }

    public void c(int n) {
        ((fie_0)this.a).D = n;
    }

    public void d(boolean bl) {
        ((fie_0)this.a).E = bl;
    }

    public void e(boolean bl) {
        ((fie_0)this.a).F = bl;
    }

    public void f(boolean bl) {
        ((fie_0)this.a).G = bl;
    }

    public void g(boolean bl) {
        ((fie_0)this.a).H = bl;
    }

    public void h(boolean bl) {
        ((fie_0)this.a).I = bl;
    }

    public void a(int[] nArray) {
        ((fie_0)this.a).K = nArray == null ? new TIntHashSet() : new TIntHashSet(nArray);
    }

    public void b(String string) {
        try {
            ((fie_0)this.a).L = eyS.c(string);
        }
        catch (Exception exception) {
            b.error((Object)("Erreur lors de la compilation des crit\u00e8res de l'\u00e9tat " + ((fie_0)this.a).p()), (Throwable)exception);
        }
    }

    public void i(boolean bl) {
        ((fie_0)this.a).M = bl;
    }

    public void a(byte by) {
        ((fie_0)this.a).N = by;
    }

    public void j(boolean bl) {
        ((fie_0)this.a).Q = bl;
    }

    public void d(short s2) {
        ((fie_0)this.a).R = s2;
    }

    public void d(int n) {
        ((fie_0)this.a).S = n;
    }

    public void b(byte by) {
        ((fie_0)this.a).O = epg.a(by);
    }

    public void k(boolean bl) {
        ((fie_0)this.a).U = bl;
    }

    public void l(boolean bl) {
        ((fie_0)this.a).J = bl;
    }

    public void b(int[] nArray) {
        for (int n : nArray) {
            ((fie_0)this.a).e(n);
        }
    }

    public void a(abc_2<efh_0> abc_22) {
        ((fie_0)this.a).T = abc_22;
    }

    public void c(String string) {
        String[] stringArray;
        ((fie_0)this.a).P = new ArrayList<rg_0>();
        if (string.trim().length() == 0) {
            return;
        }
        for (String string2 : stringArray = Cz.a(string, '~')) {
            if (fif_0.a(string2, ((fie_0)this.a).P)) continue;
            b.error((Object)("Impossible d'ajouter \u00e0 l'\u00e9tat " + ((fie_0)this.a).p() + " l'HMIAction :" + string2));
        }
    }

    private static boolean a(String string, Collection<rg_0> collection) {
        String[] stringArray = string.split("\\|", -1);
        if (stringArray.length % 2 != 0) {
            b.error((Object)("HMI error : Nombre de param\u00e8tres d\u00e9cod\u00e9s: " + stringArray.length + " Attendu: pair "));
            return false;
        }
        Byte by = 0;
        String string2 = "";
        boolean bl = false;
        for (int k = 0; k < stringArray.length; k += 2) {
            String string3 = stringArray[k];
            String string4 = stringArray[k + 1];
            if (string3.equals("type")) {
                by = Byte.parseByte(string4);
                continue;
            }
            if (string3.equals("data")) {
                string2 = string4;
                continue;
            }
            if (!string3.equals("broadcast")) continue;
            bl = Boolean.parseBoolean(string4);
        }
        rg_0 rg_02 = rh_0.a().a(by, string2, bl);
        if (rg_02 != null) {
            collection.add(rg_02);
            return true;
        }
        return false;
    }
}

