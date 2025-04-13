/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from SN
 */
public class sn_0
implements Iterator<sd_0> {
    protected static final Logger a = Logger.getLogger(sn_0.class);
    private final se_0 b;
    private boolean c;
    private final Iterator<sd_0> d;
    private final Sm e;
    private sd_0 f;

    public sn_0(se_0 se_02, Iterator<sd_0> iterator, Sm sm) {
        if (iterator == null) {
            throw new UnsupportedOperationException("checkOut d'un iterator sans liste derri\u00e8re");
        }
        if (sm == null) {
            throw new UnsupportedOperationException("checkOut d'un  LinkedToEffectContainerIterator sans container");
        }
        this.b = se_02;
        this.d = iterator;
        this.e = sm;
    }

    @Override
    public boolean hasNext() {
        this.c = true;
        if (!this.d.hasNext()) {
            return false;
        }
        while (this.d.hasNext()) {
            this.f = this.d.next();
            if (this.f.k() == null || this.f.k().G_() != this.e.G_() || this.f.k().aS_() != this.e.aS_()) continue;
            return true;
        }
        return false;
    }

    public sd_0 a() {
        if (!this.c && !this.hasNext()) {
            throw new UnsupportedOperationException("Depassement de liste, cause probable : appel de next() sans v\u00e9rification");
        }
        this.c = false;
        return this.f;
    }

    @Override
    public void remove() {
        this.d.remove();
        this.b.c(this.f);
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

