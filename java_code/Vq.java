/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongIntHashMap;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Vq<Rated extends Vk> {
    private static final Logger a = Logger.getLogger(Vq.class);
    private final int b;
    private final ArrayList<Rated> c = new ArrayList();
    private final ArrayList<Rated> d = new ArrayList();
    private final byte e;
    private final boolean f;
    private Vn<Rated> g;
    private boolean h;
    private boolean i;
    private byte j;
    private final TLongIntHashMap k = new TLongIntHashMap();

    public Vq(int n, @NotNull Collection<Rated> collection, @NotNull Collection<Rated> collection2, byte by, boolean bl) {
        Vk vk;
        int n2;
        this.b = n;
        this.c.addAll(collection);
        this.d.addAll(collection2);
        this.e = by;
        this.f = bl;
        int n3 = this.c.size();
        for (n2 = 0; n2 < n3; ++n2) {
            vk = (Vk)this.c.get(n2);
            this.k.put(vk.a(), vk.b());
        }
        n3 = this.d.size();
        for (n2 = 0; n2 < n3; ++n2) {
            vk = (Vk)this.d.get(n2);
            this.k.put(vk.a(), vk.b());
        }
        this.h = false;
        this.j = (byte)-1;
        this.i = false;
        this.g = null;
    }

    public Collection<Rated> a() {
        return this.c;
    }

    public Collection<Rated> b() {
        return this.d;
    }

    public void a(byte by) {
        if (by < 0 || by > 1) {
            a.error((Object)("Impossible de mettre \u00e0 jour le gagnant : l'\u00e9quipe " + by + " n'existe pas"));
        } else {
            this.j = by;
            this.i = false;
            this.m();
        }
    }

    public void c() {
        this.i = true;
        this.m();
    }

    private void m() {
        if (!this.h) {
            this.h = true;
            if (this.g == null) {
                a.error((Object)"Combat sans handler : Mise \u00e0 jour du ladder impossible.");
            } else {
                this.g.a(this);
            }
        }
    }

    public TLongIntHashMap d() {
        return this.k;
    }

    public boolean e() {
        return this.h;
    }

    public boolean f() {
        return this.i;
    }

    public byte g() {
        return this.j;
    }

    public int h() {
        return this.b;
    }

    public Collection<Rated> i() {
        return this.j == 0 ? this.c : this.d;
    }

    public Collection<Rated> j() {
        return this.j == 1 ? this.c : this.d;
    }

    public boolean k() {
        boolean bl = this.e != this.j;
        return this.f || bl;
    }

    public boolean l() {
        boolean bl = this.e == this.j;
        return this.f || bl;
    }

    public void a(Vn<Rated> vn) {
        this.g = vn;
    }

    public String toString() {
        return "RatedTeamMatch{m_teamA=" + this.c + ", m_teamB=" + this.d + "}";
    }
}

