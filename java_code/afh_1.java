/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aFh
 */
public class afh_1 {
    private afh_1() {
    }

    @Nullable
    public static aff_1 a(aff_1 aff_12, Collection<aff_1> collection) {
        if (collection.isEmpty()) {
            return null;
        }
        int n = Integer.MAX_VALUE;
        aff_1 aff_13 = null;
        for (aff_1 aff_14 : collection) {
            int n2 = aff_14.e(aff_12);
            if (n2 >= n) continue;
            aff_13 = aff_14;
            n = n2;
        }
        return aff_13;
    }
}

