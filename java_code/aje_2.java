/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aJe
 */
class aje_2 {
    final aiu_2 a;
    final ajd_2 b;
    final ais_2 c;
    boolean d = false;
    boolean e = true;
    boolean f = false;
    boolean g = true;
    long h;
    long i;
    ain_2 j;
    final aiy_2 k;
    final aiz_2 l;
    private final List<ajf_2> n = new ArrayList<ajf_2>();
    private ajf_2 o = null;
    private boolean p = false;
    private static final int q = 5;
    private static final int r = 16384;
    protected static final Logger m = Logger.getLogger("com.ankamagames.framework.net.torrent.peer");

    aje_2(aiu_2 aiu_22, ajd_2 ajd_22, ais_2 ais_22, aiy_2 aiy_22, aiz_2 aiz_22) {
        this.a = aiu_22;
        this.b = ajd_22;
        this.c = ais_22;
        this.k = aiy_22;
        this.l = aiz_22;
    }

    void a() {
        m.log(Level.FINEST, this.a + " rcv alive");
    }

    void a(boolean bl) {
        m.log(Level.FINEST, this.a + " rcv " + (bl ? "" : "un") + "choked");
        this.g = bl;
        if (this.g) {
            this.p = true;
        }
        this.b.a(this.a, bl);
        if (!this.g && this.d) {
            this.b();
        }
    }

    void b(boolean bl) {
        m.log(Level.FINEST, this.a + " rcv " + (bl ? "" : "un") + "interested");
        this.f = bl;
        this.b.b(this.a, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(int n) {
        m.log(Level.FINEST, this.a + " rcv have(" + n + ")");
        if (n < 0 || n >= this.c.h()) {
            m.log(Level.FINER, "Got strange 'have: " + n + "' message from " + this.a);
            return;
        }
        aje_2 aje_22 = this;
        synchronized (aje_22) {
            if (this.j == null) {
                this.j = new ain_2(this.c.h());
            }
            this.j.a(n);
        }
        if (this.b.a(this.a, n)) {
            this.c(true);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(byte[] byArray) {
        aje_2 aje_22 = this;
        synchronized (aje_22) {
            m.log(Level.FINEST, this.a + " rcv bitfield");
            if (this.j != null) {
                m.log(Level.FINER, "Got unexpected bitfield message from " + this.a);
                return;
            }
            this.j = new ain_2(byArray, this.c.h());
        }
        this.c(this.b.a(this.a, this.j));
    }

    void a(int n, int n2, int n3) {
        m.log(Level.FINEST, this.a + " rcv request(" + n + ", " + n2 + ", " + n3 + ") ");
        if (this.e) {
            m.log(Level.FINER, "Request received, but choking " + this.a);
            return;
        }
        if (n < 0 || n >= this.c.h() || n2 < 0 || n2 > this.c.a(n) || n3 <= 0 || n3 > 65536) {
            m.log(Level.FINER, "Got strange 'request: " + n + ", " + n2 + ", " + n3 + "' message from " + this.a);
            return;
        }
        byte[] byArray = this.b.b(this.a, n);
        if (byArray == null) {
            m.log(Level.FINER, "Got request for unknown piece: " + n);
            return;
        }
        if (n2 >= byArray.length || n2 + n3 > byArray.length) {
            m.log(Level.FINER, "Got out of range 'request: " + n + ", " + n2 + ", " + n3 + "' message from " + this.a);
            return;
        }
        m.log(Level.FINEST, "Sending (" + n + ", " + n2 + ", " + n3 + ") to " + this.a);
        this.l.a(n, n2, n3, byArray);
        if (n2 + n3 == byArray.length) {
            m.log(Level.FINEST, "Send p" + n + " " + this.a);
        }
    }

    void b(int n) {
        this.i += (long)n;
        this.b.c(this.a, n);
    }

    void a(ajf_2 ajf_22) {
        int n = ajf_22.d;
        this.h += (long)n;
        this.b.d(this.a, n);
        if (this.d(ajf_22.a) == -1) {
            if (this.b.a(this.a, ajf_22.a, ajf_22.b)) {
                m.log(Level.FINEST, "Got " + ajf_22.a + ": " + this.a);
            } else {
                m.log(Level.FINEST, "Got BAD " + ajf_22.a + " from " + this.a);
                this.h = 0L;
            }
        }
    }

    private synchronized int d(int n) {
        for (int k = 0; k < this.n.size(); ++k) {
            if (this.n.get((int)k).a != n) continue;
            return k;
        }
        return -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    ajf_2 b(int n, int n2, int n3) {
        ajf_2 ajf_22;
        m.log(Level.FINEST, "getChunk(" + n + "," + n2 + "," + n3 + ") " + this.a);
        int n4 = this.d(n);
        if (n4 == -1) {
            m.log(Level.FINER, "Unrequested 'piece: " + n + ", " + n2 + ", " + n3 + "' received from " + this.a);
            this.h = 0L;
            return null;
        }
        aje_2 aje_22 = this;
        synchronized (aje_22) {
            ajf_22 = this.n.get(n4);
            while (ajf_22.a == n && ajf_22.c != n2 && n4 < this.n.size() - 1) {
                ajf_22 = this.n.get(++n4);
            }
            if (ajf_22.a != n || ajf_22.c != n2 || ajf_22.d != n3) {
                m.log(Level.FINER, "Unrequested or unneeded 'piece: " + n + ", " + n2 + ", " + n3 + "' received from " + this.a);
                this.h = 0L;
                return null;
            }
            if (n4 != 0) {
                String string = "Some requests dropped, got " + ajf_22 + ", wanted:";
                for (int k = 0; k < n4; ++k) {
                    ajf_2 ajf_23 = this.n.remove(0);
                    this.n.add(ajf_23);
                    string = string + " " + ajf_23;
                }
                string = string + " " + this.a;
                m.log(Level.FINER, string);
            }
            this.n.remove(0);
        }
        this.c();
        return ajf_22;
    }

    void c(int n, int n2, int n3) {
        m.log(Level.FINEST, "Got cancel message (" + n + ", " + n2 + ", " + n3 + ")");
        this.l.a(n, n2, n3);
    }

    void a(int n, byte[] byArray) {
        m.log(Level.WARNING, "Ignoring unknown message type: " + n + " length: " + byArray.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void c(int n) {
        m.log(Level.FINEST, "Tell " + this.a + " havePiece(" + n + ")");
        aje_2 aje_22 = this;
        synchronized (aje_22) {
            if (this.o != null && this.o.a == n) {
                this.o = null;
            }
            Iterator<ajf_2> iterator = this.n.iterator();
            while (iterator.hasNext()) {
                ajf_2 ajf_22 = iterator.next();
                if (ajf_22.a != n) continue;
                iterator.remove();
                this.l.b(ajf_22);
            }
        }
        this.l.a(n);
        this.c();
        aje_22 = this;
        synchronized (aje_22) {
            if (this.o == null) {
                this.c(false);
            }
        }
    }

    private void b() {
        if (this.p) {
            this.l.a(this.n);
            this.p = false;
        }
        this.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c() {
        boolean bl = true;
        while (bl) {
            boolean bl2;
            int n;
            aje_2 aje_22 = this;
            synchronized (aje_22) {
                bl = this.n.size() < 5;
            }
            if (bl && this.o == null) {
                bl = this.d();
                continue;
            }
            if (!bl) continue;
            aje_2 aje_23 = this;
            synchronized (aje_23) {
                n = this.c.a(this.o.a);
                bl2 = this.o.c + this.o.d == n;
            }
            if (bl2) {
                bl = this.d();
                continue;
            }
            aje_23 = this;
            synchronized (aje_23) {
                int n2 = this.o.a;
                int n3 = this.o.c + 16384;
                byte[] byArray = this.o.b;
                int n4 = n - n3;
                int n5 = n4 > 16384 ? 16384 : n4;
                ajf_2 ajf_22 = new ajf_2(n2, byArray, n3, n5);
                this.n.add(ajf_22);
                if (!this.g) {
                    this.l.a(ajf_22);
                }
                this.o = ajf_22;
            }
        }
        m.log(Level.FINEST, this.a + " requests " + this.n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean d() {
        if (this.j != null) {
            int n = this.b.b(this.a, this.j);
            m.log(Level.FINEST, this.a + " want piece " + n);
            aje_2 aje_22 = this;
            synchronized (aje_22) {
                if (n != -1 && (this.o == null || this.o.a != n)) {
                    int n2 = this.c.a(n);
                    byte[] byArray = new byte[n2];
                    int n3 = n2 < 16384 ? n2 : 16384;
                    ajf_2 ajf_22 = new ajf_2(n, byArray, 0, n3);
                    this.n.add(ajf_22);
                    if (!this.g) {
                        this.l.a(ajf_22);
                    }
                    this.o = ajf_22;
                    return true;
                }
            }
        }
        return false;
    }

    synchronized void c(boolean bl) {
        m.log(Level.FINEST, this.a + " setInteresting(" + bl + ")");
        if (bl != this.d) {
            this.d = bl;
            this.l.b(bl);
            if (this.d && !this.g) {
                this.b();
            }
        }
    }

    synchronized void d(boolean bl) {
        m.log(Level.FINEST, this.a + " setChoking(" + bl + ")");
        if (this.e != bl) {
            this.e = bl;
            this.l.a(bl);
        }
    }
}

