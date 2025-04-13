/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.io.LittleEndianDataInputStream
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.io.LittleEndianDataInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from avS
 */
public class avs_1 {
    private static final LoadingCache<String, byte[]> c = CacheBuilder.newBuilder().expireAfterAccess(1L, TimeUnit.MINUTES).build((CacheLoader)new avt_1());
    public static final int a = 1;
    public static final int b = 100;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(String string, ParticleSystem particleSystem, int n) {
        try (LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream((InputStream)new ByteArrayInputStream((byte[])c.get((Object)string)));){
            avs_1.a((DataInput)littleEndianDataInputStream, particleSystem, n);
        }
    }

    public static void a(DataInput dataInput, ParticleSystem particleSystem, int n) {
        if (n < 1) {
            n = 1;
        } else if (n > 100) {
            n = 100;
        }
        avs_1.a(particleSystem, n, dataInput);
        int n2 = dataInput.readByte() & 0xFF;
        for (int k = 0; k < n2; ++k) {
            awn_2 awn_22 = avs_1.a(dataInput, n);
            if (awn_22 == null) continue;
            particleSystem.a(awn_22);
        }
    }

    private static void a(ParticleSystem particleSystem, int n, DataInput dataInput) {
        boolean bl = dataInput.readBoolean();
        boolean bl2 = dataInput.readBoolean();
        boolean bl3 = dataInput.readBoolean();
        int n2 = dataInput.readInt();
        int n3 = dataInput.readInt();
        long l = dataInput.readLong();
        int n4 = awf_2.d(dataInput, n);
        byte by = dataInput.readByte();
        particleSystem.d(bl);
        particleSystem.j(n4);
        particleSystem.b(by);
        particleSystem.C = bl2;
        aws_2 aws_22 = new aws_2(bl3 ? new awu_2() : awv_2.a());
        particleSystem.a(aws_22);
        particleSystem.A = l;
        particleSystem.a(axn_2.a(n2), axn_2.a(n3));
    }

    private static awn_2 a(DataInput dataInput, float f2) {
        int n;
        int n2;
        float f3 = dataInput.readByte();
        float f4 = dataInput.readByte();
        int n3 = dataInput.readInt();
        if (f2 < f3 || f2 > f4) {
            dataInput.skipBytes(n3);
            return null;
        }
        float f5 = (f2 - f3) / (f4 - f3);
        awn_2 awn_22 = (awn_2)awp_2.a(dataInput, f5);
        int n4 = dataInput.readByte();
        for (n2 = 0; n2 < n4; ++n2) {
            avn_1 avn_12 = awy_1.a(dataInput, f5);
            awn_22.a(avn_12);
        }
        avs_1.a(dataInput, f5, awn_22);
        n2 = dataInput.readByte();
        for (n = 0; n < n2; ++n) {
            awo_2 awo_22 = (awo_2)awq_2.a(dataInput, f5);
            avs_1.a(dataInput, f5, awo_22);
            awn_22.a(awo_22);
        }
        n = dataInput.readByte();
        for (int k = 0; k < n; ++k) {
            awn_2 awn_23 = avs_1.a(dataInput, f2);
            awn_22.a(awn_23);
        }
        return awn_22;
    }

    private static void a(DataInput dataInput, float f2, avk_1 avk_12) {
        int n = dataInput.readByte();
        for (int k = 0; k < n; ++k) {
            avh_1 avh_12 = awd_2.c(dataInput, f2);
            int n2 = dataInput.readByte();
            if (n2 == 0) {
                avh_12.a((avj_1[])null);
            } else {
                avj_1[] avj_1Array = new avj_1[n2];
                for (int i2 = 0; i2 < n2; ++i2) {
                    avj_1Array[i2] = awg_2.a(dataInput, f2);
                }
                avh_12.a(avj_1Array);
            }
            if (avh_12.a()) {
                avk_12.c(avh_12);
                continue;
            }
            avk_12.a(avh_12);
        }
    }
}

