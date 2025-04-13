/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;

/*
 * Renamed from azl
 */
class azl_2 {
    private final BufferedImage a;
    private int b;
    private short c;
    private byte d;

    azl_2(BufferedImage bufferedImage) {
        this.a = bufferedImage;
    }

    public void a() {
        switch (this.a.getType()) {
            case 2: 
            case 3: 
            case 6: 
            case 7: {
                this.b = 6408;
                this.c = (short)32;
                this.d = (byte)17;
                break;
            }
            case 4: 
            case 5: {
                this.b = 6407;
                this.c = (short)24;
                this.d = (byte)2;
                break;
            }
            default: {
                this.b = 6407;
                this.c = (short)24;
                this.d = 1;
            }
        }
    }

    public int b() {
        return this.b;
    }

    public short c() {
        return this.c;
    }

    public byte d() {
        return this.d;
    }

    public String toString() {
        return "ImageInfos{m_image=" + this.a + ", m_gl=" + this.b + ", m_bitDepth=" + this.c + ", m_layer=" + this.d + "}";
    }
}

