/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.jogamp.opengl.util.texture.TextureCoords;
import java.io.DataInput;
import java.io.DataOutput;

public abstract class agC {
    agC() {
    }

    public abstract void a(DataOutput var1);

    public abstract int a();

    public abstract String toString();

    static TextureCoords[] a(short[] sArray, short s2, short s3, int n, int n2, boolean bl) {
        assert (n > 0);
        assert (n2 > 0);
        float f2 = Hw.e(n);
        float f3 = (float)Hw.e(n2) - 0.5f;
        float f4 = (float)s2 / f2;
        float f5 = (float)s3 / f3;
        TextureCoords[] textureCoordsArray = new TextureCoords[sArray.length / 2];
        for (int k = 0; k < textureCoordsArray.length; ++k) {
            float f6 = ((float)sArray[k * 2] + 0.5f) / f2;
            float f7 = ((float)sArray[k * 2 + 1] + 0.5f) / f3;
            textureCoordsArray[k] = bl ? new TextureCoords(f4 + f6, f5 + f7, f6, f7) : new TextureCoords(f6, f5 + f7, f4 + f6, f7);
        }
        return textureCoordsArray;
    }

    static agC a(boolean bl, DataInput dataInput, boolean bl2) {
        int n = dataInput.readByte() & 0xFF;
        if (n == 0) {
            return null;
        }
        int n2 = dataInput.readInt();
        short s2 = dataInput.readShort();
        short s3 = dataInput.readShort();
        short s4 = dataInput.readShort();
        short s5 = dataInput.readShort();
        short[] sArray = new short[n];
        for (int k = 0; k < n; ++k) {
            sArray[k] = dataInput.readShort();
        }
        short[] sArray2 = new short[n * 2];
        for (int k = 0; k < n * 2; ++k) {
            sArray2[k] = dataInput.readShort();
        }
        if (bl) {
            return new agF(n2, s2, s3, s4, s5, sArray, sArray2);
        }
        TextureCoords[] textureCoordsArray = agC.a(sArray2, s2, s3, s4, s5, bl2);
        return new agH(n2, sArray, textureCoordsArray);
    }
}

