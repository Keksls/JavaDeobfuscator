/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class bNI
extends fhf_0<bNR> {
    protected static final Logger a = Logger.getLogger(bNI.class);
    private final short f;
    private final Map<Long, String[]> g;
    private final int h;
    private final boolean i;

    public bNI(int n, short s2, short s3, short s4, fhj_0 fhj_02, boolean bl, short s5, Map<Long, int[]> map, int n2, boolean bl2) {
        super(n, s2, s3, s4, fhj_02, bl);
        this.c = bl;
        this.f = s5;
        this.g = new HashMap<Long, String[]>(map.size());
        this.h = n2;
        this.i = bl2;
        this.a(map);
    }

    @Override
    private void a(Map<Long, int[]> map) {
        try {
            String string = azs_0.a().a("ANMResourcePath");
            for (Map.Entry<Long, int[]> entry : map.entrySet()) {
                int[] nArray = entry.getValue();
                String[] stringArray = new String[nArray.length];
                for (int k = 0; k < nArray.length; ++k) {
                    stringArray[k] = String.format(string, nArray[k]);
                }
                long l = entry.getKey();
                this.g.put(l, stringArray);
            }
        }
        catch (gm_0 gm_02) {
            a.error((Object)"Erreur \u00e0 la r\u00e9cup\u00e9ration du chemin des anms de ressources", (Throwable)gm_02);
        }
    }

    public String a(int n, int n2, long l) {
        if (this.g.isEmpty()) {
            a.error((Object)("La resource " + this.h() + " n'a pas de gfxId"));
            return null;
        }
        String[] stringArray = this.g.get(l);
        if (stringArray == null && (stringArray = this.g.get(-1L)) == null) {
            a.error((Object)("Pas de gfxIds par d\u00e9faut pour la resource " + this.h()));
            return null;
        }
        int n3 = (int)(Math.abs(Hw.c(n, n2)) % (long)stringArray.length);
        return stringArray[n3];
    }

    public String c() {
        return bae.h().a(12, (long)this.h(), new Object[0]);
    }

    public boolean d() {
        return this.i;
    }

    public boolean e() {
        return this.c;
    }

    public short f() {
        return this.f;
    }

    public boolean a(byte by) {
        return this.a((bNR)this.b(by));
    }

    public boolean a(bNR bNR2) {
        ece_0 ece_02 = bgg.a.b();
        int n = bNR2.g();
        for (int k = 0; k < n; ++k) {
            brw_1 brw_12 = (brw_1)bNR2.c(k);
            if (brw_12.l() == 0) {
                return true;
            }
            if (!ece_02.e(brw_12.l())) continue;
            return true;
        }
        return false;
    }

    public int g() {
        return this.h;
    }
}

