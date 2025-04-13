/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aIX
 */
class aix_2
extends TimerTask {
    private static final long n = 1024L;
    long a = Long.MAX_VALUE;
    aiu_2 b = null;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    final List<aiu_2> j = new ArrayList<aiu_2>();
    long k = 0L;
    long l = 0L;
    private final aja_2 o;
    protected static final Logger m = Logger.getLogger("com.ankamagames.framework.net.torrent.peer");

    aix_2(aja_2 aja_22) {
        this.o = aja_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        List<aiu_2> list = this.o.j;
        synchronized (list) {
            ArrayList<aiu_2> arrayList = new ArrayList<aiu_2>();
            Iterator<aiu_2> iterator = this.o.j.iterator();
            while (iterator.hasNext()) {
                aiu_2 aiu_22 = iterator.next();
                if (!aiu_22.b()) {
                    iterator.remove();
                    continue;
                }
                ++this.c;
                if (!aiu_22.f() && !this.j.contains(aiu_22)) {
                    this.j.add(aiu_22);
                    ++this.d;
                }
                if (!aiu_22.g() && aiu_22.e()) {
                    ++this.e;
                }
                if (aiu_22.d()) {
                    ++this.f;
                }
                if (aiu_22.e()) {
                    ++this.g;
                }
                if (aiu_22.f()) {
                    ++this.h;
                }
                if (aiu_22.g()) {
                    ++this.i;
                }
                long l = aiu_22.i();
                this.k += l;
                long l2 = aiu_22.h();
                this.l += l2;
                aiu_22.j();
                this.o.h.put(aiu_22, l / 1024L);
                this.o.i.put(aiu_22, l2 / 1024L);
                m.log(Level.FINEST, aiu_22 + ": ul: " + l / 1024L + " dl: " + l2 / 1024L + " i: " + aiu_22.d() + " I: " + aiu_22.e() + " c: " + aiu_22.f() + " C: " + aiu_22.g());
                if (this.o.g < 4 || this.f <= 4 || aiu_22.f()) continue;
                if (!aiu_22.d()) {
                    m.log(Level.FINER, "Choke uninterested peer: " + aiu_22);
                    aiu_22.c(true);
                    --this.d;
                    --this.o.g;
                    iterator.remove();
                    arrayList.add(aiu_22);
                    continue;
                }
                if (aiu_22.g() && this.o.e() != 0L) {
                    m.log(Level.FINEST, "Choke choking peer: " + aiu_22);
                    aiu_22.c(true);
                    --this.d;
                    --this.o.g;
                    iterator.remove();
                    arrayList.add(aiu_22);
                    continue;
                }
                if (aiu_22.e() && !aiu_22.g() && l2 == 0L) {
                    m.log(Level.FINEST, "Choke downloader that doesn't deliver:" + aiu_22);
                    aiu_22.c(true);
                    --this.d;
                    --this.o.g;
                    iterator.remove();
                    arrayList.add(aiu_22);
                    continue;
                }
                if (aiu_22.f() || l2 >= this.a) continue;
                this.a = l2;
                this.b = aiu_22;
            }
            this.o.g = this.d;
            if (this.d >= 4 && this.f > 4 && this.b != null) {
                m.log(Level.FINEST, "Choke worst downloader: " + this.b);
                this.b.c(true);
                --this.o.g;
                this.o.j.remove(this.b);
                arrayList.add(this.b);
            }
            this.o.k();
            this.o.j.addAll(arrayList);
        }
    }
}

