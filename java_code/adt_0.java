/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  org.apache.log4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from adt
 */
public class adt_0
implements adv_0 {
    protected static Logger a = Logger.getLogger(adt_0.class);
    private static final String b = auc_1.a().c() + "textures/";
    private static final int c = 30;
    private static final LoadingCache<String, azk_2> d = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).removalListener(removalNotification -> ((azk_2)removalNotification.getValue()).u()).build((CacheLoader)new adu_0());
    private final aey_2 e;
    private float[] f = null;
    private int g;
    private int h;

    public adt_0(String string, aey_2 aey_22) {
        this.e = aey_22;
        String string2 = b + string;
        this.a(string2);
    }

    void a(String string) {
        azk_2 azk_22;
        try {
            azk_22 = (azk_2)d.get((Object)string);
        }
        catch (ExecutionException executionException) {
            a.error((Object)("Unable to get image (" + string + ") in CACHE"));
            return;
        }
        if (azk_22 == null) {
            a.error((Object)("Unable to load image (" + string + ")"));
            return;
        }
        azr_2 azr_22 = azk_22.a(0);
        this.g = azr_22.a();
        this.h = azr_22.b();
        this.f = new float[this.h * this.g];
        for (int k = 0; k < this.h; ++k) {
            int n = k * this.g;
            for (int i2 = 0; i2 < this.g; ++i2) {
                azj_2 azj_22 = azr_22.b(i2, k);
                this.f[n + i2] = azj_22.q();
            }
        }
    }

    @Override
    public void a(float[] fArray, int n, int n2, int n3, int n4) {
        int n5;
        if (this.f == null) {
            return;
        }
        int n6 = n3 % this.g;
        if (n6 < 0) {
            n6 += this.g;
        }
        if ((n5 = n4 % this.h) < 0) {
            n5 += this.h;
        }
        if (this.e == null) {
            for (int k = n5; k < n5 + n2; ++k) {
                int n7 = k % this.h;
                int n8 = n7 * this.g;
                int n9 = (k - n5) * n2 - n6;
                for (int i2 = n6; i2 < n6 + n; ++i2) {
                    int n10 = i2 % this.g;
                    fArray[n9 + i2] = this.f[n8 + n10];
                }
            }
        } else {
            for (int k = n5; k < n5 + n2; ++k) {
                int n11 = k % this.h;
                int n12 = n11 * this.g;
                int n13 = (k - n5) * n2 - n6;
                for (int i3 = n6; i3 < n6 + n; ++i3) {
                    int n14 = i3 % this.g;
                    fArray[n13 + i3] = this.e.a(n14, n11, this.f[n12 + n14]);
                }
            }
        }
    }
}

