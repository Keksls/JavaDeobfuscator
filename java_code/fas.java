/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class fas {
    private static final Logger b = Logger.getLogger(fas.class);
    public static final fas a = new fas();
    private final TIntObjectHashMap<faq> c = new TIntObjectHashMap();

    public void a(faq faq2) {
        this.c.put(faq2.a(), (Object)faq2);
    }

    public void a(fam_0 fam_02, boolean bl) {
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fam_02.a(new fap_0((faq)tIntObjectIterator.value()));
        }
        if (bl) {
            fam_02.a(new fap_0(fal_0.c));
        }
    }

    public void a(fao_0 fao_02, int n) {
        fao_02.cB().k(n);
    }

    public void b(fao_0 fao_02, int n) {
        fao_02.cB().l(n);
    }

    public boolean a(int n) {
        faq faq2 = (faq)this.c.get(n);
        if (faq2 == null) {
            b.warn((Object)("[LOCK] On essaye de r\u00e9cup\u00e9rer l'\u00e9tat d'un verrou inexistant id=" + n), (Throwable)new Exception());
            return false;
        }
        if (faq2.f().c()) {
            return false;
        }
        wu_0 wu_02 = wc_0.p().a();
        return wu_02.b(faq2.f());
    }

    public boolean b(int n) {
        faq faq2 = (faq)this.c.get(n);
        if (faq2 == null) {
            b.warn((Object)("[LOCK] On essaye de r\u00e9cup\u00e9rer l'\u00e9tat d'un verrou inexistant id=" + n), (Throwable)new Exception());
            return false;
        }
        return faq2.g();
    }

    public int c(int n) {
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            faq faq2 = (faq)tIntObjectIterator.value();
            if (faq2.b() != n) continue;
            return faq2.a();
        }
        return -1;
    }
}

