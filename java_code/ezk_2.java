/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.map.hash.TIntShortHashMap;
import java.util.HashMap;

/*
 * Renamed from ezk
 */
public class ezk_2 {
    private final ezx_2 a;

    public ezk_2(ezx_2 ezx_22) {
        this.a = ezx_22;
    }

    public TIntShortHashMap a(TIntShortHashMap tIntShortHashMap, short s2) {
        ezu_1 ezu_12 = new ezu_1(this.a);
        HashMap hashMap = new HashMap();
        tIntShortHashMap.forEachEntry((n, s3) -> {
            ezu_12.b(n, s3);
            int n3 = ezi_2.a.b(n);
            hashMap.compute(n3, (n2, s2) -> (short)(s2 == null ? s3 : s2 + s3));
            return true;
        });
        if (ezp_1.a(ezu_12, s2).isEmpty()) {
            ezu_12.a(this.a);
            return tIntShortHashMap;
        }
        return new TIntShortHashMap();
    }

    public void a() {
        this.a.g();
    }

    public String toString() {
        return "AptitudeSheetController{m_model=" + this.a + "}";
    }
}

