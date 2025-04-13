/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Range
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Dl
 */
public class dl_0 {
    public static void a(dj_0 dj_02, eg_1 eg_12) {
        try {
            int n2 = eg_12.b() & 0xFFFF;
            di_0[] di_0Array = (di_0[])ContiguousSet.create((Range)Range.closedOpen((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(n2)), (DiscreteDomain)DiscreteDomain.integers()).stream().map(n -> dl_0.a(eg_12)).toArray(di_0[]::new);
            dj_02.a(di_0Array);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("unable to load sprite definitions", iOException);
        }
    }

    @Nullable
    private static di_0 a(eg_1 eg_12) {
        try {
            int n;
            int n2;
            di_0 di_02 = new di_0();
            di_02.b(false);
            short s2 = eg_12.b();
            di_02.a(s2);
            di_02.a(eg_12.a());
            if ((di_02.e() & 0x40) == 0) {
                di_02.a(0);
                di_02.b(0);
            } else {
                di_02.a(eg_12.e());
                di_02.a(di_02.b().hashCode());
                n2 = di_02.b().indexOf(95) + 1;
                di_02.b(di_02.b().substring(n2).hashCode());
            }
            eg_12.c();
            eg_12.c();
            if (!di_02.j()) {
                int n3;
                n2 = eg_12.a() & 0xFF;
                if (n2 != 0) {
                    for (n3 = 0; n3 < n2; ++n3) {
                        ef_0.a(eg_12);
                    }
                }
                if ((n3 = eg_12.a() & 0xFF) != 0) {
                    for (n = 0; n < n3; ++n) {
                        ef_0.a(eg_12);
                    }
                }
            }
            n2 = eg_12.b() & 0xFFFF;
            fs_0[] fs_0Array = new fs_0[n2];
            di_02.a(fs_0Array);
            for (n = 0; n < fs_0Array.length; ++n) {
                int n4;
                Fz[] fzArray = new fs_0();
                int n5 = ee_1.a((fs_0)fzArray, eg_12, n);
                fs_0Array[n] = fzArray;
                if (n5 > 0) {
                    try {
                        fs_0 fs_02 = new fs_0();
                        fs_02.a(fs_0Array[n].a());
                        fs_02.a(new Fz[0]);
                        for (int k = 0; k < n5; ++k) {
                            fs_0Array[++n] = fs_02;
                        }
                    }
                    catch (Exception exception) {
                        throw new IOException("erreur avec la definition " + di_02.b() + ". nombre de frame incorrete", exception);
                    }
                }
                if ((n4 = fs_0Array[n].a().length) <= di_02.g()) continue;
                di_02.d(n4);
            }
            if (fs_0Array.length == 1) {
                Fz[] fzArray;
                for (Fz fz : fzArray = fs_0Array[0].b()) {
                    switch (fz.b()) {
                        case a: 
                        case h: 
                        case d: 
                        case b: {
                            di_02.a(true);
                        }
                    }
                }
            }
            if (dh_0.a(di_02.b())) {
                return null;
            }
            return di_02;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to load sprite", iOException);
        }
    }
}

