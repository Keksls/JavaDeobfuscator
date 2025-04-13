/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eEU
 */
public final class eeu_0 {
    private static final Logger a = Logger.getLogger(eeu_0.class);

    private eeu_0() {
    }

    public static byte[] a(eet_0 eet_02) {
        gr_1 gr_12 = eeu_0.b(eet_02);
        return gr_12.t().toByteArray();
    }

    public static eet_0 a(byte[] byArray) {
        gp_2 gp_22;
        try {
            gp_22 = gp_2.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize stasis dungeon info from protobuf.");
        }
        return eeu_0.a(gp_22);
    }

    public static byte[] a(eep_0 eep_02) {
        hj_0 hj_02 = eeu_0.b(eep_02);
        return hj_02.g().toByteArray();
    }

    public static eep_0 b(byte[] byArray) {
        hh_0 hh_02;
        try {
            hh_02 = hh_0.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize dungeon progression from protobuf.");
        }
        return eeu_0.a(hh_02);
    }

    public static byte[] a(eQa eQa2) {
        gv_0 gv_02 = eeu_0.b(eQa2);
        return gv_02.g().toByteArray();
    }

    public static eQa c(byte[] byArray) {
        gt_0 gt_02;
        try {
            gt_02 = gt_0.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize dungeon progression from protobuf.");
        }
        return eeu_0.a(gt_02);
    }

    @NotNull
    private static gr_1 b(eet_0 eet_02) {
        gr_1 gr_12 = gp_2.s();
        gr_12.b(eet_02.a()).d(eet_02.d()).c(eet_02.e()).b(eet_02.g()).a(eet_02.f()).c(eet_02.h()).d(eet_02.b()).a(eet_02.c());
        return gr_12;
    }

    @NotNull
    private static eet_0 a(gp_2 gp_22) {
        eet_0 eet_02 = new eet_0();
        eet_02.b(gp_22.c());
        eet_02.a(gp_22.q());
        eet_02.b(gp_22.i());
        eet_02.c(gp_22.e());
        eet_02.a(gp_22.g());
        for (Long l : gp_22.n()) {
            eet_02.a(l);
        }
        eet_02.d(gp_22.m());
        return eet_02;
    }

    @NotNull
    private static hj_0 b(eep_0 eep_02) {
        hj_0 hj_02 = hh_0.f();
        for (Map.Entry<Integer, Integer> entry : eep_02.a()) {
            Integer n = entry.getKey();
            Integer n2 = entry.getValue();
            hj_02.a(eeu_0.a(n, n2));
        }
        return hj_02;
    }

    @NotNull
    private static gv_0 b(eQa eQa2) {
        gv_0 gv_02 = gt_0.f();
        for (Map.Entry<Long, eet_0> entry : eQa2.b()) {
            Long l = entry.getKey();
            eet_0 eet_02 = entry.getValue();
            gv_02.a(eeu_0.a(l, eet_02));
        }
        return gv_02;
    }

    @NotNull
    private static hf a(int n, int n2) {
        hf hf2 = hd_0.g();
        hf2.a(n).b(n2);
        return hf2;
    }

    @NotNull
    private static eep_0 a(hh_0 hh_02) {
        eep_0 eep_02 = new eep_0();
        for (hd_0 hd_02 : hh_02.b()) {
            eep_02.a(hd_02.c(), hd_02.e());
        }
        return eep_02;
    }

    @NotNull
    private static eQa a(gt_0 gt_02) {
        eQa eQa2 = new eQa();
        for (gw_0 gw_02 : gt_02.b()) {
            eQa2.a(gw_02.c(), eeu_0.a(gw_02.e()));
        }
        return eQa2;
    }

    @NotNull
    private static gy_0 a(long l, eet_0 eet_02) {
        gy_0 gy_02 = gw_0.h();
        gy_02.a(l).a(eeu_0.b(eet_02));
        return gy_02;
    }
}

