/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cgY
 */
public class cgy_1<F extends bwh_0>
implements ahr_1 {
    private static final Logger b = Logger.getLogger(cgy_1.class);
    protected final List<chc_1<? extends adt_1, F>> a = new ArrayList<chc_1<? extends adt_1, F>>();

    @Override
    public boolean a(adt_1 adt_12) {
        int n = adt_12.a();
        for (chc_1<adt_1, F> chc_12 : this.a) {
            if (n != chc_12.a()) continue;
            try {
                boolean bl = chc_12.a(adt_12);
                if (bl) continue;
                return bl;
            }
            catch (Exception exception) {
                b.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        return true;
    }

    public void a(chc_1<? extends adt_1, F> chc_12) {
        if (!this.a.contains(chc_12)) {
            this.a.add(chc_12);
        }
    }

    public boolean b(chc_1 chc_12) {
        return this.a.remove(chc_12);
    }

    boolean c(chc_1<? extends adt_1, F> chc_12) {
        return this.a.contains(chc_12);
    }

    public void a(F f2) {
        for (chc_1<adt_1, F> chc_12 : this.a) {
            chc_12.a(f2);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

