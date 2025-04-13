/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSi
 */
public class bsi_2 {
    @Nullable
    public static bsg_2 a(@NotNull @NotNull ArrayList<@NotNull bsg_2> arrayList, int n, int n2, @Nullable Object object) {
        for (bsg_2 bsg_22 : arrayList) {
            if (bsg_22.a() != n || bsg_22.b() != n2) continue;
            return bsg_22;
        }
        if (object != null) {
            for (bsg_2 bsg_22 : arrayList) {
                if (!Objects.equals(bsg_22.d(), object)) continue;
                return bsg_22;
            }
        }
        return arrayList.isEmpty() ? null : arrayList.get(0);
    }

    public static aix_1 a(bsg_2 bsg_22, aiy_1 aiy_12, String string) {
        File file = bSM.a(bsg_22.c());
        String string2 = bSM.a(file);
        aix_1 aix_12 = new aix_1(null, string2, string, aiy_12);
        bSL.a.a(bsg_22.c(), aix_12);
        return aix_12;
    }
}

