/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

/*
 * Renamed from bJI
 */
public final class bji_1
extends bjc_1 {
    private final int d;
    private final eyz_0 e;

    public bji_1(int n, eyz_0 eyz_02, long l) {
        Object object;
        this.e = eyz_02;
        this.d = n;
        EnumMap<exh_2, exk_2> enumMap = new EnumMap<exh_2, exk_2>(exh_2.class);
        for (Object object2 : bjh_1.values()) {
            Optional optional;
            object = this.e.a(object2.a());
            Optional<Object> optional2 = optional = object == null ? Optional.empty() : bjd_1.a.a(l).b((Long)object);
            if (optional.isPresent()) {
                exh_2[] exh_2Array;
                exk_2 exk_22 = (exk_2)optional.get();
                this.a(object2.a(), new bja_1(object2.a(), exk_22));
                for (exh_2 exh_22 : exh_2Array = exk_22.U().j()) {
                    enumMap.put(exh_22, exk_22);
                }
                continue;
            }
            this.a(object2.a(), new bja_1(object2.a()));
        }
        for (Map.Entry entry : enumMap.entrySet()) {
            Object object2;
            exh_2 exh_23 = (exh_2)entry.getKey();
            object2 = (exk_2)entry.getValue();
            object = ((exk_2)object2).b(((exk_2)object2).a());
            ((exk_2)object2).b((exk_2)object);
            this.a(exh_23).a((exk_2)object);
        }
        this.a();
    }

    @Override
    public boolean a(long l) {
        return this.e.b(l);
    }

    public boolean a(bmr_1 bmr_12) {
        return this.e.a(bmr_12);
    }

    public eyz_0 e() {
        return this.e;
    }

    public int f() {
        return this.d;
    }
}

