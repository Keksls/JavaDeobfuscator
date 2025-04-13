/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from EG
 */
public final class eg_0 {
    private eg_0() {
    }

    @Nullable
    public static gc_0 a(Optional<gd_1> optional) {
        gc_0 gc_02;
        if (optional.isEmpty()) {
            return null;
        }
        switch (optional.get()) {
            case a: {
                gc_02 = new fx_0();
                break;
            }
            case b: {
                gc_02 = new fz_0();
                break;
            }
            case c: {
                gc_02 = new FY();
                break;
            }
            case d: {
                gc_02 = new FW();
                break;
            }
            default: {
                gc_02 = null;
            }
        }
        return gc_02;
    }
}

