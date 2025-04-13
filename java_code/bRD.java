/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bRD
extends fjJ
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(bRD.class);
    private static final String b = "resourceFamilyRatios";
    private static final String[] d = new String[]{"resourceFamilyRatios"};
    private static final bRD e = new bRD();
    private final ArrayList<bRz> f = new ArrayList();

    private bRD() {
    }

    public void a(byte[] byArray) {
        this.f.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
        int n = byteBuffer.getInt();
        ccu_1 ccu_12 = bRA.e().h();
        if (ccu_12 == null) {
            a.warn((Object)"R\u00e9ception d'information de ressources dans une zone inconnue du client");
            return;
        }
        yn_0 yn_02 = ccu_12.b();
        bMn bMn2 = bwy_2.h().j();
        bMw bMw2 = bMn2 != null ? bMn2.v() : null;
        for (int k = 0; k < n; ++k) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            aeo_2 aeo_22 = null;
            if (bMw2 != null) {
                aeo_22 = bMw2.b(n2);
            }
            int n4 = yn_02.b;
            tIntIntHashMap.put(n2, n3);
            eAJ eAJ2 = eAJ.a((short)n2);
            if (eAJ2 == null || !eAJ2.c()) continue;
            this.f.add(new bRz(bRw.b(k), n2, aeo_22, n3, n4));
        }
        if (bMw2 != null) {
            bMw2.d(-1);
            bMw2.b(tIntIntHashMap);
        }
        fis_1.a().a((ajf_1)this, d);
    }

    public bRz a(int n) {
        int n2 = this.f.size();
        for (int k = 0; k < n2; ++k) {
            bRz bRz2 = this.f.get(k);
            if (bRz2.h() != n) continue;
            return bRz2;
        }
        return null;
    }

    public ArrayList<bRz> a() {
        return this.f;
    }

    public float b() {
        float f2 = 0.0f;
        for (bRz bRz2 : this.f) {
            f2 += bRz2.a();
        }
        return f2 / (float)this.f.size();
    }

    public static bRD c() {
        return e;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.f.size() > 0 ? this.f : null;
        }
        return null;
    }

    public void e() {
        this.f.clear();
    }

    public void f() {
        a.info((Object)"#################################################");
        int n = this.f.size();
        for (int k = 0; k < n; ++k) {
            bRz bRz2 = this.f.get(k);
            a.info((Object)bRz2);
        }
        a.info((Object)"#################################################");
    }
}

