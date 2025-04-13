/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aHF
 */
public class ahf_1
implements adv_1 {
    private static final ahf_1 b = new ahf_1();
    private final HashMap<String, ahd_1> c;
    public static final int a = 1000;
    private static final int d = 30293;

    private ahf_1() {
        adi_2.a().a(this, 1000L, 30293);
        this.c = new HashMap();
    }

    public static ahf_1 a() {
        return b;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        boolean bl = true;
        if (adt_12.a() == Integer.MIN_VALUE) {
            adh_2 adh_22 = (adh_2)adt_12;
            long l = adh_22.d();
            switch (adh_22.c()) {
                case 30293: {
                    for (String string : this.c.keySet()) {
                        ahd_1 ahd_12 = this.c.get(string);
                        if (ahd_12 == null || l - ahd_12.b() < ahd_12.c()) continue;
                        ahd_12.h();
                        ahd_12.a(l);
                        ahd_12.c(";");
                        ahd_12.e();
                    }
                    bl = false;
                }
            }
        }
        return bl;
    }

    public void a(String string, ahd_1 ahd_12) {
        this.c.put(string, ahd_12);
    }

    public void a(String string) {
        if (this.c.containsKey(string)) {
            this.c.remove(string);
        }
    }

    public ahd_1 b(String string) {
        if (this.c.containsKey(string)) {
            return this.c.get(string);
        }
        return null;
    }
}

