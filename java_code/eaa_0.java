/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eAa
 */
public abstract class eaa_0 {
    protected long a;
    protected String b;
    protected short c;
    protected byte d;
    protected long e;
    protected String f;
    protected eb g;

    protected eaa_0() {
    }

    protected eaa_0(long l, String string, short s2, byte by, long l2, String string2, @NotNull eb eb2) {
        this.a = l;
        this.b = string;
        this.c = s2;
        this.d = by;
        this.e = l2;
        this.f = string2;
        this.g = eb2;
    }

    public long a() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public short g() {
        return this.c;
    }

    public byte h() {
        return this.d;
    }

    public long i() {
        return this.e;
    }

    public String j() {
        return this.f;
    }

    public void a(String string) {
        this.f = string;
    }

    public eb k() {
        return this.g;
    }

    protected static eb a(byte[] byArray) {
        try {
            return eb.a(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new RuntimeException("Error when unserializing appearance", invalidProtocolBufferException);
        }
    }
}

