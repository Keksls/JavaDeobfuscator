/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;

/*
 * Renamed from asf
 */
public final class asf_1
implements asc_1 {
    private int a;
    private String b;
    private String c;
    private long d;

    public asf_1() {
    }

    public asf_1(int n, String string, String string2, long l) {
        this.a = n;
        this.b = string != null ? string.intern() : null;
        this.c = string2 != null ? string2.intern() : null;
        this.d = l;
    }

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public String b() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    public String c() {
        return this.c;
    }

    public void b(String string) {
        this.c = string;
    }

    public long d() {
        return this.d;
    }

    public void a(long l) {
        this.d = l;
    }

    @Override
    public void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.a);
        dataOutputStream.writeUTF(this.b);
        dataOutputStream.writeUTF(this.c);
        dataOutputStream.writeLong(this.d);
    }

    @Override
    public void a(DataInputStream dataInputStream) {
        this.a = dataInputStream.readInt();
        this.b = dataInputStream.readUTF().intern();
        this.c = dataInputStream.readUTF().intern();
        this.d = dataInputStream.readLong();
    }
}

