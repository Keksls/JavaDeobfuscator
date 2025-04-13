/*
 * Decompiled with CFR 0.152.
 */
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public class PC
extends ps_0 {
    private short a;
    private ByteBuffer b;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 1, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getShort();
        this.b = byteBuffer;
        return true;
    }

    @Override
    public int a() {
        return 333;
    }

    public short b() {
        return this.a;
    }

    public boolean c() {
        if (this.b.remaining() < 1) {
            A.error((Object)("cannot extract a boolean from the buffer : " + this.b.remaining() + " bytes remaining, 8 necessary"));
            return false;
        }
        return this.b.get() != 0;
    }

    public byte d() {
        if (this.b.remaining() < 1) {
            A.error((Object)("cannot extract a boolean from the buffer : " + this.b.remaining() + " bytes remaining, 8 necessary"));
            return 0;
        }
        return this.b.get();
    }

    public short e() {
        if (this.b.remaining() < 2) {
            A.error((Object)("cannot extract a boolean from the buffer : " + this.b.remaining() + " bytes remaining, 16 necessary"));
            return 0;
        }
        return this.b.getShort();
    }

    public int f() {
        if (this.b.remaining() < 4) {
            A.error((Object)("cannot extract a long from the buffer : " + this.b.remaining() + " bytes remaining, 4 necessary"));
            return 0;
        }
        return this.b.getInt();
    }

    public long g() {
        if (this.b.remaining() < 8) {
            A.error((Object)("cannot extract a long from the buffer : " + this.b.remaining() + " bytes remaining, 8 necessary"));
            return 0L;
        }
        return this.b.getLong();
    }

    public String h() {
        if (this.b.remaining() < 2) {
            A.error((Object)("cannot extract the string size from the buffer : " + this.b.remaining() + " bytes remaining, 2 necessary"));
            return null;
        }
        try {
            return Cz.a(this.b);
        }
        catch (BufferUnderflowException bufferUnderflowException) {
            A.error((Object)"cannot extract a string from the buffer, the specified size is larger than the remaining size", (Throwable)bufferUnderflowException);
            return null;
        }
    }
}

