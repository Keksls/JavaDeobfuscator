/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aEL
 */
public final class ael_2 {
    private static final Logger c = Logger.getLogger(ael_2.class);
    public static final int a = 11;
    private final aff_1 d = new aff_1();
    private aff_1 e = null;
    private final List<aem_2> f;

    public static ael_2 a(apl_1 apl_12) {
        if (!apl_12.b() || apl_12.a() <= 1) {
            c.error((Object)"Impossible de convertir un PathFindResult sans r\u00e9sultat en Direction8Path");
            return null;
        }
        ael_2 ael_22 = new ael_2(apl_12.a() - 1);
        ael_22.c(new aff_1(apl_12.c()));
        for (int k = 1; k < apl_12.a(); ++k) {
            aej_2 aej_22 = apl_12.b(k);
            int n = apl_12.a(k)[2] - apl_12.a(k - 1)[2];
            if (aej_22 == null) {
                c.error((Object)"Impossible de convertir le d\u00e9placement en Direction8 : le PathFindResult n'est pas continu ?");
                return null;
            }
            ael_22.a(aej_22, n);
        }
        ael_22.b(new aff_1(apl_12.d()));
        return ael_22;
    }

    public ael_2(aff_1 aff_12, List<aem_2> list) {
        this.f = list;
        if (list == null || list.size() == 0) {
            c.error((Object)"Liste de cellules vide");
            return;
        }
        this.c(aff_12);
    }

    public static ael_2 a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 11) {
            c.error((Object)("Impossible de d\u00e9coder un Direction8Path dans un buffer de " + byteBuffer.remaining() + " < 11"));
            return null;
        }
        byteBuffer.mark();
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        int n3 = byteBuffer.get() & 0xFF;
        ael_2 ael_22 = new ael_2(n3);
        aff_1 aff_12 = new aff_1(n, n2, s2);
        ael_22.c(aff_12);
        if (byteBuffer.remaining() < ael_22.f()) {
            c.error((Object)("La taille du buffer ne correspond pas : attendu=" + ael_22.f() + " > courant=" + byteBuffer.remaining()));
            byteBuffer.reset();
            return null;
        }
        for (int k = 0; k < n3; ++k) {
            byte by = byteBuffer.get();
            aej_2 aej_22 = aej_2.a(by >> 5 & 7);
            int n4 = by & 0x1F;
            if ((n4 & 0x10) != 0) {
                n4 |= 0xFFFFFFE0;
            }
            ael_22.a(aej_22, n4);
        }
        ael_22.b(aff_12);
        return ael_22;
    }

    public static ael_2 a(aff_1 aff_12, ael_2 ael_22, ael_2 ael_23) {
        aff_1 aff_13 = ael_23.a();
        aff_1 aff_14 = ael_22.a();
        int n = -1;
        int n2 = -1;
        if (aff_14.a((Object)aff_12)) {
            n = 0;
        }
        if (aff_14.a((Object)aff_13)) {
            n2 = 0;
        }
        for (int k = 0; k < ael_22.e(); ++k) {
            aem_2 aem_22 = ael_22.a(k);
            aff_14.a(aem_22.a);
            aff_14.a(0, 0, aff_14.f() + aem_22.b);
            if (n == -1 && aff_14.a((Object)aff_12)) {
                n = k + 1;
                if (n2 != -1) break;
            }
            if (!aff_14.a((Object)aff_13)) continue;
            n2 = k + 1;
            if (n != -1) break;
        }
        if (n != -1 && n2 != -1) {
            ael_2 ael_24 = new ael_2(ael_23.e() + ael_22.e());
            ael_24.c(aff_12);
            if (n2 >= n) {
                for (int k = n; k <= n2 - 1; ++k) {
                    ael_24.a(ael_22.a(k));
                }
            } else {
                for (int k = n - 1; k >= n2; --k) {
                    aem_2 aem_23 = ael_22.a(k);
                    ael_24.a(aem_23.a.g(), -aem_23.b);
                }
            }
            ael_24.f.addAll(ael_23.f);
            ael_24.b(new aff_1(ael_23.b()));
            return ael_24;
        }
        return null;
    }

    public aff_1 a() {
        return new aff_1(this.d);
    }

    public aff_1 b() {
        if (this.e == null) {
            aff_1 aff_12 = this.a();
            for (aem_2 aem_22 : this.f) {
                aff_12.a(aem_22.a);
                aff_12.a(0, 0, aem_22.b);
            }
            this.e = aff_12;
        }
        return new aff_1(this.e);
    }

    @Nullable
    private aff_1 b(int n) {
        aff_1 aff_12 = this.a();
        if (n < 0 || n >= this.e()) {
            return null;
        }
        for (int k = 0; k < n; ++k) {
            aem_2 aem_22 = this.a(k);
            aff_12.a(aem_22.a);
            aff_12.a(0, 0, aem_22.b);
        }
        return new aff_1(aff_12);
    }

    public byte[] c() {
        assert (this.f.size() <= 255) : "Impossible d'encoder un Direction8Path de plus de 255 steps";
        ByteBuffer byteBuffer = ByteBuffer.allocate(this.d());
        byteBuffer.putInt(this.d.d());
        byteBuffer.putInt(this.d.e());
        byteBuffer.putShort(this.d.f());
        byteBuffer.put((byte)this.f.size());
        for (aem_2 aem_22 : this.f) {
            int n = (aem_22.a.l & 7) << 5;
            byteBuffer.put((byte)(n |= aem_22.b & 0x1F));
        }
        return byteBuffer.array();
    }

    public int d() {
        return 11 + this.f();
    }

    public String toString() {
        String string = "{ size = " + this.f.size() + ", [" + this.d.d() + ":" + this.d.e() + ":" + this.d.f() + "] ";
        aff_1 aff_12 = this.a();
        for (aem_2 aem_22 : this.f) {
            aff_12.a(aem_22.a);
            aff_12.a(0, 0, aem_22.b);
            string = string + "[" + aff_12.d() + ":" + aff_12.e() + ":" + aff_12.f() + "] ";
        }
        string = string + "}";
        return string;
    }

    public boolean equals(Object object) {
        if (object != null && object instanceof ael_2) {
            ael_2 ael_22 = (ael_2)object;
            if (!ael_22.d.equals(this.d)) {
                return false;
            }
            return ael_22.f.equals(this.f);
        }
        return false;
    }

    public int e() {
        return this.f.size();
    }

    public aem_2 a(int n) {
        return this.f.get(n);
    }

    public ael_2 a(int n, int n2) {
        int n3;
        if (n < 0 || n >= n2 || n2 > this.e()) {
            throw new IllegalArgumentException("0 <= startIndex < endIndex <= size() non-respect\u00e9");
        }
        ael_2 ael_22 = new ael_2(n2 - n);
        aff_1 aff_12 = this.a();
        for (n3 = 0; n3 < n; ++n3) {
            aem_2 aem_22 = this.f.get(n3);
            aff_12.a(aem_22.a);
            aff_12.a(0, 0, aem_22.b);
        }
        ael_22.c(aff_12);
        for (n3 = n; n3 < n2; ++n3) {
            ael_22.a(this.f.get(n3));
        }
        return ael_22;
    }

    public boolean a(aff_1 aff_12) {
        aff_1 aff_13 = this.a();
        if (aff_13.a((Object)aff_12)) {
            return true;
        }
        for (int k = 0; k < this.e(); ++k) {
            aem_2 aem_22 = this.f.get(k);
            aff_13.a(aem_22.a);
            aff_13.a(0, 0, aem_22.b);
            if (!aff_13.a((Object)aff_12)) continue;
            return true;
        }
        return false;
    }

    public boolean a(ael_2 ael_22) {
        if (ael_22 == null) {
            return false;
        }
        int n = this.e();
        int n2 = ael_22.e();
        if (n2 > n) {
            return false;
        }
        aff_1 aff_12 = ael_22.a();
        for (int k = 0; k < n; ++k) {
            aff_1 aff_13 = this.b(k);
            if (aff_13 == null || !aff_13.equals(aff_12)) continue;
            boolean bl = true;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (k + i2 >= n) continue;
                aff_1 aff_14 = ael_22.b(i2);
                aff_1 aff_15 = this.b(k + i2);
                if (aff_14 != null && aff_14.equals(aff_15)) continue;
                bl = false;
            }
            if (!bl) continue;
            return true;
        }
        return false;
    }

    public boolean a(aej_2 aej_22) {
        for (aem_2 aem_22 : this.f) {
            if (aem_22.a.l != aej_22.l) continue;
            return true;
        }
        return false;
    }

    private ael_2(int n) {
        this.f = new ArrayList<aem_2>(n);
    }

    private void a(aej_2 aej_22, int n) {
        if (n < -16 || n > 15 || aej_22.l < 0 || aej_22.l > 7 || this.f.size() > 255) {
            throw new IllegalArgumentException("step ou direction invalides");
        }
        this.f.add(new aem_2(aej_22, n));
    }

    private void a(aem_2 aem_22) {
        if (aem_22.b < -16 || aem_22.b > 15 || aem_22.a.l < 0 || aem_22.a.l > 7) {
            throw new IllegalArgumentException("step ou direction invalides");
        }
        this.a(aem_22.a, aem_22.b);
    }

    private void c(aff_1 aff_12) {
        this.d.g(aff_12);
    }

    public void b(aff_1 aff_12) {
        this.e = aff_12;
    }

    private int f() {
        return this.f.size();
    }
}

