/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;

/*
 * Renamed from asb
 */
public final class asb_1
implements asc_1 {
    private int a;
    private short b;
    private byte[] c;

    public asb_1(int n, short s2, byte[] byArray) {
        this.a = n;
        this.b = s2;
        this.c = byArray;
    }

    public asb_1() {
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }

    @Override
    public void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.a);
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeInt(this.c.length);
        dataOutputStream.write(this.c);
    }

    @Override
    public void a(DataInputStream dataInputStream) {
        this.a = dataInputStream.readInt();
        this.b = dataInputStream.readShort();
        int n = dataInputStream.readInt();
        this.c = new byte[n];
        dataInputStream.read(this.c);
    }

    public static int b(DataInputStream dataInputStream) {
        dataInputStream.readInt();
        dataInputStream.readShort();
        int n = dataInputStream.readInt();
        dataInputStream.skipBytes(n);
        return 10 + n;
    }
}

