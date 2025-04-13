/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from EI
 */
public final class ei_2 {
    private static final Logger a = LoggerFactory.getLogger(ei_2.class);

    private ei_2() {
    }

    @Nullable
    public static gc_0 a(fy_0 fy_02, eg_1 eg_12) {
        Optional<gd_1> optional = gd_1.a(eg_12.a());
        if (optional.isEmpty()) {
            return null;
        }
        gc_0 gc_02 = eg_0.a(optional);
        if (gc_02 == null) {
            return null;
        }
        ei_2.a(fy_02, eg_12, gc_02);
        return gc_02;
    }

    private static void a(fy_0 fy_02, eg_1 eg_12, gc_0 gc_02) {
        gc_02.a(fy_02);
        switch (gc_02.o()) {
            case a: {
                ed_1.a((fx_0)gc_02, eg_12);
                return;
            }
            case b: {
                ee_0.a((fz_0)gc_02, eg_12);
                return;
            }
            case c: {
                ec_1.a((FY)gc_02, eg_12);
                return;
            }
            case d: {
                eb_1.a((FW)gc_02, eg_12);
                return;
            }
        }
        a.error("No known loader for definition {}", (Object)gc_02);
    }
}

