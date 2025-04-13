/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from SO
 */
public class so_0
implements abo_1,
Iterator<sd_0> {
    protected static final Logger a = Logger.getLogger(so_0.class);
    private static final abm_1 b = new abm_1(new SP());
    private se_0 c;
    private Iterator<sd_0> d;
    private sd_0 e = null;
    private Su f;
    private final List<sd_0> g = new ArrayList<sd_0>();
    private boolean h = false;
    private boolean i = false;

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        for (sd_0 sd_02 : this.g) {
            this.c.c(sd_02);
        }
        this.g.clear();
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.h = false;
    }

    public static so_0 a(se_0 se_02, Iterator<sd_0> iterator, Su su, boolean bl) {
        if (iterator != null && su != null) {
            so_0 so_02;
            try {
                so_02 = (so_0)b.borrowObject();
            }
            catch (Exception exception) {
                so_02 = new so_0();
                a.error((Object)("erreur dans le checkOut de " + so_02.getClass()));
            }
            so_02.c = se_02;
            so_02.d = iterator;
            so_02.f = su;
            so_02.h = bl;
            return so_02;
        }
        if (iterator == null) {
            throw new UnsupportedOperationException("checkOut d'un iterator sans liste derri\u00e8re");
        }
        throw new UnsupportedOperationException("checkOut d'un  LinkedToEffectUserIterator sans effectUser");
    }

    @Override
    public boolean hasNext() {
        this.i = true;
        if (!this.d.hasNext()) {
            return false;
        }
        while (this.d.hasNext()) {
            this.e = this.d.next();
            if ((this.e.h() != this.f || this.h) && this.e.i() != this.f) continue;
            return true;
        }
        return false;
    }

    public sd_0 a() {
        if (!this.i && !this.hasNext()) {
            throw new UnsupportedOperationException("Depassement de liste, cause probable : appel de next() sans v\u00e9rification");
        }
        this.i = false;
        return this.e;
    }

    @Override
    public void remove() {
        this.d.remove();
        this.g.add(this.e);
    }

    public void b() {
        if (b != null) {
            try {
                b.returnObject(this);
            }
            catch (Exception exception) {
                a.error((Object)"impossible");
            }
        } else {
            this.onCheckIn();
        }
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

