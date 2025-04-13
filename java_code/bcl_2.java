/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bcl
 */
public class bcl_2
extends ahs_1 {
    private static final Logger b = Logger.getLogger(bcl_2.class);
    private final Object c = new Object();
    public static final bcl_2 a = new bcl_2();
    private final ArrayList<bco_2> d = new ArrayList();

    private bcl_2() {
        super(new bcn_2());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bco_2 bco_22) {
        Object object = this.c;
        synchronized (object) {
            b.info((Object)("[" + this.getClass().getSimpleName() + "] Demande de token Haapi"));
            this.d.add(bco_22);
            if (!azu_0.j().c(this)) {
                azu_0.j().a(this);
            }
            bcl_2.c();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(String string) {
        Object object = this.c;
        synchronized (object) {
            b.info((Object)("[" + this.getClass().getSimpleName() + "] R\u00e9ception de token Haapi : " + string));
            int n = this.d.size();
            for (int k = 0; k < n; ++k) {
                bco_2 bco_22 = this.d.get(k);
                bco_22.a(string);
            }
            this.d.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a() {
        Object object = this.c;
        synchronized (object) {
            b.info((Object)("[" + this.getClass().getSimpleName() + "] R\u00e9ception d'un token Haapi vide."));
            int n = this.d.size();
            for (int k = 0; k < n; ++k) {
                bco_2 bco_22 = this.d.get(k);
                bco_22.a();
            }
            this.d.clear();
        }
    }

    private static void c() {
        long l = afo_1.a(azu_0.j().L());
        String string = bae.h().f().i();
        azu_0.j().K().c(new clm_1(l, string));
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.a(new bcm_2(this));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            Object object = this.c;
            synchronized (object) {
                this.d.clear();
            }
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public String toString() {
        return "HaapiTokenAuthFrame{}";
    }
}

