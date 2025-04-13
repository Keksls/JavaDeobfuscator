/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import org.apache.log4j.Logger;

public class Ss
implements abo_1 {
    private static final Logger a = Logger.getLogger(Ss.class);
    private final BitSet b = new BitSet();
    private final HashSet<Su> c = new HashSet();
    private int d = 0;
    private static final abm_1 e = new abm_1(new St());

    public static Ss a() {
        Ss ss;
        try {
            ss = (Ss)e.borrowObject();
        }
        catch (Exception exception) {
            ss = new Ss();
            a.error((Object)("Erreur de checkout : " + exception.getMessage()));
        }
        return ss;
    }

    public void a(BitSet bitSet) {
        this.b.or(bitSet);
    }

    public void a(Collection<Su> collection) {
        this.c.addAll(collection);
    }

    public void a(Su su) {
        this.c.add(su);
    }

    public void b() {
        ++this.d;
    }

    public BitSet c() {
        return this.b;
    }

    public HashSet<Su> d() {
        return this.c;
    }

    public void a(Ss ss) {
        if (ss == null) {
            return;
        }
        this.a(ss.c());
        this.a(ss.d());
        this.d += ss.e();
    }

    public int e() {
        return this.d;
    }

    public void f() {
        this.d = 0;
        this.c.clear();
        this.b.clear();
    }

    public void g() {
        if (e != null) {
            try {
                e.returnObject(this);
            }
            catch (Exception exception) {
                a.error((Object)("Impossible de retourner l'\u00e9v\u00e9nement " + this + " au pool"), (Throwable)exception);
            }
        } else {
            this.onCheckIn();
        }
    }

    @Override
    public void onCheckOut() {
        this.d = 0;
    }

    @Override
    public void onCheckIn() {
        this.b.clear();
        this.c.clear();
    }
}

