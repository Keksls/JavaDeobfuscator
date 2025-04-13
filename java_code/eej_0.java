/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from eEj
 */
public abstract class eej_0 {
    protected static final Logger a = Logger.getLogger(eej_0.class);
    protected final eeq_0 b;
    protected final abq_2<eEv> c;
    private final ArrayList<eEs> d;

    public eej_0(eeq_0 eeq_02) {
        this.b = eeq_02;
        this.c = new abq_2<eEv>(this.b.b().a());
        this.d = new ArrayList();
    }

    public short a() {
        return this.b.a();
    }

    public ArrayList<eEv> b() {
        return this.c;
    }

    public eeq_0 c() {
        return this.b;
    }

    public int a(eEv eEv2) {
        this.c.add(eEv2);
        this.f();
        return this.c.indexOf(eEv2);
    }

    protected void d() {
        this.c.remove(this.c.b());
    }

    public void a(long l) {
        eEv eEv2 = null;
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            eEv eEv3 = (eEv)this.c.get(k);
            if (eEv3.j() != l) continue;
            eEv2 = eEv3;
            break;
        }
        this.c.remove(eEv2);
        this.f();
    }

    public int b(eEv eEv2) {
        this.c.add(eEv2);
        int n = this.c.indexOf(eEv2);
        this.c.remove(eEv2);
        return n;
    }

    public void e() {
        this.c.clear();
        this.g();
    }

    protected void f() {
        int n = this.d.size();
        for (int k = 0; k < n; ++k) {
            this.d.get(k).b(this);
        }
    }

    protected void g() {
        int n = this.d.size();
        for (int k = 0; k < n; ++k) {
            this.d.get(k).a(this);
        }
    }

    public void a(eEs eEs2) {
        if (!this.d.contains(eEs2)) {
            this.d.add(eEs2);
        }
    }

    public eEv h() {
        return (eEv)this.c.get(0);
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.b.a());
        byteBuffer.putShort((short)this.c.size());
        for (int k = 0; k < this.c.size(); ++k) {
            ((eEv)this.c.get(k)).a(byteBuffer);
        }
    }

    public void b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            eEv eEv2 = eEv.b(byteBuffer);
            this.a(eEv2);
        }
    }

    public int i() {
        int n = 0;
        for (int k = 0; k < this.c.size(); ++k) {
            eEv eEv2 = (eEv)this.c.get(k);
            n += eEv2.i();
        }
        return 4 + n;
    }

    public String toString() {
        return "DungeonLadder(instanceId=" + this.b.a() + ", ladderType=" + this.b.b().name() + ", resultCount=" + this.c.size() + ")";
    }
}

