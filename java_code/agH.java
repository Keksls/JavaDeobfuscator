/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.jogamp.opengl.util.texture.TextureCoords;
import java.io.DataInput;
import java.io.DataOutput;

public class agH
extends agC {
    private final TextureCoords[] d;
    final int b;
    final short[] c;

    agH(int n, short[] sArray, TextureCoords[] textureCoordsArray) {
        this.b = n;
        this.c = sArray;
        this.d = textureCoordsArray;
    }

    @Override
    public void a(DataOutput dataOutput) {
        throw new UnsupportedOperationException("utiliser la classe ElementAnimData.Export");
    }

    public TextureCoords a(short s2) {
        int n = (s2 & 0xFFFF) % this.b;
        for (int k = 0; k < this.c.length; ++k) {
            if ((n -= this.c[k]) >= 0) continue;
            return this.d[k];
        }
        return this.d[0];
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public String toString() {
        return "dur\u00e9e: " + this.b + "ms  images: " + this.c.length;
    }

    public static agH a(agF agF2) {
        TextureCoords[] textureCoordsArray = agH.a(agF2.f, agF2.b, agF2.c, agF2.d, agF2.e, false);
        return new agH(agF2.g, agF2.h, textureCoordsArray);
    }

    public static agH a(DataInput dataInput, boolean bl) {
        return (agH)agC.a(false, dataInput, bl);
    }
}

