/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import org.apache.log4j.Logger;

/*
 * Renamed from aza
 */
public final class aza_1 {
    protected static final Logger a = Logger.getLogger(aza_1.class);
    public static final byte b = 1;
    private boolean d = false;
    private byte[] e;
    private int f;
    private int g;

    public aza_1(int n, int n2, byte[] byArray) {
        this.f = n;
        this.g = n2;
        this.e = byArray;
    }

    public aza_1(BufferedImage bufferedImage, boolean bl) {
        this.a(bufferedImage, bl);
    }

    public aza_1(arf_1 arf_12) {
        this.a(arf_12);
    }

    public BufferedImage a() {
        return azm_2.a(this.f, this.g, this.e, azn_1.a);
    }

    private void a(BufferedImage bufferedImage, boolean bl) {
        if (bufferedImage != null) {
            this.f = bufferedImage.getWidth();
            this.g = bufferedImage.getHeight();
            if (bl) {
                if (bufferedImage.getType() != 3) {
                    bufferedImage = azm_2.d(bufferedImage);
                } else if (bufferedImage.getType() != 2) {
                    bufferedImage = azm_2.c(bufferedImage);
                }
            } else if (bufferedImage.getType() != 2) {
                bufferedImage = azm_2.c(bufferedImage);
            }
            this.d = bufferedImage.isAlphaPremultiplied();
            DataBufferInt dataBufferInt = (DataBufferInt)bufferedImage.getData().getDataBuffer();
            this.e = new byte[this.f * this.g * 4];
            for (int k = 0; k < dataBufferInt.getSize(); ++k) {
                int n = 4 * k;
                int n2 = dataBufferInt.getElem(k);
                this.e[n] = (byte)(n2 >> 16 & 0xFF);
                this.e[n + 1] = (byte)(n2 >> 8 & 0xFF);
                this.e[n + 2] = (byte)(n2 & 0xFF);
                this.e[n + 3] = (byte)(n2 >> 24 & 0xFF);
            }
        } else {
            this.f = 0;
            this.g = 0;
            this.e = null;
        }
    }

    public byte[] b() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.f;
    }

    public String toString() {
        return "AlphaBitmapData (" + this.f + "x" + this.g + ") @" + Integer.toHexString(super.hashCode());
    }

    public void a(gk_0 gk_02) {
        gk_02.b((short)1);
        gk_02.a(this.d);
        gk_02.b(this.f);
        gk_02.b(this.g);
        if (this.e != null) {
            gk_02.d(this.e.length);
            gk_02.a(this.e);
        } else {
            gk_02.d(0L);
        }
    }

    public void a(arf_1 arf_12) {
        short s2 = arf_12.k();
        if (s2 != 1) {
            a.error((Object)"Incorrect version exception", (Throwable)new Exception("Version incorrecte:" + s2 + " courante:1"));
        }
        this.d = arf_12.l();
        this.f = arf_12.h();
        this.g = arf_12.h();
        int n = (int)arf_12.i();
        if (n > 0) {
            this.e = arf_12.a(n);
        }
    }

    public void e() {
        if (this.e != null && !this.d) {
            this.d = true;
            for (int k = 0; k < this.e.length; k += 4) {
                byte by = this.e[k + 3];
                this.e[k] = (byte)(this.e[k] * by / 255);
                this.e[k + 1] = (byte)(this.e[k + 1] * by / 255);
                this.e[k + 2] = (byte)(this.e[k + 2] * by / 255);
            }
        }
    }

    public void f() {
        if (this.e != null && this.d) {
            this.d = false;
            for (int k = 0; k < this.e.length; k += 4) {
                byte by = this.e[k + 3];
                if (by != 0) {
                    this.e[k] = (byte)(this.e[k] * 255 / by);
                    this.e[k + 1] = (byte)(this.e[k + 1] * 255 / by);
                    this.e[k + 2] = (byte)(this.e[k + 2] * 255 / by);
                    continue;
                }
                this.e[k] = -1;
                this.e[k + 1] = -1;
                this.e[k + 2] = -1;
            }
        }
    }

    public boolean g() {
        return this.d;
    }

    public float a(int n, int n2) {
        if (n >= this.f || n2 >= this.g || this.e == null) {
            return 0.0f;
        }
        byte by = this.e[4 * (n + n2 * this.f) + 3];
        return (float)by / 255.0f;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof aza_1) {
            aza_1 aza_12 = (aza_1)object;
            if (this.d() != aza_12.d() || this.c() != aza_12.c()) {
                return false;
            }
            byte[] byArray = this.b();
            byte[] byArray2 = aza_12.b();
            for (int k = 0; k < byArray.length; ++k) {
                if (byArray[k] == byArray2[k]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "Pas d'insertion possible en tant que clef dans une HashMap/HashTable";
        return super.hashCode();
    }
}

