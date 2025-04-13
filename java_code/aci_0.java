/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from acI
 */
public class aci_0 {
    private static final Logger k = Logger.getLogger(aci_0.class);
    public static final int a = 1024;
    public static final int b = 576;
    private static final TLongArrayList l = new TLongArrayList(2048);
    private static final ArrayList<ScreenElement> m = new ArrayList();
    private static final LoadingCache<String, byte[]> n = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new acj_0());
    final ArrayList<ScreenElement> c;
    final short d;
    final short e;
    int f;
    int g;
    int h;
    int i;
    private int o = Integer.MAX_VALUE;
    private int p = Integer.MAX_VALUE;
    private short q = (short)Short.MAX_VALUE;
    private int r = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;
    private short t = (short)Short.MIN_VALUE;

    public aci_0() {
        this(0, 0);
    }

    public aci_0(int n, int n2) {
        this.c = new ArrayList(1024);
        this.f = Integer.MAX_VALUE;
        this.h = Integer.MIN_VALUE;
        this.g = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        assert (n > Short.MIN_VALUE && n < Short.MAX_VALUE);
        assert (n2 > Short.MIN_VALUE && n2 < Short.MAX_VALUE);
        this.d = (short)n;
        this.e = (short)n2;
    }

    public final void a() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            ScreenElement screenElement = this.c.get(k);
            screenElement.u();
        }
        this.c.clear();
    }

    public final int a(byte by) {
        int n = 0;
        int n2 = this.c.size();
        for (int k = 0; k < n2; ++k) {
            ScreenElement screenElement = this.c.get(k);
            byte by2 = screenElement.i().n();
            if ((by2 & by) != by2) continue;
            ++n;
        }
        return n;
    }

    public final ArrayList<ScreenElement> b() {
        return this.c;
    }

    public final short c() {
        return this.d;
    }

    public final short d() {
        return this.e;
    }

    public boolean a(String string) {
        byte[] byArray;
        String string2 = this.b(string);
        try {
            byArray = (byte[])n.get((Object)string2);
        }
        catch (ExecutionException executionException) {
            k.error((Object)("Unable to load map (" + string2 + ") in CACHE"));
            return false;
        }
        if (byArray == null) {
            k.error((Object)("Unable to load map (" + string2 + ")"));
            return false;
        }
        arf_1 arf_12 = arf_1.a(byArray);
        this.o = arf_12.c();
        this.p = arf_12.c();
        this.q = arf_12.b();
        this.r = arf_12.c();
        this.s = arf_12.c();
        this.t = arf_12.b();
        int n = arf_12.b() & 0xFFFF;
        int[] nArray = new int[n];
        byte[] byArray2 = new byte[n];
        int[] nArray2 = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = arf_12.c();
            byArray2[k] = arf_12.a();
            nArray2[k] = arf_12.c();
        }
        float[][] fArray = this.a(arf_12);
        boolean bl = true;
        int n2 = arf_12.c();
        int n3 = arf_12.c();
        int n4 = arf_12.b() & 0xFFFF;
        for (int k = 0; k < n4; ++k) {
            int n5 = n2 + (arf_12.a() & 0xFF);
            int n6 = n2 + (arf_12.a() & 0xFF);
            int n7 = n3 + (arf_12.a() & 0xFF);
            int n8 = n3 + (arf_12.a() & 0xFF);
            for (int i2 = n5; i2 < n6; ++i2) {
                for (int i3 = n7; i3 < n8; ++i3) {
                    int n9 = arf_12.a() & 0xFF;
                    for (int i4 = 0; i4 < n9; ++i4) {
                        ScreenElement screenElement = (ScreenElement)ScreenElement.a.d();
                        screenElement.d = i2;
                        screenElement.e = i3;
                        bl &= screenElement.a(arf_12);
                        int n10 = arf_12.b() & 0xFFFF;
                        screenElement.k = nArray[n10];
                        screenElement.l = byArray2[n10];
                        screenElement.m = nArray2[n10];
                        int n11 = arf_12.b() & 0xFFFF;
                        screenElement.p = fArray[n11];
                        agD agD2 = screenElement.h;
                        if (agD2 == null) continue;
                        screenElement.t();
                        screenElement.s();
                        this.c.add(screenElement);
                    }
                }
            }
        }
        arf_12.close();
        this.e();
        return bl;
    }

    private float[][] a(arf_1 arf_12) {
        int n = arf_12.b() & 0xFFFF;
        float[][] fArrayArray = new float[n][];
        for (int k = 0; k < n; ++k) {
            byte by = arf_12.a();
            fArrayArray[k] = ScreenElement.e(by);
            ScreenElement.a(fArrayArray[k], by, arf_12);
        }
        return fArrayArray;
    }

    public final void e() {
        aci_0.a(this.c);
        this.g();
    }

    private void g() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            int n2;
            int n3;
            ScreenElement screenElement = this.c.get(k);
            if (screenElement.g < this.f) {
                this.f = screenElement.g;
            }
            if (screenElement.g + (n3 = screenElement.h.d()) > this.h) {
                this.h = screenElement.g + n3;
            }
            if (screenElement.f > this.i) {
                this.i = screenElement.f;
            }
            if (screenElement.f - (n2 = screenElement.h.e()) >= this.g) continue;
            this.g = screenElement.f - n2;
        }
    }

    private static void a(ArrayList<ScreenElement> arrayList) {
        int n;
        l.reset();
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            ScreenElement screenElement = arrayList.get(n);
            l.add((screenElement.o << 14) + (long)n);
        }
        l.sort();
        m.clear();
        m.ensureCapacity(n2);
        n = 0;
        for (int k = 0; k < n2; ++k) {
            long l = aci_0.l.getQuick(k);
            int n3 = (int)(l & 0x3FFFL);
            if (l < 0L) {
                m.add(arrayList.get(n3));
                continue;
            }
            m.add(n, arrayList.get(n3));
            ++n;
        }
        arrayList.clear();
        arrayList.addAll(m);
    }

    public final String toString() {
        return "ScreenMap {" + this.d + ", " + this.e + "}";
    }

    int a(String string, int[] nArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        String string2 = this.b(string);
        gk_0 gk_02 = new gk_0();
        this.f();
        HashSet<acl_0> hashSet = new HashSet<acl_0>();
        HashSet<ack_0> hashSet2 = new HashSet<ack_0>();
        int n11 = this.c.size();
        for (n10 = 0; n10 < n11; ++n10) {
            ScreenElement screenElement = this.c.get(n10);
            hashSet.add(new acl_0(screenElement));
            hashSet2.add(new ack_0(screenElement));
        }
        gk_02.a(this.o);
        gk_02.a(this.p);
        gk_02.a(this.q);
        gk_02.a(this.r);
        gk_02.a(this.s);
        gk_02.a(this.t);
        n10 = Integer.MAX_VALUE;
        int n12 = Integer.MAX_VALUE;
        int n13 = Integer.MIN_VALUE;
        int n14 = Integer.MIN_VALUE;
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap(512);
        for (int k = 0; k < n11; ++k) {
            ScreenElement screenElement = this.c.get(k);
            n9 = screenElement.d;
            n8 = screenElement.e;
            if (n9 < n10) {
                n10 = n9;
            }
            if (n9 > n13) {
                n13 = n9;
            }
            if (n8 < n12) {
                n12 = n8;
            }
            if (n8 > n14) {
                n14 = n8;
            }
            int n15 = Hw.d(n9, n8);
            ahx_2.a(tIntObjectHashMap, n15, screenElement);
        }
        ArrayList arrayList = new ArrayList(hashSet);
        gk_02.a((short)arrayList.size());
        for (int k = 0; k < arrayList.size(); ++k) {
            ((acl_0)arrayList.get(k)).a(gk_02);
        }
        nArray[1] = arrayList.size();
        ArrayList arrayList2 = new ArrayList(hashSet2);
        gk_02.a((short)arrayList2.size());
        for (n9 = 0; n9 < arrayList2.size(); ++n9) {
            ((ack_0)arrayList2.get(n9)).a(gk_02);
        }
        nArray[2] = arrayList2.size();
        assert (n13 - n10 <= 255);
        assert (n14 - n12 <= 255);
        gk_02.a(n10);
        gk_02.a(n12);
        n9 = n13 - n10 + 1;
        n8 = n14 - n12 + 1;
        ArrayList<afk_2> arrayList3 = new ArrayList<afk_2>(n9 * n8);
        byte[] byArray = new byte[n8 * n9];
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ArrayList arrayList4 = (ArrayList)tIntObjectIterator.value();
            n7 = arrayList4.size();
            n6 = tIntObjectIterator.key();
            n5 = Hw.b(n6);
            n4 = Hw.c(n6);
            byArray[(n4 - n12) * n9 + (n5 - n10)] = (byte)n7;
        }
        for (n3 = 0; n3 < n8; ++n3) {
            for (n7 = 0; n7 < n9; ++n7) {
                if (byArray[n3 * n9 + n7] == 0) continue;
                n6 = 1;
                n5 = 1;
                for (n4 = n3 + 1; n4 < n8 && byArray[n4 * n9 + n7] != 0; ++n4) {
                    ++n5;
                }
                for (n4 = n7 + 1; n4 < n9; ++n4) {
                    n2 = 1;
                    for (n = n3; n < n3 + n5; ++n) {
                        if (byArray[n * n9 + n4] != 0) continue;
                        n2 = 0;
                        break;
                    }
                    if (n2 == 0) break;
                    ++n6;
                }
                for (n4 = n3; n4 < n3 + n5; ++n4) {
                    for (n2 = n7; n2 < n7 + n6; ++n2) {
                        byArray[n4 * n9 + n2] = 0;
                    }
                }
                arrayList3.add(new afk_2(n7, n7 + n6, n3, n3 + n5));
            }
        }
        n3 = arrayList3.size();
        gk_02.a((short)n3);
        for (n7 = 0; n7 < n3; ++n7) {
            afk_2 afk_22 = (afk_2)arrayList3.get(n7);
            gk_02.a((byte)afk_22.b);
            gk_02.a((byte)afk_22.c);
            gk_02.a((byte)afk_22.d);
            gk_02.a((byte)afk_22.e);
            for (n5 = afk_22.b; n5 < afk_22.c; ++n5) {
                for (n4 = afk_22.d; n4 < afk_22.e; ++n4) {
                    n2 = n5 + n10;
                    n = n4 + n12;
                    int n16 = Hw.d(n2, n);
                    ArrayList arrayList5 = (ArrayList)tIntObjectHashMap.get(n16);
                    int n17 = arrayList5.size();
                    gk_02.a((byte)n17);
                    for (int k = 0; k < n17; ++k) {
                        ScreenElement screenElement = (ScreenElement)arrayList5.get(k);
                        screenElement.a(gk_02);
                        int n18 = arrayList.indexOf(new acl_0(screenElement));
                        if (n18 == -1 || n18 > Short.MAX_VALUE) {
                            throw new RuntimeException("pas d'indexage de groupe");
                        }
                        gk_02.a((short)n18);
                        int n19 = arrayList2.indexOf(new ack_0(screenElement));
                        if (n19 == -1 || n19 > Short.MAX_VALUE) {
                            throw new RuntimeException("pas d'indexage de couleur");
                        }
                        gk_02.a((short)n19);
                    }
                }
            }
        }
        FileOutputStream fileOutputStream = gi_0.o(string2);
        byte[] byArray2 = gk_02.a();
        fileOutputStream.write(byArray2);
        gk_02.d();
        fileOutputStream.close();
        return byArray2.length;
    }

    public void f() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            ScreenElement screenElement = this.c.get(k);
            if (screenElement.d < this.o) {
                this.o = screenElement.d;
            }
            if (screenElement.d > this.r) {
                this.r = screenElement.d;
            }
            if (screenElement.e < this.p) {
                this.p = screenElement.e;
            }
            if (screenElement.e > this.s) {
                this.s = screenElement.e;
            }
            if (screenElement.c < this.q) {
                this.q = screenElement.c;
            }
            if (screenElement.c <= this.t) continue;
            this.t = screenElement.c;
        }
    }

    void a(ScreenElement screenElement) {
        this.c.add(screenElement);
    }

    boolean a(int n, int n2) {
        return n >= this.o && n <= this.r && n2 >= this.p && n2 <= this.s;
    }

    boolean a(int n, int n2, short s2) {
        return n >= this.o && n <= this.r && n2 >= this.p && n2 <= this.s && s2 >= this.q && s2 <= this.t;
    }

    private String b(String string) {
        return string + this.d + "_" + this.e;
    }
}

