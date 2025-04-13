/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class eDr
extends eDq<Sm<efh_0>> {
    public eDr(List<efh_0> list, int n, short s2) {
        this(list, n, s2, true, eDk.b, 0);
    }

    public eDr(List<efh_0> list, int n, short s2, boolean bl, eDk eDk2, int n2) {
        this(list, n, s2, bl, (ArrayList<String>)null, (ArrayList<String>)null, eDk2, n2);
    }

    public eDr(List<efh_0> list, int n, short s2, boolean bl, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, eDk eDk2, int n2) {
        super(new eDs(list), n, s2, bl, arrayList, arrayList2, eDk2, n2);
    }
}

