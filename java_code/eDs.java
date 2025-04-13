/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class eDs
implements Sm<efh_0> {
    private List<efh_0> b;
    static final /* synthetic */ boolean a;

    public eDs(List<efh_0> list) {
        if (!a && (list == null || list.contains(null))) {
            throw new AssertionError();
        }
        this.b = list;
    }

    @Override
    public int G_() {
        return 0;
    }

    @Override
    public long aS_() {
        return 0L;
    }

    @Override
    @NotNull
    public Iterator<efh_0> iterator() {
        return this.b.iterator();
    }

    static {
        a = !eDr.class.desiredAssertionStatus();
    }
}

