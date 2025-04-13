/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class afp {
    public static final byte a = 1;
    public static final byte b = 2;
    public static final byte c = 3;
    public static final byte d = 4;
    private short e;
    private long f;
    private int g;
    private ArrayList<amb_1> h;
    private ArrayList<amb_1> i;
    private ArrayList<amb_1> j;
    private ArrayList<amb_1> k;
    private amb_1 l;
    private amb_1 m;
    private boolean n;

    public void a(int n, long l, long l2, byte by, short s2, byte by2, int n2) {
        this.a(n, new amb_1(l, l2, by, s2, by2, n2));
    }

    private void a(int n, amb_1 amb_12) {
        switch (amb_12.e()) {
            case 0: {
                this.c(n, amb_12);
                break;
            }
            case -1: {
                this.b(3, amb_12);
                break;
            }
            case -2: {
                this.b(4, amb_12);
                break;
            }
            default: {
                this.b(n, amb_12);
            }
        }
    }

    public Optional<amb_1> a(Long l) {
        Optional<amb_1> optional;
        if (l == null) {
            return Optional.empty();
        }
        if (this.h != null && (optional = this.h.stream().filter(amb_12 -> amb_12.a() == l.longValue()).findFirst()).isPresent()) {
            return optional;
        }
        if (this.i != null && (optional = this.i.stream().filter(amb_12 -> amb_12.a() == l.longValue()).findFirst()).isPresent()) {
            return optional;
        }
        if (this.j != null && (optional = this.j.stream().filter(amb_12 -> amb_12.a() == l.longValue()).findFirst()).isPresent()) {
            return optional;
        }
        if (this.k == null) {
            return Optional.empty();
        }
        return this.k.stream().filter(amb_12 -> amb_12.a() == l.longValue()).findFirst();
    }

    private void b(int n, amb_1 amb_12) {
        ArrayList<amb_1> arrayList;
        if (n == 1) {
            if (this.h == null) {
                this.h = new ArrayList();
            }
            arrayList = this.h;
        } else if (n == 2) {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            arrayList = this.i;
        } else if (n == 3) {
            if (this.j == null) {
                this.j = new ArrayList();
            }
            arrayList = this.j;
        } else if (n == 4) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            arrayList = this.k;
        } else {
            return;
        }
        arrayList.add(amb_12);
        arrayList.sort(afq.a);
    }

    public List<amb_1> a() {
        ArrayList<amb_1> arrayList = new ArrayList<amb_1>();
        if (this.h != null) {
            arrayList.addAll(this.h);
        }
        if (this.i != null) {
            arrayList.addAll(this.i);
        }
        if (this.j != null) {
            arrayList.addAll(this.j);
        }
        if (this.k != null) {
            arrayList.addAll(this.k);
        }
        return arrayList;
    }

    private void c(int n, amb_1 amb_12) {
        if (n == 1) {
            this.l = amb_12;
        } else if (n == 2) {
            this.m = amb_12;
        }
    }

    public ArrayList<amb_1> b() {
        return this.h;
    }

    public ArrayList<amb_1> c() {
        return this.i;
    }

    public List<amb_1> d() {
        return this.j != null ? this.j : Collections.emptyList();
    }

    public List<amb_1> e() {
        return this.k != null ? this.k : Collections.emptyList();
    }

    public amb_1 f() {
        return this.l;
    }

    public amb_1 g() {
        return this.m;
    }

    public short h() {
        return this.e;
    }

    public void a(short s2) {
        this.e = s2;
    }

    public void a(long l) {
        this.f = l;
    }

    public long i() {
        return this.f;
    }

    public void a(int n) {
        this.g = n;
    }

    public int j() {
        return this.g;
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    public boolean k() {
        return this.n;
    }

    final void a(@NotNull arf_1 arf_12) {
        amb_1 amb_12;
        int n;
        this.e = arf_12.b();
        this.f = arf_12.j();
        this.g = arf_12.c();
        int n2 = arf_12.b();
        for (n = 0; n < n2; ++n) {
            amb_12 = new amb_1();
            amb_12.a(arf_12);
            this.a(1, amb_12);
        }
        n2 = arf_12.b();
        for (n = 0; n < n2; ++n) {
            amb_12 = new amb_1();
            amb_12.a(arf_12);
            this.a(2, amb_12);
        }
        n2 = arf_12.b();
        for (n = 0; n < n2; ++n) {
            amb_12 = new amb_1();
            amb_12.a(arf_12);
            this.a(3, amb_12);
        }
        n2 = arf_12.b();
        for (n = 0; n < n2; ++n) {
            amb_12 = new amb_1();
            amb_12.a(arf_12);
            this.a(4, amb_12);
        }
        this.n = arf_12.l();
    }

    final void a(@NotNull gk_0 gk_02) {
        int n;
        int n2;
        gk_02.a(this.e);
        gk_02.c(this.f);
        gk_02.a(this.g);
        short s2 = 0;
        if (this.h != null) {
            s2 = (short)(s2 + (short)this.h.size());
        }
        if (this.l != null) {
            s2 = (short)(s2 + 1);
        }
        gk_02.a(s2);
        if (this.h != null) {
            n2 = this.h.size();
            for (n = 0; n < n2; ++n) {
                this.h.get(n).a(gk_02);
            }
        }
        if (this.l != null) {
            this.l.a(gk_02);
        }
        s2 = 0;
        if (this.i != null) {
            s2 = (short)(s2 + (short)this.i.size());
        }
        if (this.m != null) {
            s2 = (short)(s2 + 1);
        }
        gk_02.a(s2);
        if (this.i != null) {
            n2 = this.i.size();
            for (n = 0; n < n2; ++n) {
                this.i.get(n).a(gk_02);
            }
        }
        if (this.m != null) {
            this.m.a(gk_02);
        }
        s2 = 0;
        if (this.j != null) {
            s2 = (short)(s2 + (short)this.j.size());
        }
        gk_02.a(s2);
        if (this.j != null) {
            n2 = this.j.size();
            for (n = 0; n < n2; ++n) {
                this.j.get(n).a(gk_02);
            }
        }
        s2 = 0;
        if (this.k != null) {
            s2 = (short)(s2 + (short)this.k.size());
        }
        gk_02.a(s2);
        if (this.k != null) {
            n2 = this.k.size();
            for (n = 0; n < n2; ++n) {
                this.k.get(n).a(gk_02);
            }
        }
        gk_02.a(this.n);
    }

    public boolean a(afp afp2) {
        int n;
        int n2;
        if (afp2 == this) {
            return true;
        }
        if (afp2.h == null || this.h == null) {
            if (afp2.h != null || this.h != null) {
                return false;
            }
        } else {
            if (afp2.h.size() != this.h.size()) {
                return false;
            }
            n2 = this.h.size();
            for (n = 0; n < n2; ++n) {
                if (this.h.get(n).equals(afp2.h.get(n))) continue;
                return false;
            }
        }
        if (afp2.i == null || this.i == null) {
            if (afp2.i != null || this.i != null) {
                return false;
            }
        } else {
            if (afp2.i.size() != this.i.size()) {
                return false;
            }
            n2 = this.i.size();
            for (n = 0; n < n2; ++n) {
                if (this.i.get(n).equals(afp2.i.get(n))) continue;
                return false;
            }
        }
        if (afp2.j == null || this.j == null) {
            if (afp2.j != null || this.j != null) {
                return false;
            }
        } else {
            if (afp2.j.size() != this.j.size()) {
                return false;
            }
            n2 = this.j.size();
            for (n = 0; n < n2; ++n) {
                if (this.j.get(n).equals(afp2.j.get(n))) continue;
                return false;
            }
        }
        if (afp2.k == null || this.k == null) {
            if (afp2.k != null || this.k != null) {
                return false;
            }
        } else {
            if (afp2.k.size() != this.k.size()) {
                return false;
            }
            n2 = this.k.size();
            for (n = 0; n < n2; ++n) {
                if (this.k.get(n).equals(afp2.k.get(n))) continue;
                return false;
            }
        }
        if (this.l == null || afp2.l == null ? this.l != null || afp2.l != null : !this.l.equals(afp2.l)) {
            return false;
        }
        if (this.m == null || afp2.m == null ? this.m != null || afp2.m != null : !this.m.equals(afp2.m)) {
            return false;
        }
        return this.n == afp2.n;
    }
}

