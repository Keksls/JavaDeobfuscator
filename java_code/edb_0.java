/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eDB
 */
public class edb_0
extends eDr {
    public edb_0(List<efh_0> list) {
        super(list, 0, (short)0);
    }

    @Override
    public void b(@NotNull ArrayList<String> arrayList) {
        ani_2 ani_22 = eDi.aq.a();
        if (!arrayList.isEmpty()) {
            boolean bl = true;
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                if (!bl) {
                    ani_22.m();
                } else {
                    bl = false;
                }
                ani_22.a((CharSequence)arrayList.get(k));
            }
        }
        arrayList.clear();
        arrayList.add(ani_22.r());
    }

    @Override
    public String a(@NotNull String string, @NotNull efh_0 efh_02) {
        if (efh_02.L()) {
            return "";
        }
        String string2 = super.a(string, efh_02);
        ani_2 ani_22 = eDi.aq.a();
        ani_22.a((CharSequence)string2).m();
        return ani_22.r();
    }
}

