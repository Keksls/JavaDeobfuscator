/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class eZy {
    private static final Logger a = Logger.getLogger(eZy.class);
    private static final fat<tb_0<te_0>> b = elj_0.b((short)30, (short)67, (short)38, (short)15);
    private static final fat<tb_0<te_0>> c = elj_0.b((short)0, (short)97, (short)38, (short)15);
    private static final int d = 15;

    @Nullable
    public static eZw a(@NotNull lk_0 lk_02) {
        if (lk_02.b() == null) {
            return null;
        }
        eZw eZw2 = new eZw();
        lk_02.b().forEach(lR2 -> eZy.a(eZw2, (byte)lR2.c(), eZy.a(lR2)));
        eZw2.b(lk_02.i());
        eZw2.c(lk_02.k());
        eZw2.d((byte)lk_02.m());
        return eZw2;
    }

    public static eZw a(@NotNull yk_1 yk_12) {
        eZw eZw2 = new eZw();
        yk_12.a.forEach(ym_22 -> eZy.a(eZw2, ym_22.a, eZy.a(ym_22)));
        eZw2.b(yk_12.c);
        eZw2.c(yk_12.d);
        eZw2.d(yk_12.e);
        yk_12.b.forEach(yl_12 -> eZw2.a(ext_1.a(yl_12.a), yl_12.b));
        return eZw2;
    }

    public static eze_0 a(@NotNull lR lR2) {
        return new eze_0(lR2.e(), (byte)lR2.g(), lR2.i());
    }

    public static eze_0 a(@NotNull ym_2 ym_22) {
        return new eze_0(ym_22.b, ym_22.c, ym_22.d);
    }

    public static void a(eZw eZw2, byte by, eze_0 eze_02) {
        if (eze_02.d() < 0) {
            return;
        }
        eZw2.a(by, eze_02);
    }

    public static short a(@NotNull exk_2 exk_22) {
        Object object;
        short s2 = eZy.b(exk_22);
        int n = eZy.c(exk_22);
        if (exk_22.y()) {
            object = exk_22.C();
            ((eZw)object).b(ext_1.s);
            ((eZw)object).b(ext_1.t);
        }
        if ((object = exk_22.T()) == null || !((ezr_0)object).ac()) {
            eZw eZw2 = new eZw();
            eZw2.c(n);
            exk_22.a(eZw2);
            return s2;
        }
        boolean bl = exk_22.y() && exk_22.C().d() < 0;
        eZy.a(exk_22, b);
        exk_22.C().c(n);
        return s2;
    }

    static short b(@NotNull exk_2 exk_22) {
        if (!exk_22.y()) {
            return 0;
        }
        eZw eZw2 = exk_22.C();
        short s2 = 0;
        for (eze_0 eze_02 : eZw2.c().values()) {
            if (!eze_02.g()) continue;
            int n = eze_02.a();
            s2 = (short)(s2 + eZy.a(exk_22, n));
        }
        return s2;
    }

    public static int c(@NotNull exk_2 exk_22) {
        if (!exk_22.y()) {
            return 0;
        }
        eZw eZw2 = exk_22.C();
        int n = eZw2.n();
        Map<ext_1, Integer> map = eZw2.k();
        if (map.isEmpty()) {
            return n;
        }
        for (Map.Entry<ext_1, Integer> entry : map.entrySet()) {
            ext_1 ext_12 = entry.getKey();
            Integer n2 = entry.getValue();
            if (ext_12 == null || n2 == null || n2 <= 0 || ext_12 != ext_1.s && ext_12 != ext_1.t) continue;
            n = n2;
        }
        return n;
    }

    public static boolean d(@NotNull exk_2 exk_22) {
        eZw eZw2 = exk_22.C();
        eZw eZw3 = eZy.h(exk_22);
        for (int k = 0; eZw2.a(eZw3) && k < 15; ++k) {
            eZw3 = eZy.h(exk_22);
        }
        exk_22.a(eZw3);
        return !eZw2.a(eZw3);
    }

    private static eZw h(@NotNull exk_2 exk_22) {
        eZw eZw2 = exk_22.C().p();
        Map<Byte, eze_0> map = eZw2.c();
        ArrayList<Byte> arrayList = new ArrayList<Byte>(map.keySet());
        Collections.shuffle(arrayList);
        HashMap<Byte, eze_0> hashMap = new HashMap<Byte, eze_0>();
        for (byte by = 0; by < arrayList.size(); by = (byte)(by + 1)) {
            Byte by2 = (Byte)arrayList.get(by);
            hashMap.put(by, map.get(by2));
        }
        eZw2.a((Map<Byte, eze_0>)hashMap);
        return eZw2;
    }

    public static void e(@NotNull exk_2 exk_22) {
        eZy.a(exk_22, b);
    }

    public static void a(@NotNull exk_2 exk_22, @NotNull fat<tb_0<te_0>> fat2) {
        eZw eZw2 = exk_22.y() ? exk_22.C() : new eZw();
        eZw2.a((Map<Byte, eze_0>)new HashMap<Byte, eze_0>());
        byte by = eZy.a(exk_22.T(), fat2);
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            eZw2.c().put(by2, new eze_0(eZy.a()));
        }
        exk_22.a(eZw2);
    }

    public static boolean f(@NotNull exk_2 exk_22) {
        eZw eZw2;
        int n;
        if (!exk_22.y()) {
            return false;
        }
        ezr_0<?> ezr_02 = exk_22.T();
        byte by = eZy.a(ezr_02);
        if (by <= (n = (eZw2 = exk_22.C()).b())) {
            return false;
        }
        for (int k = 0; k < by - n; ++k) {
            byte by2 = (byte)(k + n);
            eZw2.a(by2, new eze_0(eZy.a()));
        }
        return true;
    }

    public static byte a(@NotNull ezr_0<?> ezr_02) {
        return eZy.a(ezr_02, b);
    }

    public static byte a(@NotNull ezr_0<?> ezr_02, @NotNull fat<tb_0<te_0>> fat2) {
        tb_0<te_0> tb_02 = fat2.a((Object)null, (Object)null, (Object)null, (Object)null);
        if (tb_02 == null) {
            return 0;
        }
        te_0 te_02 = tb_02.b();
        byte by = te_02.a();
        byte by2 = ezr_02.ad();
        byte by3 = ezr_02.ae();
        if (by > by3) {
            return by3;
        }
        if (by < by2) {
            return by2;
        }
        return by;
    }

    private static tc_0 a() {
        fat<tb_0<tc_0>> fat2 = elj_0.a((short)100, (short)100, (short)100, (short)32);
        if (fat2 == null) {
            return tc_0.a;
        }
        tb_0<tc_0> tb_02 = fat2.a((Object)null, (Object)null, (Object)null, (Object)null);
        if (tb_02 == null) {
            return tc_0.a;
        }
        return tb_02.b();
    }

    public static boolean g(exk_2 exk_22) {
        eZw eZw2 = exk_22.C();
        eZw eZw3 = eZw2.p();
        eZw3.c().values().forEach(eze_02 -> eze_02.a(eZy.a()));
        for (int k = 0; eZw2.a(eZw3) && k < 15; ++k) {
            eZw3.c().values().forEach(eze_02 -> eze_02.a(eZy.a()));
        }
        exk_22.a(eZw3);
        return !eZw2.a(eZw3);
    }

    public static void a(@NotNull exk_2 exk_22, @NotNull exk_2 exk_23) {
        eZw eZw2 = exk_22.y() ? exk_22.C() : new eZw();
        ezf_0 ezf_02 = exk_23.ar();
        if (ezf_02.b() == ezh_0.c) {
            eZw2.b(exk_23.aT_());
        } else {
            eZw2.c(exk_23.aT_());
        }
        exk_22.a(eZw2);
    }

    public static ezg_0 b(exk_2 exk_22, exk_2 exk_23) {
        if (exk_22 == null) {
            return ezg_0.c;
        }
        if (exk_23 == null) {
            return ezg_0.b;
        }
        if (exk_22.a() == exk_23.a()) {
            return ezg_0.h;
        }
        if (exk_22.e() > 1) {
            return ezg_0.d;
        }
        ezf_0 ezf_02 = exk_23.ar();
        if (ezf_02 == null) {
            return ezg_0.e;
        }
        ezh_0 ezh_02 = ezf_02.b();
        if (!ezh_02.a(exk_22)) {
            return ezg_0.k;
        }
        if (ezh_02 == ezh_0.c) {
            if (!exk_22.y()) {
                return ezg_0.f;
            }
            eZw eZw2 = exk_22.C();
            boolean bl = eZy.a(eZw2, ezf_02);
            if (eZw2.l() == exk_23.aT_()) {
                return ezg_0.i;
            }
            return bl ? (eZw2.m() ? ezg_0.j : ezg_0.a) : ezg_0.g;
        }
        if (!exk_22.y()) {
            ezr_0<?> ezr_02 = exk_22.T();
            if (ezr_02.ac()) {
                return ezg_0.e;
            }
            if (!ezr_02.F().a(exh_2.q) && !ezr_02.F().a(exh_2.r)) {
                return ezg_0.e;
            }
            return ezg_0.a;
        }
        eZw eZw3 = exk_22.C();
        if (!eZw3.k().isEmpty()) {
            return ezg_0.l;
        }
        if (eZw3.n() == exk_23.aT_()) {
            return ezg_0.i;
        }
        return eZw3.o() ? ezg_0.j : ezg_0.a;
    }

    public static boolean a(@NotNull eZw eZw2, @NotNull ezf_0 ezf_02) {
        tc_0[] tc_0Array = ezf_02.a();
        if (tc_0Array.length == 0) {
            return true;
        }
        if (tc_0Array.length > eZw2.c().size()) {
            return false;
        }
        for (int k = 0; k < eZw2.c().size(); ++k) {
            boolean bl = true;
            for (int i2 = 0; i2 < tc_0Array.length; ++i2) {
                int n = k + i2;
                if (!eZw2.c().containsKey((byte)n)) {
                    bl = false;
                    break;
                }
                eze_0 eze_02 = eZw2.c().get((byte)n);
                tc_0 tc_02 = eze_02.c();
                if (tc_02 == tc_0.e || tc_0Array[i2] == tc_0.a || tc_02 == tc_0Array[i2]) continue;
                bl = false;
                break;
            }
            if (!bl) continue;
            return true;
        }
        return false;
    }

    static short a(@NotNull exk_2 exk_22, int n) {
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            return 0;
        }
        short s2 = ((ezr_0)r2).G();
        short s3 = s2 > 10 ? (short)(s2 - 10) : s2;
        short s4 = s2 > 10 ? (short)200 : 0;
        short s5 = exk_22.c();
        short s6 = s4;
        s6 = (short)(s6 + eZy.a(s5, s3, exw_1.b));
        s6 = (short)(s6 + eZy.a(s5, s3, exw_1.c));
        s6 = (short)(s6 + eZy.a(s5, s3, exw_1.d));
        s6 = (short)(s6 + eZy.a(s5, s3, exw_1.e));
        return s6;
    }

    private static short a(short s2, short s3, exw_1 exw_12) {
        short s4 = eZy.a(s3, exw_12);
        if (s4 <= 0) {
            return 0;
        }
        double d2 = eZq.a(s2, exw_12);
        return Hw.c((long)Math.floor(d2 * 100.0 / (double)exw_12.g() * (double)s4));
    }

    private static short a(short s2, exw_1 exw_12) {
        switch (exw_12) {
            case b: {
                return 1;
            }
            case c: {
                if (s2 >= 5) {
                    return 6;
                }
                if (s2 == 4) {
                    return 4;
                }
                if (s2 == 3) {
                    return 2;
                }
                if (s2 == 2) {
                    return 1;
                }
                if (s2 == 1) {
                    return 0;
                }
                return 0;
            }
            case d: {
                if (s2 >= 7) {
                    return 4;
                }
                if (s2 == 6) {
                    return 2;
                }
                return 0;
            }
            case e: {
                if (s2 == 10) {
                    return 6;
                }
                if (s2 == 9) {
                    return 4;
                }
                if (s2 == 8) {
                    return 2;
                }
                return 0;
            }
        }
        return 0;
    }

    public static byte[] a(eZw eZw2) {
        if (eZw2 == null) {
            return Cn.b;
        }
        lM lM2 = eyl_1.a(eZw2);
        if (lM2 == null) {
            a.fatal((Object)("Unable to serialize Shards :" + eZw2));
            return Cn.b;
        }
        return lM2.p().toByteArray();
    }

    public static eZw a(byte[] byArray) {
        try {
            lk_0 lk_02 = lk_0.a(byArray);
            return eyl_1.a(lk_02);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.fatal((Object)"Unable to unserialize Shards from proto", (Throwable)invalidProtocolBufferException);
            return null;
        }
    }
}

