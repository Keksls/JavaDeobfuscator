/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bWG
 */
public class bwg_2
implements ajh_1,
eyv_1 {
    public static final String a = "wallets";
    public static final String b = "totalAmount";
    public static final String d = "challenge";
    public static final String e = "weather";
    public static final String f = "ecosystem";
    private final fgP<bMn> g;
    private final ArrayList<bwi_2> h = new ArrayList();

    public bwg_2(bMn bMn2, fgP<bMn> fgP2) {
        this.g = fgP2;
        this.a(bMn2);
    }

    public void a(bMn bMn2) {
        block5: for (fgo_0 fgo_02 : fgo_0.values()) {
            switch (fgo_02) {
                case b: {
                    if (bMn2.o().b() == 0) continue block5;
                    this.h.add(new bwi_2(fgo_02, this.g));
                    continue block5;
                }
                case a: {
                    if (bMn2.h().b() == 0) continue block5;
                    this.h.add(new bwi_2(fgo_02, this.g));
                    continue block5;
                }
                case c: {
                    if (!fis_1.a().c("wakfuEcosystemEnabled")) continue block5;
                    this.h.add(new bwi_2(fgo_02, this.g));
                }
            }
        }
    }

    @Override
    public String[] d() {
        return null;
    }

    private bwi_2 a(fgo_0 fgo_02) {
        int n = this.h.size();
        for (int k = 0; k < n; ++k) {
            bwi_2 bwi_22 = this.h.get(k);
            if (bwi_22.a() != fgo_02) continue;
            return bwi_22;
        }
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.h;
        }
        if (string.equals(d)) {
            return this.a(fgo_0.a);
        }
        if (string.equals(e)) {
            return this.a(fgo_0.b);
        }
        if (string.equals(f)) {
            return this.a(fgo_0.c);
        }
        if (string.equals(b)) {
            return this.g.a() + "\u00a7";
        }
        return null;
    }

    @Override
    public void a(eyu_1 eyu_12, long l) {
        this.a();
    }

    public void a() {
        bwi_2 bwi_22;
        bwi_2 bwi_23;
        fis_1.a().a((ajf_1)this, a, b);
        bwi_2 bwi_24 = this.a(fgo_0.a);
        if (bwi_24 != null) {
            bwi_24.c();
        }
        if ((bwi_23 = this.a(fgo_0.b)) != null) {
            bwi_23.c();
        }
        if ((bwi_22 = this.a(fgo_0.c)) != null) {
            bwi_22.c();
        }
    }
}

