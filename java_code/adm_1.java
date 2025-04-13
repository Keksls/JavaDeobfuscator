/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.TLinkable;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aDM
 */
class adm_1
implements TLinkable<adm_1>,
Comparable {
    protected adm_1 a;
    protected adm_1 b;
    protected int c = 0;
    protected long d;
    protected long e;
    protected long f;
    protected long g;
    protected int h = 0;
    private boolean j = false;
    protected adv_1 i;

    public void a(int n) {
        this.c = n;
    }

    public int a() {
        return this.c;
    }

    public adm_1 b() {
        return this.a;
    }

    public void a(adm_1 adm_12) {
        this.a = adm_12;
    }

    public adm_1 c() {
        return this.b;
    }

    public void b(adm_1 adm_12) {
        this.b = adm_12;
    }

    public long d() {
        return this.d;
    }

    void a(long l) {
        this.d = l;
    }

    public long e() {
        return this.g;
    }

    public void b(long l) {
        this.g = l;
    }

    public void c(long l) {
        this.e = l;
    }

    public long f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    public boolean h() {
        return this.g == -1L || (long)this.h <= this.g;
    }

    public adv_1 i() {
        return this.i;
    }

    public void a(adv_1 adv_12) {
        this.i = adv_12;
    }

    void d(long l) {
        ++this.h;
        this.f = l + this.e;
    }

    public boolean j() {
        return this.j;
    }

    public void k() {
        this.j = true;
    }

    public int compareTo(@NotNull Object object) {
        adm_1 adm_12 = (adm_1)object;
        if (adm_12 == null) {
            throw new UnsupportedOperationException("Comparaison d'un listener avec null.");
        }
        if (this.f < adm_12.f) {
            return -1;
        }
        if (this.f > adm_12.f) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return this.i.getClass().getName() + ", nextTime : " + this.f;
    }

    public /* synthetic */ void setPrevious(TLinkable tLinkable) {
        this.b((adm_1)tLinkable);
    }

    public /* synthetic */ void setNext(TLinkable tLinkable) {
        this.a((adm_1)tLinkable);
    }

    public /* synthetic */ TLinkable getPrevious() {
        return this.c();
    }

    public /* synthetic */ TLinkable getNext() {
        return this.b();
    }
}

