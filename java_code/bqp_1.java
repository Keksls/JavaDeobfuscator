/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

/*
 * Renamed from bQp
 */
public class bqp_1
implements ajh_1 {
    static final Logger d = Logger.getLogger(bqp_1.class);
    private final ery_1 e;
    public static final String a = "entries";
    public static final String[] b = new String[]{"entries"};
    final ArrayList<bqm_1> f;

    public bqp_1(ery_1 ery_12) {
        this.e = ery_12;
        this.f = new ArrayList();
        this.e.a(new bqq_1(this));
        this.e.b(new bqr_1(this));
        Collections.sort(this.f);
    }

    @Override
    public String[] d() {
        return b;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        return null;
    }
}

