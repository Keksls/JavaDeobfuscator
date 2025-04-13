/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 */
import gnu.trove.list.TLinkable;

/*
 * Renamed from aBG
 */
class abg_2<V>
implements TLinkable<abg_2<V>> {
    final int a;
    V b;
    private abg_2<V> c = null;
    private abg_2<V> d = null;

    abg_2(int n, V v) {
        this.a = n;
        this.b = v;
    }

    public abg_2<V> a() {
        return this.c;
    }

    public abg_2<V> b() {
        return this.d;
    }

    public void a(abg_2<V> abg_22) {
        this.c = abg_22;
    }

    public void b(abg_2<V> abg_22) {
        this.d = abg_22;
    }

    public /* synthetic */ void setPrevious(TLinkable tLinkable) {
        this.b((abg_2)tLinkable);
    }

    public /* synthetic */ void setNext(TLinkable tLinkable) {
        this.a((abg_2)tLinkable);
    }

    public /* synthetic */ TLinkable getPrevious() {
        return this.b();
    }

    public /* synthetic */ TLinkable getNext() {
        return this.a();
    }
}

