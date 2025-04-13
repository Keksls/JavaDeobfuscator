/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;

/*
 * Renamed from bgV
 */
class bgv_2 {
    private final Constructor a;

    bgv_2(Class clazz) {
        this.a = bgv_2.a(clazz);
    }

    private static Constructor a(Class clazz) {
        for (Constructor<?> constructor : clazz.getConstructors()) {
            if (constructor.getParameterTypes().length != 16) continue;
            return constructor;
        }
        throw new NoSuchMethodException();
    }

    public ekk_0 a(aqw_0 aqw_02) {
        return (ekk_0)this.a.newInstance(aqw_02.c(), bgu_2.b(aqw_02), bgu_2.a(aqw_02.o()), bgu_2.a(aqw_02.p()), aqw_02.f(), aqw_02.d(), aqw_02.g(), aqw_02.r(), aqw_02.v(), aqw_02.w(), bgu_2.a(aqw_02.x()), bgu_2.a(aqw_02.y()), aqw_02.s(), aqw_02.h(), aqw_02.l(), aqw_02.z());
    }
}

