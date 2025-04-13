/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eJP
 */
public class ejp_0
implements Iterator<sd_0> {
    protected static final Logger a = Logger.getLogger(ejp_0.class);
    private final se_0 b;
    private final Iterator<sd_0> c;
    private sd_0 d;
    private final exk_2 e;
    private boolean f;

    public ejp_0(se_0 se_02, Iterator<sd_0> iterator, exk_2 exk_22) {
        this.b = se_02;
        this.c = iterator;
        this.e = exk_22;
        if (iterator == null || exk_22 == null) {
            if (iterator == null) {
                throw new UnsupportedOperationException("checkOut d'un iterator sans liste derri\u00e8re");
            }
            throw new UnsupportedOperationException("checkOut d'un LinkedToItemIterator sans item");
        }
    }

    @Override
    public boolean hasNext() {
        this.f = true;
        if (!this.c.hasNext()) {
            return false;
        }
        while (this.c.hasNext()) {
            this.d = this.c.next();
            Object EC = this.d.k();
            if (EC == null || EC.G_() != 12 || !(EC instanceof exk_2) || ((exk_2)EC).a() != this.e.a()) continue;
            return true;
        }
        return false;
    }

    public sd_0 a() {
        if (!this.f && !this.hasNext()) {
            throw new UnsupportedOperationException("Depassement de liste, cause probable : appel de next() sans v\u00e9rification");
        }
        this.f = false;
        return this.d;
    }

    @Override
    public void remove() {
        this.c.remove();
        this.b.c(this.d);
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

