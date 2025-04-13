/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.HashFunctions
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import gnu.trove.impl.HashFunctions;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class eLo
implements abo_1,
eLk {
    protected static final Logger a = Logger.getLogger(eLo.class);
    private long b;
    private wt_0 c;
    private wt_0 d;
    private String e;
    private String f;
    private long g;
    private boolean h = true;
    private byte i;
    private byte j = 0;
    private byte k = (byte)2;
    private TLongObjectHashMap<String> l = new TLongObjectHashMap();
    private byte m = (byte)2;
    private TLongObjectHashMap<String> n = new TLongObjectHashMap();
    private static long o = -1L;
    private boolean p;
    private static final ObjectPool q = new abm_1(new eLp());
    private static int r = 0;

    public static eLo f() {
        eLo eLo2;
        try {
            eLo2 = (eLo)q.borrowObject();
            eLo2.p = true;
            ++r;
        }
        catch (Exception exception) {
            eLo2 = new eLo();
            a.error((Object)("Erreur lors d'un checkOut sur un message de type CreateGuildRequestMessage : " + exception.getMessage()));
        }
        return eLo2;
    }

    @Override
    public void onCheckOut() {
        this.k = (byte)2;
        this.m = (byte)2;
    }

    @Override
    public void onCheckIn() {
        this.b = -1L;
        this.c = null;
        this.d = null;
        this.f = null;
        this.e = null;
        this.k = 0;
        this.m = 0;
        this.g = -1L;
        this.j = 0;
        this.l.clear();
        this.n.clear();
    }

    public void g() {
        if (this.p) {
            try {
                q.returnObject((Object)this);
                --r;
                this.p = false;
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        } else {
            this.onCheckIn();
        }
    }

    public eLo() {
    }

    public eLo(String string, String string2, long l, byte by, byte by2, wu_0 wu_02) {
        this(string, string2, l, by, by2, wu_02, true);
    }

    public eLo(String string, String string2, long l, byte by, byte by2, wu_0 wu_02, boolean bl) {
        this.a(string, string2, l, by, by2, bl);
        this.a(wu_02);
    }

    public eLo(String string, String string2, long l, byte by, byte by2, int n, int n2, int n3) {
        this(string, string2, l, by, by2, n, n2, n3, true);
    }

    public eLo(String string, String string2, long l, byte by, byte by2, int n, int n2, int n3, boolean bl) {
        this.a(string, string2, l, by, by2, bl);
        this.a(0, 0, n, n2, n3);
    }

    public eLo(String string, String string2, long l, byte by, byte by2, byte by3, byte by4, short s2, byte by5, byte by6) {
        this(string, string2, l, by, by2, by3, by4, s2, by5, by6, true);
    }

    public eLo(String string, String string2, long l, byte by, byte by2, byte by3, byte by4, short s2, byte by5, byte by6, boolean bl) {
        this.a(string, string2, l, by, by2, bl);
        this.a(by6, by5, by3, by4, s2);
    }

    private void a(String string, String string2, long l, byte by, byte by2, boolean bl) {
        this.h();
        this.e = string != null ? string : "";
        this.f = string2 != null ? string2 : "";
        this.g = l;
        this.i = by;
        this.j = by2;
        this.h = bl;
    }

    public void a(eLo eLo2) {
        TLongObjectIterator tLongObjectIterator;
        this.b = eLo2.b;
        this.e = eLo2.e;
        this.f = eLo2.f;
        this.g = eLo2.g;
        this.i = eLo2.i;
        this.j = eLo2.j;
        this.h = eLo2.h;
        if (eLo2.c != null) {
            this.c = new wt_0(eLo2.c);
        }
        if (eLo2.d != null) {
            this.d = new wt_0(eLo2.d);
        }
        this.k = eLo2.k;
        this.m = eLo2.m;
        this.l.clear();
        if (!eLo2.l.isEmpty()) {
            tLongObjectIterator = eLo2.l.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.l.put(tLongObjectIterator.key(), (Object)((String)tLongObjectIterator.value()));
            }
        }
        this.n.clear();
        if (!eLo2.n.isEmpty()) {
            tLongObjectIterator = eLo2.n.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.n.put(tLongObjectIterator.key(), (Object)((String)tLongObjectIterator.value()));
            }
        }
    }

    public void a(int n, int n2, int n3, int n4, int n5) {
        if (this.c == null) {
            this.c = new wt_0(0, n, n2, n3, n4, n5);
        } else {
            this.c.a(0, n, n2, n3, n4, n5);
        }
    }

    public void b(int n, int n2, int n3, int n4, int n5) {
        if (this.d == null) {
            this.d = new wt_0(0, n, n2, n3, n4, n5);
        } else {
            this.d.a(0, n, n2, n3, n4, n5);
        }
    }

    public void a(wu_0 wu_02) {
        this.c = new wt_0(wu_02);
    }

    public void b(wu_0 wu_02) {
        this.d = new wt_0(wu_02);
    }

    public void a(long l) {
        this.b = l;
    }

    public void h() {
        this.b = o--;
    }

    public long i() {
        return this.b;
    }

    public void a(String string) {
        if (string.length() > 32) {
            string = string.substring(0, 32);
        }
        this.e = string;
    }

    public void b(String string) {
        if (string.length() > 127) {
            string = string.substring(0, 127);
        }
        this.f = string;
    }

    public void b(long l) {
        this.g = l;
    }

    public void a(byte by) {
        this.i = by;
    }

    public void b(byte by) {
        this.j = by;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public boolean j() {
        return this.h;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public wt_0 k() {
        return this.c;
    }

    @Override
    public wu_0 a() {
        return this.c;
    }

    public wt_0 l() {
        return this.d;
    }

    public wu_0 m() {
        return this.d;
    }

    @Override
    public String b() {
        return this.e;
    }

    @Override
    public String c() {
        return this.f;
    }

    @Override
    public long d() {
        return this.g;
    }

    @Override
    public byte e() {
        return this.i;
    }

    public byte n() {
        return this.j;
    }

    public byte o() {
        return this.k;
    }

    public void c(byte by) {
        this.k = by;
    }

    public byte p() {
        return this.m;
    }

    public void d(byte by) {
        this.m = by;
    }

    public void a(long l, String string) {
        this.l.put(l, (Object)string);
    }

    public String c(long l) {
        return (String)this.l.remove(l);
    }

    public TLongObjectHashMap<String> q() {
        return this.l;
    }

    public void b(long l, String string) {
        this.n.put(l, (Object)string);
    }

    public String d(long l) {
        return (String)this.n.remove(l);
    }

    public TLongObjectHashMap<String> r() {
        return this.n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eLo)) {
            return false;
        }
        eLo eLo2 = (eLo)object;
        if (this.c != null) {
            if (this.c.j() != eLo2.c.j()) {
                return false;
            }
            if (this.c.m() != this.c.m()) {
                return false;
            }
            if (this.c.o() != eLo2.c.o()) {
                return false;
            }
        }
        if (this.g != eLo2.g) {
            return false;
        }
        if (this.i != eLo2.i) {
            return false;
        }
        if (this.j != eLo2.j) {
            return false;
        }
        return this.e != null ? this.e.toLowerCase().equals(eLo2.e.toLowerCase()) : eLo2.e == null;
    }

    public int hashCode() {
        return (int)(this.b ^ this.b >>> 32);
    }

    public int s() {
        int n = 31 * HashFunctions.hash((long)this.c.h());
        n = 31 * n + (this.e != null ? this.e.hashCode() : 0);
        n = 31 * n + (int)(this.g ^ this.g >>> 32);
        n = 31 * n + this.i;
        n = 31 * n + this.j;
        return n;
    }

    public String toString() {
        return "WakfuCalendarEvent{\nm_uid=" + this.b + ", m_startDate=" + this.c + ", m_endDate=" + this.d + ", m_title=\"" + this.e + "\", m_desc=\"" + this.f + "\"\nm_ownerId=" + this.g + ", m_type=" + this.i + "\nm_evolution=" + this.j + "\nm_participants=" + this.a(this.l) + ", m_registered=" + this.a(this.n) + "\n}";
    }

    private String a(TLongObjectHashMap<String> tLongObjectHashMap) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            String string = (String)tLongObjectIterator.value();
            long l = tLongObjectIterator.key();
            stringBuilder.append("(").append(l).append(",").append(string).append(")").append(";");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean c(wu_0 wu_02) {
        return this.c.o() <= wu_02.o() && this.c.m() < wu_02.m();
    }

    public eLo c(boolean bl) {
        eLo eLo2 = bl ? eLo.f() : new eLo();
        eLo2.e = this.e;
        eLo2.f = this.f;
        eLo2.c = this.c;
        eLo2.d = this.d;
        eLo2.k = this.k;
        eLo2.m = this.m;
        eLo2.g = this.g;
        eLo2.l = new TLongObjectHashMap(this.l);
        eLo2.n = new TLongObjectHashMap(this.n);
        eLo2.i = this.i;
        eLo2.j = this.j;
        eLo2.b = this.b;
        return eLo2;
    }
}

