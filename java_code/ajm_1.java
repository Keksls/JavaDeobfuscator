/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from aJm
 */
public class ajm_1 {
    private final String a;
    private final int b;
    private final Set c;

    public ajm_1(InputStream inputStream, byte[] byArray, ais_2 ais_22) {
        this(new ajn_1(inputStream), byArray, ais_22);
    }

    public ajm_1(ajn_1 ajn_12, byte[] byArray, ais_2 ais_22) {
        this(ajn_12.g().g(), byArray, ais_22);
    }

    public ajm_1(Map map, byte[] byArray, ais_2 ais_22) {
        ajo_1 ajo_12 = (ajo_1)map.get("failure reason");
        if (ajo_12 != null) {
            this.a = ajo_12.a();
            this.b = -1;
            this.c = null;
        } else {
            this.a = null;
            ajo_1 ajo_13 = (ajo_1)map.get("interval");
            if (ajo_13 == null) {
                throw new ajq_1("No interval given");
            }
            this.b = ajo_13.d();
            ajo_1 ajo_14 = (ajo_1)map.get("peers");
            if (ajo_14 == null) {
                throw new ajq_1("No peer list");
            }
            this.c = ajm_1.a(ajo_14.f(), byArray, ais_22);
        }
    }

    public static Set a(InputStream inputStream, byte[] byArray, ais_2 ais_22) {
        return ajm_1.a(new ajn_1(inputStream), byArray, ais_22);
    }

    public static Set a(ajn_1 ajn_12, byte[] byArray, ais_2 ais_22) {
        return ajm_1.a(ajn_12.f().f(), byArray, ais_22);
    }

    public static Set<aiu_2> a(List list, byte[] byArray, ais_2 ais_22) {
        HashSet<aiu_2> hashSet = new HashSet<aiu_2>(list.size());
        for (Object e2 : list) {
            ajc_2 ajc_22 = new ajc_2(((ajo_1)e2).g());
            hashSet.add(new aiu_2(ajc_22, byArray, ais_22));
        }
        return hashSet;
    }

    public Set a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public String toString() {
        if (this.a != null) {
            return "TrackerInfo[FAILED: " + this.a + "]";
        }
        return "TrackerInfo[interval=" + this.b + ", peers=" + this.c + "]";
    }
}

