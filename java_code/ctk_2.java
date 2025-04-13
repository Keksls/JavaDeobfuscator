/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctK
 */
public class ctk_2
extends ctj_2 {
    private long c;
    private int d;
    private int[][] e;

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return null;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = new int[this.d][3];
        for (int k = 0; k < this.d; ++k) {
            this.e[k][0] = byteBuffer.getInt();
            this.e[k][1] = byteBuffer.getInt();
            this.e[k][2] = byteBuffer.getInt();
        }
        return true;
    }

    @Override
    public int a() {
        return 13222;
    }

    public long g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int[][] i() {
        return this.e;
    }
}

