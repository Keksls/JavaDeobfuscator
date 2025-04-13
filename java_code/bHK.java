/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bHK
implements abg_1 {
    protected static final Logger a = Logger.getLogger(bHK.class);
    private static final bHK b = new bHK();
    private final ArrayList<Long> c = new ArrayList();

    public static bHK a() {
        return b;
    }

    public void a(long l) {
        this.c.add(l);
    }

    @Override
    public long d() {
        if (!this.c.isEmpty()) {
            long l = this.c.remove(0);
            if (this.c.isEmpty()) {
                long l2 = cyt_0.s().a_();
                cnr_0 cnr_02 = new cnr_0(l2, 0);
                azu_0.j().K().c(cnr_02);
            }
            return l;
        }
        a.error((Object)" La list d'id unique est vide ");
        return -1L;
    }

    public void b() {
        this.c.clear();
    }
}

