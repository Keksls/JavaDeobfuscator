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

public class bRC
extends fjJ
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(bRC.class);
    private static final String b = "monsterFamilyRatios";
    private static final String[] d = new String[]{"monsterFamilyRatios"};
    private static final bRC e = new bRC();
    private final ArrayList<bRz> f = new ArrayList();

    private bRC() {
    }

    public void a(byte[] byArray) {
        this.f.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
        int n = byteBuffer.getInt();
        ccu_1 ccu_12 = bRA.e().h();
        if (ccu_12 == null) {
            a.warn((Object)"R\u00e9ception d'information de monstres dans une zone inconnue du client");
            return;
        }
        ym_0 ym_02 = ccu_12.c();
        bMn bMn2 = bwy_2.h().j();
        bMw bMw2 = bMn2 != null ? bMn2.v() : null;
        for (int k = 0; k < n; ++k) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            aeo_2 aeo_22 = null;
            if (bMw2 != null) {
                aeo_22 = bMw2.a(n2);
            }
            int n4 = ym_02.b;
            tIntIntHashMap.put(n2, n3);
            this.f.add(new bRz(bRw.a(k), n2, aeo_22, n3, n4));
        }
        if (bMw2 != null) {
            bMw2.c(-1);
            bMw2.a(tIntIntHashMap);
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

    public static bRC c() {
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

