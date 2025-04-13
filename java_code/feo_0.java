/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from feO
 */
public class feo_0 {
    private static final Logger a = Logger.getLogger(feo_0.class);
    private static final TIntIntHashMap b = new TIntIntHashMap();
    private static final Map<Long, fem_0> c = new HashMap<Long, fem_0>();
    private final TIntObjectHashMap<fem_0> d = new TIntObjectHashMap();
    private final fej_0 e;

    public feo_0(faX faX2) {
        this.e = new fej_0(faX2);
    }

    private void b(fem_0 fem_02) {
        this.d.put(fem_02.a(), (Object)fem_02);
        c.put(fem_02.k(), fem_02);
        this.e.a(fem_02.a(), fem_02.e());
        b.put(fem_02.a(), fem_02.c());
        fem_02.b().e(fem_02.a());
    }

    private void c(fem_0 fem_02) {
        this.d.remove(fem_02.a());
        c.remove(fem_02.k());
        this.e.a(fem_02.a());
        b.remove(fem_02.a());
    }

    private void b(int n, fgi_0 fgi_02, long l) {
        this.e.a(fgi_02, l);
    }

    private void b(int n, fjb_0 fjb_02, int n2) {
        this.e.a(fjb_02, n2);
    }

    private void b(int n, long l) {
        ((fem_0)this.d.get(n)).a(l);
        this.e.a(n, ((fem_0)this.d.get(n)).e());
    }

    private void b(int n, boolean bl) {
        fem_0 fem_02 = (fem_0)this.d.get(n);
        if (fem_02 == null) {
            a.error((Object)("Unable to find protector " + n));
            return;
        }
        fem_02.a(bl);
    }

    private void c(int n, int n2) {
        fem_0 fem_02 = (fem_0)this.d.get(n);
        if (fem_02 == null) {
            a.error((Object)("Mise a jour de la satisfaction d'un protecteur inconnu " + n));
            return;
        }
        fem_02.a(n2);
    }

    private void b(int n, fjb_0 fjb_02, float f2) {
        ((fem_0)this.d.get(n)).a(fjb_02, f2);
    }

    private void a(int n, faX faX2) {
        fem_0 fem_02 = (fem_0)this.d.get(n);
        this.c(fem_02);
        fem_02.a(faX2);
        faX2.E().b(fem_02);
    }

    public boolean a(int n) {
        return this.d.containsKey(n);
    }

    public fem_0 b(int n) {
        return (fem_0)this.d.get(n);
    }

    public static fem_0 c(int n) {
        return c.get(n);
    }

    public TIntObjectIterator<fem_0> a() {
        return this.d.iterator();
    }

    public int b() {
        return this.d.size();
    }

    public fej_0 c() {
        return this.e;
    }

    public int d() {
        return this.d.size();
    }

    public void e() {
        Object[] objectArray = this.d.values();
        for (int k = 0; k < objectArray.length; ++k) {
            this.c((fem_0)objectArray[k]);
        }
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.d.size());
        TIntObjectIterator tIntObjectIterator = this.d.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((fem_0)tIntObjectIterator.value()).b(byteBuffer);
        }
    }

    public void b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.b(fem_0.a(byteBuffer));
        }
    }

    public int f() {
        return 4 + this.d.size() * fem_0.j();
    }

    public static void a(fem_0 fem_02) {
        int n = fem_02.c();
        int n2 = fem_02.a();
        faX faX2 = fbc_0.a.a(n);
        if (faX2 == null) {
            a.error((Object)("Nation " + n + " inconnue pour le protecteur " + n2));
            return;
        }
        feo_0 feo_02 = faX2.E();
        fem_0 fem_03 = (fem_0)feo_02.d.get(n2);
        if (fem_03 != null) {
            a.warn((Object)("Demande de remplacement des informations du protecteur " + fem_03));
            feo_02.c(fem_03);
            return;
        }
        a.info((Object)("Enregistrement du protecteur " + fem_02));
        feo_02.b(fem_02);
    }

    public static void a(int n, long l, int n2, boolean bl, long l2, float f2, int n3, int n4, String string) {
        faX faX2 = fbc_0.a.a(n2);
        if (faX2 == null) {
            a.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        feo_0 feo_02 = faX2.E();
        fem_0 fem_02 = (fem_0)feo_02.d.get(n);
        if (fem_02 != null) {
            a.warn((Object)("Demande de remplacement des informations du protecteur " + fem_02));
            feo_02.c(fem_02);
            return;
        }
        fem_0 fem_03 = new fem_0(n, l, faX2, bl, l2, f2, n3, n4, string);
        a.info((Object)("Enregistrement du protecteur " + fem_03));
        feo_02.b(fem_03);
    }

    public static void a(int n, fgi_0 fgi_02, long l) {
        int n2 = b.get(n);
        faX faX2 = fbc_0.a.a(n2);
        if (faX2 == null) {
            a.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        feo_0 feo_02 = faX2.E();
        a.info((Object)("Achat d'un item de type " + fgi_02 + " au prix de " + l + " sur le protecteur " + n));
        feo_02.b(n, fgi_02, l);
    }

    public static void a(int n, fjb_0 fjb_02, int n2) {
        int n3 = b.get(n);
        faX faX2 = fbc_0.a.a(n3);
        if (faX2 == null) {
            a.error((Object)("Nation " + n3 + " inconnue pour le protecteur " + n));
            return;
        }
        feo_0 feo_02 = faX2.E();
        a.info((Object)("Taxes de type " + fjb_02 + " d'un montant de " + n2 + " pr\u00e9lev\u00e9es pour le protecteur " + n));
        feo_02.b(n, fjb_02, n2);
    }

    public static void a(int n, long l) {
        int n2 = b.get(n);
        faX faX2 = fbc_0.a.a(n2);
        if (faX2 == null) {
            a.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        feo_0 feo_02 = faX2.E();
        a.info((Object)("Update de wallet du protecteur " + n + " pour un montant de " + l));
        feo_02.b(n, l);
    }

    public static void a(int n, boolean bl) {
        int n2 = b.get(n);
        faX faX2 = fbc_0.a.a(n2);
        if (faX2 == null) {
            a.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        feo_0 feo_02 = faX2.E();
        a.info((Object)("Update de chaos du protecteur " + n + ", chaos = " + bl));
        feo_02.b(n, bl);
    }

    public static void a(int n, int n2) {
        int n3 = b.get(n);
        faX faX2 = fbc_0.a.a(n3);
        if (faX2 == null) {
            a.error((Object)("Nation " + n3 + " inconnue pour le protecteur " + n));
            return;
        }
        feo_0 feo_02 = faX2.E();
        a.info((Object)("Update de la satisfaction du protecteur " + n + ". Nouvelle satisfaction : " + n2));
        feo_02.c(n, n2);
    }

    public static void a(int n, fjb_0 fjb_02, float f2) {
        int n2 = b.get(n);
        faX faX2 = fbc_0.a.a(n2);
        if (faX2 == null) {
            a.error((Object)("Nation " + n2 + " inconnue pour le protecteur " + n));
            return;
        }
        feo_0 feo_02 = faX2.E();
        a.info((Object)("Update de la valeur de taxe " + fjb_02 + " \u00e0 une valeur de " + f2 + " pour le protecteur " + n));
        feo_02.b(n, fjb_02, f2);
    }

    public static void b(int n, int n2) {
        int n3 = b.get(n);
        faX faX2 = fbc_0.a.a(n3);
        if (faX2 == null) {
            a.error((Object)("Nation " + n3 + " inconnue pour le protecteur " + n));
            return;
        }
        feo_0 feo_02 = faX2.E();
        a.info((Object)("Update de la nation du protecteur " + n + ". Nouvelle nation : " + n2));
        feo_02.a(n, fbc_0.a.a(n2));
    }

    public static int d(int n) {
        return b.get(n);
    }

    public static int e(int n) {
        fem_0 fem_02 = feo_0.c(n);
        if (fem_02 == null) {
            return 0;
        }
        return feo_0.d(fem_02.a());
    }
}

