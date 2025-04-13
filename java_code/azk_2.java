/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.util.texture.TextureData
 *  com.jogamp.opengl.util.texture.awt.AWTTextureIO
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.awt.AWTTextureIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from azk
 */
public class azk_2
extends abp_1 {
    public static final azq_2 o;
    public static final azq_2 p;
    public static final azq_2 q;
    protected azz_1 r;
    protected boolean s;
    protected static final azr_2 t;
    private static final Logger a;
    private abc_1 b;
    private ArrayList<azr_2> c;
    private afe_1 d;
    private afe_1 e;
    private boolean f;
    private static final boolean g = false;

    public azk_2() {
        this(abc_1.a, t);
    }

    public static azk_2 a(BufferedImage bufferedImage) {
        azl_2 azl_22 = new azl_2(bufferedImage);
        azl_22.a();
        int n = azl_22.b();
        TextureData textureData = AWTTextureIO.newTextureData((GLProfile)GLProfile.getDefault(), (BufferedImage)bufferedImage, (int)n, (int)n, (boolean)false);
        Buffer buffer = textureData.getBuffer();
        azr_2 azr_22 = new azr_2(textureData.getWidth(), textureData.getHeight(), azl_22.c(), null, (ByteBuffer)buffer);
        azr_22.a(azl_22.d());
        azk_2 azk_22 = new azk_2(abc_1.a, azr_22);
        azr_22.u();
        return azk_22;
    }

    private void a() {
        if (!this.c.isEmpty()) {
            this.d = this.b(0);
            this.e = new afe_1(this.d);
        }
    }

    public azk_2(abc_1 abc_12, azr_2[] azr_2Array) {
        this.b = abc_12;
        this.c = new ArrayList(azr_2Array.length);
        for (azr_2 azr_22 : azr_2Array) {
            this.a(azr_22);
        }
        this.a();
    }

    public azk_2(abc_1 abc_12, azr_2 azr_22) {
        this.b = abc_12;
        this.c = new ArrayList(1);
        this.a(azr_22);
        this.a();
    }

    public azk_2(azk_2 azk_22) {
        assert (azk_22.b != null) : "On copie une image releas\u00e9e";
        this.b = azk_22.b;
        int n = azk_22.c.size();
        this.c = new ArrayList(n);
        for (int k = 0; k < n; ++k) {
            this.a(new azr_2(azk_22.a(k)));
        }
        this.a();
    }

    public azk_2(String string) {
        this.c(string);
    }

    public boolean b(String string) {
        azk_1 azk_12 = azk_2.a(string);
        this.d = azk_2.a(azk_12, string);
        if (this.d == null) {
            return false;
        }
        this.e = new afe_1(Hw.e(this.d.a()), Hw.e(this.d.b()));
        this.r = new azz_1(azk_12, string);
        gg_0.a(this.r);
        return true;
    }

    public boolean c(String string) {
        return this.a(azk_2.e(string));
    }

    private boolean a(azk_2 azk_22) {
        if (azk_22 == null) {
            return false;
        }
        this.b = azk_22.b;
        if (this.c != null) {
            for (int k = 0; k < this.c.size(); ++k) {
                this.c.get(k).u();
            }
        }
        this.c = azk_22.c;
        this.a();
        azk_22.c = null;
        azk_22.u();
        return true;
    }

    public static azk_2 a(byte[] byArray, String string) {
        azk_2 azk_22 = azk_2.b(byArray, string);
        if (azk_22 == null) {
            return null;
        }
        azk_22.a();
        return azk_22;
    }

    public boolean a(String ... stringArray) {
        assert (stringArray.length > 0);
        azr_2 azr_22 = this.c.remove(0);
        azr_22.u();
        abc_1 abc_12 = null;
        int n = -1;
        int n2 = -1;
        for (int k = 0; k < stringArray.length; ++k) {
            azk_2 azk_22 = azk_2.e(stringArray[k]);
            if (azk_22 == null) {
                return false;
            }
            if (abc_12 != null && !abc_12.equals(azk_22.b)) {
                azk_22.u();
                return false;
            }
            abc_12 = azk_22.b;
            assert (azk_22.b != null) : "image releas\u00e9e";
            int n3 = azk_22.t();
            for (int i2 = 0; i2 < n3; ++i2) {
                azr_2 azr_23 = azk_22.a(i2);
                if (n == -1 && n2 == -1) {
                    n = azr_23.a();
                    n2 = azr_23.b();
                } else if (n != azr_23.a() || n2 != azr_23.b()) {
                    azk_22.u();
                    return false;
                }
                this.a(azr_23);
            }
            azk_22.u();
        }
        this.b = abc_12;
        this.a();
        return true;
    }

    public void a(int n, azh_2 azh_22) {
        this.c.get(n).a(azh_22);
    }

    public void a(int n, azr_2 azr_22) {
        azr_22.k_();
        this.c.get(n).u();
        this.c.set(n, azr_22);
    }

    public final void a(azr_2 azr_22) {
        azr_22.k_();
        this.c.add(azr_22);
    }

    public final boolean s() {
        return this.c == null || this.c.isEmpty() || this.c.get(0) == t;
    }

    @Nullable
    public azr_2 a(int n) {
        if (this.c == null) {
            return null;
        }
        assert (n < this.c.size());
        return this.c.get(n);
    }

    public final int t() {
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    public final abc_1 v() {
        return this.b;
    }

    public final afe_1 b(int n) {
        return this.a(n).c();
    }

    public afe_1 w() {
        return this.d;
    }

    public azj_2 a(int n, int n2, int n3) {
        return this.a(n3).b(n, n2);
    }

    public void d(boolean bl) {
        this.f = bl;
    }

    public afe_1 x() {
        return this.e;
    }

    public final void y() {
        int n = this.t();
        for (int k = 0; k < n; ++k) {
            azr_2 azr_22 = azk_2.b(this.a(k));
            this.a(k, azr_22);
            azr_22.u();
        }
        if (!this.c.isEmpty()) {
            this.e = this.b(0);
        }
    }

    private static azr_2 b(azr_2 azr_22) {
        azr_2 azr_23 = azk_2.a(azr_22.h(), azr_22.a(), azr_22.b(), azr_22.g());
        azr_23.a(azr_22.n());
        azr_23.a(azr_22.e(), azr_22.f());
        return azr_23;
    }

    public void z() {
        this.s = true;
    }

    public final void a(float f2, float f3, azq_2 azq_22) {
        for (azr_2 azr_22 : this.c) {
            azr_22.a(f2, f3, azq_22);
        }
        this.a();
    }

    public final void A() {
        for (int k = this.c.size() - 1; k >= 1; --k) {
            azr_2 azr_22 = this.c.get(k);
            azr_2 azr_23 = this.c.get(k - 1);
            if (azr_22.g() != 32) {
                this.a(k - 1, azr_22);
                continue;
            }
            azr_23.a(azr_22);
            this.c.remove(k);
            azr_22.u();
        }
    }

    public static afe_1 d(String string) {
        azk_1 azk_12 = azk_2.a(string);
        return azk_2.a(azk_12, string);
    }

    public static afe_1 a(azk_1 azk_12, String string) {
        if (azk_12 == null) {
            return null;
        }
        afe_1 afe_12 = azk_12.a(string);
        if (afe_12 == null) {
            a.error((Object)("Unable to read image " + string));
        }
        return afe_12;
    }

    public static azk_2 e(String string) {
        azk_1 azk_12 = azk_2.a(string);
        if (azk_12 == null) {
            return null;
        }
        azk_2 azk_22 = azk_12.b(string);
        if (azk_22 == null) {
            a.error((Object)("Impossible de lire l'image " + string));
        }
        return azk_22;
    }

    public static azk_2 b(byte[] byArray, String string) {
        assert (byArray != null);
        azk_1 azk_12 = azl_1.a().a(string);
        if (azk_12 == null) {
            a.error((Object)("No ImageReader registered for file ext (." + string + ")"));
            a.error((Object)("Did you forget to call ImageReaderFactory.getInstance().registerReader (\"" + string + "\", new " + string + "Reader ()); ?"));
            return null;
        }
        azk_2 azk_22 = azk_12.b(byArray);
        if (azk_22 == null) {
            a.error((Object)"Impossible de lire les donn\u00e9es d'image.");
        }
        return azk_22;
    }

    public static void a(byte[] byArray, int n) {
        block3: {
            block2: {
                if (n != 16) break block2;
                int n2 = 0;
                while (n2 < byArray.length) {
                    byte by = byArray[n2];
                    byte by2 = byArray[n2 + 1];
                    byArray[n2++] = (byte)(by2 << 3 | by & 7);
                    byArray[n2++] = (byte)(by2 & 0xE0 | by >> 3);
                }
                break block3;
            }
            if (n != 24 && n != 32) break block3;
            int n3 = n / 8;
            for (int k = 0; k < byArray.length; k += n3) {
                byte by = byArray[k];
                byArray[k] = byArray[k + 2];
                byArray[k + 2] = by;
            }
        }
    }

    public static byte[] b(BufferedImage bufferedImage) {
        switch (bufferedImage.getType()) {
            case 6: {
                return azk_2.c(bufferedImage);
            }
            case 0: 
            case 5: 
            case 13: {
                return azk_2.d(bufferedImage);
            }
        }
        a.error((Object)("Unhandled format " + bufferedImage.getType()));
        return azk_2.d(bufferedImage);
    }

    public static byte[] c(BufferedImage bufferedImage) {
        byte[] byArray = ByteBuffer.wrap(((DataBufferByte)bufferedImage.getRaster().getDataBuffer()).getData()).array();
        ByteBuffer byteBuffer = ByteBuffer.allocate(byArray.length);
        for (int k = 0; k < byArray.length; k += 4) {
            byte by = byArray[k];
            byte by2 = byArray[k + 1];
            byte by3 = byArray[k + 2];
            byte by4 = byArray[k + 3];
            byteBuffer.put(by4);
            byteBuffer.put(by3);
            byteBuffer.put(by2);
            byteBuffer.put(by);
        }
        byteBuffer.rewind();
        return byteBuffer.array();
    }

    public static byte[] d(BufferedImage bufferedImage) {
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int[] nArray = bufferedImage.getRGB(0, 0, n, n2, null, 0, n);
        ByteBuffer byteBuffer = ByteBuffer.allocate(nArray.length * 4);
        for (int k = 0; k < nArray.length; ++k) {
            int n3 = nArray[k];
            byte by = (byte)(n3 & 0xFF);
            byte by2 = (byte)(n3 >>> 8 & 0xFF);
            byte by3 = (byte)(n3 >>> 16 & 0xFF);
            byte by4 = (byte)(n3 >>> 24 & 0xFF);
            byteBuffer.put(by3);
            byteBuffer.put(by2);
            byteBuffer.put(by);
            byteBuffer.put(by4);
        }
        byteBuffer.rewind();
        return byteBuffer.array();
    }

    public static void b(byte[] byArray, int n) {
        assert (byArray.length % n == 0) : "Unable to flip the image since the buffer length is not a muptiple of line size";
        byte[] byArray2 = new byte[n];
        int n2 = byArray.length / n;
        int n3 = byArray.length - n;
        int n4 = 0;
        for (int k = 0; k < n2 / 2; ++k) {
            System.arraycopy(byArray, n4, byArray2, 0, n);
            System.arraycopy(byArray, n3, byArray, n4, n);
            System.arraycopy(byArray2, 0, byArray, n3, n);
            n3 -= n;
            n4 += n;
        }
    }

    public static azr_2 a(byte[] byArray, int n, int n2, int n3) {
        int n4 = Hw.e(n);
        int n5 = Hw.e(n2);
        if (n4 == n && n5 == n2) {
            return new azr_2(n4, n5, (short)n3, null, (byte[])byArray.clone());
        }
        int n6 = n3 / 8;
        byte[] byArray2 = new byte[n4 * n5 * n6];
        int n7 = n * n6;
        int n8 = n4 * n6;
        int n9 = byArray.length / n7;
        int n10 = 0;
        int n11 = 0;
        for (int k = 0; k < n9; ++k) {
            System.arraycopy(byArray, n10, byArray2, n11, n7);
            n10 += n7;
            n11 += n8;
        }
        return new azr_2(n4, n5, (short)n3, null, byArray2);
    }

    public static azr_2 a(azr_2 azr_22, int n, int n2, int n3, int n4) {
        assert (n >= 0 && n3 > n && n3 <= azr_22.b());
        assert (n2 >= 0 && n4 > n2 && n4 <= azr_22.a());
        int n5 = azr_22.g() / 8;
        int n6 = n4 - n2;
        int n7 = n3 - n;
        byte[] byArray = new byte[n6 * n7 * n5];
        int n8 = azr_22.a() * n5;
        int n9 = n3 - n;
        int n10 = n6 * n5;
        byte[] byArray2 = azr_22.h();
        int n11 = n * n8 + n2 * n5;
        int n12 = 0;
        for (int k = 0; k < n9; ++k) {
            System.arraycopy(byArray2, n11, byArray, n12, n10);
            n11 += n8;
            n12 += n10;
        }
        azr_2 azr_23 = new azr_2(n6, n7, (short)azr_22.g(), null, byArray);
        azr_23.a(azr_22.n());
        return azr_23;
    }

    public static void a(azr_2 azr_22, afk_2 afk_22) {
        afk_22.a(azr_22.a());
        afk_22.c(azr_22.b());
        afk_22.b(0);
        afk_22.d(0);
        for (int k = 0; k < azr_22.a(); ++k) {
            for (int i2 = 0; i2 < azr_22.b(); ++i2) {
                if (azr_22.a(k, i2) == 0) continue;
                if (k < afk_22.a()) {
                    afk_22.a(k);
                }
                if (k > afk_22.b()) {
                    afk_22.b(k);
                }
                if (i2 < afk_22.c()) {
                    afk_22.c(i2);
                }
                if (i2 <= afk_22.d()) continue;
                afk_22.d(i2);
            }
        }
        if (afk_22.c() > afk_22.d()) {
            afk_22.a(0);
            afk_22.b(0);
            afk_22.c(0);
            afk_22.d(0);
        }
    }

    public void c(int n) {
        for (azr_2 azr_22 : this.c) {
            azr_22.a(n);
        }
    }

    public void B() {
        if (!this.a(this.r.f())) {
            a.error((Object)("Unable to read image " + this.r.b()));
            return;
        }
        if (this.f) {
            this.y();
        }
        this.r = null;
        this.s = true;
    }

    private static azk_1 a(String string) {
        String string2 = gi_0.j(string).toUpperCase();
        azk_1 azk_12 = azl_1.a().a(string2);
        if (azk_12 == null) {
            a.error((Object)("No ImageReader registered for file ext (." + string2 + ")"));
            a.error((Object)("Did you forget to call ImageReaderFactory.getInstance().registerReader (\"" + string2 + "\", new " + string2 + "Reader ()); ?"));
        }
        return azk_12;
    }

    @Override
    protected void j_() {
        super.j_();
        if (this.c != null) {
            for (azr_2 azr_22 : this.c) {
                azr_22.u();
            }
            this.c = null;
        }
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = false;
    }

    static {
        int n;
        o = new azq_2(3);
        p = new azq_2(3);
        q = new azq_2(3);
        float f2 = 1.5f;
        float f3 = 4.5f;
        float[] fArray = new float[o.b() * o.b()];
        int n2 = o.b() / 2;
        float f4 = 0.0f;
        int n3 = -1;
        for (n = -n2; n < n2 + 1; ++n) {
            for (int k = -n2; k < n2 + 1; ++k) {
                float f5 = (float)(0.0707355302630646 * StrictMath.exp((float)(-(n * n + k * k)) / 4.5f));
                f4 += f5;
                fArray[++n3] = f5;
            }
        }
        n3 = 0;
        while (n3 < fArray.length) {
            int n4 = n3++;
            fArray[n4] = fArray[n4] / f4;
        }
        o.a(fArray);
        int n5 = p.b();
        float[] fArray2 = new float[n5 * n5];
        int n6 = n5 / 2;
        float f6 = 0.0f;
        int n7 = -1;
        for (n3 = -n6; n3 < n6 + 1; ++n3) {
            for (n = -n6; n < n6 + 1; ++n) {
                float f7 = n5 + n5 * n3 * n3 + n * n;
                f6 += f7;
                fArray2[++n7] = f7;
            }
        }
        n7 = 0;
        while (n7 < fArray2.length) {
            int n8 = n7++;
            fArray2[n8] = fArray2[n8] / f6;
        }
        p.a(fArray2);
        n5 = q.b();
        fArray2 = new float[n5 * n5];
        n6 = n5 / 2;
        f6 = 0.0f;
        n7 = -1;
        for (n3 = -n6; n3 < n6 + 1; ++n3) {
            for (n = -n6; n < n6 + 1; ++n) {
                float f8 = 1.0f;
                f6 += 1.0f;
                fArray2[++n7] = 1.0f;
            }
        }
        n7 = 0;
        while (n7 < fArray2.length) {
            int n9 = n7++;
            fArray2[n9] = fArray2[n9] / f6;
        }
        q.a(fArray2);
        a = Logger.getLogger(azk_2.class);
        n5 = 128;
        int n10 = 64;
        byte[] byArray = new byte[32768];
        t = new azr_2(128, 64, 32, null, byArray);
        t.a(255);
        t.k_();
    }
}

