/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Pv
 */
public class pv_0
extends ps_0 {
    protected short a;
    protected ByteBuffer b;

    public short b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 4, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (!this.a(byArray.length - 4, n, true)) {
            return false;
        }
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.b = ByteBuffer.wrap(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 309;
    }

    public String c() {
        if (this.b.remaining() < 2) {
            A.error((Object)("extractStringParameter() impossible d'extraire la taille de la cha\u00eene : " + this.b.remaining() + " bytes restant dans le buffer (2 requis)"));
            return null;
        }
        int n = this.b.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        if (this.b.remaining() < n) {
            A.error((Object)("extractStringParameter() impossible d'extraire la cha\u00eene : " + this.b.remaining() + " bytes restant dans le buffer (" + n + " requis)"));
            return null;
        }
        this.b.get(byArray);
        return Cz.a(byArray);
    }

    public int d() {
        if (this.b.remaining() < 4) {
            A.error((Object)("extractIntParameter() impossible d'extraire l'Integer : " + this.b.remaining() + " bytes restant dans le buffer (4 requis)"));
            return 0;
        }
        return this.b.getInt();
    }

    public boolean a(int n) {
        return this.b.remaining() >= n;
    }

    public boolean e() {
        if (this.b.remaining() < 1) {
            A.error((Object)("extractBooleanParameter() impossible d'extraire le Boolean : " + this.b.remaining() + " bytes restant dans le buffer (1 requis)"));
            return false;
        }
        return this.b.get() != 0;
    }

    public byte f() {
        if (this.b.remaining() < 1) {
            A.error((Object)("extractByteParameter() impossible d'extraire le Byte : " + this.b.remaining() + " bytes restant dans le buffer (1 requis)"));
            return 0;
        }
        return this.b.get();
    }

    public long g() {
        if (this.b.remaining() < 8) {
            A.error((Object)("extractLongParameter() impossible d'extraire le Long : " + this.b.remaining() + " bytes restant dans le buffer (8 requis)"));
            return 0L;
        }
        return this.b.getLong();
    }

    public short h() {
        if (this.b.remaining() < 2) {
            A.error((Object)("extractShortParameter() impossible d'extraire le Short : " + this.b.remaining() + " bytes restant dans le buffer (2 requis)"));
            return 0;
        }
        return this.b.getShort();
    }

    public float i() {
        if (this.b.remaining() < 4) {
            A.error((Object)("extractFloatParameter() impossible d'extraire le Float : " + this.b.remaining() + " bytes restant dans le buffer (4 requis)"));
            return 0.0f;
        }
        return this.b.getFloat();
    }

    public byte[] j() {
        short s2 = this.h();
        if (s2 < this.b.remaining()) {
            A.error((Object)("[Moderation] Cannot extract byte array from result message: expected " + s2 + " bytes in buffer but found " + this.b.remaining()));
            return new byte[0];
        }
        byte[] byArray = new byte[s2];
        this.b.get(byArray);
        return byArray;
    }
}

