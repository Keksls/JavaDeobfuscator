/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TShortHashSet
 */
import gnu.trove.set.hash.TShortHashSet;
import java.io.DataOutput;

public class agF
extends agC {
    final short b;
    final short c;
    final short d;
    final short e;
    final short[] f;
    final int g;
    final short[] h;

    public agF(int n, short s2, short s3, short s4, short s5, short[] sArray, short[] sArray2) {
        this.g = n;
        this.b = s2;
        this.c = s3;
        this.d = s4;
        this.e = s5;
        this.h = sArray;
        this.f = sArray2;
    }

    @Override
    public int a() {
        return this.g;
    }

    @Override
    public String toString() {
        return "dur\u00e9e: " + this.g + "ms  images: " + this.h.length;
    }

    public short[] b() {
        return this.f;
    }

    public short[] c() {
        return this.h;
    }

    @Override
    public void a(DataOutput dataOutput) {
        if (this.h == null || this.h.length <= 1) {
            dataOutput.writeByte(0);
        } else {
            int n;
            int n2 = this.h.length;
            dataOutput.writeByte(n2);
            dataOutput.writeInt(this.g);
            dataOutput.writeShort(this.b);
            dataOutput.writeShort(this.c);
            dataOutput.writeShort(this.d);
            dataOutput.writeShort(this.e);
            for (n = 0; n < n2; ++n) {
                dataOutput.writeShort(this.h[n]);
            }
            assert (this.f.length == 2 * n2);
            for (n = 0; n < this.f.length; ++n) {
                dataOutput.writeShort(this.f[n]);
            }
        }
    }

    public short d() {
        return this.b;
    }

    public short e() {
        return this.c;
    }

    public short f() {
        return this.d;
    }

    public short g() {
        return this.e;
    }

    public static agF a(short s2, short s3, short[] sArray, short[] sArray2) {
        short s4;
        if (sArray.length <= 1 || sArray2.length <= 2) {
            throw new RuntimeException("pas une animation");
        }
        if (sArray.length * 2 != sArray2.length) {
            throw new RuntimeException("valeurs incorrectes");
        }
        int n = 0;
        for (int k = 0; k < sArray.length; ++k) {
            n += sArray[k];
        }
        TShortHashSet tShortHashSet = new TShortHashSet();
        TShortHashSet tShortHashSet2 = new TShortHashSet();
        for (s4 = 0; s4 < sArray2.length; s4 += 2) {
            tShortHashSet.add(sArray2[s4]);
            tShortHashSet2.add(sArray2[s4 + 1]);
        }
        s4 = (short)(s2 / tShortHashSet.size());
        short s5 = (short)(s3 / tShortHashSet2.size());
        return new agF(n, s4, s5, s2, s3, sArray, sArray2);
    }

    public static agF b(short s2, short s3, short[] sArray, short[] sArray2) {
        short s4;
        if (sArray.length <= 1 || sArray2.length <= 2) {
            throw new RuntimeException("pas une animation");
        }
        if (sArray.length * 2 != sArray2.length) {
            throw new RuntimeException("valeurs incorrectes");
        }
        int n = 0;
        for (int k = 0; k < sArray.length; ++k) {
            n += sArray[k];
        }
        TShortHashSet tShortHashSet = new TShortHashSet();
        TShortHashSet tShortHashSet2 = new TShortHashSet();
        for (s4 = 0; s4 < sArray2.length; s4 += 2) {
            tShortHashSet.add(sArray2[s4]);
            tShortHashSet2.add(sArray2[s4 + 1]);
        }
        s4 = (short)(s2 * tShortHashSet.size());
        short s5 = (short)(s3 * tShortHashSet2.size());
        return new agF(n, s2, s3, s4, s5, sArray, sArray2);
    }
}

