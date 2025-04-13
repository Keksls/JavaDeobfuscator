/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

public final class ceL
implements ahr_1 {
    private static final ceL a = new ceL();

    public static ceL a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 23573: {
                cbx_0 cbx_02 = (cbx_0)adt_12;
                Map<Integer, Integer[]> map = cbx_02.e();
                bus_2.a().a(cbx_02.b());
                bus_2.a().b(cbx_02.c());
                bus_2.a().c(cbx_02.d());
                bus_2.a().d(cbx_02.f());
                bus_2.a().e(cbx_02.g());
                bus_2.a().f(cbx_02.h());
                EnumMap<enu_0, Integer[]> enumMap = new EnumMap<enu_0, Integer[]>(enu_0.class);
                for (Map.Entry<Integer, Integer[]> entry : map.entrySet()) {
                    enumMap.put(enu_0.a(entry.getKey()), entry.getValue());
                }
                bus_2.a().a(enumMap);
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

