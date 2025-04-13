/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TByteObjectProcedure
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TByteObjectProcedure;
import java.util.LinkedList;

/*
 * Renamed from eCz
 */
public class ecz_0 {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final LinkedList<eCA> e = new LinkedList();
    private long f;
    private final TByteObjectHashMap<eCB> g = new TByteObjectHashMap();
    private final TIntObjectHashMap<eCB> h = new TIntObjectHashMap();
    private eCJ i;
    private eCE j;

    public ecz_0(long l, int n, long l2, long l3) {
        this.a = l;
        this.b = n;
        this.c = l2;
        this.d = l3;
        this.i = eCJ.a;
    }

    public long a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public long e() {
        return this.f;
    }

    public LinkedList<eCA> f() {
        return this.e;
    }

    public void a(long l) {
        this.f = l;
    }

    public eCA g() {
        return this.e.getFirst();
    }

    public void a(eCA eCA2) {
        if (this.e.size() >= 4) {
            this.e.pop();
        }
        this.e.addLast(eCA2);
    }

    public boolean a(byte by) {
        return this.g.containsKey(by);
    }

    public eCB b(byte by) {
        return (eCB)this.g.get(by);
    }

    public void a(eCB eCB2) {
        this.g.put(eCB2.a(), (Object)eCB2);
    }

    public eCE h() {
        return this.j;
    }

    public void a(eCE eCE2) {
        this.j = eCE2;
    }

    public boolean a(int n) {
        return this.h.containsKey(n);
    }

    public void b(eCB eCB2) {
        this.h.put(eCB2.b(), (Object)eCB2);
    }

    public eCB b(int n) {
        return (eCB)this.h.get(n);
    }

    public boolean i() {
        return this.d == -1L;
    }

    public eCJ j() {
        return this.i;
    }

    public void a(eCJ eCJ2) {
        this.i = eCJ2;
    }

    public void k() {
    }

    public byte[] l() {
        return eCC.a(this);
    }

    public void a(TByteObjectProcedure tByteObjectProcedure) {
        this.g.forEachEntry(tByteObjectProcedure);
    }
}

